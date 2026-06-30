package l44;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static long f397744a;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkWriteGiftCodeAndShowTip", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (!android.text.TextUtils.isEmpty(str)) {
            c(str);
            if (!android.text.TextUtils.isEmpty(str2)) {
                long j17 = f397744a;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (java.lang.System.currentTimeMillis() - j17 > 1500) {
                    f397744a = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new l44.j(context, str2), 800L);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWriteGiftCodeAndShowTip", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("wx_ad_pkgname", str);
            jSONObject.put("wx_ad_deeplink", str2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "wx_ad_deeplink", jSONObject.toString(), null);
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeDelayDeepLink", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }

    public static void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "wx_ad_giftcode", str, null);
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeGiftCode", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper");
    }
}
