package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class g1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 f222805d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 activityC16010xe7956427) {
        this.f222805d = activityC16010xe7956427;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 c15897x3884718 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718) obj;
        if (c15897x3884718 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("timeStamp", c15897x3884718.f221385d);
                jSONObject.put("cgiReponseStr", c15897x3884718.f221388g);
                jSONObject.put("cgiCostTimeMs", c15897x3884718.f221386e);
                jSONObject.put("isRequestFail", c15897x3884718.f221387f);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebTabUI", e17.getMessage());
            }
            java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameIndexPreloadData__= %s; })()", jSONObject);
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.f222729v;
            this.f222805d.f221030g.o(format, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "gamelog.setInjectJsPreloadDataCallback.onCallback preloadJsonObj = " + jSONObject);
        }
    }
}
