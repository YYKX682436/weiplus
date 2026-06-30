package ad1;

/* loaded from: classes7.dex */
public class d extends ad1.f {
    public static final int CTRL_INDEX = 1060;
    public static final java.lang.String NAME = "createCellularNetworkRequestTaskAsync";

    public d(uh1.o oVar) {
        super(0, oVar);
    }

    public static /* synthetic */ void C(ad1.d dVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject, android.net.Network network) {
        dVar.getClass();
        if (network == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiCreateCellularNetworkRequestTaskAsync", "invokeImp, cellular network is unavailable");
            dVar.f3115h.b(lVar, str, "cellular network is unavailable", 600006, null);
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("forceCellularNetwork", true);
            super.d(lVar, jSONObject, str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCreateCellularNetworkRequestTaskAsync", e17, "put forceCellularNetwork fail, are you kidding me?", new java.lang.Object[0]);
            dVar.f3115h.b(lVar, str, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR, 600004, null);
        }
    }

    @Override // ad1.f, gb1.m
    public void d(final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final org.json.JSONObject jSONObject, final java.lang.String str) {
        uh1.q1.f427870h.b(new uh1.p1() { // from class: ad1.d$$a
            @Override // uh1.p1
            public final void a(android.net.Network network) {
                ad1.d.C(ad1.d.this, lVar, str, jSONObject, network);
            }
        });
    }
}
