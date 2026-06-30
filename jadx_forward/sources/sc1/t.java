package sc1;

/* loaded from: classes7.dex */
public class t implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f487264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487265e;

    public t(sc1.z zVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487264d = i17;
        this.f487265e = tVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        sc1.x xVar = new sc1.x(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("livePlayerId", this.f487264d);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (bundle != null) {
                for (java.lang.String str : bundle.keySet()) {
                    jSONObject2.put(str, bundle.get(str));
                }
            }
            jSONObject.put("info", jSONObject2);
        } catch (org.json.JSONException unused) {
        }
        xVar.f163907f = jSONObject.toString();
        this.f487265e.i(xVar, null);
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePlayer", "onPlayEvent errCode:%d", java.lang.Integer.valueOf(i17));
        sc1.y yVar = new sc1.y(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760));
            jSONObject.put("livePlayerId", this.f487264d);
        } catch (org.json.JSONException unused) {
        }
        yVar.f163907f = jSONObject.toString();
        this.f487265e.i(yVar, null);
    }
}
