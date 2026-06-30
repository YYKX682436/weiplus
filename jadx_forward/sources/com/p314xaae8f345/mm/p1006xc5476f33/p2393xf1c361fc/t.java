package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f263155d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 a0Var, java.util.Map map) {
        this.f263155d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map map = this.f263155d;
        if (map != null && map.size() > 0) {
            try {
                jSONObject.put("requestId", map.get("requestId"));
                jSONObject.put("searchId", map.get("searchId"));
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
                jSONObject.put("type", map.get("type"));
                jSONObject.put("url", map.get("url"));
                jSONObject.put("parentSearchID", map.get("parentSearchID"));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FTSWebSearchLogic", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSWebSearchLogic", "searchData, " + jSONObject.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putString("sos_fts_search_data_tmp", jSONObject.toString());
    }
}
