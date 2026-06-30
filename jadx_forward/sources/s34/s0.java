package s34;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f484294c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f484296e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f484297f;

    public s0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, java.lang.String str4, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f484292a = str;
        this.f484293b = str2;
        this.f484294c = i17;
        this.f484295d = str3;
        this.f484296e = i18;
        this.f484297f = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s34.s0 c(java.util.Map map, java.lang.String str) {
        s34.s0 s0Var;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        } else if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        } else {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.String str2 = (java.lang.String) map.get(str.concat(".username"));
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = (java.lang.String) map.get(str.concat(".path"));
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) map.get(str.concat(".version"));
                int intValue = (str6 == null || (h18 = r26.h0.h(str6)) == null) ? 0 : h18.intValue();
                java.lang.String str7 = (java.lang.String) map.get(str.concat(".requestId"));
                java.lang.String str8 = str7 == null ? "" : str7;
                java.lang.String str9 = (java.lang.String) map.get(str.concat(".preloadFlag"));
                int intValue2 = (str9 == null || (h17 = r26.h0.h(str9)) == null) ? 0 : h17.intValue();
                java.lang.String str10 = (java.lang.String) map.get(str.concat(".ecsJumpInfoBase64Str"));
                s0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new s34.s0(str3, str5, intValue, str8, intValue2, str10 == null ? "" : str10, null));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                s0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(s0Var)) {
                ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(s0Var));
            }
            r11 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(s0Var) ? null : s0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        return r11;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRequestId", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRequestId", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        return this.f484295d;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdMiniShopClickActionInfo");
        return this.f484294c;
    }
}
