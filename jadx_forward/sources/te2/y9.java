package te2;

/* loaded from: classes10.dex */
public final class y9 extends te2.jc {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f500082m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, liveData, statusMonitor, basePlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f500082m = "FinderLiveVisitorMusicSingSongPresenter";
    }

    @Override // te2.jc
    public java.lang.String c() {
        return this.f500082m;
    }

    @Override // te2.jc
    public void f(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f500082m, "loadSongListData - call old version CGI");
        dk2.xf W0 = this.f499685g.W0();
        if (W0 != null) {
            gk2.e eVar = this.f499683e;
            ((dk2.r4) W0).S(((mm2.c1) eVar.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, new te2.v9(this, callback));
        }
    }

    @Override // te2.jc
    public void h() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        java.lang.String str = this.f500082m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupAdapter - create old version adapter");
        bm2.k8 k8Var = new bm2.k8(this.f499683e);
        k8Var.f103584i = new te2.w9(this);
        k8Var.f103585m = new te2.x9(this);
        this.f499687i = k8Var;
        te2.lc lcVar = this.f499686h;
        te2.fa faVar = lcVar instanceof te2.fa ? (te2.fa) lcVar : null;
        if (faVar != null && (c22849x81a93d25 = faVar.f499554t) != null) {
            c22849x81a93d25.mo7960x6cab2c8d(k8Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupAdapter - complete");
    }
}
