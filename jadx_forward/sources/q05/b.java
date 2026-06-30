package q05;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: q, reason: collision with root package name */
    public static final float[] f440965q = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: r, reason: collision with root package name */
    public static final float[] f440966r = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f440967a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f440968b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f440969c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f440970d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f440971e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f440972f;

    /* renamed from: g, reason: collision with root package name */
    public int f440973g;

    /* renamed from: h, reason: collision with root package name */
    public int f440974h;

    /* renamed from: i, reason: collision with root package name */
    public int f440975i;

    /* renamed from: j, reason: collision with root package name */
    public int f440976j;

    /* renamed from: k, reason: collision with root package name */
    public int f440977k;

    /* renamed from: l, reason: collision with root package name */
    public int f440978l;

    /* renamed from: m, reason: collision with root package name */
    public int f440979m;

    /* renamed from: n, reason: collision with root package name */
    public int f440980n;

    /* renamed from: o, reason: collision with root package name */
    public int f440981o;

    /* renamed from: p, reason: collision with root package name */
    public final int f440982p;

    public b() {
        this.f440969c = new float[16];
        float[] fArr = new float[16];
        this.f440970d = fArr;
        this.f440973g = 0;
        this.f440976j = 0;
        this.f440977k = 0;
        this.f440978l = 0;
        this.f440979m = 0;
        this.f440980n = 0;
        this.f440981o = 0;
        this.f440982p = 0;
        this.f440982p = 0;
        this.f440971e = r3;
        int[] iArr = {0};
        this.f440972f = r3;
        int[] iArr2 = {0};
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440967a = asFloatBuffer;
        asFloatBuffer.put(f440965q).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440968b = asFloatBuffer2;
        asFloatBuffer2.put(f440966r).position(0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (!c() || a("OES2TextureFilter create0") != 0) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter create0 failed");
        }
    }

    public final int a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SharpenFilter.OES2Texture", str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
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
        int b17 = b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nvarying vec2 coordinate;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   coordinate = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b17 == 0) {
            return false;
        }
        int b18 = this.f440982p == 2 ? b("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 coordinate;\nuniform samplerExternalOES inputImageTexture;\nuniform int outputFormat;\nvec3 RGB2YUV(vec3 rgb)\n{\nvec3 yuv = vec3(0.0);\nyuv.x = rgb.r * 0.257 + rgb.g * 0.504 + rgb.b * 0.098 + 0.0627;\nyuv.y = rgb.r * -0.148 + rgb.g * -0.291 + rgb.b * 0.439 + 0.50196;\nyuv.z = rgb.r * 0.439 + rgb.g * -0.368 + rgb.b * -0.071 + 0.50196;\nreturn yuv;\n}\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\nvec3 yuvColor = outputFormat==1?RGB2YUV(orgColor):orgColor;\ngl_FragColor = vec4(yuvColor, 1.0);\n}\n", 35632) : b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform sampler2D inputImageTexture;\nuniform int outputFormat;\nvec3 RGB2YUV(vec3 rgb)\n{\nvec3 yuv = vec3(0.0);\nyuv.x = rgb.r * 0.257 + rgb.g * 0.504 + rgb.b * 0.098 + 0.06275;\nyuv.y = rgb.r * -0.148 + rgb.g * -0.291 + rgb.b * 0.439 + 0.50196;\nyuv.z = rgb.r * 0.439 + rgb.g * -0.368 + rgb.b * -0.071 + 0.50196;\nreturn yuv;\n}\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\nvec3 yuvColor = outputFormat==1?RGB2YUV(orgColor):orgColor;\ngl_FragColor = vec4(yuvColor, 1.0);\n}\n", 35632);
        if (b18 == 0) {
            return false;
        }
        this.f440973g = android.opengl.GLES20.glCreateProgram();
        if (a("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f440973g, b17);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f440973g, b18);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f440973g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f440973g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f440973g);
            android.opengl.GLES20.glDeleteProgram(this.f440973g);
            this.f440973g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f440973g);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f440973g, "position");
        this.f440978l = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f440973g, "texCoord");
        this.f440979m = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f440980n = android.opengl.GLES20.glGetUniformLocation(this.f440973g, "inputImageTexture");
        this.f440974h = android.opengl.GLES20.glGetUniformLocation(this.f440973g, "uMVPMatrix");
        this.f440975i = android.opengl.GLES20.glGetUniformLocation(this.f440973g, "uSTMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f440973g, "outputFormat");
        this.f440981o = glGetUniformLocation;
        return (this.f440978l == -1 || this.f440979m == -1 || this.f440980n == -1 || this.f440974h == -1 || this.f440975i == -1 || glGetUniformLocation == -1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public int d(int i17, int i18, int i19, int i27) {
        ?? r37;
        int i28;
        int i29 = this.f440976j;
        int[] iArr = this.f440972f;
        int[] iArr2 = this.f440971e;
        if (i29 == i18 && this.f440977k == i19) {
            r37 = 0;
            i28 = 36160;
        } else {
            if (iArr2[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
                iArr2[0] = 0;
            }
            if (iArr[0] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr, 0);
                iArr[0] = 0;
            }
            android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, iArr2[0]);
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i18, i19, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            r37 = 0;
            i28 = 36160;
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            this.f440976j = i18;
            this.f440977k = i19;
        }
        android.opengl.GLES20.glBindFramebuffer(i28, iArr2[r37]);
        android.opengl.GLES20.glUseProgram(this.f440973g);
        android.opengl.GLES20.glViewport(r37, r37, i18, i19);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glActiveTexture(33984);
        if (this.f440982p == 2) {
            android.opengl.GLES20.glBindTexture(36197, i17);
        } else {
            android.opengl.GLES20.glBindTexture(3553, i17);
        }
        android.opengl.GLES20.glUniform1i(this.f440980n, r37);
        android.opengl.GLES20.glUniform1i(this.f440981o, i27);
        float[] fArr = this.f440969c;
        android.opengl.Matrix.setIdentityM(fArr, r37);
        float[] fArr2 = this.f440970d;
        android.opengl.Matrix.setIdentityM(fArr2, r37);
        android.opengl.GLES20.glUniformMatrix4fv(this.f440974h, 1, r37, fArr, r37);
        android.opengl.GLES20.glUniformMatrix4fv(this.f440975i, 1, r37, fArr2, r37);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f440978l);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f440979m);
        this.f440967a.position(r37);
        this.f440968b.position(r37);
        android.opengl.GLES20.glVertexAttribPointer(this.f440978l, 3, 5126, false, 0, (java.nio.Buffer) this.f440967a);
        android.opengl.GLES20.glVertexAttribPointer(this.f440979m, 2, 5126, false, 0, (java.nio.Buffer) this.f440968b);
        android.opengl.GLES20.glDrawArrays(5, r37, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f440978l);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f440979m);
        android.opengl.GLES20.glBindFramebuffer(i28, r37);
        if (a("OES2TextureFilter") == 0) {
            return iArr[r37];
        }
        throw new java.lang.RuntimeException("sifeng: OES2TextureFilter process failed");
    }

    public b(int i17) {
        this.f440969c = new float[16];
        float[] fArr = new float[16];
        this.f440970d = fArr;
        this.f440973g = 0;
        this.f440976j = 0;
        this.f440977k = 0;
        this.f440978l = 0;
        this.f440979m = 0;
        this.f440980n = 0;
        this.f440981o = 0;
        this.f440982p = 0;
        this.f440982p = i17;
        this.f440971e = r2;
        int[] iArr = {0};
        this.f440972f = r2;
        int[] iArr2 = {0};
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440967a = asFloatBuffer;
        asFloatBuffer.put(f440965q).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f440968b = asFloatBuffer2;
        asFloatBuffer2.put(f440966r).position(0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (!c() || a("OES2TextureFilter create1") != 0) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter create1 failed");
        }
    }
}
