package s34;

/* loaded from: classes4.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484265a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484266b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f484267c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f484268d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f484269e;

    /* renamed from: f, reason: collision with root package name */
    public final double f484270f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f484271g;

    public p0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, double d17, boolean z18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f484265a = str;
        this.f484266b = str2;
        this.f484267c = str3;
        this.f484268d = str4;
        this.f484269e = z17;
        this.f484270f = d17;
        this.f484271g = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s34.p0 a(java.util.Map values, java.lang.String str) {
        s34.p0 p0Var;
        java.lang.Integer h17;
        java.lang.Double e17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        if (a84.b0.c(values) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        } else if (values.containsKey(str)) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.String str2 = (java.lang.String) values.get(str + ".appId");
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = (java.lang.String) values.get(str + ".page");
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) values.get(str + ".query");
                java.lang.String str7 = str6 == null ? "" : str6;
                java.lang.String str8 = (java.lang.String) values.get(str + ".minVersion");
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.String str10 = (java.lang.String) values.get(str + ".isHalfScreen");
                int intValue = (str10 == null || (h18 = r26.h0.h(str10)) == null) ? 0 : h18.intValue();
                java.lang.String str11 = (java.lang.String) values.get(str + ".heightPercent");
                double doubleValue = (str11 == null || (e17 = r26.g0.e(str11)) == null) ? 0.75d : e17.doubleValue();
                java.lang.String str12 = (java.lang.String) values.get(str + ".enableDragToCloseInHalfScreen");
                p0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new s34.p0(str3, str5, str7, str9, intValue == 1, (doubleValue <= 0.0d || doubleValue >= 1.0d) ? 0.75d : doubleValue, ((str12 == null || (h17 = r26.h0.h(str12)) == null) ? 0 : h17.intValue()) == 1, null));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p0Var = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(p0Var)) {
                ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(p0Var));
            }
            r6 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(p0Var) ? null : p0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
        return r6;
    }
}
