package q05;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: p, reason: collision with root package name */
    public static final float[] f440948p = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: q, reason: collision with root package name */
    public static final float[] f440949q = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f440950a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f440951b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f440952c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f440953d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f440954e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f440955f;

    /* renamed from: g, reason: collision with root package name */
    public int f440956g;

    /* renamed from: h, reason: collision with root package name */
    public int f440957h;

    /* renamed from: i, reason: collision with root package name */
    public int f440958i;

    /* renamed from: j, reason: collision with root package name */
    public int f440959j;

    /* renamed from: k, reason: collision with root package name */
    public int f440960k;

    /* renamed from: l, reason: collision with root package name */
    public int f440961l;

    /* renamed from: m, reason: collision with root package name */
    public int f440962m;

    /* renamed from: n, reason: collision with root package name */
    public int f440963n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f440964o;

    public a() {
        this.f440952c = new float[16];
        this.f440953d = new float[16];
        this.f440956g = 0;
        this.f440959j = 0;
        this.f440960k = 0;
        this.f440961l = 0;
        this.f440962m = 0;
        this.f440963n = 0;
        this.f440964o = false;
        this.f440954e = new int[3];
        this.f440955f = new int[3];
        for (int i17 = 0; i17 < 3; i17++) {
            this.f440954e[i17] = 0;
            this.f440955f[i17] = 0;
        }
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440950a = asFloatBuffer;
        asFloatBuffer.put(f440948p).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440951b = asFloatBuffer2;
        asFloatBuffer2.put(f440949q).position(0);
        android.opengl.Matrix.setIdentityM(this.f440953d, 0);
        if (!c() || a("BlurFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: BlurFilter create failed");
        }
    }

    public final int a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurFilter.OES2Texture", str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
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
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean c() {
        int b17;
        int b18 = b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nuniform highp vec2 texSize;\nuniform highp float Offset;\nvarying vec2 TexCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   TexCoord = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b18 == 0 || (b17 = b("precision mediump float;\nvarying vec2 TexCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\ngl_FragColor = vec4(texture2D(inputImageTexture, TexCoord).rgb, 1.0);\n}\n", 35632)) == 0) {
            return false;
        }
        this.f440956g = android.opengl.GLES20.glCreateProgram();
        if (a("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f440956g, b18);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f440956g, b17);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f440956g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f440956g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f440956g);
            android.opengl.GLES20.glDeleteProgram(this.f440956g);
            this.f440956g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f440956g);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f440956g, "position");
        this.f440961l = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f440956g, "texCoord");
        this.f440962m = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f440963n = android.opengl.GLES20.glGetUniformLocation(this.f440956g, "inputImageTexture");
        this.f440957h = android.opengl.GLES20.glGetUniformLocation(this.f440956g, "uMVPMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f440956g, "uSTMatrix");
        this.f440958i = glGetUniformLocation;
        return (this.f440961l == -1 || this.f440962m == -1 || this.f440963n == -1 || this.f440957h == -1 || glGetUniformLocation == -1) ? false : true;
    }

    public void d(int i17, int i18, int i19, int i27) {
        int i28 = this.f440959j;
        int i29 = 3553;
        float f17 = 1.5f;
        boolean z17 = this.f440964o;
        int[] iArr = this.f440955f;
        int[] iArr2 = this.f440954e;
        int i37 = 1;
        if ((i28 != i18 || this.f440960k != i19) && (i28 != i18 || this.f440960k != i19)) {
            float[] fArr = {1.25f, 1.5f, 3.0f};
            int i38 = 0;
            float f18 = 1.0f;
            while (i38 < 3) {
                if (iArr2[i38] != 0) {
                    android.opengl.GLES20.glDeleteFramebuffers(i37, iArr2, i38);
                    iArr2[i38] = 0;
                }
                if (iArr[i38] != 0) {
                    android.opengl.GLES20.glDeleteTextures(i37, iArr, i38);
                    iArr[i38] = 0;
                }
                f18 = z17 ? fArr[i38] : f18 * 1.5f;
                android.opengl.GLES20.glGenFramebuffers(i37, iArr2, i38);
                android.opengl.GLES20.glBindFramebuffer(36160, iArr2[i38]);
                android.opengl.GLES20.glGenTextures(i37, iArr, i38);
                android.opengl.GLES20.glBindTexture(3553, iArr[i38]);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, (int) (i18 / f18), (int) (i19 / f18), 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
                android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
                android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
                android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[i38], 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                i38++;
                i37 = 1;
            }
            this.f440959j = i18;
            this.f440960k = i19;
        }
        float[] fArr2 = {1.25f, 1.5f, 3.0f};
        int i39 = i17;
        int i47 = 0;
        float f19 = 1.0f;
        while (i47 < 3) {
            f19 = z17 ? fArr2[i47] : f19 * f17;
            android.opengl.GLES20.glBindFramebuffer(36160, iArr2[i47]);
            android.opengl.GLES20.glUseProgram(this.f440956g);
            android.opengl.GLES20.glViewport(0, 0, (int) (i18 / f19), (int) (i19 / f19));
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClear(16384);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(i29, i39);
            android.opengl.GLES20.glUniform1i(this.f440963n, 0);
            float[] fArr3 = this.f440952c;
            android.opengl.Matrix.setIdentityM(fArr3, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.f440957h, 1, false, fArr3, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.f440958i, 1, false, this.f440953d, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f440961l);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f440962m);
            this.f440950a.position(0);
            this.f440951b.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f440961l, 3, 5126, false, 0, (java.nio.Buffer) this.f440950a);
            android.opengl.GLES20.glVertexAttribPointer(this.f440962m, 2, 5126, false, 0, (java.nio.Buffer) this.f440951b);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f440961l);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f440962m);
            i39 = iArr[i47];
            if (a("BlurFilter") != 0) {
                throw new java.lang.RuntimeException("sifeng: BlurFilter process failed");
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i47++;
            i29 = 3553;
            f17 = 1.5f;
        }
    }

    public a(int i17) {
        this.f440952c = new float[16];
        this.f440953d = new float[16];
        this.f440956g = 0;
        this.f440959j = 0;
        this.f440960k = 0;
        this.f440961l = 0;
        this.f440962m = 0;
        this.f440963n = 0;
        this.f440964o = false;
        if (i17 != 2 && i17 != 3 && i17 != 4) {
            this.f440964o = false;
        } else {
            this.f440964o = true;
        }
        this.f440954e = new int[3];
        this.f440955f = new int[3];
        for (int i18 = 0; i18 < 3; i18++) {
            this.f440954e[i18] = 0;
            this.f440955f[i18] = 0;
        }
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440950a = asFloatBuffer;
        asFloatBuffer.put(f440948p).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440951b = asFloatBuffer2;
        asFloatBuffer2.put(f440949q).position(0);
        android.opengl.Matrix.setIdentityM(this.f440953d, 0);
        if (!c() || a("BlurFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: BlurFilter create failed");
        }
    }
}
