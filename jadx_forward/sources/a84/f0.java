package a84;

/* loaded from: classes4.dex */
public abstract class f0 {
    public static java.lang.String a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillDigital", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        if (i17 > 9 || i17 < 0) {
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillDigital", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
            return valueOf;
        }
        java.lang.String str = "0" + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillDigital", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return str;
    }

    public static long b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getServerTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getServerTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return c17;
    }

    public static boolean c(long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCountDownTimeValid", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        long b17 = b();
        if (j17 == 0) {
            j17 = b17;
        }
        if (j17 < 0 || j17 > b17 || j18 < b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCountDownTimeValid", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
            return false;
        }
        boolean z17 = ((int) ((j18 - b17) / 86400000)) < 100;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCountDownTimeValid", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return z17;
    }

    public static a84.e0 d(long j17, a84.e0 e0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        if (e0Var == null) {
            e0Var = new a84.e0();
        }
        int i17 = (int) (j17 / 86400000);
        e0Var.f83805a = i17;
        int i18 = (int) ((j17 - (i17 * 86400000)) / 3600000);
        e0Var.f83806b = i18;
        int i19 = (int) (((j17 - (i17 * 86400000)) - (i18 * 3600000)) / 60000);
        e0Var.f83807c = i19;
        e0Var.f83808d = (int) ((((j17 - (i17 * 86400000)) - (i18 * 3600000)) - (i19 * 60000)) / 1000);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
        return e0Var;
    }
}
