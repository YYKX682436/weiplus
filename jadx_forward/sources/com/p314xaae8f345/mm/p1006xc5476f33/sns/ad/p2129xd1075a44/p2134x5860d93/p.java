package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class p implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y f244888a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar) {
        this.f244888a = yVar;
    }

    @Override // ym5.v1
    /* renamed from: onFlush */
    public void mo66152xaf961065() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGFlushListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar = this.f244888a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.A(yVar) != null) {
            android.widget.ImageView A = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.A(yVar);
            boolean z17 = false;
            if (A != null && A.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.j(), "mThumbIv need to be gone");
                yVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = yVar.f244907w;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                if (c22789xd23e9a9b != null) {
                    c22789xd23e9a9b.j(this);
                }
                android.widget.ImageView A2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.A(yVar);
                if (A2 != null) {
                    A2.clearAnimation();
                }
                android.widget.ImageView A3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.A(yVar);
                if (A3 != null) {
                    A3.setVisibility(8);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGFlushListener$1");
    }
}
