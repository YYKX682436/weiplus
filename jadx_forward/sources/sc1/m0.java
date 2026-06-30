package sc1;

/* loaded from: classes7.dex */
public class m0 implements com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f487228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487229c;

    public m0(sc1.x0 x0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487228b = i17;
        this.f487229c = tVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7
    /* renamed from: onNetStatus */
    public void mo29885x3bee38d0(android.os.Bundle bundle) {
        sc1.v0 v0Var = new sc1.v0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePusherId", this.f487228b);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (bundle != null) {
                for (java.lang.String str : bundle.keySet()) {
                    jSONObject2.put(str, bundle.get(str));
                }
            }
            jSONObject.put("info", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        v0Var.f163907f = jSONObject.toString();
        this.f487229c.i(v0Var, null);
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7
    /* renamed from: onPushEvent */
    public void mo29886xceec7081(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onPushEvent errCode:%d", java.lang.Integer.valueOf(i17));
        sc1.w0 w0Var = new sc1.w0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760));
            jSONObject.put("livePusherId", this.f487228b);
        } catch (org.json.JSONException unused) {
        }
        w0Var.f163907f = jSONObject.toString();
        this.f487229c.i(w0Var, null);
    }
}
