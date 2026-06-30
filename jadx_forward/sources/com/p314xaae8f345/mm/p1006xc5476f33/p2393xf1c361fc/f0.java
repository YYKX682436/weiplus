package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class f0 implements o13.x {
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var) {
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.o0) vVar.f432689a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "historySearchResultListener ret %d, webViewId %s", java.lang.Integer.valueOf(vVar.f432691c), java.lang.Integer.valueOf(o0Var.f263111s));
        if (vVar.f432691c == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("ret", 0);
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (p13.y yVar : vVar.f432693e) {
                    if (yVar.f432723h != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(yVar.f432723h);
                        jSONObject2.put("timeStamp", yVar.f432721f);
                        jSONArray2.put(jSONObject2);
                    }
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("items", jSONArray2);
                jSONArray.put(jSONObject3);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.e0(this, o0Var, jSONObject));
        }
    }
}
