package a84;

/* loaded from: classes4.dex */
public abstract class b0 {
    public static boolean a(int i17, java.util.Collection collection) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIndexOutOfBounds", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = b(collection) || i17 < 0 || i17 >= collection.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIndexOutOfBounds", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean b(java.util.Collection collection) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = collection == null || collection.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean c(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = map == null || map.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean d(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = objArr == null || objArr.length == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean e(java.util.Collection collection) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = !b(collection);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean f(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = !c(map);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean g(java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = !d(objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }
}
