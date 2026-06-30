package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12111xfd21d298 f162748a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12111xfd21d298 c12111xfd21d298) {
        this.f162748a = c12111xfd21d298;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiGetFinderAccount", "[JsApiGetFinderAccount] errType=%s errCode=%s errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12111xfd21d298 c12111xfd21d298 = this.f162748a;
        if (i17 == 0 && i18 == 0) {
            try {
                r45.xb1 xb1Var = (r45.xb1) fVar.f152151d;
                if (xb1Var.m75941xfb821914(1).isEmpty()) {
                    c12111xfd21d298.f162693h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("not contact", -1, jSONObject);
                } else {
                    jSONObject = pm0.b0.b((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xb1Var.m75941xfb821914(1).get(0));
                    c12111xfd21d298.f162693h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", 0, jSONObject);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Finder.JsApiGetFinderAccount", e17, "GetFinderAccountTask runInMainProcess", new java.lang.Object[0]);
                c12111xfd21d298.f162693h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(e17.getMessage(), -1, jSONObject);
            }
        } else if (i17 == 4) {
            c12111xfd21d298.f162693h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(str, i18, jSONObject);
        } else {
            c12111xfd21d298.f162693h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(str, -1, jSONObject);
        }
        c12111xfd21d298.c();
        return null;
    }
}
