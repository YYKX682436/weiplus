package vc1;

/* loaded from: classes13.dex */
public class m1 implements com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516544a;

    public m1(vc1.p1 p1Var, java.lang.String str) {
        this.f516544a = p1Var;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener
    /* renamed from: onEvent */
    public boolean mo35538xaf8c47fb(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onEvent eventType:%s, eventInfo:%s ", str, str2);
        vc1.u1 u1Var = this.f516544a.f516638w0;
        if (u1Var == null) {
            return false;
        }
        java.lang.String mo36409x5db1b11 = interfaceC4273x137f8dd1.mo36409x5db1b11();
        uc1.p pVar = (uc1.p) u1Var;
        pVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 sVar = new uc1.s();
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject = pVar.f507874a;
        hashMap.put("mapId", java.lang.Integer.valueOf(vc1.e3.c(jSONObject)));
        hashMap.put("layerId", mo36409x5db1b11);
        hashMap.put("eventType", str);
        hashMap.put("eventInfo", str2);
        sVar.t(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapVisualLayer", "onEvent eventType:%s, eventInfo:%s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = pVar.f507875b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
        if (Q != null) {
            Q.i(sVar, null);
            return false;
        }
        lVar.p(sVar);
        return false;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener
    /* renamed from: onLayerLoadFinish */
    public void mo35539x8e86c96b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onLayerLoadFinish status:%d", java.lang.Integer.valueOf(i17));
    }
}
