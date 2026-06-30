package rh3;

/* loaded from: classes15.dex */
public abstract class c implements rh3.o {

    /* renamed from: e, reason: collision with root package name */
    public rh3.k f477197e;

    /* renamed from: f, reason: collision with root package name */
    public rh3.h f477198f;

    /* renamed from: g, reason: collision with root package name */
    public rh3.e f477199g;

    /* renamed from: h, reason: collision with root package name */
    public rh3.d f477200h;

    /* renamed from: i, reason: collision with root package name */
    public rh3.l f477201i;

    /* renamed from: m, reason: collision with root package name */
    public rh3.n f477202m;

    /* renamed from: n, reason: collision with root package name */
    public rh3.g f477203n;

    /* renamed from: o, reason: collision with root package name */
    public rh3.m f477204o;

    /* renamed from: p, reason: collision with root package name */
    public rh3.i f477205p;

    /* renamed from: q, reason: collision with root package name */
    public rh3.j f477206q;

    /* renamed from: r, reason: collision with root package name */
    public rh3.f f477207r;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f477209t;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f477208s = "MMPlayer." + hashCode();

    /* renamed from: d, reason: collision with root package name */
    public rh3.p f477196d = new rh3.q();

    /* renamed from: u, reason: collision with root package name */
    public int f477210u = 1;

    private final java.lang.String r() {
        rh3.p pVar = this.f477196d;
        if (pVar != null) {
            return ((rh3.q) pVar).f(this.f477208s);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onePlayContext");
        throw null;
    }

    public final void A(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnVideoSizeChanged width:" + i17 + " height:" + i18);
        rh3.n nVar = this.f477202m;
        if (nVar != null) {
            nVar.m(this, i17, i18);
        }
    }

    public final void a(int i17, java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        if (i17 == 4 && this.f477210u != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r(), "changePlayerState from:" + this.f477210u + " to:" + i17 + " return for error state.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), invokeSource + " changeState from " + this.f477210u + " to " + i17);
        int i18 = this.f477210u;
        this.f477210u = i17;
        rh3.p pVar = this.f477196d;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("onePlayContext");
            throw null;
        }
        ((rh3.q) pVar).f477213c = i17;
        if (i18 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnStateChange mp:" + this + " preState:" + i18 + " curState:" + i17);
            rh3.m mVar = this.f477204o;
            if (mVar != null) {
                mVar.h(this, i18, i17);
            }
        }
    }

    @Override // rh3.o
    public void d(rh3.p onePlayContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
        this.f477196d = onePlayContext;
    }

    @Override // rh3.o
    public void e(rh3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnDownloaderListener listener:" + listener);
        this.f477207r = listener;
    }

    @Override // rh3.o
    public void f(rh3.e listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnCompletionListener listener:" + listener);
        this.f477199g = listener;
    }

    @Override // rh3.o
    public void g(rh3.d listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnBufferingListener listener:" + listener);
        this.f477200h = listener;
    }

    @Override // rh3.o
    /* renamed from: getState */
    public int mo162423x75286adb() {
        return this.f477210u;
    }

    @Override // rh3.o
    /* renamed from: getTag */
    public java.lang.String mo162424xb5887064() {
        return r();
    }

    @Override // rh3.o
    public void h(rh3.m listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnStateChangeListener listener:" + listener);
        this.f477204o = listener;
    }

    @Override // rh3.o
    public void i(rh3.h listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnFirstFrameRenderStartListener listener:" + listener);
        this.f477198f = listener;
    }

    @Override // rh3.o
    public void j(rh3.k listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnPreparedListener listener:" + listener);
        this.f477197e = listener;
    }

    @Override // rh3.o
    public void k(rh3.n listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnVideoSizeChangedListener listener:" + listener);
        this.f477202m = listener;
    }

    @Override // rh3.o
    public void l(rh3.i listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnInfoListener listener:" + listener);
        this.f477205p = listener;
    }

    @Override // rh3.o
    public void o(rh3.j listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnPlayProgressMsListener listener:" + listener);
        this.f477206q = listener;
    }

    @Override // rh3.o
    public void p(rh3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnSeekCompleteListener listener:" + listener);
        this.f477201i = listener;
    }

    @Override // rh3.o
    /* renamed from: pause */
    public void mo162425x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "pause");
        a(6, "pause");
    }

    @Override // rh3.o
    /* renamed from: prepareAsync */
    public void mo162426x857611b5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "prepareAsync");
        a(3, "prepareAsync");
    }

    @Override // rh3.o
    public void q(rh3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setOnErrorListener listener:" + listener);
        this.f477203n = listener;
    }

    @Override // rh3.o
    /* renamed from: release */
    public void mo162427x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "release");
        a(11, "release");
    }

    @Override // rh3.o
    /* renamed from: reset */
    public void mo162428x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "reset");
        a(1, "reset");
    }

    public final void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnBufferingEnd");
        rh3.d dVar = this.f477200h;
        if (dVar != null) {
            dVar.p(this);
        }
    }

    @Override // rh3.o
    /* renamed from: seekTo */
    public void mo162429xc9fc1b13(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "seekTo msec:" + j17);
    }

    @Override // rh3.o
    /* renamed from: setSurface */
    public void mo162430x42c875eb(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "setSurface surface:" + surface);
    }

    @Override // rh3.o
    /* renamed from: start */
    public void mo162431x68ac462() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "start");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "startProgressTimer");
        boolean z17 = false;
        if (this.f477209t == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new rh3.a(this), true);
            this.f477209t = b4Var2;
            b4Var2.m77789xc5a5549d(false);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f477209t;
        if (b4Var3 != null && b4Var3.e()) {
            z17 = true;
        }
        if (z17 && (b4Var = this.f477209t) != null) {
            b4Var.c(0L, 20L);
        }
        a(5, "start");
    }

    @Override // rh3.o
    /* renamed from: stop */
    public void mo162432x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "stop");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "stopProgressTimer :" + this.f477209t);
        sh3.a aVar = (sh3.a) this;
        pm0.v.X(new rh3.b(this, aVar.mo162433xddd35a52(), aVar.mo162434x37a7fa50()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f477209t;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f477209t = null;
        a(8, "stop");
    }

    public final void t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnBufferingStart");
        rh3.d dVar = this.f477200h;
        if (dVar != null) {
            dVar.q(this);
        }
    }

    public final void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnCompletion");
        a(7, "notifyOnCompletion");
        rh3.e eVar = this.f477199g;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    public final void v(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnError errorType:" + i17 + " errorCode:" + i18);
        a(10, "notifyOnError");
        rh3.g gVar = this.f477203n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        gVar.r(this, i17, i18);
    }

    public final void w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnFirstFrameRenderStartListener");
        rh3.h hVar = this.f477198f;
        if (hVar != null) {
            hVar.i(this);
        }
    }

    public final void x(rh3.o mp6, int i17, long j17, long j18, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnInfo mp:" + mp6 + " what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj);
        rh3.i iVar = this.f477205p;
        if (iVar != null) {
            iVar.j(mp6, i17, j17, j18, obj);
        }
    }

    public final void y(rh3.s mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnPrepared");
        a(4, "notifyOnPrepared");
        rh3.k kVar = this.f477197e;
        if (kVar != null) {
            kVar.b(this, mediaInfo);
        }
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "notifyOnSeekComplete");
        rh3.l lVar = this.f477201i;
        if (lVar != null) {
            lVar.d(this);
        }
    }
}
