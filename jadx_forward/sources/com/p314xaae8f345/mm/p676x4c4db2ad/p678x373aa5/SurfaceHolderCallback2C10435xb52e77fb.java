package com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5;

/* renamed from: com.tencent.mm.dynamicbackground.view.GameGLSurfaceView */
/* loaded from: classes8.dex */
public class SurfaceHolderCallback2C10435xb52e77fb extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback2 {

    /* renamed from: s, reason: collision with root package name */
    public static final nq.t f146412s = new nq.t(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f146413d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f146414e;

    /* renamed from: f, reason: collision with root package name */
    public nq.s f146415f;

    /* renamed from: g, reason: collision with root package name */
    public nq.w f146416g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f146417h;

    /* renamed from: i, reason: collision with root package name */
    public nq.n f146418i;

    /* renamed from: m, reason: collision with root package name */
    public nq.o f146419m;

    /* renamed from: n, reason: collision with root package name */
    public nq.p f146420n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f146421o;

    /* renamed from: p, reason: collision with root package name */
    public int f146422p;

    /* renamed from: q, reason: collision with root package name */
    public int f146423q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f146424r;

    public SurfaceHolderCallback2C10435xb52e77fb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146413d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f146414e = new java.lang.ref.WeakReference(this);
        this.f146421o = false;
        getHolder().addCallback(this);
    }

