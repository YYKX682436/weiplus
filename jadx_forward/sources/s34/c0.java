package s34;

/* loaded from: classes4.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f484128a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484129b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f484130c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f484131d;

    public static s34.c0 a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
        if (a84.b0.c(map)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".finderUsername");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
        try {
            s34.c0 c0Var = new s34.c0();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c0Var.f484128a = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".finderLiveId");
            if (str4 == null) {
                str4 = "";
            }
            c0Var.f484129b = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".finderLiveFeedExportId");
            if (str5 == null) {
                str5 = "";
            }
            c0Var.f484130c = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".finderLiveFeedNonceId");
            if (str6 != null) {
                str3 = str6;
            }
            c0Var.f484131d = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return c0Var;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveInfo");
            return null;
        }
    }
}
