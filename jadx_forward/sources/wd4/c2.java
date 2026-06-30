package wd4;

/* loaded from: classes4.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f526418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f526419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee, int i17) {
        super(1);
        this.f526418d = activityC18058xc05952ee;
        this.f526419e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markTokenDone, token: ");
        int i17 = this.f526419e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", sb6.toString());
        java.util.WeakHashMap weakHashMap = wd4.d2.f526425a;
        if (weakHashMap == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f526418d;
            java.util.HashSet hashSet = (java.util.HashSet) weakHashMap.get(activityC18058xc05952ee);
            if (hashSet == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            } else {
                if (hashSet.remove(java.lang.Integer.valueOf(i17)) && hashSet.isEmpty() && weakHashMap.remove(activityC18058xc05952ee) != null && weakHashMap.isEmpty()) {
                    wd4.d2.f526425a = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
        return f0Var;
    }
}
