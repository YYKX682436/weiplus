package k64;

/* loaded from: classes4.dex */
public class r extends k64.a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public e74.j f386141f;

    public r(java.lang.String str, java.lang.String str2, r45.a3[] a3VarArr) {
        J(new r45.b3(), new r45.c3(), "/cgi-bin/mmoc-bin/adplayinfo/ad_dynamic_update", 5012, str, str2, a3VarArr);
    }

    @Override // k64.a
    public void H(r45.mr5 mr5Var, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        r45.b3 b3Var = (r45.b3) mr5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        try {
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.String str2 = (java.lang.String) objArr[1];
            r45.a3[] a3VarArr = (r45.a3[]) objArr[2];
            if (b3Var != null) {
                b3Var.f452021d = str;
                b3Var.f452022e = str2;
                if (a84.b0.g(a3VarArr)) {
                    java.util.Collections.addAll(b3Var.f452023f, a3VarArr);
                }
                b3Var.f452023f.size();
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdDynamicUpdate", "fillRequestParam::convert to param throw wrong!!!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    public void K(e74.j jVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSend", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        gm0.j1.d().a(5012, this);
        gm0.j1.d().g(this);
        this.f386141f = jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSend", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    public void L(int i17, java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResponseFinish", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        e74.j jVar = this.f386141f;
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f394148d).B(new k64.q(this, jVar, i17, str, list));
        } else if (jVar != null) {
            jVar.a(i17, str, list);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponseFinish", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.c3 c3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        gm0.j1.d().q(5012, this);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof k64.r) && (c3Var = (r45.c3) ((k64.r) m1Var).I()) != null) {
            L(0, c3Var.f452784d, c3Var.f452785e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        } else {
            L(-1, "", null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        }
    }
}
