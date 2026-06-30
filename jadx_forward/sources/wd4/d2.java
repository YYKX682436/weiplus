package wd4;

/* loaded from: classes4.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f526425a;

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 d17;
        wd4.g a17;
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityC18058xc05952ee, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 f76 = activityC18058xc05952ee.f7();
        if (f76 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            d17 = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            wd4.l1 l1Var = f76.f249624h;
            if (l1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "getBottomSheet, mShareSheet is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                d17 = null;
            } else {
                d17 = l1Var.d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, bottomSheet is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 f77 = activityC18058xc05952ee.f7();
        if (f77 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            a17 = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            a17 = wd4.r.a(f77.f249627n, f77.f249629p);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            return;
        }
        int hashCode = d17.hashCode() + a17.m173547x8cdac1b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + a17 + ", token: " + hashCode);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        java.util.WeakHashMap weakHashMap = f526425a;
        boolean contains = (weakHashMap == null || (hashSet = (java.util.HashSet) weakHashMap.get(activityC18058xc05952ee)) == null) ? false : hashSet.contains(java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "tryEnableOpenMaterialsForCurrentMaterial, duplicate");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "markTokenInProgress, token: " + hashCode);
        java.util.WeakHashMap weakHashMap2 = f526425a;
        if (weakHashMap2 == null) {
            weakHashMap2 = new java.util.WeakHashMap();
            f526425a = weakHashMap2;
        }
        java.lang.Object obj = weakHashMap2.get(activityC18058xc05952ee);
        if (obj == null) {
            obj = new java.util.HashSet();
            weakHashMap2.put(activityC18058xc05952ee, obj);
        }
        ((java.util.HashSet) obj).add(java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
        ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC18058xc05952ee), null, null, new wd4.b2(activityC18058xc05952ee, a17, d17, null), 3, null)).p(new wd4.c2(activityC18058xc05952ee, hashCode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
    }
}
