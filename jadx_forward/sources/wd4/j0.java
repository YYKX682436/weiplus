package wd4;

/* loaded from: classes4.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap f526469a;

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2) {
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC17957x723314d2, "<this>");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 m70573xb4dbbcbe = abstractC17957x723314d2.m70573xb4dbbcbe();
        if (m70573xb4dbbcbe == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, bottomSheet is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            return;
        }
        wd4.g m70576x3642d358 = abstractC17957x723314d2.m70576x3642d358();
        if (m70576x3642d358 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            return;
        }
        int hashCode = m70573xb4dbbcbe.hashCode() + m70576x3642d358.m173547x8cdac1b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + m70576x3642d358 + ", token: " + hashCode);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        java.util.WeakHashMap weakHashMap = f526469a;
        boolean contains = (weakHashMap == null || (hashSet = (java.util.HashSet) weakHashMap.get(abstractC17957x723314d2)) == null) ? false : hashSet.contains(java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, duplicate");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials_FlipView", "markTokenInProgress, token: " + hashCode);
        java.util.WeakHashMap weakHashMap2 = f526469a;
        if (weakHashMap2 == null) {
            weakHashMap2 = new java.util.WeakHashMap();
            f526469a = weakHashMap2;
        }
        java.lang.Object obj = weakHashMap2.get(abstractC17957x723314d2);
        if (obj == null) {
            obj = new java.util.HashSet();
            weakHashMap2.put(abstractC17957x723314d2, obj);
        }
        ((java.util.HashSet) obj).add(java.lang.Integer.valueOf(hashCode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
        ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(abstractC17957x723314d2), null, null, new wd4.h0(abstractC17957x723314d2, m70576x3642d358, m70573xb4dbbcbe, null), 3, null)).p(new wd4.i0(abstractC17957x723314d2, hashCode));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
    }
}
