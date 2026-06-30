package te2;

/* loaded from: classes10.dex */
public final class m9 extends te2.jc {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f499767m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f499768n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, liveData, statusMonitor, basePlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f499767m = "FinderLiveVisitorSingSongNewPanelPresenter";
    }

    @Override // te2.jc
    public java.lang.String c() {
        return this.f499767m;
    }

    @Override // te2.jc
    public void f(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499767m, "loadSongListData - call new version CGI");
        dk2.xf W0 = this.f499685g.W0();
        if (W0 != null) {
            gk2.e eVar = this.f499683e;
            ((dk2.r4) W0).P(((mm2.c1) eVar.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, ((mm2.m6) eVar.a(mm2.m6.class)).f410782q.f315619b, new te2.e9(this, callback));
        }
    }

    @Override // te2.jc, fs2.a
    /* renamed from: g */
    public void mo56536x3b13c504(te2.lc callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.mo56536x3b13c504(callback);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f499768n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f499768n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(this.f499685g, null, null, new te2.l9(this, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499767m, "onAttach: started observing normalRoomSingState");
    }

    @Override // te2.jc
    public void h() {
        java.lang.String str = this.f499767m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupAdapter - create new version adapter");
        bm2.p8 p8Var = new bm2.p8(this.f499683e);
        te2.lc lcVar = this.f499686h;
        te2.t9 t9Var = lcVar instanceof te2.t9 ? (te2.t9) lcVar : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = t9Var != null ? t9Var.f499987r : null;
        p8Var.f103766f = new te2.i9(this);
        p8Var.f103767g = new te2.j9(this, c22849x81a93d25, p8Var);
        p8Var.f103769i = c22849x81a93d25;
        this.f499687i = p8Var;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(p8Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupAdapter - complete");
    }

    @Override // te2.jc, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f499768n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f499768n = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499767m, "onDetach: stopped observing normalRoomSingState");
        super.mo979x3f5eee52();
    }
}
