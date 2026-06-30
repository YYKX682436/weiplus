package wd4;

/* loaded from: classes4.dex */
public final class g0 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 f526438a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2) {
        this.f526438a = abstractC17957x723314d2;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService, wd4.h params) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.Boolean bool = this.f526438a.l(params.b().a().f167804f) ? java.lang.Boolean.TRUE : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, wd4.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        java.lang.String materialPath = hVar.b().a().f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        bi1.g b17 = hVar.b().b();
        bi1.g gVar = bi1.g.SNS_VIDEO;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2 = this.f526438a;
        if (b17 == gVar && !abstractC17957x723314d2.y(materialPath)) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        wd4.f0 f0Var = new wd4.f0(materialPath, h0Var);
        wd4.e0 e0Var = new wd4.e0(materialPath, h0Var);
        h0Var.f391656d = new wd4.d0(abstractC17957x723314d2, f0Var, e0Var, nVar);
        abstractC17957x723314d2.e(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (abstractC17957x723314d2.S == null) {
            abstractC17957x723314d2.S = new java.util.ArrayList();
        }
        ((java.util.ArrayList) abstractC17957x723314d2.S).add(e0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return a17;
    }

    @Override // wd4.e
    /* renamed from: getName */
    public java.lang.String mo173543xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return "FlipView$Open";
    }
}
