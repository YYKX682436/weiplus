package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class o3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34566x366c91de = 959;

    /* renamed from: NAME */
    private static final java.lang.String f34567x24728b = "addVideoToFavorites";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d5376092;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, env is null");
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        java.lang.String str = null;
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, activity is null");
            lVar.a(i17, o("fail:activity is null"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("videoPath");
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath is empty");
            lVar.a(i17, o("fail:videoPath is empty"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath: " + optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
        java.lang.String o17 = (mo50354x59eafec1 == null || (mo49620x1d5376092 = mo50354x59eafec1.mo49620x1d537609(optString)) == null) ? null : mo49620x1d5376092.o();
        if (o17 == null || o17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath is illegal");
            lVar.a(i17, o("fail:videoPath is illegal"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, realVideoPath: " + o17);
        java.lang.String optString2 = jSONObject.optString("thumbPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec12 = lVar.mo50354x59eafec1();
        if (mo50354x59eafec12 != null && (mo49620x1d537609 = mo50354x59eafec12.mo49620x1d537609(optString2)) != null) {
            str = mo49620x1d537609.o();
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, thumbPath: " + optString2 + ", realThumbPath: " + str2);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n3(this, activity, o17, str2, lVar, i17));
    }
}
