package sc1;

/* loaded from: classes7.dex */
public class n0 implements com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f487233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487234c;

    public n0(sc1.x0 x0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487233b = i17;
        this.f487234c = tVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMComplete */
    public void mo29877x552e4ec2(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onBGMComplete, error:%s", java.lang.Integer.valueOf(i17));
        sc1.r0 r0Var = new sc1.r0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("livePusherId", this.f487233b);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "onBGMComplete fail", e17);
        }
        r0Var.f163907f = jSONObject.toString();
        this.f487234c.i(r0Var, null);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMProgress */
    public void mo29878x3d3ddfb6(long j17, long j18) {
        sc1.s0 s0Var = new sc1.s0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("progress", j17);
            jSONObject.put("duration", j18);
            jSONObject.put("livePusherId", this.f487233b);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "onBGMProgress fail", e17);
        }
        s0Var.f163907f = jSONObject.toString();
        this.f487234c.i(s0Var, null);
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify
    /* renamed from: onBGMStart */
    public void mo29879x9d54bb79() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "onBGMStart");
        sc1.t0 t0Var = new sc1.t0(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePusherId", this.f487233b);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertLivePusher", "onBGMStart fail", e17);
        }
        t0Var.f163907f = jSONObject.toString();
        this.f487234c.i(t0Var, null);
    }
}
