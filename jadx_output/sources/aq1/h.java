package aq1;

@j95.b
/* loaded from: classes7.dex */
public class h extends i95.w implements zq1.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f13048d = new java.util.HashMap();

    public java.lang.String wi(java.lang.String str) {
        android.net.Uri parse;
        if (str == null || str.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineServices", "getBizInfoKey url null");
            return "";
        }
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (parse = android.net.Uri.parse(str)) == null) {
                return "";
            }
            java.lang.String queryParameter = parse.getQueryParameter("__biz");
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String queryParameter2 = parse.getQueryParameter("mid");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            java.lang.String queryParameter3 = parse.getQueryParameter("idx");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            return queryParameter + "_" + queryParameter2 + "_" + queryParameter3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineServices", "getBizInfoKey err: " + e17.getMessage());
            return "";
        }
    }
}
