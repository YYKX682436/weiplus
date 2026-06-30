package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12109x280200b8 f162741d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12109x280200b8 c12109x280200b8) {
        this.f162741d = c12109x280200b8;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List D0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Pj().D0();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = ((java.util.ArrayList) D0).iterator();
        while (it.hasNext()) {
            dm.i4 i4Var = (dm.i4) it.next();
            try {
                org.json.JSONObject b17 = pm0.b0.b(i4Var.f66937x27cd822a);
                b17.put("status", i4Var.f66940x52c1d072);
                b17.put("feedLocalId", java.lang.String.valueOf(i4Var.f72763xa3c65b86));
                jSONArray.put(b17);
            } catch (java.lang.Exception unused) {
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errMsg", "");
            jSONObject.put("errCode", 0);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
        } catch (java.lang.Exception unused2) {
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12109x280200b8 c12109x280200b8 = this.f162741d;
        c12109x280200b8.f162689h = jSONObject2;
        c12109x280200b8.c();
    }
}
