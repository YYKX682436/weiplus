package wd4;

/* loaded from: classes4.dex */
public final class q implements wd4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526536a;

    public q(java.lang.String str) {
        this.f526536a = str;
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService, wd4.h params) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 mo173544xed95cea1 = params.a().mo173544xed95cea1();
        java.lang.String str = this.f526536a;
        if (mo173544xed95cea1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryEnable, bottomSheet is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            return false;
        }
        java.lang.String str2 = params.b().a().f167804f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurMaterialPathProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurMaterialPathProvider", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, params.f526448e.mo173545xed95cea1())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryEnable, materialPath changed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        return false;
    }

    @Override // wd4.e
    /* renamed from: getName */
    public java.lang.String mo173543xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$conditionAfterLongTimesWork$1");
        return "OpenMaterials$Check";
    }
}
