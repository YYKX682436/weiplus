package s34;

/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484184a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484185b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484186c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484187d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f484188e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f484189f;

    public static s34.h0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str + ".finderEncryptedTopicId");
            java.lang.String str3 = (java.lang.String) map.get(str + ".finderTopicName");
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                s34.h0 h0Var = new s34.h0();
                h0Var.f484184a = str2;
                h0Var.f484185b = str3;
                java.lang.String str4 = (java.lang.String) map.get(str + ".finderTopicTitle");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                h0Var.f484186c = str4;
                java.lang.String str6 = (java.lang.String) map.get(str + ".relationText");
                if (str6 != null) {
                    str5 = str6;
                }
                h0Var.f484187d = str5;
                h0Var.f484188e = c(map, str + ".relationAvatarList");
                h0Var.f484189f = b(map, str + ".finderTopicResList");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
                return h0Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
    }

    public static java.util.List b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        s34.i0 b17 = s34.i0.b(map, str + ".finderTopicResInfo");
        if (b17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        arrayList.add(b17);
        for (int i17 = 1; i17 < 5; i17++) {
            s34.i0 b18 = s34.i0.b(map, str + ".finderTopicResInfo" + i17);
            if (b18 == null) {
                break;
            }
            arrayList.add(b18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        return arrayList;
    }

    public static java.util.List c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".avatar");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        arrayList.add(str2);
        int i17 = 1;
        while (true) {
            if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str + ".avatar" + i17)) || i17 >= 10) {
                break;
            }
            arrayList.add((java.lang.String) map.get(str + ".avatar" + i17));
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        return arrayList;
    }
}
