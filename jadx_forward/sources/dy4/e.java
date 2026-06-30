package dy4;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.j f326150d;

    public e(dy4.j jVar) {
        this.f326150d = jVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        dy4.j jVar = this.f326150d;
        sf.f fVar = jVar.f326204n;
        if (fVar == null) {
            return;
        }
        nw4.g gVar = ((dy4.d) fVar).f326146a.f422396d;
        boolean z17 = gVar instanceof nw4.n;
        nw4.n nVar = (z17 && z17) ? (nw4.n) gVar : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", jVar.f334030d);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                if ((bundle.get(str) instanceof java.lang.String) || (bundle.get(str) instanceof java.lang.Integer) || (bundle.get(str) instanceof java.lang.Float) || (bundle.get(str) instanceof java.lang.Double)) {
                    jSONObject2.put(str, bundle.get(str));
                }
            }
        }
        jSONObject.put("info", jSONObject2);
        if (nVar != null) {
            nVar.p("onXWebLivePlayerNetStatus", jSONObject);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        java.lang.String str;
        dy4.j jVar = this.f326150d;
        sf.f fVar = jVar.f326204n;
        if (fVar == null) {
            return;
        }
        nw4.g gVar = ((dy4.d) fVar).f326146a.f422396d;
        boolean z17 = gVar instanceof nw4.n;
        nw4.n nVar = (z17 && z17) ? (nw4.n) gVar : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", jVar.f334030d);
        jSONObject.put("errCode", i17);
        if (bundle == null || (str = bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46285x5018f760)) == null) {
            str = "";
        }
        jSONObject.put("errMsg", str);
        if (nVar != null) {
            nVar.p("onXWebLivePlayerEvent", jSONObject);
        }
    }
}