    public final void a() {
        if (this.f146415f != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void b() {
        nq.s sVar = this.f146415f;
        mq.h.b("MicroMsg.GLThread", "onPause before ui lock tid=" + sVar.getId(), new java.lang.Object[0]);
        synchronized (sVar.A) {
            mq.h.b("MicroMsg.GLThread", "onPause ui lock tid=" + sVar.getId(), new java.lang.Object[0]);
            sVar.f420438i = true;
        }
        mq.h.b("MicroMsg.GLThread", "onPause send command tid=" + sVar.getId(), new java.lang.Object[0]);
        if (sVar.f420435f.isAlive()) {
            sVar.f420436g.sendEmptyMessage(2);
        }
    }

    /* renamed from: getDebugFlags */
    public int m43655x7f2d1bea() {
        return this.f146422p;
    }

    /* renamed from: getEGLContext */
    public javax.microedition.khronos.egl.EGLContext m43656xe0fe423b() {
        return this.f146415f.B.f420430g;
    }

    /* renamed from: getEGLContextNativeHandle */
    public long m43657x990612fa() {
        return this.f146415f.B.f420424a;
    }

    /* renamed from: getIsSwapNow */
    public boolean m43658x70e70d03() {
        return this.f146421o;
    }

    /* renamed from: getPreserveEGLContextOnPause */
    public boolean m43659x5a1df1b0() {
        return this.f146424r;
    }

    /* renamed from: getRenderMode */
    public int m43660x3569ec4f() {
        int i17;
        nq.s sVar = this.f146415f;
        sVar.getClass();
        synchronized (f146412s) {
            i17 = sVar.f420448v;
        }
        return i17;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        int i17;
        super.onAttachedToWindow();
        mq.h.b("MicroMsg.GameGLSurfaceView", "onAttachedToWindow reattach =" + this.f146417h, new java.lang.Object[0]);
        if (this.f146417h && this.f146416g != null) {
            nq.s sVar = this.f146415f;
            if (sVar != null) {
                synchronized (f146412s) {
                    i17 = sVar.f420448v;
                }
            } else {
                i17 = 1;
            }
            nq.s sVar2 = new nq.s(this.f146414e);
            this.f146415f = sVar2;
            if (i17 != 1) {
                if (i17 < 0 || i17 > 1) {
                    throw new java.lang.IllegalArgumentException("renderMode");
                }
                nq.t tVar = f146412s;
                synchronized (tVar) {
                    sVar2.f420448v = i17;
                    tVar.notifyAll();
                }
            }
            this.f146415f.start();
        }
        this.f146417h = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        mq.h.b("MicroMsg.GameGLSurfaceView", "onDetachedFromWindow", new java.lang.Object[0]);
        nq.s sVar = this.f146415f;
        if (sVar != null && sVar.f420435f.isAlive()) {
            sVar.f420436g.sendEmptyMessage(5);
        }
        this.f146417h = true;
        super.onDetachedFromWindow();
    }

    /* renamed from: setDebugFlags */
    public void m43661xad5169f6(int i17) {
        this.f146422p = i17;
    }

    /* renamed from: setEGLConfigChooser */
    public void m43662x81a19c31(nq.n nVar) {
        a();
        this.f146418i = nVar;
    }

    /* renamed from: setEGLContextClientVersion */
    public void m43664xdbab8186(int i17) {
        a();
        this.f146423q = i17;
    }

    /* renamed from: setEGLContextFactory */
    public void m43665xa172aac3(nq.o oVar) {
        a();
        this.f146419m = oVar;
    }

    /* renamed from: setEGLWindowSurfaceFactory */
    public void m43666xd8b55015(nq.p pVar) {
        a();
        this.f146420n = pVar;
    }

    /* renamed from: setFps */
    public void m43667xca026527(int i17) {
    }

    /* renamed from: setGLWrapper */
    public void m43668x9c7549cc(nq.u uVar) {
    }

    /* renamed from: setPreserveEGLContextOnPause */
    public void m43669xa3ea4a24(boolean z17) {
        this.f146424r = z17;
    }

    /* renamed from: setRenderMode */
    public void m43670x638e3a5b(int i17) {
        nq.s sVar = this.f146415f;
        sVar.getClass();
        if (i17 < 0 || i17 > 1) {
            throw new java.lang.IllegalArgumentException("renderMode");
        }
        nq.t tVar = f146412s;
        synchronized (tVar) {
            sVar.f420448v = i17;
            tVar.notifyAll();
        }
    }

    /* renamed from: setRenderer */
    public void m43671x5913df45(nq.w wVar) {
        a();
        if (this.f146418i == null) {
            this.f146418i = new nq.x(this, true);
        }
        if (this.f146419m == null) {
            this.f146419m = new nq.l(this, null);
        }
        if (this.f146420n == null) {
            this.f146420n = new nq.m(null);
        }
        this.f146416g = wVar;
    }

    /* renamed from: setSwapNow */
    public void m43672x4546dd81(boolean z17) {
        this.f146421o = z17;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        nq.s sVar = this.f146415f;
        if (sVar.f420435f.isAlive()) {
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 4;
            obtain.arg1 = i18;
            obtain.arg2 = i19;
            sVar.f420436g.sendMessage(obtain);
        }
    }

    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        mq.h.b("MicroMsg.GameGLSurfaceView", "alvinluo GameGLSurfaceView surfaceCreated", new java.lang.Object[0]);
        nq.s sVar = this.f146415f;
        if (sVar.f420435f.isAlive()) {
            sVar.f420436g.sendEmptyMessage(0);
        }
    }

    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        nq.s sVar = this.f146415f;
        if (sVar.f420435f.isAlive()) {
            sVar.f420436g.sendEmptyMessage(1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
        mq.h.b("MicroMsg.GameGLSurfaceView", "surfaceRedrawNeeded", new java.lang.Object[0]);
        nq.s sVar = this.f146415f;
        if (sVar == null || !sVar.f420435f.isAlive()) {
            return;
        }
        sVar.f420436g.sendEmptyMessage(6);
    }

    /* renamed from: setEGLConfigChooser */
    public void m43663x81a19c31(boolean z17) {
        m43662x81a19c31(new nq.x(this, z17));
    }

    public SurfaceHolderCallback2C10435xb52e77fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f146413d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f146414e = new java.lang.ref.WeakReference(this);
        this.f146421o = false;
        getHolder().addCallback(this);
    }
}
