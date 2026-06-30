package com.tencent.liteav.videobase.utils;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f46822a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f46823b;

    public e(java.lang.String str, java.lang.String str2) {
        this.f46822a = str;
        this.f46823b = str2;
    }

    public static int a(java.lang.String str, int i17) {
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.tencent.liteav.videobase.utils.OpenGlUtils.checkGlError("glCompileShader");
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
