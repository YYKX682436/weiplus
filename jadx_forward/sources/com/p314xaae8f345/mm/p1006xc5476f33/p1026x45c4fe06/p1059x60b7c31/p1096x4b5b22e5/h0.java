package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f163762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ze.n f163763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163764c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f163767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 f163768g;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 i0Var, ik1.b0 b0Var, ze.n nVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc) {
        this.f163768g = i0Var;
        this.f163762a = b0Var;
        this.f163763b = nVar;
        this.f163764c = str;
        this.f163765d = str2;
        this.f163766e = yVar;
        this.f163767f = c12362x460991bc;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        km5.b c17 = km5.u.c();
        this.f163762a.f373357a = new ph1.l();
        ((ph1.l) this.f163762a.f373357a).f435870d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.e0(this);
        ph1.l lVar = (ph1.l) this.f163762a.f373357a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.f0(this, c17);
        lVar.f435874h = f0Var;
        fl1.a2 a2Var = lVar.f435872f;
        if (a2Var != null) {
            ((fl1.g1) a2Var).setOnCancelListener(f0Var);
        }
        ((ph1.l) this.f163762a.f373357a).b(this.f163763b, false);
        if (!this.f163768g.e(this.f163766e, this.f163767f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g0(this, c17))) {
            c17.c(java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.FALSE;
    }
}
