package ad4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ad4.g f84716a = new ad4.g();

    public final void a(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[1];
        int height = i18 + view.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        b(view, i18, height, i17, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
    }

    public final void b(android.view.View view, int i17, int i18, int i19, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            return;
        }
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo) + i19;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6057x8448adf c6057x8448adf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6057x8448adf();
        am.pv pvVar = c6057x8448adf.f136340g;
        pvVar.f89194a = view;
        pvVar.f89195b = i17;
        pvVar.f89196c = i18;
        pvVar.f89197d = dimensionPixelSize;
        pvVar.f89198e = runnable;
        c6057x8448adf.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.FeedRelocateUtil", "relocateFeed: changeAreaTop:" + i17 + ", changeAreaBottom:" + i18 + ", totalExtraOffsetY:" + dimensionPixelSize);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
    }
}
