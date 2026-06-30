package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 f162944h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0
    public void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, lk1.a aVar) {
        this.f162944h.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).mo32091x9a3f0ba2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f162944h.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).mo32091x9a3f0ba2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0
    public lk1.b G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, lk1.b listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = env.mo32091x9a3f0ba2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo32091x9a3f0ba2, "getRuntime(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.d1(mo32091x9a3f0ba2, listener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0
    public android.os.Bundle H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        android.os.Bundle H = super.H(e9Var, jSONObject);
        H.putString("smallAppKey", jSONObject.optString("subKey", "") + "#" + e9Var.mo48798x74292566() + ";");
        H.putBoolean("enableIndoor", jSONObject.optBoolean("enableIndoor", false));
        if (e9Var.mo32091x9a3f0ba2() != null && e9Var.mo32091x9a3f0ba2().E0() != null) {
            H.putString("openId", ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) e9Var.mo32091x9a3f0ba2().E0()).f128831x0);
        }
        return H;
    }
}
