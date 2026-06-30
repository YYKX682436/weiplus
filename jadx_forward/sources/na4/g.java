package na4;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final na4.g f417522a = new na4.g();

    /* renamed from: b, reason: collision with root package name */
    public static na4.a f417523b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f417524c = -1;

    public final na4.a a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(null);
        int i18 = a17.f278668a;
        int i19 = (i18 * 16) / 9;
        if (i17 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNavigationBarHeightValue", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            f417524c = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNavigationBarHeightValue", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            int i27 = f417524c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            i17 = i27;
        }
        f417524c = i17;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int e17 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        int i28 = i17 + h17 + e17 + i19;
        int i29 = a17.f278669b;
        na4.a cVar = i29 >= i28 ? new na4.c() : i29 > i19 + i17 ? new na4.d(true) : i29 > i19 ? new na4.e(true, true) : i29 == i19 ? new na4.b(true, true) : i29 < i19 ? new na4.f(true, true) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateResolutionRadioConfig: config:");
        sb6.append(cVar != null ? cVar.getClass().getCanonicalName() : null);
        sb6.append(", shortSide:");
        sb6.append(i18);
        sb6.append(", longSide:");
        sb6.append(i29);
        sb6.append(", bottomHeight:");
        sb6.append(i17);
        sb6.append(", statusBarHeight:");
        sb6.append(h17);
        sb6.append(", actionbarHeight:");
        sb6.append(e17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsResolutionRadioConfigManager", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        return cVar;
    }
}
