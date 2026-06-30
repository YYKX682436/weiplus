package cx;

/* loaded from: classes7.dex */
public final class x extends cx.w0 {
    public android.widget.FrameLayout E;
    public final java.util.HashSet F;
    public final java.util.HashSet G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ax.a flutterPlugin) {
        super(flutterPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPlugin, "flutterPlugin");
        dx.b a17 = dx.a.f325950a.a("MagicAdBrandService");
        jc3.y0 wi6 = ((com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicAdBrandService");
        java.util.HashSet d17 = kz5.p1.d(new hx.g(), new hx.f(), new jx.a(), new hx.h());
        d17.addAll(a17.f325951a);
        d17.addAll(wi6.f380545a);
        this.F = d17;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(a17.f325952b);
        hashSet.addAll(wi6.f380546b);
        this.G = hashSet;
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicAdBrandService";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdBrandServiceBiz", "onJSException envId:" + envId + " msg:" + msg);
    }

    @Override // cx.w0, hq0.i0
    public void X0() {
        super.X0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = z65.c.a();
        c16416x87606a7b.a(this.F);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, this.G);
        c16416x87606a7b.a(kz5.b0.c(new sp0.e()));
        ((ku5.t0) ku5.t0.f394148d).g(new cx.v(this, c16416x87606a7b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceBiz", "MagicAdAppBrandBizService setup");
    }

    @Override // cx.w0, hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceBiz", "destroyADBrandServiceBiz");
        super.mo123041x5cd39ffa();
        if (z65.c.a()) {
            pm0.v.X(new cx.u(this));
        }
    }

    @Override // cx.w0, hq0.i0, jc3.u
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceBiz", "onMainScriptInjected");
        super.n();
        ((ku5.t0) ku5.t0.f394148d).q(new cx.w(this));
    }

    @Override // cx.w0, hq0.i0, jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        super.mo123042x8cf48009();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceBiz", "onCreated");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceBiz", "onDestroy reason:" + i17);
    }

    @Override // hq0.i0
    /* renamed from: start */
    public void mo123044x68ac462() {
        super.mo123044x68ac462();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdBrandServiceBiz", "start");
    }
}
