package a84;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a84.x0 f83910a = new a84.x0();

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        if (str3 == null || str2 == null) {
            if (str3 == null) {
                str3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
            return str3;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
            return str3;
        }
        if (r26.n0.D(encodedQuery, str2, false, 2, null)) {
            encodedQuery = r26.i0.t(r26.i0.v(encodedQuery, "&".concat(str2), "", false, 4, null), str2, "", false);
        }
        if (r26.i0.A(encodedQuery, "&", false, 2, null)) {
            encodedQuery = r26.i0.w(encodedQuery, "&", "", false);
        }
        java.lang.String uri = parse.buildUpon().clearQuery().encodedQuery(encodedQuery).build().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UrlHelper", "uri=" + str3 + "  query=" + encodedQuery + "  finalUri=" + uri);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        return uri;
    }
}
