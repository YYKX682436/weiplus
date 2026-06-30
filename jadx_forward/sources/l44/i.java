package l44;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static float f397702b;

    /* renamed from: c, reason: collision with root package name */
    public static float f397703c;

    /* renamed from: a, reason: collision with root package name */
    public static final l44.i f397701a = new l44.i();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f397704d = new java.util.HashMap();

    public static final void b(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordScreenWidthHeight", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        if (context == null || f397702b > 0.0f || f397703c > 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordScreenWidthHeight", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
            return;
        }
        f397702b = com.p314xaae8f345.mm.ui.bl.b(context).x;
        f397703c = com.p314xaae8f345.mm.ui.bl.b(context).y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickCoordinateHelper", "record screen height = " + f397703c + ", screen width = " + f397702b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordScreenWidthHeight", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
    }

    public final float a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoordinateY", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        view.getLocationOnScreen(new int[2]);
        java.lang.Float valueOf = java.lang.Float.valueOf(r3[1]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoordinate", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        float floatValue = valueOf.floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoordinateY", "com.tencent.mm.plugin.sns.ad.helper.AdClickCoordinateReportHelper");
        return floatValue;
    }
}
