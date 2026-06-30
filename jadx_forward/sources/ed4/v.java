package ed4;

/* loaded from: classes4.dex */
public class v implements jb4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 f332861a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 q0Var) {
        this.f332861a = q0Var;
    }

    @Override // jb4.c0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchBegin", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchBegin", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAngleChange", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAngleChange", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$008", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        this.f332861a.f250946x++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$008", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.q.f69936x24728b, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 q0Var = this.f332861a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = q0Var.f250940r;
        java.lang.String str2 = pVar != null ? pVar.f247628g : "";
        if (str != null && !str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, url != CardInfo.sphereImageUrl, url=" + str + ", info.url=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var = q0Var.f250941s;
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, viewHolder==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, isFirstUpdateImage=" + q0Var.f250942t + ", visiable=" + p0Var.M0.getVisibility());
        if (q0Var.f250942t) {
            if (p0Var.M0.getVisibility() == 0) {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(350L);
                alphaAnimation.setAnimationListener(new ed4.t(this, p0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "do maskImage anim");
                p0Var.M0.startAnimation(alphaAnimation);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar2 = q0Var.f250940r;
            if (pVar2 == null || jb4.v.c(pVar2.f247628g, "scene_timeline")) {
                q0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "don't need shot, enable sensor, isInLowPriority=false");
                q0Var.getClass();
                p0Var.G0.m70291xc4a52ce5(true);
                q0Var.f250942t = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "disable touch before shot");
                p0Var.G0.m70292xd5adfc84(false);
                p0Var.G0.k();
                p0Var.G0.d();
                q0Var.f250945w.mo50297x7c4d7ca2(new ed4.u(this, str, p0Var), 800L);
            }
        }
        if (p0Var.N0.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "hide progressView");
            p0Var.N0.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }

    @Override // jb4.c0
    /* renamed from: onDetachedFromWindow */
    public void mo70209x8876e98b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDetachedFromWindow reset");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 q0Var = this.f332861a;
        q0Var.f250942t = true;
        q0Var.f250943u = true;
        q0Var.f250944v = null;
        q0Var.f250945w.mo50302x6b17ad39(null);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            int i17 = q0Var.f250946x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            jSONObject.put("panCount", i17);
            jSONObject.put("type", 1);
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = q0Var.f250784h.c(q0Var.f250941s.f250795c);
            java.lang.String m70355xb5882a06 = c17.m70355xb5882a06();
            if (m70355xb5882a06 == null) {
                m70355xb5882a06 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17539, c17.m70371x485d7().Id, m70355xb5882a06, c17.m70346x10413e67().f38104xce64ddf1, 1, encode);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "KVReport, id=17539, touchCount=" + encode + ", snsInfo.hash=" + c17.hashCode());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "kvStat exp:" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        q0Var.f250946x = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
    }
}
