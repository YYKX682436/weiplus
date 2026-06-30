package l44;

/* loaded from: classes4.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f397913a = new java.util.HashMap();

    public static synchronized boolean a(java.lang.String str) {
        synchronized (l44.u3.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return false;
            }
            java.util.Map map = f397913a;
            if (!((java.util.HashMap) map).containsKey(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                return false;
            }
            boolean booleanValue = ((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRelievedBuyWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return booleanValue;
        }
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSupportShowWeAppLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        if (c17903x3b438f4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportShowWeAppLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return false;
        }
        boolean z17 = c17903x3b438f4.m70135xd6a8f11d() || c17903x3b438f4.m70136xbd5ce118() || c17903x3b438f4.m70153x2c02ceb4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportShowWeAppLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        return z17;
    }

    public static void c(java.lang.String str, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppHelper", "refreshWeAppAuthIcon, weAppUserName==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
            return;
        }
        imageView.setTag(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpShowRelievedBuy", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpShowRelievedBuy", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpShowFlagshipLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_flagship_store, 0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpShowFlagshipLabel", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        boolean z19 = z17 || z18;
        boolean a17 = a(str);
        boolean z27 = !c17902x72cc1771.f38095xf9ddf9f0 && z19 && a17;
        if (z27) {
            imageView.setVisibility(0);
        } else if (imageView.getVisibility() == 0) {
            imageView.setVisibility(4);
        }
        synchronized (l44.u3.class) {
            try {
                ((java.util.HashMap) f397913a).put(str, java.lang.Boolean.valueOf(z27));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppHelper", "refreshWeAppGuaranteeAuthIcon, isExpShowFlagshipLabel=" + z18 + ", isExpShowRelievedBuy=" + z17 + ", isForbid=" + c17902x72cc1771.f38095xf9ddf9f0 + ", cache=" + a17);
        if (c17902x72cc1771.f38095xf9ddf9f0 || !z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        } else {
            ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ri(str, new l44.t3(imageView, z18, z17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshWeAppGuaranteeAuthIcon", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
        }
    }
}
