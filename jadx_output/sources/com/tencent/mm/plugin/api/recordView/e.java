package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes14.dex */
public abstract class e {
    public static int a() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(3553, iArr[0]);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9728);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    public static int b(java.lang.String str, int i17) {
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.tencent.mars.xlog.Log.e("loadShader error, infoLog: %s", android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    public static int c(java.lang.String str, java.lang.String str2) {
        int[] iArr = new int[1];
        int b17 = b(str, 35633);
        if (b17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCameraGLUtil", "load vertex shader failed");
            return 0;
        }
        int b18 = b(str2, 35632);
        if (b18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCameraGLUtil", "load fragment shader failed");
            return 0;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, b17);
        android.opengl.GLES20.glAttachShader(glCreateProgram, b18);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCameraGLUtil", "link program failed");
            return 0;
        }
        android.opengl.GLES20.glDeleteShader(b17);
        android.opengl.GLES20.glDeleteShader(b18);
        return glCreateProgram;
    }
}
