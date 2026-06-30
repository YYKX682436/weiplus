package zd1;

/* loaded from: classes7.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77583x366c91de = 1321;

    /* renamed from: NAME */
    public static final java.lang.String f77584x24728b = "setAppSnapshotStrategy";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", "invoke(" + env.mo48798x74292566() + ") data:" + data);
        boolean optBoolean = data.optBoolean("ignoreNative", false);
        int c17 = ik1.w.c(data.optInt("shortEdge", 0));
        boolean has = data.has("frame");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        if (has) {
            org.json.JSONArray jSONArray = data.getJSONArray("frame");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "getJSONArray(...)");
            if (jSONArray.length() >= 4) {
                f0Var.f391649d = ik1.w.c(jSONArray.getInt(0));
                f0Var2.f391649d = ik1.w.c(jSONArray.getInt(1));
                f0Var3.f391649d = ik1.w.c(jSONArray.getInt(2));
                f0Var4.f391649d = ik1.w.c(jSONArray.getInt(3));
            }
            if (f0Var3.f391649d <= 0 || f0Var4.f391649d <= 0) {
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                env.a(i17, u(str2, jSONObject));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", "invoke(" + env.mo48798x74292566() + ") ignoreNative:" + optBoolean + " x:" + f0Var.f391649d + " y:" + f0Var2.f391649d + " width:" + f0Var3.f391649d + " height:" + f0Var4.f391649d);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new zd1.r(env, optBoolean, i17, this, has, f0Var, f0Var3, f0Var2, f0Var4, c17, null), 3, null);
    }
}
