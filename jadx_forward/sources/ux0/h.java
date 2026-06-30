package ux0;

/* loaded from: classes14.dex */
public class h {

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f513332m = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f513333a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f513334b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f513335c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f513336d;

    /* renamed from: e, reason: collision with root package name */
    public int f513337e;

    /* renamed from: f, reason: collision with root package name */
    public int f513338f;

    /* renamed from: g, reason: collision with root package name */
    public int f513339g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f513340h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f513341i;

    /* renamed from: j, reason: collision with root package name */
    public int f513342j;

    /* renamed from: k, reason: collision with root package name */
    public int f513343k;

    /* renamed from: l, reason: collision with root package name */
    public final ux0.g f513344l;

    public h(ux0.g gVar, boolean z17) {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr2 = new float[16];
        this.f513335c = fArr2;
        boolean z18 = false;
        this.f513337e = 0;
        this.f513341i = 0;
        this.f513342j = 0;
        this.f513343k = 0;
        this.f513344l = gVar;
        if (z17) {
            fArr[1] = 1.0f;
            fArr[3] = 1.0f;
            fArr[5] = 0.0f;
            fArr[7] = 0.0f;
        }
        this.f513336d = new int[1];
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f513333a = asFloatBuffer;
        asFloatBuffer.put(f513332m).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f513334b = asFloatBuffer2;
        asFloatBuffer2.put(fArr).position(0);
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        int b17 = b("uniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nvarying vec2 coordinate;\nvoid main()\n{\n   gl_Position = position;\n   coordinate = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b17 != 0) {
            int b18 = gVar == ux0.g.TEXTURE_OES ? b("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 coordinate;\nuniform samplerExternalOES inputImageTexture;\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\ngl_FragColor = vec4(orgColor, 1.0);\n}\n", 35632) : b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\ngl_FragColor = vec4(orgColor, 1.0);\n}\n", 35632);
            if (b18 != 0) {
                this.f513337e = android.opengl.GLES20.glCreateProgram();
                if (a("glCreateProgram") == 0) {
                    android.opengl.GLES20.glAttachShader(this.f513337e, b17);
                    if (a("glAttachShader") == 0) {
                        android.opengl.GLES20.glAttachShader(this.f513337e, b18);
                        if (a("glAttachShader") == 0) {
                            android.opengl.GLES20.glLinkProgram(this.f513337e);
                            int[] iArr = new int[1];
                            android.opengl.GLES20.glGetProgramiv(this.f513337e, 35714, iArr, 0);
                            if (iArr[0] != 1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureBlitter", "Could not link program: ");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureBlitter", android.opengl.GLES20.glGetProgramInfoLog(this.f513337e));
                                android.opengl.GLES20.glDeleteProgram(this.f513337e);
                                this.f513337e = 0;
                            } else {
                                android.opengl.GLES20.glUseProgram(this.f513337e);
                                int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f513337e, "position");
                                this.f513341i = glGetAttribLocation;
                                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f513337e, "texCoord");
                                this.f513342j = glGetAttribLocation2;
                                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                                this.f513343k = android.opengl.GLES20.glGetUniformLocation(this.f513337e, "inputImageTexture");
                                int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f513337e, "uSTMatrix");
                                this.f513338f = glGetUniformLocation;
                                if (this.f513341i != -1 && this.f513342j != -1 && this.f513343k != -1 && glGetUniformLocation != -1) {
                                    z18 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z18 || a("TextureBlitter create") != 0) {
            throw new java.lang.RuntimeException("TextureBlitter create failed");
        }
    }

    public final int a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextureBlitter", str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
        return glGetError;
    }

    public int b(java.lang.String str, int i17) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureBlitter", "Could not compile shader " + i17 + ":");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
        sb6.append(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureBlitter", sb6.toString());
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean c(int i17, int i18, int i19, int i27) {
        int i28 = this.f513339g;
        int[] iArr = this.f513336d;
        if (i28 != i19 || this.f513340h != i27) {
            if (iArr[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
                iArr[0] = 0;
            }
            android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
            this.f513339g = i19;
            this.f513340h = i27;
        }
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i18, 0);
        android.opengl.GLES20.glUseProgram(this.f513337e);
        android.opengl.GLES20.glViewport(0, 0, i19, i27);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glActiveTexture(33984);
        if (this.f513344l == ux0.g.TEXTURE_OES) {
            android.opengl.GLES20.glBindTexture(36197, i17);
        } else {
            android.opengl.GLES20.glBindTexture(3553, i17);
        }
        android.opengl.GLES20.glUniform1i(this.f513343k, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.f513338f, 1, false, this.f513335c, 0);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f513341i);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f513342j);
        this.f513333a.position(0);
        this.f513334b.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.f513341i, 3, 5126, false, 0, (java.nio.Buffer) this.f513333a);
        android.opengl.GLES20.glVertexAttribPointer(this.f513342j, 2, 5126, false, 0, (java.nio.Buffer) this.f513334b);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f513341i);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f513342j);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        return a("OES2TextureRenderer") == 0;
    }
}
