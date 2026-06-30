package za4;

/* loaded from: classes4.dex */
public class p1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f552714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ za4.q1 f552715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552716g;

    public p1(java.lang.String str, int i17, za4.q1 q1Var, java.lang.String str2) {
        this.f552713d = str;
        this.f552714e = i17;
        this.f552715f = q1Var;
        this.f552716g = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
        za4.q1 q1Var = this.f552715f;
        java.lang.String str3 = this.f552713d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenCanvasMgr", "cgi fail pageid %s,preLoad %d, errType %d,errCode %d", str3, java.lang.Integer.valueOf(this.f552714e), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (q1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.va) q1Var).a(false, "");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
            return 0;
        }
        java.lang.String i19 = ((r45.oj3) oVar.f152244b.f152233a).f463834d.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenCanvasMgr", "getCanvasInfo pageid %s ,xml %s", str3, i19);
        if (q1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.va) q1Var).a(true, i19);
        }
        if (!android.text.TextUtils.isEmpty(i19)) {
            za4.s1 b17 = za4.s1.b();
            b17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addUxCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
            if (!android.text.TextUtils.isEmpty(i19) && !android.text.TextUtils.isEmpty(str3)) {
                java.lang.String str4 = this.f552716g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    str2 = str3;
                } else {
                    str2 = str3 + str4;
                }
                ((java.util.HashMap) b17.f552728e).put(str2, i19);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a3 a3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a3();
                a3Var.f67959x17759238 = str3;
                a3Var.f67960xd73cee9a = i19;
                a3Var.f67958xd73ca8a4 = str4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b3 b3Var = b17.f552727d;
                b3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a3Var.f67960xd73cee9a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                } else {
                    a3Var.f67961xac3be4e = java.lang.System.currentTimeMillis();
                    if (!b3Var.mo880xb970c2b9(a3Var)) {
                        b3Var.mo9952xce0038c9(a3Var, new java.lang.String[0]);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertOrUpdate", "com.tencent.mm.plugin.sns.storage.UxCanvasInfoStorage");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUxCache", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.OpenCanvasMgr$3");
        return 0;
    }
}
