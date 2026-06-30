package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f244863a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y f244864b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f244865c;

    public c(int i17) {
        this.f244863a = i17;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdGeneralPAGLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdGeneralPAGLogic", "adGeneralPAGLogic, from not ad to resetUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar = this.f244864b;
        if (yVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17936xdec9f2b4 D = yVar.D();
            if (D != null) {
                D.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout = yVar.A;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout2 = yVar.B;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            yVar.f244908x.removeCallbacksAndMessages(null);
            yVar.f244909y = false;
            yVar.E();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdGeneralPAGLogic");
    }
}
