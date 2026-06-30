package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public abstract class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f162622h = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque());

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n f162623g;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n nVar) {
        this.f162623g = nVar;
        nVar.f162632a = this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.mo50357xcd94f799());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public final void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        f162622h.submit(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.k(this, lVar, c0Var, jSONObject, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0
    public boolean m() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}
