package k84;

/* loaded from: classes4.dex */
public final class r4 {
    public r4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final boolean a(k84.r4 r4Var, android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        r4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        int i17 = android.os.Build.VERSION.SDK_INT;
        boolean z17 = true;
        if (i17 <= 28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSocialPatComponent", "isWeakDevice is true, for os version, sdk is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        } else {
            int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(context);
            if (c17[0] * c17[1] <= 921600) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSocialPatComponent", "isWeakDevice is true, for screen size, screenWidth is " + c17[0] + ", screenHeight is " + c17[1]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSocialPatComponent", "isWeakDevice, ret is false");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
                z17 = false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isWeakDevice", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$Companion");
        return z17;
    }
}
