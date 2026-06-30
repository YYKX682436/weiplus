package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class c6 implements zq1.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f267541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f267542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267543c;

    public c6(long j17, android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267541a = j17;
        this.f267542b = bundle;
        this.f267543c = rVar;
    }

    @Override // zq1.h0
    public void a(java.util.List list) {
        jx3.f.INSTANCE.w(1454L, 191L, 1L);
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        long j17 = this.f267541a;
        ((yq1.x0) m0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b3.f175725a;
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a3(j17), "MicroMsg.WebPrefetcherCallbackManager");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zq1.k0 k0Var = (zq1.k0) it.next();
                int i17 = k0Var.f556543b;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                zq1.i0 i0Var = k0Var.f556542a;
                java.lang.String str = i0Var != null ? i0Var.f556516a : null;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("url", str);
                jSONObject.put("result", k0Var.f556543b);
                jSONArray.put(jSONObject);
            }
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "onPrefetchResult result: %s", jSONArray2);
        android.os.Bundle bundle = this.f267542b;
        bundle.putString("url_result", jSONArray2);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267543c;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
