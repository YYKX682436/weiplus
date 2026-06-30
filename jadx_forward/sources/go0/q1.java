package go0;

/* loaded from: classes14.dex */
public final class q1 implements com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener, go0.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f355353d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355354e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f355355f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.HandlerThread f355356g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f355357h;

    /* renamed from: i, reason: collision with root package name */
    public rs0.h f355358i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f355359m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f355360n;

    /* renamed from: o, reason: collision with root package name */
    public go0.s1 f355361o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f355362p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f355363q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f355364r;

    public q1(java.lang.String userId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        this.f355353d = userId;
        this.f355354e = i17;
        this.f355355f = "LiveVisitorRenderSurface_" + userId + '_' + hashCode();
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("MicroMsg.LiveCoreVisitor_render", 10);
        this.f355356g = a17;
        this.f355362p = true;
        boolean n17 = fn0.g.f345728a.n();
        this.f355364r = n17;
        a17.start();
        this.f355357h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper(), new go0.h1(this));
        if (!n17) {
            c(new go0.j1(this));
        }
        c(new go0.i1(this));
    }

    @Override // go0.i0
    public void a(java.lang.Object obj, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f355355f, "setOutputSurface:" + obj);
        c(new go0.m1(obj, this));
    }

    public final void c(final yz5.a aVar) {
        if (this.f355356g.isAlive()) {
            if (aVar != null) {
                this.f355357h.mo50293x3498a0(new java.lang.Runnable(aVar) { // from class: go0.l1

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.a f355331d;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "function");
                        this.f355331d = aVar;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f355331d.mo152xb9724478();
                    }
                });
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f355355f, "eglThread is not alive, callback: " + aVar);
    }

    public final void d(int i17, int i18) {
        c(new go0.o1(this, i17, i18));
    }

    public final void e(int i17) {
        c(new go0.p1(this, i17));
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCVideoRenderListener
    /* renamed from: onRenderVideoFrame */
    public void mo105626x3cf387e7(java.lang.String str, int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCVideoFrame tRTCVideoFrame) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f355353d) && i17 == this.f355354e) {
            this.f355357h.mo50292x733c63a2(1024, tRTCVideoFrame).sendToTarget();
        }
    }
}
