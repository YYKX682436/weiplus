package ed4;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n f332848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa f332849e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa c18286x16099eaa, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar) {
        this.f332849e = c18286x16099eaa;
        this.f332848d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$7");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.C18286x16099eaa c18286x16099eaa = this.f332849e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = this.f332848d;
        c18286x16099eaa.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullCardAdTimeLineItemNew", "handleVideoCompletion, exp" + e17.toString());
        }
        if (c18286x16099eaa.f250844r.D0.f506688p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "checkShowEndView, videoEndView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$7");
        }
        if (nVar == null || nVar.f38339xebc26caf == null || !c18286x16099eaa.f250845s) {
            c18286x16099eaa.f250844r.D0.f506688p.c(false);
        } else {
            u74.d dVar = c18286x16099eaa.f250844r.D0;
            if (dVar.T.f506666c) {
                dVar.f506688p.m71241xb0523095(dVar.f506695w.m71200xab066d00());
            } else {
                dVar.f506688p.m71241xb0523095(dVar.f506687o.f249950g.m70610xab066d00());
            }
            c18286x16099eaa.f250844r.D0.f506688p.d();
            c18286x16099eaa.f250844r.D0.f506688p.f(true);
            c18286x16099eaa.f250846t = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar = c18286x16099eaa.f250844r;
            u74.d dVar2 = yVar.D0;
            if (!dVar2.T.f506666c) {
                yVar.f250802f0.f249950g.k(0, false);
            } else if (dVar2.f506695w.m71200xab066d00() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) {
                c18286x16099eaa.f250844r.D0.f506695w.M(0, false);
                c18286x16099eaa.f250844r.D0.f506695w.F();
            }
            c18286x16099eaa.f250849w.h(c18286x16099eaa.f250844r.D0.T.f506666c, true);
            c18286x16099eaa.G();
            c18286x16099eaa.f250843q.postDelayed(new ed4.m(c18286x16099eaa), nVar.f38339xebc26caf.f251869d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$7");
    }
}
