package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.GlShader */
/* loaded from: classes14.dex */
public class C29782xb41dd54a {
    private static final java.lang.String TAG = "GlShader";

    /* renamed from: program */
    private int f75417xed8f1e84;

    public C29782xb41dd54a(java.lang.String str, java.lang.String str2) {
        int m155548xeda30bf8 = m155548xeda30bf8(35633, str);
        int m155548xeda30bf82 = m155548xeda30bf8(35632, str2);
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.f75417xed8f1e84 = glCreateProgram;
        if (glCreateProgram == 0) {
            throw new java.lang.RuntimeException("glCreateProgram() failed. GLES20 error: " + android.opengl.GLES20.glGetError());
        }
        android.opengl.GLES20.glAttachShader(glCreateProgram, m155548xeda30bf8);
        android.opengl.GLES20.glAttachShader(this.f75417xed8f1e84, m155548xeda30bf82);
        android.opengl.GLES20.glLinkProgram(this.f75417xed8f1e84);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(this.f75417xed8f1e84, 35714, iArr, 0);
        if (iArr[0] == 1) {
            android.opengl.GLES20.glDeleteShader(m155548xeda30bf8);
            android.opengl.GLES20.glDeleteShader(m155548xeda30bf82);
            org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("Creating GlShader");
        } else {
            org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Could not link program: " + android.opengl.GLES20.glGetProgramInfoLog(this.f75417xed8f1e84));
            throw new java.lang.RuntimeException(android.opengl.GLES20.glGetProgramInfoLog(this.f75417xed8f1e84));
        }
    }

    /* renamed from: compileShader */
    private static int m155548xeda30bf8(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        if (glCreateShader == 0) {
            throw new java.lang.RuntimeException("glCreateShader() failed. GLES20 error: " + android.opengl.GLES20.glGetError());
        }
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("compileShader");
            return glCreateShader;
        }
        org.p3371xd0ce3e8d.C29806x779f633f.e(TAG, "Compile error " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader) + " in shader:\n" + str);
        throw new java.lang.RuntimeException(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
    }

    /* renamed from: getAttribLocation */
    public int m155549xcad29595(java.lang.String str) {
        int i17 = this.f75417xed8f1e84;
        if (i17 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i17, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        throw new java.lang.RuntimeException("Could not locate '" + str + "' in program");
    }

    /* renamed from: getUniformLocation */
    public int m155550xd5a6bb53(java.lang.String str) {
        int i17 = this.f75417xed8f1e84;
        if (i17 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i17, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        throw new java.lang.RuntimeException("Could not locate uniform '" + str + "' in program");
    }

    /* renamed from: release */
    public void m155551x41012807() {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Deleting shader.");
        int i17 = this.f75417xed8f1e84;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.f75417xed8f1e84 = -1;
        }
    }

    /* renamed from: setVertexAttribArray */
    public void m155553xbae2dd29(java.lang.String str, int i17, java.nio.FloatBuffer floatBuffer) {
        m155552xbae2dd29(str, i17, 0, floatBuffer);
    }

    /* renamed from: useProgram */
    public void m155554x8cecfafd() {
        if (this.f75417xed8f1e84 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        synchronized (org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75310x32c52b) {
            android.opengl.GLES20.glUseProgram(this.f75417xed8f1e84);
        }
        org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("glUseProgram");
    }

    /* renamed from: setVertexAttribArray */
    public void m155552xbae2dd29(java.lang.String str, int i17, int i18, java.nio.FloatBuffer floatBuffer) {
        if (this.f75417xed8f1e84 != -1) {
            int m155549xcad29595 = m155549xcad29595(str);
            android.opengl.GLES20.glEnableVertexAttribArray(m155549xcad29595);
            android.opengl.GLES20.glVertexAttribPointer(m155549xcad29595, i17, 5126, false, i18, (java.nio.Buffer) floatBuffer);
            org.p3371xd0ce3e8d.C29784x7f4262a7.m155561x7db050b2("setVertexAttribArray");
            return;
        }
        throw new java.lang.RuntimeException("The program has been released");
    }
}
