package s34;

/* loaded from: classes4.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int f484278a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484279b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484280c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484281d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f484282e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f484283f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f484284g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f484285h;

    /* renamed from: i, reason: collision with root package name */
    public float f484286i;

    /* renamed from: j, reason: collision with root package name */
    public float f484287j;

    /* renamed from: likeAnimIconList */
    @za4.l1
    public java.util.List<s34.q0> f76714x9f6a5b1f;

    public static s34.r0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".liveType");
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        try {
            s34.r0 r0Var = new s34.r0();
            r0Var.f484278a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
            java.lang.String str3 = (java.lang.String) map.get(str + ".liveParams");
            java.lang.String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            r0Var.f484279b = str3;
            java.lang.String str5 = (java.lang.String) map.get(str + ".finderUsername");
            if (str5 == null) {
                str5 = "";
            }
            r0Var.f484280c = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".finderLiveId");
            if (str6 != null) {
                str4 = str6;
            }
            r0Var.f484281d = str4;
            r0Var.f484282e = b(map, str + ".pendingDescList");
            r0Var.f484283f = b(map, str + ".livingDescList");
            r0Var.f484284g = b(map, str + ".endDescList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".showLikeAnimation");
            r0Var.f484285h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0) > 0;
            r0Var.f484286i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".likeAnimationInterval"));
            r0Var.f484287j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str + ".likeAnimationScale"));
            r0Var.f76714x9f6a5b1f = c(map, str + ".liveCheerIconList");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return r0Var;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
    }

    public static java.util.List b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".descText");
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str2);
        int i17 = 1;
        while (true) {
            java.lang.String str3 = (java.lang.String) map.get(str + ".descText" + i17);
            if (str3 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseDescList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
                return arrayList;
            }
            arrayList.add(str3);
            i17++;
        }
    }

    public static java.util.List c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
            return arrayList;
        }
        java.lang.String str2 = str + ".iconInfo";
        int i17 = 0;
        while (map.containsKey(str2)) {
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".iconUrl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".sampleRate"), 0);
            if (!android.text.TextUtils.isEmpty(str3) && D1 > 0 && D1 <= 100) {
                s34.q0 q0Var = new s34.q0();
                q0Var.f76712x61ad9236 = str3;
                q0Var.f484276a = D1;
                arrayList.add(q0Var);
            }
            i17++;
            str2 = str + ".iconInfo" + i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseLikeIconList", "com.tencent.mm.plugin.sns.ad.adxml.AdLiveInfo");
        return arrayList;
    }
}
