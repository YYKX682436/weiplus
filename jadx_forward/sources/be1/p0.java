package be1;

/* loaded from: classes7.dex */
public final class p0 implements d85.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f101023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f101025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.q0 f101027e;

    public p0(android.app.Activity activity, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, be1.q0 q0Var) {
        this.f101023a = activity;
        this.f101024b = str;
        this.f101025c = yVar;
        this.f101026d = i17;
        this.f101027e = q0Var;
    }

    @Override // d85.l0
    public final void a(d85.h0 h0Var) {
        int i17 = h0Var == null ? -1 : be1.o0.f101021a[h0Var.ordinal()];
        be1.q0 q0Var = this.f101027e;
        int i18 = this.f101026d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f101025c;
        int i19 = 2;
        if (i17 != 1) {
            if (i17 != 2) {
                i19 = 3;
                if (i17 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiRequestSystemCapabilityAuthorization", "requestPermission error: " + h0Var);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
                    q0Var.getClass();
                    java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 4);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    yVar.a(i18, q0Var.u(str, jSONObject));
                    return;
                }
            } else {
                i19 = 1;
            }
        } else if (!z2.h.b(this.f101023a, this.f101024b)) {
            i19 = 6;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i19)), new jz5.l(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61558xbb80ca22, java.lang.Boolean.valueOf(h0Var == d85.h0.GRANTED)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestSystemCapabilityAuthorization", "invoke: result " + k17);
        q0Var.getClass();
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!(k17 instanceof java.util.HashMap)) {
            k17 = new java.util.HashMap(k17);
        }
        k17.put("errno", 0);
        yVar.a(i18, q0Var.t("ok", k17));
    }
}
