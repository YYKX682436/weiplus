package s34;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f484137a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484138b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f484139c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484140d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f484141e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f484142f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f484143g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f484144h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f484145i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f484146j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f484147k;

    /* renamed from: l, reason: collision with root package name */
    public final long f484148l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f484149m;

    public d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, long j17, java.lang.String str11) {
        this.f484137a = i17;
        this.f484138b = str;
        this.f484139c = str2;
        this.f484140d = str3;
        this.f484141e = str4;
        this.f484142f = str5;
        this.f484143g = str6;
        this.f484144h = str7;
        this.f484145i = str8;
        this.f484146j = str9;
        this.f484147k = str10;
        this.f484148l = j17;
        this.f484149m = str11;
    }

    public static final s34.d b(java.util.Map map, java.lang.String str) {
        java.lang.Long j17;
        java.lang.Integer h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        s34.d dVar = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".clickActionType"));
            int intValue = (str2 == null || (h17 = r26.h0.h(str2)) == null) ? 0 : h17.intValue();
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".imageUrl"));
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".iconId"));
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = (java.lang.String) map.get(str.concat(".customIconDescription"));
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".sourceFooterData"));
            java.lang.String str10 = str9 == null ? "" : str9;
            java.lang.String str11 = (java.lang.String) map.get(str.concat(".sourceVerifyInfo"));
            java.lang.String str12 = str11 == null ? "" : str11;
            java.lang.String str13 = (java.lang.String) map.get(str.concat(".desc"));
            java.lang.String str14 = str13 == null ? "" : str13;
            java.lang.String str15 = (java.lang.String) map.get(str.concat(".emoticonUrl"));
            java.lang.String str16 = str15 == null ? "" : str15;
            java.lang.String str17 = (java.lang.String) map.get(str.concat(".emoticonMd5"));
            java.lang.String str18 = str17 == null ? "" : str17;
            java.lang.String str19 = (java.lang.String) map.get(str.concat(".videoUrl"));
            java.lang.String str20 = str19 == null ? "" : str19;
            java.lang.String str21 = (java.lang.String) map.get(str.concat(".videoMd5"));
            java.lang.String str22 = str21 == null ? "" : str21;
            java.lang.String str23 = (java.lang.String) map.get(str.concat(".expiredTime"));
            long longValue = (str23 == null || (j17 = r26.h0.j(str23)) == null) ? 0L : j17.longValue();
            java.lang.String str24 = (java.lang.String) map.get(str.concat(".expiredToast"));
            if (str24 == null) {
                str24 = "";
            }
            dVar = new s34.d(intValue, str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, longValue, str24);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        return dVar;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdClickToTextStatusUIInfo");
        return this.f484146j;
    }
}
