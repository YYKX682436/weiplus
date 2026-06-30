package wd4;

/* loaded from: classes4.dex */
public final class a2 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f526396a;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee) {
        this.f526396a = activityC18058xc05952ee;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService, wd4.h params) {
        boolean l17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.String str = params.b().a().f167804f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f526396a;
        activityC18058xc05952ee.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = activityC18058xc05952ee.f248343o;
        if (c18064xe6e1a3b3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryUI", "getDownloadResult, flipView is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            l17 = false;
        } else {
            l17 = c18064xe6e1a3b3.l(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        java.lang.Boolean bool = l17 ? java.lang.Boolean.TRUE : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, wd4.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        java.lang.String materialPath = hVar.b().a().f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        bi1.g b17 = hVar.b().b();
        bi1.g gVar = bi1.g.SNS_VIDEO;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f526396a;
        if (b17 == gVar) {
            activityC18058xc05952ee.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = activityC18058xc05952ee.f248343o;
            if (c18064xe6e1a3b3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsGalleryUI", "startDownloadVideo, flipView is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                z17 = false;
            } else {
                boolean y17 = c18064xe6e1a3b3.y(materialPath);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                z17 = y17;
            }
            if (!z17) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        wd4.z1 z1Var = new wd4.z1(materialPath, h0Var);
        wd4.y1 y1Var = new wd4.y1(materialPath, h0Var);
        h0Var.f391656d = new wd4.x1(activityC18058xc05952ee, z1Var, y1Var, nVar);
        activityC18058xc05952ee.w7(z1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = activityC18058xc05952ee.f248343o;
        if (c18064xe6e1a3b32 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            if (c18064xe6e1a3b32.S == null) {
                c18064xe6e1a3b32.S = new java.util.ArrayList();
            }
            ((java.util.ArrayList) c18064xe6e1a3b32.S).add(y1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return a17;
    }

    @Override // wd4.e
    /* renamed from: getName */
    public java.lang.String mo173543xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
        return "SnsGalleryUI$Open";
    }
}
