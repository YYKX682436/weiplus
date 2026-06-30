package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3064xed046e09.p3065xe5054ebb;

/* renamed from: com.tencent.thumbplayer.tmediacodec.preload.glrender.TextureRender */
/* loaded from: classes14.dex */
public class C26508x3ea1b271 {

    /* renamed from: FLOAT_SIZE_BYTES */
    private static final int f54175x4d57ec70 = 4;

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f54176xb30c5cb4 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final java.lang.String TAG = "TextureRender";

    /* renamed from: TRIANGLE_VERTICES_DATA_POS_OFFSET */
    private static final int f54177x39646ac4 = 0;

    /* renamed from: TRIANGLE_VERTICES_DATA_STRIDE_BYTES */
    private static final int f54178x3d85cbab = 20;

    /* renamed from: TRIANGLE_VERTICES_DATA_UV_OFFSET */
    private static final int f54179x67a9856b = 3;

    /* renamed from: VERTEX_SHADER */
    private static final java.lang.String f54180xeb40e2e0 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";

    /* renamed from: mProgram */
    private int f54182x8ba7d157;

    /* renamed from: mTriangleVertices */
    private java.nio.FloatBuffer f54185xb56e18ae;

    /* renamed from: mTriangleVerticesData */
    private final float[] f54186xaa567578;

    /* renamed from: maPositionHandle */
    private int f54187x65483765;

    /* renamed from: maTextureHandle */
    private int f54188x4ce81ef;

    /* renamed from: muMVPMatrixHandle */
    private int f54189x3af65808;

    /* renamed from: muSTMatrixHandle */
    private int f54190xf4cf39f2;

    /* renamed from: mMVPMatrix */
    private float[] f54181x9264a89b = new float[16];

    /* renamed from: mSTMatrix */
    private float[] f54183xb3a2c4ef = new float[16];

    /* renamed from: mTextureID */
    private int f54184x3e144d89 = -12345;

    public C26508x3ea1b271() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f54186xaa567578 = fArr;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f54185xb56e18ae = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        android.opengl.Matrix.setIdentityM(this.f54183xb3a2c4ef, 0);
    }

    /* renamed from: createProgram */
    private int m103480x737641e8(java.lang.String str, java.lang.String str2) {
        int m103481xf272646b;
        int m103481xf272646b2 = m103481xf272646b(35633, str);
        if (m103481xf272646b2 == 0 || (m103481xf272646b = m103481xf272646b(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        m103483x15195fb("glCreateProgram");
        android.opengl.GLES20.glAttachShader(glCreateProgram, m103481xf272646b2);
        m103483x15195fb("glAttachShader");
        android.opengl.GLES20.glAttachShader(glCreateProgram, m103481xf272646b);
        m103483x15195fb("glAttachShader");
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram);
        android.opengl.GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    /* renamed from: loadShader */
    private int m103481xf272646b(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        m103483x15195fb("glCreateShader type=" + i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: changeFragmentShader */
    public void m103482xf686f625(java.lang.String str) {
        android.opengl.GLES20.glDeleteProgram(this.f54182x8ba7d157);
        int m103480x737641e8 = m103480x737641e8(f54180xeb40e2e0, str);
        this.f54182x8ba7d157 = m103480x737641e8;
        if (m103480x737641e8 == 0) {
            throw new java.lang.RuntimeException("failed creating program");
        }
    }

    /* renamed from: checkGlError */
    public void m103483x15195fb(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new java.lang.RuntimeException(str + ": glError " + glGetError);
    }

    /* renamed from: drawFrame */
    public void m103484x75e3689(android.graphics.SurfaceTexture surfaceTexture) {
        m103483x15195fb("onDrawFrame start");
        surfaceTexture.getTransformMatrix(this.f54183xb3a2c4ef);
        android.opengl.GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glUseProgram(this.f54182x8ba7d157);
        m103483x15195fb("glUseProgram");
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.f54184x3e144d89);
        this.f54185xb56e18ae.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f54187x65483765, 3, 5126, false, 20, (java.nio.Buffer) this.f54185xb56e18ae);
        m103483x15195fb("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f54187x65483765);
        m103483x15195fb("glEnableVertexAttribArray maPositionHandle");
        this.f54185xb56e18ae.position(3);
        android.opengl.GLES20.glVertexAttribPointer(this.f54188x4ce81ef, 2, 5126, false, 20, (java.nio.Buffer) this.f54185xb56e18ae);
        m103483x15195fb("glVertexAttribPointer maTextureHandle");
        android.opengl.GLES20.glEnableVertexAttribArray(this.f54188x4ce81ef);
        m103483x15195fb("glEnableVertexAttribArray maTextureHandle");
        android.opengl.Matrix.setIdentityM(this.f54181x9264a89b, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f54189x3af65808, 1, false, this.f54181x9264a89b, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f54190xf4cf39f2, 1, false, this.f54183xb3a2c4ef, 0);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        m103483x15195fb("glDrawArrays");
        android.opengl.GLES20.glFinish();
    }

    /* renamed from: getTextureId */
    public int m103485xc2ca74e0() {
        return this.f54184x3e144d89;
    }

    /* renamed from: surfaceCreated */
    public void m103486xbb66fd7b() {
        int m103480x737641e8 = m103480x737641e8(f54180xeb40e2e0, f54176xb30c5cb4);
        this.f54182x8ba7d157 = m103480x737641e8;
        if (m103480x737641e8 == 0) {
            throw new java.lang.RuntimeException("failed creating program");
        }
        this.f54187x65483765 = android.opengl.GLES20.glGetAttribLocation(m103480x737641e8, "aPosition");
        m103483x15195fb("glGetAttribLocation aPosition");
        if (this.f54187x65483765 == -1) {
            throw new java.lang.RuntimeException("Could not get attrib location for aPosition");
        }
        this.f54188x4ce81ef = android.opengl.GLES20.glGetAttribLocation(this.f54182x8ba7d157, "aTextureCoord");
        m103483x15195fb("glGetAttribLocation aTextureCoord");
        if (this.f54188x4ce81ef == -1) {
            throw new java.lang.RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f54189x3af65808 = android.opengl.GLES20.glGetUniformLocation(this.f54182x8ba7d157, "uMVPMatrix");
        m103483x15195fb("glGetUniformLocation uMVPMatrix");
        if (this.f54189x3af65808 == -1) {
            throw new java.lang.RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.f54190xf4cf39f2 = android.opengl.GLES20.glGetUniformLocation(this.f54182x8ba7d157, "uSTMatrix");
        m103483x15195fb("glGetUniformLocation uSTMatrix");
        if (this.f54190xf4cf39f2 == -1) {
            throw new java.lang.RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        this.f54184x3e144d89 = i17;
        android.opengl.GLES20.glBindTexture(36197, i17);
        m103483x15195fb("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(36197, 10241, 9728.0f);
        android.opengl.GLES20.glTexParameterf(36197, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        m103483x15195fb("glTexParameter");
    }
}
