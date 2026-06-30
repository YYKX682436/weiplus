package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f128156i = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f128157j = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    protected final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.a f128158a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128159b;

    /* renamed from: c, reason: collision with root package name */
    protected int f128160c;

    /* renamed from: d, reason: collision with root package name */
    protected int f128161d;

    /* renamed from: e, reason: collision with root package name */
    protected int f128162e;

    /* renamed from: f, reason: collision with root package name */
    protected com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e f128163f;

    /* renamed from: g, reason: collision with root package name */
    public int f128164g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f128165h;

    /* renamed from: k, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.e f128166k;

    /* renamed from: l, reason: collision with root package name */
    private int f128167l;

    /* renamed from: m, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.c f128168m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f128169n;

    public a() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public void a(int i17) {
    }

    public int b() {
        return 3553;
    }

    public final void c() {
        if (this.f128169n) {
            this.f128158a.a();
            d();
            this.f128169n = false;
            this.f128168m.d();
            int i17 = this.f128164g;
            if (i17 != -1) {
                android.opengl.GLES20.glDeleteProgram(i17);
                this.f128164g = -1;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d("TXCGPUImageFilter", "%s uninitialized, count: %d", this, java.lang.Integer.valueOf(f128157j.decrementAndGet()));
        }
    }

    public void d() {
    }

    public a(java.lang.String str, java.lang.String str2) {
        this.f128159b = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(-1, -1);
        this.f128164g = -1;
        this.f128168m = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.c();
        this.f128158a = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.a();
        this.f128166k = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.e(str, str2);
    }

    public final void a() {
        if (this.f128169n) {
            return;
        }
        this.f128168m.a();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.e eVar = this.f128166k;
        int a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.e.a(eVar.f128355a, 35633);
        int i17 = -1;
        if (a17 == 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Program", "load vertex shader failed.");
        } else {
            int a18 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.e.a(eVar.f128356b, 35632);
            if (a18 == 0) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Program", "load fragment shader failed.");
                android.opengl.GLES20.glDeleteShader(a17);
            } else {
                int glCreateProgram = android.opengl.GLES20.glCreateProgram();
                android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
                android.opengl.GLES20.glAttachShader(glCreateProgram, a18);
                android.opengl.GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Program", "link program failed. status: " + iArr[0]);
                    android.opengl.GLES20.glDeleteShader(a17);
                    android.opengl.GLES20.glDeleteShader(a18);
                    android.opengl.GLES20.glDeleteProgram(glCreateProgram);
                } else {
                    android.opengl.GLES20.glDeleteShader(a17);
                    android.opengl.GLES20.glDeleteShader(a18);
                    i17 = glCreateProgram;
                }
            }
        }
        this.f128164g = i17;
        this.f128160c = android.opengl.GLES20.glGetAttribLocation(i17, "position");
        this.f128161d = android.opengl.GLES20.glGetUniformLocation(this.f128164g, "inputImageTexture");
        this.f128162e = android.opengl.GLES20.glGetAttribLocation(this.f128164g, "inputTextureCoordinate");
        this.f128167l = android.opengl.GLES20.glGetUniformLocation(this.f128164g, "textureTransform");
        a((com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e) null);
        this.f128169n = true;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d("TXCGPUImageFilter", "%s initialized, count: %d", this, java.lang.Integer.valueOf(f128157j.incrementAndGet()));
    }

    public final void a(int i17, int i18) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128159b;
        c3779x275421.f14764x6be2dc6 = i17;
        c3779x275421.f14763xb7389127 = i18;
    }

    public void a(int i17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        if (this.f128169n) {
            android.opengl.GLES20.glUseProgram(this.f128164g);
            this.f128158a.a();
            floatBuffer.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f128160c, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f128160c);
            floatBuffer2.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f128162e, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f128162e);
            if (i17 != -1) {
                android.opengl.GLES20.glActiveTexture(33984);
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31148x89bf7a1e(b(), i17);
                android.opengl.GLES20.glUniform1i(this.f128161d, 0);
            }
            if (dVar != null) {
                this.f128168m.a(dVar.a());
                this.f128168m.b();
            } else {
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31147xfc642370(36160, 0);
            }
            float[] fArr = this.f128165h;
            if (fArr == null) {
                fArr = f128156i;
            }
            android.opengl.GLES20.glUniformMatrix4fv(this.f128167l, 1, false, fArr, 0);
            a(i17);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f128160c);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f128162e);
            android.opengl.GLES20.glActiveTexture(33984);
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31148x89bf7a1e(b(), 0);
            if (dVar != null) {
                com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31147xfc642370(36160, 0);
                this.f128168m.c();
            }
        }
    }

    public void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e eVar) {
        this.f128163f = eVar;
    }
}
