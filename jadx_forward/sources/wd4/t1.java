package wd4;

/* loaded from: classes4.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f526563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3 f526564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pi f526565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f526566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c3 c3Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pi piVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1);
        this.f526563d = activityC18058xc05952ee;
        this.f526564e = c3Var;
        this.f526565f = piVar;
        this.f526566g = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f526563d;
        activityC18058xc05952ee.y7(this.f526564e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        java.util.List list = activityC18058xc05952ee.H1;
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        } else {
            ((java.util.ArrayList) list).remove(this.f526565f);
            if (((java.util.ArrayList) activityC18058xc05952ee.H1).isEmpty()) {
                activityC18058xc05952ee.H1 = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        this.f526566g.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(booleanValue)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
        return f0Var;
    }
}
