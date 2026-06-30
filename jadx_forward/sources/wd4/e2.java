package wd4;

/* loaded from: classes4.dex */
public final class e2 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f526429a;

    /* renamed from: b, reason: collision with root package name */
    public final zh1.z0 f526430b;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee snsGalleryUI, zh1.z0 enhanceController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsGalleryUI, "snsGalleryUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enhanceController, "enhanceController");
        this.f526429a = snsGalleryUI;
        this.f526430b = enhanceController;
        snsGalleryUI.w7(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIRevokeOpenMaterialsEnableLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onMediaChange, do revoke");
        this.f526430b.o(zh1.y0.HIDE);
        this.f526429a.y7(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIRevokeOpenMaterialsEnableLogic");
    }
}
