package a84;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a84.x0 f2377a = new a84.x0();

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        if (str3 == null || str2 == null) {
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
            return str3;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
            return str3;
        }
        if (r26.n0.D(encodedQuery, str2, false, 2, null)) {
            encodedQuery = r26.i0.t(r26.i0.v(encodedQuery, "&".concat(str2), "", false, 4, null), str2, "", false);
        }
        if (r26.i0.A(encodedQuery, "&", false, 2, null)) {
            encodedQuery = r26.i0.w(encodedQuery, "&", "", false);
        }
        java.lang.String uri = parse.buildUpon().clearQuery().encodedQuery(encodedQuery).build().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        com.tencent.mars.xlog.Log.i("UrlHelper", "uri=" + str3 + "  query=" + encodedQuery + "  finalUri=" + uri);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteUriQuery", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        return uri;
    }
}
