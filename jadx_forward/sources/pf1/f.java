package pf1;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: NAME */
    public static final java.lang.String f76414x24728b = "invokeMiniProgramAPI";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        pf1.v env = (pf1.v) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        pf1.q qVar = (pf1.q) env.c0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = qVar.mo158327x5db1c38().C0();
        if (C0 != null) {
            try {
                data.put("htmlId", qVar.m158333x1d24f51c());
                data.put("webviewId", qVar.hashCode());
            } catch (org.json.JSONException unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.b();
            bVar.v(C0, qVar.hashCode());
            java.lang.String jSONObject = data.toString();
            if (jSONObject == null) {
                jSONObject = "";
            }
            bVar.f163907f = jSONObject;
            bVar.m();
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str2, jSONObject2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public java.lang.String l() {
        return "err_msg";
    }
}
