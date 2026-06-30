package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class v implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 f263214d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 a0Var) {
        this.f263214d = a0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f432691c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0 a0Var = this.f263214d;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(((java.lang.Integer) a0Var.f262969s.f432603m).intValue(), "");
            return;
        }
        if (i17 != 0) {
            return;
        }
        java.util.List list = vVar.f432693e;
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSWebSearchLogic", "local contact search size 0");
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(((java.lang.Integer) a0Var.f262969s.f432603m).intValue(), "");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (p13.y yVar : vVar.f432693e) {
                if (yVar.f432717b == 131072) {
                    jSONArray2.put(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0.a(yVar, vVar.f432692d));
                }
            }
            jSONObject2.put("items", jSONArray2);
            jSONObject2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573705fh2));
            jSONObject2.put("count", jSONArray2.length());
            jSONObject2.put("type", 3);
            jSONArray.put(jSONObject2);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
            jSONObject.put("ret", 0);
            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(((java.lang.Integer) a0Var.f262969s.f432603m).intValue(), jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FTSWebSearchLogic", e17, "onSearchDone", new java.lang.Object[0]);
        }
    }
}
