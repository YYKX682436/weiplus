package s34;

/* loaded from: classes4.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484241a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484242b;

    public static s34.m0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
        if (a84.b0.c(map) || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return null;
        }
        try {
            s34.m0 m0Var = new s34.m0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".finderUsername");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            m0Var.f484241a = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".exportId");
            if (str4 != null) {
                str3 = str4;
            }
            m0Var.f484242b = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return m0Var;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadFinderProfile");
            return null;
        }
    }
}
