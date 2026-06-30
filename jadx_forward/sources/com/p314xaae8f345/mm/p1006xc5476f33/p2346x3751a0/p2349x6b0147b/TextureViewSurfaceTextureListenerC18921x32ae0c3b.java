package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b;

/* renamed from: com.tencent.mm.plugin.voip.video.GLTextureView */
/* loaded from: classes13.dex */
public class TextureViewSurfaceTextureListenerC18921x32ae0c3b extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, android.view.View.OnLayoutChangeListener {

    /* renamed from: r, reason: collision with root package name */
    public static final wq4.n f258562r = new wq4.n(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f258563d;

    /* renamed from: e, reason: collision with root package name */
    public wq4.m f258564e;

    /* renamed from: f, reason: collision with root package name */
    public wq4.q f258565f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f258566g;

    /* renamed from: h, reason: collision with root package name */
    public wq4.i f258567h;

    /* renamed from: i, reason: collision with root package name */
    public wq4.j f258568i;

    /* renamed from: m, reason: collision with root package name */
    public wq4.k f258569m;

    /* renamed from: n, reason: collision with root package name */
    public int f258570n;

    /* renamed from: o, reason: collision with root package name */
    public int f258571o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f258572p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f258573q;

    public TextureViewSurfaceTextureListenerC18921x32ae0c3b(android.content.Context context) {
        super(context);
        this.f258563d = new java.lang.ref.WeakReference(this);
        this.f258573q = new java.util.ArrayList();
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.f258564e != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void b(java.lang.Runnable runnable) {
        wq4.m mVar = this.f258564e;
        mVar.getClass();
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException("r must not be null");
        }
        wq4.n nVar = f258562r;
        synchronized (nVar) {
            mVar.f530210t.add(runnable);
            nVar.notifyAll();
        }
    }

    public void c(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        wq4.m mVar = this.f258564e;
        mVar.getClass();
        wq4.n nVar = f258562r;
        synchronized (nVar) {
            mVar.f530205o = i18;
            mVar.f530206p = i19;
            mVar.f530211u = true;
            mVar.f530208r = true;
            mVar.f530209s = false;
            nVar.notifyAll();
            while (!mVar.f530198e && !mVar.f530209s) {
                if (!(mVar.f530202i && mVar.f530203m && mVar.b())) {
                    break;
                }
                mVar.getId();
                try {
                    f258562r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void d(android.graphics.SurfaceTexture surfaceTexture) {
        wq4.m mVar = this.f258564e;
        mVar.getClass();
        wq4.n nVar = f258562r;
        synchronized (nVar) {
            mVar.getId();
            mVar.f530199f = true;
            nVar.notifyAll();
            while (mVar.f530201h && !mVar.f530198e) {
                try {
                    f258562r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void e(android.graphics.SurfaceTexture surfaceTexture) {
        wq4.m mVar = this.f258564e;
        mVar.getClass();
        wq4.n nVar = f258562r;
        synchronized (nVar) {
            mVar.getId();
            mVar.f530199f = false;
            nVar.notifyAll();
            while (!mVar.f530201h && !mVar.f530198e) {
                try {
                    f258562r.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: finalize */
    public void m72889xd764dc1e() {
        try {
            wq4.m mVar = this.f258564e;
            if (mVar != null) {
                mVar.c();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getDebugFlags */
    public int m72890x7f2d1bea() {
        return this.f258570n;
    }

    /* renamed from: getPreserveEGLContextOnPause */
    public boolean m72891x5a1df1b0() {
        return this.f258572p;
    }

    /* renamed from: getRenderMode */
    public int m72892x3569ec4f() {
        int i17;
        wq4.m mVar = this.f258564e;
        mVar.getClass();
        synchronized (f258562r) {
            i17 = mVar.f530207q;
        }
        return i17;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i17;
        super.onAttachedToWindow();
        if (this.f258566g && this.f258565f != null) {
            wq4.m mVar = this.f258564e;
            if (mVar != null) {
                synchronized (f258562r) {
                    i17 = mVar.f530207q;
                }
            } else {
                i17 = 1;
            }
            wq4.m mVar2 = new wq4.m(this.f258563d);
            this.f258564e = mVar2;
            if (i17 != 1) {
                if (i17 < 0 || i17 > 1) {
                    throw new java.lang.IllegalArgumentException("renderMode");
                }
                wq4.n nVar = f258562r;
                synchronized (nVar) {
                    mVar2.f530207q = i17;
                    nVar.notifyAll();
                }
            }
            this.f258564e.start();
        }
        this.f258566g = false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        e(getSurfaceTexture());
        wq4.m mVar = this.f258564e;
        if (mVar != null) {
            mVar.c();
        }
        this.f258566g = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        c(getSurfaceTexture(), 0, i19 - i17, i27 - i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        d(surfaceTexture);
        c(surfaceTexture, 0, i17, i18);
        java.util.Iterator it = ((java.util.ArrayList) this.f258573q).iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        java.util.Iterator it = this.f258573q.iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        c(surfaceTexture, 0, i17, i18);
        java.util.Iterator it = ((java.util.ArrayList) this.f258573q).iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        java.util.Iterator it = this.f258573q.iterator();
        while (it.hasNext()) {
            ((android.view.TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    /* renamed from: setDebugFlags */
    public void m72893xad5169f6(int i17) {
        this.f258570n = i17;
    }

    /* renamed from: setEGLConfigChooser */
    public void m72894x81a19c31(wq4.i iVar) {
        a();
        this.f258567h = iVar;
    }

    /* renamed from: setEGLContextClientVersion */
    public void m72896xdbab8186(int i17) {
        a();
        this.f258571o = i17;
    }

    /* renamed from: setEGLContextFactory */
    public void m72897xa172aac3(wq4.j jVar) {
        a();
        this.f258568i = jVar;
    }

    /* renamed from: setEGLWindowSurfaceFactory */
    public void m72898xd8b55015(wq4.k kVar) {
        a();
        this.f258569m = kVar;
    }

    /* renamed from: setGLWrapper */
    public void m72899x9c7549cc(wq4.o oVar) {
    }

    /* renamed from: setPreserveEGLContextOnPause */
    public void m72900xa3ea4a24(boolean z17) {
        this.f258572p = z17;
    }

    /* renamed from: setRenderMode */
    public void m72901x638e3a5b(int i17) {
        wq4.m mVar = this.f258564e;
        mVar.getClass();
        if (i17 < 0 || i17 > 1) {
            throw new java.lang.IllegalArgumentException("renderMode");
        }
        wq4.n nVar = f258562r;
        synchronized (nVar) {
            mVar.f530207q = i17;
            nVar.notifyAll();
        }
    }

    /* renamed from: setRenderer */
    public void m72902x5913df45(wq4.q qVar) {
        a();
        if (this.f258567h == null) {
            this.f258567h = new wq4.r(this, true);
        }
        if (this.f258568i == null) {
            this.f258568i = new wq4.g(this, null);
        }
        if (this.f258569m == null) {
            this.f258569m = new wq4.h(null);
        }
        this.f258565f = qVar;
        wq4.m mVar = new wq4.m(this.f258563d);
        this.f258564e = mVar;
        mVar.start();
    }

    /* renamed from: setEGLConfigChooser */
    public void m72895x81a19c31(boolean z17) {
        m72894x81a19c31(new wq4.r(this, z17));
    }

    public TextureViewSurfaceTextureListenerC18921x32ae0c3b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f258563d = new java.lang.ref.WeakReference(this);
        this.f258573q = new java.util.ArrayList();
        setSurfaceTextureListener(this);
    }
}
