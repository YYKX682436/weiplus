package n74;

/* loaded from: classes4.dex */
public class b1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f416838d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f416839e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 f416840f;

    public b1(int i17, java.lang.String str, n74.y0 y0Var) {
        this.f416838d = i17;
        this.f416839e = str;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 a(n74.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = b1Var.f416840f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        return c17902x72cc1771;
    }

    public static void b(n74.b1 b1Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        b1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        long F0 = ca4.z0.F0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(F0);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", "adInfo can not get from DB due to adsnsinfo is null, longSnsId = " + F0 + ", snsId = " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        } else {
            b1Var.f416840f = y07.m70299x10413e67();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }

    public static void c(n74.b1 b1Var, ca4.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        b1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        bVar.f121353b = null;
        bVar.f121356e = null;
        bVar.f121357f = null;
        bVar.f121355d.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }

    public static void d(n74.b1 b1Var, ca4.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        b1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        if (b1Var.f416840f == null || bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", "adInfo or adChainData is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n74.z0(b1Var, bVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        if (m1Var instanceof i64.o0) {
            try {
                r45.go3 go3Var = (r45.go3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType = ");
                sb6.append(i17);
                sb6.append(", errCode = ");
                sb6.append(i18);
                sb6.append(", snsId = ");
                sb6.append(this.f416839e);
                sb6.append(", rsp.sns_ad_id = ");
                sb6.append(go3Var == null ? "" : go3Var.f456927e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicDataReqHelper", sb6.toString());
                if (i17 == 0 && i18 == 0 && go3Var != null) {
                    int i19 = go3Var.f456926d;
                    java.lang.String str2 = go3Var.f456927e;
                    java.lang.String str3 = go3Var.f456928f;
                    int i27 = this.f416838d;
                    if (i27 == 1 && i27 == i19 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.f416839e, str3) && this.f416839e.equals(str2)) {
                        java.lang.String str4 = this.f416839e;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
                        ((ku5.t0) ku5.t0.f394148d).g(new n74.a1(this, str4, str3));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
                    }
                }
                gm0.j1.d().q(m1Var.mo808xfb85f7b0(), this);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicDataReqHelper", "NetSceneDynamicAdDataUpdate onSceneEnd exp=" + th6.toString() + ", snsId = " + this.f416839e);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
    }
}
