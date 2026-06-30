package com.tencent.mm.dynamicbackground.view;

/* loaded from: classes8.dex */
public class GameGLSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback2 {

    /* renamed from: s, reason: collision with root package name */
    public static final nq.t f64879s = new nq.t(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f64880d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f64881e;

    /* renamed from: f, reason: collision with root package name */
    public nq.s f64882f;

    /* renamed from: g, reason: collision with root package name */
    public nq.w f64883g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64884h;

    /* renamed from: i, reason: collision with root package name */
    public nq.n f64885i;

    /* renamed from: m, reason: collision with root package name */
    public nq.o f64886m;

    /* renamed from: n, reason: collision with root package name */
    public nq.p f64887n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f64888o;

    /* renamed from: p, reason: collision with root package name */
    public int f64889p;

    /* renamed from: q, reason: collision with root package name */
    public int f64890q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64891r;

    public GameGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64880d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f64881e = new java.lang.ref.WeakReference(this);
        this.f64888o = false;
        getHolder().addCallback(this);
    }

    public final void a() {
        if (this.f64882f != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void b() {
        nq.s sVar = this.f64882f;
        mq.h.b("MicroMsg.GLThread", "onPause before ui lock tid=" + sVar.getId(), new java.lang.Object[0]);
        synchronized (sVar.A) {
            mq.h.b("MicroMsg.GLThread", "onPause ui lock tid=" + sVar.getId(), new java.lang.Object[0]);
            sVar.f338905i = true;
        }
        mq.h.b("MicroMsg.GLThread", "onPause send command tid=" + sVar.getId(), new java.lang.Object[0]);
        if (sVar.f338902f.isAlive()) {
            sVar.f338903g.sendEmptyMessage(2);
        }
    }

    public int getDebugFlags() {
        return this.f64889p;
    }

    public javax.microedition.khronos.egl.EGLContext getEGLContext() {
        return this.f64882f.B.f338897g;
    }

    public long getEGLContextNativeHandle() {
        return this.f64882f.B.f338891a;
    }

    public boolean getIsSwapNow() {
        return this.f64888o;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f64891r;
    }

    public int getRenderMode() {
        int i17;
        nq.s sVar = this.f64882f;
        sVar.getClass();
        synchronized (f64879s) {
            i17 = sVar.f338915v;
        }
        return i17;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        int i17;
        super.onAttachedToWindow();
        mq.h.b("MicroMsg.GameGLSurfaceView", "onAttachedToWindow reattach =" + this.f64884h, new java.lang.Object[0]);
        if (this.f64884h && this.f64883g != null) {
            nq.s sVar = this.f64882f;
            if (sVar != null) {
                synchronized (f64879s) {
                    i17 = sVar.f338915v;
                }
            } else {
                i17 = 1;
            }
            nq.s sVar2 = new nq.s(this.f64881e);
            this.f64882f = sVar2;
            if (i17 != 1) {
                if (i17 < 0 || i17 > 1) {
                    throw new java.lang.IllegalArgumentException("renderMode");
                }
                nq.t tVar = f64879s;
                synchronized (tVar) {
                    sVar2.f338915v = i17;
                    tVar.notifyAll();
                }
            }
            this.f64882f.start();
        }
        this.f64884h = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        mq.h.b("MicroMsg.GameGLSurfaceView", "onDetachedFromWindow", new java.lang.Object[0]);
        nq.s sVar = this.f64882f;
        if (sVar != null && sVar.f338902f.isAlive()) {
            sVar.f338903g.sendEmptyMessage(5);
        }
        this.f64884h = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i17) {
        this.f64889p = i17;
    }

    public void setEGLConfigChooser(nq.n nVar) {
        a();
        this.f64885i = nVar;
    }

    public void setEGLContextClientVersion(int i17) {
        a();
        this.f64890q = i17;
    }

    public void setEGLContextFactory(nq.o oVar) {
        a();
        this.f64886m = oVar;
    }

    public void setEGLWindowSurfaceFactory(nq.p pVar) {
        a();
        this.f64887n = pVar;
    }

    public void setFps(int i17) {
    }

    public void setGLWrapper(nq.u uVar) {
    }

    public void setPreserveEGLContextOnPause(boolean z17) {
        this.f64891r = z17;
    }

    public void setRenderMode(int i17) {
        nq.s sVar = this.f64882f;
        sVar.getClass();
        if (i17 < 0 || i17 > 1) {
            throw new java.lang.IllegalArgumentException("renderMode");
        }
        nq.t tVar = f64879s;
        synchronized (tVar) {
            sVar.f338915v = i17;
            tVar.notifyAll();
        }
    }

    public void setRenderer(nq.w wVar) {
        a();
        if (this.f64885i == null) {
            this.f64885i = new nq.x(this, true);
        }
        if (this.f64886m == null) {
            this.f64886m = new nq.l(this, null);
        }
        if (this.f64887n == null) {
            this.f64887n = new nq.m(null);
        }
        this.f64883g = wVar;
    }

    public void setSwapNow(boolean z17) {
        this.f64888o = z17;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        nq.s sVar = this.f64882f;
        if (sVar.f338902f.isAlive()) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 4;
            obtain.arg1 = i18;
            obtain.arg2 = i19;
            sVar.f338903g.sendMessage(obtain);
        }
    }

    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        mq.h.b("MicroMsg.GameGLSurfaceView", "alvinluo GameGLSurfaceView surfaceCreated", new java.lang.Object[0]);
        nq.s sVar = this.f64882f;
        if (sVar.f338902f.isAlive()) {
            sVar.f338903g.sendEmptyMessage(0);
        }
    }

    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        nq.s sVar = this.f64882f;
        if (sVar.f338902f.isAlive()) {
            sVar.f338903g.sendEmptyMessage(1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
        mq.h.b("MicroMsg.GameGLSurfaceView", "surfaceRedrawNeeded", new java.lang.Object[0]);
        nq.s sVar = this.f64882f;
        if (sVar == null || !sVar.f338902f.isAlive()) {
            return;
        }
        sVar.f338903g.sendEmptyMessage(6);
    }

    public void setEGLConfigChooser(boolean z17) {
        setEGLConfigChooser(new nq.x(this, z17));
    }

    public GameGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f64880d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f64881e = new java.lang.ref.WeakReference(this);
        this.f64888o = false;
        getHolder().addCallback(this);
    }
}
