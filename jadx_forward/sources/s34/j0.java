package s34;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484206a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484207b;

    /* renamed from: c, reason: collision with root package name */
    public final int f484208c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484209d;

    /* renamed from: e, reason: collision with root package name */
    public final int f484210e;

    /* renamed from: f, reason: collision with root package name */
    public final int f484211f;

    public j0(java.lang.String weappUserName, java.lang.String weappPath, int i17, java.lang.String prerenderWeappPath, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weappUserName, "weappUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weappPath, "weappPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prerenderWeappPath, "prerenderWeappPath");
        this.f484206a = weappUserName;
        this.f484207b = weappPath;
        this.f484208c = i17;
        this.f484209d = prerenderWeappPath;
        this.f484210e = i18;
        this.f484211f = i19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s34.j0 d(java.util.Map map, java.lang.String str) {
        s34.j0 j0Var;
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        } else {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.String str2 = (java.lang.String) map.get(str.concat(".weappUserName"));
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = (java.lang.String) map.get(str.concat(".weappPath"));
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) map.get(str.concat(".weappVersion"));
                int intValue = (str6 == null || (h19 = r26.h0.h(str6)) == null) ? 0 : h19.intValue();
                java.lang.String str7 = (java.lang.String) map.get(str.concat(".prerenderWeappPath"));
                java.lang.String str8 = str7 == null ? "" : str7;
                java.lang.String str9 = (java.lang.String) map.get(str.concat(".miniProgramType"));
                int intValue2 = (str9 == null || (h18 = r26.h0.h(str9)) == null) ? 0 : h18.intValue();
                java.lang.String str10 = (java.lang.String) map.get(str.concat(".needPrerender"));
                j0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new s34.j0(str3, str5, intValue, str8, intValue2, (str10 == null || (h17 = r26.h0.h(str10)) == null) ? 0 : h17.intValue()));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                j0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(j0Var)) {
                ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(j0Var));
            }
            r11 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(j0Var) ? null : j0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return r11;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPrerenderWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPrerenderWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return this.f484209d;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeappPath", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return this.f484207b;
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWeappUserName", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWeappUserName", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return this.f484206a;
    }

    /* renamed from: toString */
    public java.lang.String m163791x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        java.lang.String str = "[weappUserName is " + this.f484206a + ", weappPath is " + this.f484207b + ", weappVersion is " + this.f484208c + ", prerenderWeappPath is " + this.f484209d + ", needPrerender is " + this.f484211f + ']';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        return str;
    }
}
