package wd4;

/* loaded from: classes4.dex */
public final class o1 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f526523a;

    public o1(fc4.j0 j0Var) {
        this.f526523a = j0Var;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService, wd4.h params) {
        boolean j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        fc4.j0 j0Var = this.f526523a;
        j0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasDownload", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        xc4.p pVar = j0Var.f342707g;
        if (pVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasDownload", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
            j17 = false;
        } else {
            j17 = com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.o(pVar.W0(), pVar.R0()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasDownload", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC");
        }
        java.lang.Boolean bool = j17 ? java.lang.Boolean.TRUE : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, wd4.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        java.lang.String materialPath = hVar.b().a().f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        java.lang.Object R6 = this.f526523a.R6(materialPath, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        return R6;
    }

    @Override // wd4.e
    /* renamed from: getName */
    public java.lang.String mo173543xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsFlexibleVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2$3");
        return "SnsOnlineVideoActivity$Open";
    }
}
