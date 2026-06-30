package dc4;

/* loaded from: classes4.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f310284d;

    public h0(dc4.l0 l0Var) {
        this.f310284d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u74.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18402xe28da210 c18402xe28da210;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        dc4.l0 l0Var = this.f310284d;
        l0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        try {
            dVar = l0Var.f310306t;
            c18402xe28da210 = dVar.f506688p;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAdDetailItemNew", "handleVideoCompletion, exp" + e17.toString());
        }
        if (c18402xe28da210 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdDetailItemNew", "checkShowEndView, viewHolder.videoEndView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = l0Var.f310303q;
        if (nVar == null || nVar.f38339xebc26caf == null) {
            c18402xe28da210.c(false);
        } else {
            if (dVar.T.f506666c) {
                c18402xe28da210.m71241xb0523095(dVar.f506695w.m71200xab066d00());
            } else {
                c18402xe28da210.m71241xb0523095(dVar.f506687o.f249950g.m70610xab066d00());
            }
            l0Var.f310306t.f506688p.d();
            l0Var.f310306t.f506688p.f(true);
            l0Var.f310305s = true;
            u74.d dVar2 = l0Var.f310306t;
            if (!dVar2.T.f506666c) {
                dVar2.f506687o.f249950g.k(0, false);
            } else if (dVar2.f506695w.m71200xab066d00() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) {
                l0Var.f310306t.f506695w.M(0, false);
                l0Var.f310306t.f506695w.F();
            }
            l0Var.f310307u.h(l0Var.f310306t.T.f506666c, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEndViewShow", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            fd4.l lVar = l0Var.f310308v;
            if (lVar instanceof fd4.k) {
                ((fd4.k) lVar).t(l0Var.f310306t, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEndViewShow", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new dc4.j0(l0Var), l0Var.f310303q.f38339xebc26caf.f251869d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
    }
}
