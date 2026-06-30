package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 f163045o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, lk1.a aVar) {
        this.f163045o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).mo32091x9a3f0ba2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w
    public void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f163045o.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).mo32091x9a3f0ba2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w
    public lk1.b H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, lk1.b listener) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = env.mo32091x9a3f0ba2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo32091x9a3f0ba2, "getRuntime(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.d1(mo32091x9a3f0ba2, listener);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.w
    public android.os.Bundle I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        android.os.Bundle I = super.I(e9Var, jSONObject);
        I.putString("smallAppKey", jSONObject.optString("subKey", "") + "#" + e9Var.mo48798x74292566() + ";");
        if (e9Var.mo32091x9a3f0ba2() != null && e9Var.mo32091x9a3f0ba2().E0() != null) {
            I.putString("openId", ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) e9Var.mo32091x9a3f0ba2().E0()).f128831x0);
        }
        return I;
    }
}
