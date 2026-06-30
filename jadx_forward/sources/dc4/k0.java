package dc4;

/* loaded from: classes4.dex */
public class k0 implements u74.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f310300a;

    public k0(dc4.l0 l0Var) {
        this.f310300a = l0Var;
    }

    @Override // u74.e
    public void a(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        dc4.l0 l0Var = this.f310300a;
        int m70621x51e8b0a = z17 ? dc4.l0.l(l0Var).f506695w.m70621x51e8b0a() / 1000 : dc4.l0.l(l0Var).f506687o.f249950g.m70609x37a7fa50() / 1000;
        l0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        long j17 = l0Var.f310365e.f68891x29d1292e;
        i64.b1 b1Var = l0Var.f310304r;
        if (b1Var != null) {
            b1Var.s(j17);
            b1Var.v(j17, i17);
            if (!b1Var.m(j17)) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                b1Var.w(j17, android.os.SystemClock.elapsedRealtime());
                b1Var.x(j17, m70621x51e8b0a, true);
                b1Var.d(j17, j17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = l0Var.f310303q;
        u74.d dVar = l0Var.f310306t;
        n74.i1.c(nVar, i17, dVar.f506685m, dVar.f506686n);
        k84.f4.c(i17, l0Var.f310306t, l0Var.f310365e);
        p84.e eVar = l0Var.f310307u.f506706h;
        if (eVar != null) {
            eVar.c(i17);
        }
        long j18 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        fd4.l lVar = l0Var.f310308v;
        if (lVar != null) {
            lVar.g(j18, m70621x51e8b0a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }

    @Override // u74.e
    public void b(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", "onStart, isOnlineVideoView=" + z17 + ", duration=" + i17 + ", hash=" + this.f310300a.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }

    @Override // u74.e
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }

    @Override // u74.e
    public void d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion, isOnlineVideoView=");
        sb6.append(z17);
        sb6.append(", hash=");
        dc4.l0 l0Var = this.f310300a;
        sb6.append(l0Var.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", sb6.toString());
        l0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.f fVar = l0Var.f310307u;
        p84.e eVar = fVar.f506706h;
        if (eVar != null) {
            eVar.b();
        }
        if (l0Var.f310303q.f38339xebc26caf == null) {
            fVar.j(l0Var.f310306t.T.f506666c);
        }
        l0Var.f310304r.b(l0Var.f310365e.f68891x29d1292e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dc4.h0(l0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }
}
