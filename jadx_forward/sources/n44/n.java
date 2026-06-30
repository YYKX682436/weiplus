package n44;

/* loaded from: classes.dex */
public final class n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f416534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f416535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.r f416536f;

    public n(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, p3325xe03a0797.p3326xc267989b.q qVar, yz5.r rVar) {
        this.f416534d = m1Var;
        this.f416535e = qVar;
        this.f416536f = rVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$_onSceneEnd$1");
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = this.f416534d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, m1Var2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", "request onSceneEnd");
            gm0.j1.d().q(m1Var2.mo808xfb85f7b0(), this);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f416535e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f416536f.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdHalfScreenJumpHelper", "request, scene is not netScene");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$request$2$_onSceneEnd$1");
    }
}
