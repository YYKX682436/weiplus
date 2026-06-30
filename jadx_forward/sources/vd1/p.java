package vd1;

/* loaded from: classes.dex */
public class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f77292x366c91de = 45;

    /* renamed from: NAME */
    private static final java.lang.String f77293x24728b = "reportAction";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String optString = jSONObject.optString("key");
        java.lang.String optString2 = jSONObject.optString("value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey =  %s, actionValue =  %s", optString, optString2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue is null");
            lVar.a(i17, o("fail"));
            return;
        }
        if (optString.length() <= 0 || optString.length() > 32 || optString2.length() <= 0 || optString2.length() > 1024) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportAction", "doReportActionInfo, actionKey or actionValue size is bad");
            lVar.a(i17, o("fail"));
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        if (android.text.TextUtils.isEmpty(mo48798x74292566)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportAction", "doReportActionInfo, appId is empty");
            lVar.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportAction", "doReportActionInfo, appId %s", mo48798x74292566);
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(lVar.mo50352x76847179())) {
            i18 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(lVar.mo50352x76847179()) ? 1 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(lVar.mo50352x76847179()) ? 5 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(lVar.mo50352x76847179()) ? 4 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(lVar.mo50352x76847179()) ? 3 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(lVar.mo50352x76847179()) ? 2 : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportAction", "doReportActionInfo, get networkType %d", java.lang.Integer.valueOf(i18));
        } else {
            i18 = 0;
        }
        long i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        try {
            str2 = java.net.URLEncoder.encode("", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            try {
                str3 = java.net.URLEncoder.encode("", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                try {
                    str = java.net.URLEncoder.encode(optString, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    e = e17;
                    str = "";
                }
                try {
                    str4 = java.net.URLEncoder.encode(optString2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException e18) {
                    e = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiReportAction", e, "", new java.lang.Object[0]);
                    str4 = "";
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13579, mo48798x74292566, java.lang.Integer.valueOf(i18), str2, str3, "", str, str4, java.lang.Long.valueOf(i19), java.lang.Long.valueOf(i19));
                    lVar.a(i17, o("ok"));
                }
            } catch (java.io.UnsupportedEncodingException e19) {
                e = e19;
                str = "";
                str3 = str;
            }
        } catch (java.io.UnsupportedEncodingException e27) {
            e = e27;
            str = "";
            str2 = str;
            str3 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13579, mo48798x74292566, java.lang.Integer.valueOf(i18), str2, str3, "", str, str4, java.lang.Long.valueOf(i19), java.lang.Long.valueOf(i19));
        lVar.a(i17, o("ok"));
    }
}
