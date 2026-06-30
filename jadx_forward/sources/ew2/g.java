package ew2;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final java.nio.FloatBuffer f338590b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.nio.FloatBuffer f338591c;

    /* renamed from: a, reason: collision with root package name */
    public int f338592a;

    static {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(32);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f338590b = asFloatBuffer;
        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(32);
        allocateDirect2.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        asFloatBuffer2.position(0);
        f338591c = asFloatBuffer2;
    }

    public g() {
        int a17 = a(35633, "attribute vec4 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n    gl_Position = vPosition;\n    texCoord = vTexCoord;\n}");
        int a18 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 texCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, texCoord);\n}");
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.f338592a = glCreateProgram;
        if (glCreateProgram == 0) {
            throw new java.lang.RuntimeException("glCreateProgram() failed. GLES20 error: " + android.opengl.GLES20.glGetError());
        }
        android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
        android.opengl.GLES20.glAttachShader(this.f338592a, a18);
        android.opengl.GLES20.glLinkProgram(this.f338592a);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(this.f338592a, 35714, iArr, 0);
        if (iArr[0] != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderGLShader", "Could not link program: " + android.opengl.GLES20.glGetProgramInfoLog(this.f338592a));
            throw new java.lang.RuntimeException(android.opengl.GLES20.glGetProgramInfoLog(this.f338592a));
        }
        android.opengl.GLES20.glDeleteShader(a17);
        android.opengl.GLES20.glDeleteShader(a18);
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new ew2.a(glGetError, "Creating GlShader");
            }
            throw new android.opengl.GLException(glGetError, "Creating GlShader: GLES20 error: " + glGetError);
        }
    }

    public final int a(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        if (glCreateShader == 0) {
            throw new java.lang.RuntimeException("glCreateShader() failed. GLES20 error: " + android.opengl.GLES20.glGetError());
        }
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderGLShader", "Compile error " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader) + " in shader:" + str);
            throw new java.lang.RuntimeException(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        }
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return glCreateShader;
        }
        if (glGetError == 1285) {
            throw new ew2.a(glGetError, "compileShader");
        }
        throw new android.opengl.GLException(glGetError, "compileShader: GLES20 error: " + glGetError);
    }

    public final int b(java.lang.String label) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        int i17 = this.f338592a;
        if (i17 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i17, label);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        throw new java.lang.RuntimeException("Could not locate '" + label + "' in program");
    }

    public final void c() {
        int i17 = this.f338592a;
        if (i17 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        android.opengl.GLES20.glUseProgram(i17);
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new ew2.a(glGetError, "glUseProgram");
            }
            throw new android.opengl.GLException(glGetError, "glUseProgram: GLES20 error: " + glGetError);
        }
    }
}
