package k64;

/* loaded from: classes4.dex */
public abstract class s implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f386142d;

    public s(int i17) {
        this.f386142d = i17;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
        try {
            b(-1, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NetSceneEnd", "there is an exception: " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
    }

    public abstract void b(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
        try {
            gm0.j1.d().q(this.f386142d, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneEnd", "errType is " + i17 + ", errCode is " + i18 + ", errMsg is " + str);
            if (i17 == 0 && i18 == 0 && m1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
                b(0, m1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
            } else {
                a();
            }
        } catch (java.lang.Throwable unused) {
            a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneEnd");
    }
}
