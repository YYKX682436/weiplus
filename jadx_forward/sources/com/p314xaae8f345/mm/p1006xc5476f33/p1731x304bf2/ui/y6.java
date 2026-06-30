package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class y6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4 f223422d;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4 activityC15990xef42d2e4) {
        this.f223422d = activityC15990xef42d2e4;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppGameTabUI", e17.getMessage());
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("__gameIndexPreloadData__", jSONObject.toString());
            this.f223422d.f222527p.d(hashMap);
        }
    }
}
