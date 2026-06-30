package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f128355a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f128356b;

    public e(java.lang.String str, java.lang.String str2) {
        this.f128355a = str;
        this.f128356b = str2;
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
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31149x15195fb("glCompileShader");
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
