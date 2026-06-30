package ad1;

/* loaded from: classes7.dex */
public class d extends ad1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f23x366c91de = 1060;

    /* renamed from: NAME */
    public static final java.lang.String f24x24728b = "createCellularNetworkRequestTaskAsync";

    public d(uh1.o oVar) {
        super(0, oVar);
    }

    public static /* synthetic */ void C(ad1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, org.json.JSONObject jSONObject, android.net.Network network) {
        dVar.getClass();
        if (network == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiCreateCellularNetworkRequestTaskAsync", "invokeImp, cellular network is unavailable");
            dVar.f84648h.b(lVar, str, "cellular network is unavailable", 600006, null);
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("forceCellularNetwork", true);
            super.d(lVar, jSONObject, str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCreateCellularNetworkRequestTaskAsync", e17, "put forceCellularNetwork fail, are you kidding me?", new java.lang.Object[0]);
            dVar.f84648h.b(lVar, str, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be, 600004, null);
        }
    }

    @Override // ad1.f, gb1.m
    public void d(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final org.json.JSONObject jSONObject, final java.lang.String str) {
        uh1.q1.f509403h.b(new uh1.p1() { // from class: ad1.d$$a
            @Override // uh1.p1
            public final void a(android.net.Network network) {
                ad1.d.C(ad1.d.this, lVar, str, jSONObject, network);
            }
        });
    }
}
