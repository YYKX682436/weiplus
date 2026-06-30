package br4;

/* loaded from: classes14.dex */
public abstract class f {
    public static int a(java.lang.String str, java.lang.String str2) {
        int b17;
        int b18 = b(35633, str);
        if (b18 == 0 || (b17 = b(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipRenderUtils", "Could not create program");
        }
        android.opengl.GLES20.glAttachShader(glCreateProgram, b18);
        android.opengl.GLES20.glAttachShader(glCreateProgram, b17);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.VoipRenderUtils", "Could not link program: ");
        com.tencent.mars.xlog.Log.e("MicroMsg.VoipRenderUtils", android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
        android.opengl.GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int b(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.VoipRenderUtils", "Could not compile shader %s and shader info is %s", java.lang.Integer.valueOf(i17), android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
