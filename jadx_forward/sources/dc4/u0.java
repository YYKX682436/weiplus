package dc4;

/* loaded from: classes4.dex */
public class u0 implements jb4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.v0 f310363a;

    public u0(dc4.v0 v0Var) {
        this.f310363a = v0Var;
    }

    @Override // jb4.c0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchBegin", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchBegin", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAngleChange", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAngleChange", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$208", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        this.f310363a.E++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$208", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUpdateImage", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        dc4.v0 v0Var = this.f310363a;
        if (dc4.v0.l(v0Var).getVisibility() == 0) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(350L);
            alphaAnimation.setAnimationListener(new dc4.s0(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "do maskImage anim");
            dc4.v0.l(v0Var).startAnimation(alphaAnimation);
        }
        if (dc4.v0.n(v0Var) == null || jb4.v.c(dc4.v0.n(v0Var).f247628g, "scene_timeline")) {
            v0Var.f310381x.m70291xc4a52ce5(true);
            v0Var.f310381x.m70292xd5adfc84(true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "disable touch before shot");
            v0Var.f310381x.m70292xd5adfc84(false);
            v0Var.f310381x.k();
            v0Var.f310381x.d();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new dc4.t0(this, str), 800L);
        }
        if (dc4.v0.m(v0Var).getVisibility() == 0) {
            dc4.v0.m(v0Var).setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "hide progressView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateImage", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }

    @Override // jb4.c0
    /* renamed from: onDetachedFromWindow */
    public void mo70209x8876e98b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromWindow, hash=");
        dc4.v0 v0Var = this.f310363a;
        sb6.append(v0Var.f310381x.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", sb6.toString());
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            int i17 = v0Var.E;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            jSONObject.put("panCount", i17);
            jSONObject.put("type", 1);
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String m70355xb5882a06 = v0Var.f310365e.m70355xb5882a06();
            if (m70355xb5882a06 == null) {
                m70355xb5882a06 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17539, v0Var.f310365e.m70371x485d7().Id, m70355xb5882a06, v0Var.f310365e.m70346x10413e67().f38104xce64ddf1, 2, encode);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "KVReport, id=17539, touchCount=" + encode);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "kvStat exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        v0Var.E = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        v0Var.D = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3");
    }
}
