package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162740b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162739a = e9Var;
        this.f162740b = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        int i19 = this.f162740b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162739a;
        if (i17 != 0 || i18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i17 == 4) {
                e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(str, i18, jSONObject));
                return;
            } else {
                e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(str, -1, jSONObject));
                return;
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 c19796x6abb1fc1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) oVar.f152244b.f152233a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2 = pm0.b0.b(c19796x6abb1fc1);
            e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", 0, jSONObject2));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Finder.JsApiFetchFinderProfileFeed", e17, "JsApiFetchFinderProfileFeed", new java.lang.Object[0]);
            e9Var.a(i19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a(e17.getMessage(), -1, jSONObject2));
        }
    }
}
