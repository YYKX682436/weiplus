package yo5;

/* loaded from: classes14.dex */
public final class e extends p3325xe03a0797.p3326xc267989b.p0 implements java.io.Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static int f545891o;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f545892e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f545893f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f545894g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f545895h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f545896i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f545897m;

    /* renamed from: n, reason: collision with root package name */
    public dp5.d f545898n;

    public e(int i17, java.lang.String name, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i18 & 1) != 0) {
            i17 = f545891o;
            f545891o = i17 + 1;
        }
        name = (i18 & 2) != 0 ? "" : name;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f545892e = "MicroMsg.MVR.GLHandlerThread-" + name + '-' + i17;
        this.f545894g = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f545895h = jz5.h.b(new yo5.d(name, i17));
        this.f545896i = jz5.h.b(new yo5.c(this));
        this.f545897m = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(M(), java.lang.Thread.currentThread())) {
            block.run();
            return;
        }
        android.os.Handler K = this.f545893f ? K() : null;
        if (K != null) {
            K.post(block);
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f545894g.readLock();
        readLock.lock();
        try {
            if (this.f545893f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545892e, "direct dispatch in lock scope");
                K().post(block);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545892e, "enqueue block");
                this.f545897m.add(block);
            }
        } finally {
            readLock.unlock();
        }
    }

    public final android.os.Handler K() {
        return (android.os.Handler) ((jz5.n) this.f545896i).mo141623x754a37bb();
    }

    public final android.os.HandlerThread M() {
        return (android.os.HandlerThread) ((jz5.n) this.f545895h).mo141623x754a37bb();
    }

    public final void N(android.opengl.EGLContext eGLContext) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545892e, "bindGLEnvironment");
        M().start();
        K().post(new yo5.a(this, eGLContext));
    }

    public final boolean O() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), M().getLooper())) {
            P();
        } else {
            K().post(new yo5.b(this));
        }
        return M().quitSafely();
    }

    public final void P() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545892e, "release gl environment, " + this.f545898n);
        dp5.d dVar = this.f545898n;
        if (dVar != null) {
            dp5.c cVar = dp5.c.f323811a;
            ((dp5.b) dp5.c.f323812b).getClass();
            android.opengl.EGLDisplay eGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            android.opengl.EGLSurface eGLSurface = dVar.f323814b;
            if (eGLSurface != eGLDisplay) {
                android.opengl.EGLSurface eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGLContext eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
                android.opengl.EGLDisplay eGLDisplay2 = dVar.f323813a;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContext);
                android.opengl.EGL14.eglDestroySurface(eGLDisplay2, eGLSurface);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy eglContext: ");
                android.opengl.EGLContext eGLContext2 = dVar.f323815c;
                sb6.append(eGLContext2.getNativeHandle());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvOp", sb6.toString());
                android.opengl.EGL14.eglDestroyContext(eGLDisplay2, eGLContext2);
                android.opengl.EGL14.eglReleaseThread();
                android.opengl.EGL14.eglTerminate(eGLDisplay2);
            }
        }
        this.f545898n = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545892e, "close");
        O();
    }
}
