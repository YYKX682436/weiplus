package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.Program */
/* loaded from: classes14.dex */
public class C25776x50c7b664 {
    private static final java.lang.String TAG = "Program";

    /* renamed from: checkEglError */
    public static void m97612x90b29146(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            sb6.append(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            new java.lang.RuntimeException("EGL error encountered (see log): " + sb6.toString());
        }
    }

    /* renamed from: createProgram */
    public static synchronized int m97613x737641e8(java.lang.String str, java.lang.String str2) {
        int m97614x737641e8;
        synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.class) {
            m97614x737641e8 = m97614x737641e8(str, str2, null);
        }
        return m97614x737641e8;
    }

    /* renamed from: loadShader */
    private static synchronized int m97615xf272646b(int i17, java.lang.String str) {
        int glCreateShader;
        synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.class) {
            glCreateShader = android.opengl.GLES20.glCreateShader(i17);
            m97612x90b29146("glCreateShader type=" + i17);
            android.opengl.GLES20.glShaderSource(glCreateShader, str);
            android.opengl.GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "Could not compile shader " + i17 + ":");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
                sb6.append(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
                android.opengl.GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: createProgram */
    public static synchronized int m97614x737641e8(java.lang.String str, java.lang.String str2, int[] iArr) {
        synchronized (com.p314xaae8f345.tav.p2959x5befac44.C25776x50c7b664.class) {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            int m97615xf272646b = m97615xf272646b(35633, str);
            int i17 = 0;
            if (m97615xf272646b == 0) {
                return 0;
            }
            int m97615xf272646b2 = m97615xf272646b(35632, str2);
            if (m97615xf272646b2 == 0) {
                return 0;
            }
            if (iArr != null && iArr.length >= 2) {
                iArr[0] = m97615xf272646b;
                iArr[1] = m97615xf272646b2;
            }
            int glCreateProgram = android.opengl.GLES20.glCreateProgram();
            m97612x90b29146("glCreateProgram");
            if (glCreateProgram == 0) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "Could not create program");
            }
            android.opengl.GLES20.glAttachShader(glCreateProgram, m97615xf272646b);
            m97612x90b29146("glAttachShader");
            android.opengl.GLES20.glAttachShader(glCreateProgram, m97615xf272646b2);
            m97612x90b29146("glAttachShader");
            android.opengl.GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] != 1) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "Could not link program: ");
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
                android.opengl.GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i17 = glCreateProgram;
            }
            return i17;
        }
    }
}
