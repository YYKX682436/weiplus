package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2;

/* renamed from: com.tencent.thumbplayer.core.postprocessor.TPProgramUtils */
/* loaded from: classes14.dex */
public class C26425xfadaf929 {
    private static final java.lang.String TAG = "Program";

    /* renamed from: checkEglError */
    private static void m102765x90b29146(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            java.lang.Integer.toHexString(eglGetError);
            sb6.append(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            new java.lang.RuntimeException("EGL error encountered (see log): " + sb6.toString());
        }
    }

    /* renamed from: createProgram */
    public static synchronized int m102766x737641e8(java.lang.String str, java.lang.String str2) {
        int m102767x737641e8;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26425xfadaf929.class) {
            m102767x737641e8 = m102767x737641e8(str, str2, null);
        }
        return m102767x737641e8;
    }

    /* renamed from: loadShader */
    private static synchronized int m102768xf272646b(int i17, java.lang.String str) {
        int glCreateShader;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26425xfadaf929.class) {
            glCreateShader = android.opengl.GLES20.glCreateShader(i17);
            m102765x90b29146("glCreateShader type=" + i17);
            android.opengl.GLES20.glShaderSource(glCreateShader, str);
            android.opengl.GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
                android.opengl.GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: createProgram */
    public static synchronized int m102767x737641e8(java.lang.String str, java.lang.String str2, int[] iArr) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3043x21c67f2.C26425xfadaf929.class) {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            int m102768xf272646b = m102768xf272646b(35633, str);
            int i17 = 0;
            if (m102768xf272646b == 0) {
                return 0;
            }
            int m102768xf272646b2 = m102768xf272646b(35632, str2);
            if (m102768xf272646b2 == 0) {
                return 0;
            }
            if (iArr != null && iArr.length >= 2) {
                iArr[0] = m102768xf272646b;
                iArr[1] = m102768xf272646b2;
            }
            int glCreateProgram = android.opengl.GLES20.glCreateProgram();
            m102765x90b29146("glCreateProgram");
            android.opengl.GLES20.glAttachShader(glCreateProgram, m102768xf272646b);
            m102765x90b29146("glAttachShader");
            android.opengl.GLES20.glAttachShader(glCreateProgram, m102768xf272646b2);
            m102765x90b29146("glAttachShader");
            android.opengl.GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] != 1) {
                android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram);
                android.opengl.GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i17 = glCreateProgram;
            }
            return i17;
        }
    }
}
