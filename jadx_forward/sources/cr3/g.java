package cr3;

/* loaded from: classes11.dex */
public class g implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f303480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f303481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f303482c;

    public g(j41.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, j41.d0 d0Var) {
        this.f303480a = e0Var;
        this.f303481b = z3Var;
        this.f303482c = d0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        j41.e0 e0Var = this.f303480a;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(e0Var.f379156e);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            java.lang.String optString2 = jSONObject.optString("pagepath");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = optString;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (optString2 == null) {
                optString2 = "";
            }
            nxVar.f89000b = optString2;
            nxVar.f89001c = 0;
            nxVar.f89002d = 1192;
            c6113xa3727625.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15319, this.f303481b.Q0(), java.lang.Integer.valueOf(e0Var.f379155d), this.f303482c.f379150a);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Profile.OpenIMProfileLogic", e17, "loadProfile", new java.lang.Object[0]);
        }
        return true;
    }
}
