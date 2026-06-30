package com.tencent.liteav.videobase.a;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f46623i = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f46624j = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    protected final com.tencent.liteav.videobase.utils.a f46625a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.tencent.liteav.base.util.Size f46626b;

    /* renamed from: c, reason: collision with root package name */
    protected int f46627c;

    /* renamed from: d, reason: collision with root package name */
    protected int f46628d;

    /* renamed from: e, reason: collision with root package name */
    protected int f46629e;

    /* renamed from: f, reason: collision with root package name */
    protected com.tencent.liteav.videobase.frame.e f46630f;

    /* renamed from: g, reason: collision with root package name */
    public int f46631g;

    /* renamed from: h, reason: collision with root package name */
    public float[] f46632h;

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.liteav.videobase.utils.e f46633k;

    /* renamed from: l, reason: collision with root package name */
    private int f46634l;

    /* renamed from: m, reason: collision with root package name */
    private final com.tencent.liteav.videobase.frame.c f46635m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46636n;

    public a() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public void a(int i17) {
    }

    public int b() {
        return 3553;
    }

    public final void c() {
        if (this.f46636n) {
            this.f46625a.a();
            d();
            this.f46636n = false;
            this.f46635m.d();
            int i17 = this.f46631g;
            if (i17 != -1) {
                android.opengl.GLES20.glDeleteProgram(i17);
                this.f46631g = -1;
            }
            com.tencent.liteav.base.util.LiteavLog.d("TXCGPUImageFilter", "%s uninitialized, count: %d", this, java.lang.Integer.valueOf(f46624j.decrementAndGet()));
        }
    }

    public void d() {
    }

    public a(java.lang.String str, java.lang.String str2) {
        this.f46626b = new com.tencent.liteav.base.util.Size(-1, -1);
        this.f46631g = -1;
        this.f46635m = new com.tencent.liteav.videobase.frame.c();
        this.f46625a = new com.tencent.liteav.videobase.utils.a();
        this.f46633k = new com.tencent.liteav.videobase.utils.e(str, str2);
    }

    public final void a() {
        if (this.f46636n) {
            return;
        }
        this.f46635m.a();
        com.tencent.liteav.videobase.utils.e eVar = this.f46633k;
        int a17 = com.tencent.liteav.videobase.utils.e.a(eVar.f46822a, 35633);
        int i17 = -1;
        if (a17 == 0) {
            com.tencent.liteav.base.util.LiteavLog.e("Program", "load vertex shader failed.");
        } else {
            int a18 = com.tencent.liteav.videobase.utils.e.a(eVar.f46823b, 35632);
            if (a18 == 0) {
                com.tencent.liteav.base.util.LiteavLog.e("Program", "load fragment shader failed.");
                android.opengl.GLES20.glDeleteShader(a17);
            } else {
                int glCreateProgram = android.opengl.GLES20.glCreateProgram();
                android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
                android.opengl.GLES20.glAttachShader(glCreateProgram, a18);
                android.opengl.GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    com.tencent.liteav.base.util.LiteavLog.e("Program", "link program failed. status: " + iArr[0]);
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
        this.f46631g = i17;
        this.f46627c = android.opengl.GLES20.glGetAttribLocation(i17, "position");
        this.f46628d = android.opengl.GLES20.glGetUniformLocation(this.f46631g, "inputImageTexture");
        this.f46629e = android.opengl.GLES20.glGetAttribLocation(this.f46631g, "inputTextureCoordinate");
        this.f46634l = android.opengl.GLES20.glGetUniformLocation(this.f46631g, "textureTransform");
        a((com.tencent.liteav.videobase.frame.e) null);
        this.f46636n = true;
        com.tencent.liteav.base.util.LiteavLog.d("TXCGPUImageFilter", "%s initialized, count: %d", this, java.lang.Integer.valueOf(f46624j.incrementAndGet()));
    }

    public final void a(int i17, int i18) {
        com.tencent.liteav.base.util.Size size = this.f46626b;
        size.width = i17;
        size.height = i18;
    }

    public void a(int i17, com.tencent.liteav.videobase.frame.d dVar, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        if (this.f46636n) {
            android.opengl.GLES20.glUseProgram(this.f46631g);
            this.f46625a.a();
            floatBuffer.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f46627c, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f46627c);
            floatBuffer2.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f46629e, 2, 5126, false, 0, (java.nio.Buffer) floatBuffer2);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f46629e);
            if (i17 != -1) {
                android.opengl.GLES20.glActiveTexture(33984);
                com.tencent.liteav.videobase.utils.OpenGlUtils.bindTexture(b(), i17);
                android.opengl.GLES20.glUniform1i(this.f46628d, 0);
            }
            if (dVar != null) {
                this.f46635m.a(dVar.a());
                this.f46635m.b();
            } else {
                com.tencent.liteav.videobase.utils.OpenGlUtils.bindFramebuffer(36160, 0);
            }
            float[] fArr = this.f46632h;
            if (fArr == null) {
                fArr = f46623i;
            }
            android.opengl.GLES20.glUniformMatrix4fv(this.f46634l, 1, false, fArr, 0);
            a(i17);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f46627c);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f46629e);
            android.opengl.GLES20.glActiveTexture(33984);
            com.tencent.liteav.videobase.utils.OpenGlUtils.bindTexture(b(), 0);
            if (dVar != null) {
                com.tencent.liteav.videobase.utils.OpenGlUtils.bindFramebuffer(36160, 0);
                this.f46635m.c();
            }
        }
    }

    public void a(com.tencent.liteav.videobase.frame.e eVar) {
        this.f46630f = eVar;
    }
}
