package wd4;

/* loaded from: classes4.dex */
public final class w1 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f526586a;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee) {
        this.f526586a = activityC18058xc05952ee;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService, wd4.h params) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (params.b().b() != bi1.g.SNS_IMAGE) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return bool;
        }
        java.lang.String str = params.b().a().f167804f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f526586a;
        activityC18058xc05952ee.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 f76 = activityC18058xc05952ee.f7();
        if (f76 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            arrayList = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            java.lang.String i17 = f76.i();
            if (!str.equals(i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "getCodeScanResult, mediaPath: %s, curMediaPath: %s", str, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            } else if (f76.f249625i != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "getCodeScanResult, recognizingFilePath not null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            } else {
                arrayList = f76.f249635v;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            }
            arrayList = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (arrayList == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((zh1.p) openMaterialService).wi(arrayList));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return valueOf;
    }

    @Override // wd4.c
    public java.lang.Object b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, wd4.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        if (hVar.b().b() != bi1.g.SNS_IMAGE) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        } else {
            java.lang.String materialPath = hVar.b().a().f167804f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            wd4.u1 u1Var = new wd4.u1(materialPath, h0Var);
            wd4.v1 v1Var = new wd4.v1(materialPath, h0Var, k5Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f526586a;
            h0Var.f391656d = new wd4.t1(activityC18058xc05952ee, u1Var, v1Var, nVar);
            activityC18058xc05952ee.w7(u1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            if (activityC18058xc05952ee.H1 == null) {
                activityC18058xc05952ee.H1 = new java.util.ArrayList();
            }
            ((java.util.ArrayList) activityC18058xc05952ee.H1).add(v1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return a17;
    }

    @Override // wd4.e
    /* renamed from: getName */
    public java.lang.String mo173543xfb82e301() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
        return "SnsGalleryUI$Fetch";
    }
}
