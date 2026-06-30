package ew2;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: q, reason: collision with root package name */
    public static final ew2.b f338572q = new ew2.b(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f338573r = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f338574a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f338575b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLContext f338576c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f338577d;

    /* renamed from: e, reason: collision with root package name */
    public android.opengl.EGLSurface f338578e;

    /* renamed from: f, reason: collision with root package name */
    public int f338579f;

    /* renamed from: g, reason: collision with root package name */
    public ew2.h f338580g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f338581h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f338582i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f338583j;

    /* renamed from: k, reason: collision with root package name */
    public ew2.g f338584k;

    /* renamed from: l, reason: collision with root package name */
    public int f338585l;

    /* renamed from: m, reason: collision with root package name */
    public int f338586m;

    /* renamed from: n, reason: collision with root package name */
    public int f338587n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f338588o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f338589p;

    public f() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("TP-ProcessSurface-RenderThread", 0);
        this.f338574a = a17;
        android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f338576c = EGL_NO_CONTEXT;
        android.opengl.EGLDisplay EGL_NO_DISPLAY = android.opengl.EGL14.EGL_NO_DISPLAY;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        this.f338577d = EGL_NO_DISPLAY;
        android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        this.f338578e = EGL_NO_SURFACE;
        this.f338581h = new java.util.concurrent.CountDownLatch(1);
        this.f338588o = "vPosition";
        this.f338589p = "vTexCoord";
        a17.start();
        this.f338575b = new android.os.Handler(a17.getLooper());
    }

    public final void a() {
        android.opengl.EGLDisplay eGLDisplay = this.f338577d;
        android.opengl.EGLSurface eGLSurface = this.f338578e;
        b(eGLDisplay, eGLSurface, eGLSurface, this.f338576c);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.f338579f);
        ew2.g gVar = this.f338584k;
        ew2.b bVar = f338572q;
        if (gVar == null) {
            ew2.g gVar2 = new ew2.g();
            gVar2.c();
            int i17 = gVar2.f338592a;
            if (i17 == -1) {
                throw new java.lang.RuntimeException("The program has been released");
            }
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2284xec3e5bc3);
            if (glGetUniformLocation < 0) {
                throw new java.lang.RuntimeException("Could not locate uniform 'sTexture' in program");
            }
            this.f338587n = glGetUniformLocation;
            this.f338585l = gVar2.b(this.f338588o);
            this.f338586m = gVar2.b(this.f338589p);
            bVar.a("Create shader");
            this.f338584k = gVar2;
        }
        ew2.g gVar3 = this.f338584k;
        if (gVar3 != null) {
            gVar3.c();
            android.opengl.GLES20.glEnableVertexAttribArray(this.f338585l);
            android.opengl.GLES20.glVertexAttribPointer(this.f338585l, 2, 5126, false, 0, (java.nio.Buffer) ew2.g.f338590b);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f338586m);
            android.opengl.GLES20.glVertexAttribPointer(this.f338586m, 2, 5126, false, 0, (java.nio.Buffer) ew2.g.f338591c);
            android.opengl.GLES20.glUniform1i(this.f338587n, 0);
            bVar.a("Prepare shader");
        }
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.f338577d, this.f338578e, 12375, iArr, 0);
        int i18 = iArr[0];
        int[] iArr2 = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.f338577d, this.f338578e, 12374, iArr2, 0);
        android.opengl.GLES20.glViewport(0, 0, i18, iArr2[0]);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f338585l);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f338586m);
        android.opengl.EGL14.eglSwapBuffers(this.f338577d, this.f338578e);
        yz5.a aVar = this.f338583j;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f338583j = null;
        this.f338582i = true;
    }

    public final void b(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface, android.opengl.EGLSurface eGLSurface2, android.opengl.EGLContext eGLContext) {
        if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface2, eGLContext)) {
            return;
        }
        throw new android.opengl.GLException(android.opengl.EGL14.eglGetError(), "eglMakeCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    public final void c() {
        this.f338575b.post(new ew2.c(this));
        this.f338574a.quitSafely();
    }

    public final void d() {
        this.f338575b.post(new ew2.d(this));
    }
}
