package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class j2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34366x366c91de = 958;

    /* renamed from: NAME */
    private static final java.lang.String f34367x24728b = "addFileToFavorites";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, env is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        java.lang.String str3 = null;
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, activity is null");
            lVar.a(i17, o("fail:activity is null"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath is empty");
            lVar.a(i17, o("fail:filePath is empty"));
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String c17 = r26.i0.y(optString, "wxfile://", false) ? s46.c.c(optString) : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath: " + optString + ", fileExt: " + c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
        if (mo50354x59eafec1 != null && (mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(optString)) != null) {
            str3 = mo49620x1d537609.o();
        }
        if (str3 == null || str3.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath is illegal");
            lVar.a(i17, o("fail:filePath is illegal"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, realFilePath: " + str3);
        java.lang.Object opt = jSONObject.opt(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
        if (opt instanceof java.lang.String) {
            str2 = (java.lang.String) opt;
            str = c17;
        } else {
            str = c17;
            int O = r26.n0.O(optString, '/', 0, false, 6, null);
            if (O == -1) {
                str2 = optString;
            } else {
                java.lang.String substring = optString.substring(O + 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                str2 = substring;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, fileName: " + str2);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i2(this, activity, str3, str, str2, lVar, i17));
    }
}
