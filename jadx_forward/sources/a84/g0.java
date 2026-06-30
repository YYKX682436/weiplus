package a84;

/* loaded from: classes4.dex */
public abstract class g0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.c2 {
    public static double n(android.os.Bundle bundle, java.lang.String str, double d17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
        if (bundle == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
            return d17;
        }
        try {
            d17 = bundle.getDouble(str, d17);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
        return d17;
    }
}
