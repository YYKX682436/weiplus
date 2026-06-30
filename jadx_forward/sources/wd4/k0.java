package wd4;

/* loaded from: classes4.dex */
public final class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 f526475a;

    /* renamed from: b, reason: collision with root package name */
    public final zh1.z0 f526476b;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 flipView, zh1.z0 enhanceController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flipView, "flipView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enhanceController, "enhanceController");
        this.f526475a = flipView;
        this.f526476b = enhanceController;
        flipView.e(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewRevokeOpenMaterialsEnableLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, do revoke");
        this.f526476b.o(zh1.y0.HIDE);
        this.f526475a.v(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewRevokeOpenMaterialsEnableLogic");
    }
}
