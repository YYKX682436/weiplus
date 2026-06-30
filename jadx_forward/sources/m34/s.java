package m34;

/* loaded from: classes4.dex */
public class s implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 f404907d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74) {
        this.f404907d = c17691x8fb37d74;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = this.f404907d;
        c17691x8fb37d74.f244040d = i17;
        c17691x8fb37d74.f244041e = i18;
        if (c17691x8fb37d74.B) {
            c17691x8fb37d74.f244052s.mo50293x3498a0(new m34.r(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = this.f404907d;
        if (c17691x8fb37d74.A) {
            c17691x8fb37d74.f244047n.mo61296x11f3be80(false);
            c17691x8fb37d74.f((int) c17691x8fb37d74.f244048o);
            c17691x8fb37d74.g();
            m34.a0 a0Var = c17691x8fb37d74.f244044h;
            if (a0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayDownloadedPartComplete", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerUI", "onPlayDownloadedPartComplete");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a9933 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iy) a0Var).f250991a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.U6(activityC18151xfc5a9933, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d742 = activityC18151xfc5a9933.f249190e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                c17691x8fb37d742.f244043g.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayDownloadedPartComplete", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                return;
            }
            return;
        }
        c17691x8fb37d74.f244048o = 0.0d;
        c17691x8fb37d74.b(0.0d);
        c17691x8fb37d74.f244047n.mo61296x11f3be80(false);
        c17691x8fb37d74.f(0);
        c17691x8fb37d74.g();
        if (java.lang.System.currentTimeMillis() - c17691x8fb37d74.C < 2000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "Too short onCompletion");
            return;
        }
        c17691x8fb37d74.C = java.lang.System.currentTimeMillis();
        m34.a0 a0Var2 = c17691x8fb37d74.f244044h;
        if (a0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayCompletion", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerUI", "onPlayCompletion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a99332 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iy) a0Var2).f250991a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a99332).f370654i.f379443b++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.U6(activityC18151xfc5a99332, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i17 = activityC18151xfc5a99332.L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i17 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,2,");
                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.V6(activityC18151xfc5a99332));
                sb6.append(",");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str = activityC18151xfc5a99332.M;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str);
                sb6.append(",");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str2 = activityC18151xfc5a99332.N;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str2);
                sb6.append(",");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                sb6.append(",");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str3 = activityC18151xfc5a99332.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str3);
                sb6.append(",");
                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.V6(activityC18151xfc5a99332));
                com.p314xaae8f345.mm.p959x883644fd.r rVar = new com.p314xaae8f345.mm.p959x883644fd.r(13227, sb6.toString(), (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f354821b.g(rVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayCompletion", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoPlayView", "on play video error, what %d extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f404907d.f244046m.mo69303x360802();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        fp.k.b();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74.H;
        this.f404907d.h(true);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m34.q(this, i17, i18));
        return 0;
    }
}
