package ut0;

/* loaded from: classes.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77237x366c91de = 1522;

    /* renamed from: NAME */
    public static final java.lang.String f77238x24728b = "applyHPatch";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch in jsapi");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = env.mo50354x59eafec1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50354x59eafec1);
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(data.optString("oldFile"));
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d5376092 = mo50354x59eafec1.mo49620x1d537609(data.optString("patchFile"));
        com.p314xaae8f345.mm.vfs.r6 mo49629x74638431 = mo50354x59eafec1.mo49629x74638431(data.optString("newFile"));
        if (mo49620x1d537609 != null && mo49620x1d5376092 != null && mo49629x74638431 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.WVA.JsApiApplyHPatch", "HPatch resolve path: ok: oldFile=" + mo49620x1d537609 + ", patch=" + mo49620x1d5376092 + ", newFile=" + mo49629x74638431);
            ((ku5.t0) ku5.t0.f394148d).g(new ut0.a(mo49620x1d537609, mo49620x1d5376092, mo49629x74638431, env, i17, this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrand.WVA.JsApiApplyHPatch", "HPatch resolve path: failed: oldFile=" + mo49620x1d537609 + ", patch=" + mo49620x1d5376092 + ", newFile=" + mo49629x74638431);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (mo49620x1d537609 == null) {
            arrayList.add("oldFile");
        }
        if (mo49620x1d5376092 == null) {
            arrayList.add("patchFile");
        }
        if (mo49629x74638431 == null) {
            arrayList.add("newFile");
        }
        java.lang.String concat = "fail: path invalid: ".concat(kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
        if (android.text.TextUtils.isEmpty(concat)) {
            concat = "fail:jsapi invalid request data";
        }
        if (concat == null) {
            concat = "";
        }
        java.lang.String str = concat;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str, jSONObject));
    }
}
