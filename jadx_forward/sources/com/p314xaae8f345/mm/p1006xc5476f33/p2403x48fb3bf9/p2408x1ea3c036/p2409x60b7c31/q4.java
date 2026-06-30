package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class q4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f263975a;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, sd.b bVar) {
        this.f263975a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f263975a.c(str, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            sd.b bVar = this.f263975a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f488130b.f426039c.optString("liteAppId")) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65284x81288087(bVar.f488130b.f426039c.optString("liteAppId"), str, jSONObject);
        }
    }
}
