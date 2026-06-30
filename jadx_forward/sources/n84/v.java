package n84;

/* loaded from: classes14.dex */
public class v extends n84.a0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public static final float[] G = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public static final short[] H = {0, 1, 2, 0, 2, 3};
    public static final float[] I = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f, 0.0f, 1.0f};

    /* renamed from: J, reason: collision with root package name */
    public static final float[] f417223J = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f, 0.0f, 1.0f};
    public boolean A;
    public final int B;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 C;
    public long D;
    public int E;
    public long F;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f417224r;

    /* renamed from: s, reason: collision with root package name */
    public java.nio.FloatBuffer f417225s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f417226t;

    /* renamed from: u, reason: collision with root package name */
    public int f417227u;

    /* renamed from: v, reason: collision with root package name */
    public java.nio.FloatBuffer f417228v;

    /* renamed from: w, reason: collision with root package name */
    public java.nio.ShortBuffer f417229w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.SurfaceTexture f417230x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f417231y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f417232z;

    public v(android.content.Context context, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        super(surfaceTexture, i17, i18);
        this.f417226t = new int[1];
        this.f417232z = false;
        this.A = false;
        this.C = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(0, 1, u26.u.DROP_OLDEST);
        this.D = 0L;
        this.F = 0L;
        this.f417224r = context;
        this.f417231y = new float[16];
        this.B = i19;
        ((ku5.t0) ku5.t0.f394148d).a(this);
    }

    @Override // n84.a0
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        try {
        } catch (java.lang.Throwable th6) {
            n84.w.c("AlphaTextureRenderer", "draw called error", th6);
        }
        synchronized (this) {
            try {
                if (this.f417232z) {
                    try {
                        this.f417230x.updateTexImage();
                        this.f417230x.getTransformMatrix(this.f417231y);
                        g();
                        this.f417232z = false;
                    } catch (java.lang.Exception e17) {
                        n84.w.d("AlphaTextureRenderer", e17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                        return false;
                    }
                } else {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = this.C;
                    if (i2Var != null) {
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var).e(java.lang.Boolean.FALSE);
                    }
                    android.content.Context context = this.f417224r;
                    boolean mo78538xecd98af8 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo78538xecd98af8() : false;
                    if (java.lang.System.currentTimeMillis() - this.F < 500 || mo78538xecd98af8) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                        return false;
                    }
                    n84.w.e("AlphaTextureRenderer", "flush without input! mFrameHasAvailabled = " + this.A);
                    if (!this.A) {
                        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        android.opengl.GLES20.glClear(16384);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                        return true;
                    }
                }
                f("gl draw texture");
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                android.opengl.GLES20.glClear(16384);
                f("gl draw texture");
                android.opengl.GLES20.glUseProgram(this.f417227u);
                f("gl draw texture");
                int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f417227u, "texture");
                int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f417227u, "vTexCoordinate");
                int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f417227u, "vPosition");
                int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.f417227u, "textureTransform");
                android.opengl.GLES20.glUniform2f(android.opengl.GLES20.glGetUniformLocation(this.f417227u, "vSurfaceWidth"), this.f417198i, this.f417199m);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 0, (java.nio.Buffer) this.f417228v);
                f("gl draw texture");
                android.opengl.GLES20.glBindTexture(36197, this.f417226t[0]);
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glUniform1i(glGetUniformLocation, 0);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation, 4, 5126, false, 0, (java.nio.Buffer) this.f417225s);
                android.opengl.GLES20.glUniformMatrix4fv(glGetUniformLocation2, 1, false, this.f417231y, 0);
                f("gl draw texture");
                android.opengl.GLES20.glDrawElements(4, 6, 5123, this.f417229w);
                f("gl draw texture");
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glEnable(3042);
                android.opengl.GLES20.glBlendFunc(1, 771);
                f("gl draw texture");
                this.F = java.lang.System.currentTimeMillis();
                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var2 = this.C;
                if (i2Var2 != null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var2).e(java.lang.Boolean.TRUE);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                return true;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                throw th7;
            }
        }
    }

    @Override // n84.a0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupVertexBuffer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(12);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        this.f417229w = asShortBuffer;
        asShortBuffer.put(H);
        this.f417229w.position(0);
        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(48);
        allocateDirect2.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect2.asFloatBuffer();
        this.f417228v = asFloatBuffer;
        asFloatBuffer.put(G);
        this.f417228v.position(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupVertexBuffer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        int i17 = this.B;
        boolean z17 = i17 == 0;
        float[] fArr = I;
        float[] fArr2 = f417223J;
        java.nio.ByteBuffer allocateDirect3 = java.nio.ByteBuffer.allocateDirect((z17 ? fArr : fArr2).length * 4);
        allocateDirect3.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.f417225s = asFloatBuffer2;
        if (!z17) {
            fArr = fArr2;
        }
        asFloatBuffer2.put(fArr);
        this.f417225s.position(0);
        android.opengl.GLES20.glActiveTexture(33984);
        int[] iArr = this.f417226t;
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        f("gl generate texture");
        android.opengl.GLES20.glBindTexture(36197, iArr[0]);
        f("gl bind texture");
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(iArr[0]);
        this.f417230x = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadShaders", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        boolean z18 = i17 == 0;
        int i18 = z18 ? com.p314xaae8f345.mm.R.raw.f80643xf2a38c1b : com.p314xaae8f345.mm.R.raw.f80642xef39dadd;
        android.content.Context context = this.f417224r;
        java.lang.String a17 = n84.y.a(context, i18);
        java.lang.String a18 = n84.y.a(context, z18 ? com.p314xaae8f345.mm.R.raw.f80641xdde1694a : com.p314xaae8f345.mm.R.raw.f80640xda77b80c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        int glCreateShader = android.opengl.GLES20.glCreateShader(35633);
        android.opengl.GLES20.glShaderSource(glCreateShader, a17);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr2, 0);
        if (iArr2[0] != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("load vertex shader:" + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException;
        }
        int glCreateShader2 = android.opengl.GLES20.glCreateShader(35632);
        android.opengl.GLES20.glShaderSource(glCreateShader2, a18);
        android.opengl.GLES20.glCompileShader(glCreateShader2);
        android.opengl.GLES20.glGetShaderiv(glCreateShader2, 35713, iArr2, 0);
        if (iArr2[0] != 1) {
            java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("load fragment shader:" + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException2;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 1) {
            java.lang.IllegalStateException illegalStateException3 = new java.lang.IllegalStateException("link program:" + android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException3;
        }
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        this.f417227u = glCreateProgram;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadShaders", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        n84.w.a("AlphaTextureRenderer", "initGLComponents");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }

    public void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkOpenGLError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        while (true) {
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOpenGLError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                return;
            }
            n84.w.b("AlphaTextureRenderer", str + ": glError " + android.opengl.GLUtils.getEGLErrorString(glGetError));
        }
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pingFps", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        if (this.D == 0) {
            this.D = java.lang.System.currentTimeMillis();
        }
        this.E++;
        if (java.lang.System.currentTimeMillis() - this.D > 1000) {
            n84.w.a("AlphaTextureRenderer", "FPS: " + this.E);
            this.D = java.lang.System.currentTimeMillis();
            this.E = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pingFps", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFrameAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        synchronized (this) {
            try {
                java.util.Objects.toString(surfaceTexture);
                this.f417232z = true;
                this.A = true;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFrameAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFrameAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }
}
