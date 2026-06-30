package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f247683a;

    public static com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                str2 = str;
            } else {
                str2 = str + i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValueKey", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
            }
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".type");
            if (android.text.TextUtils.isEmpty(str3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                return null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str3, 0) == 136) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v();
                vVar.f247683a = (java.lang.String) map.get(str2 + ".webViewUrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.ADXml$FloatWebViewInfo");
                return vVar;
            }
            i17++;
        }
    }
}
