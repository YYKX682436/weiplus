package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f163731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f163732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g f163733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f163734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f163735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 f163736f;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.i0 i0Var, ik1.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc) {
        this.f163736f = i0Var;
        this.f163731a = b0Var;
        this.f163732b = yVar;
        this.f163733c = gVar;
        this.f163734d = str;
        this.f163735e = c12362x460991bc;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) obj;
        if (this.f163731a.f373357a != null) {
            ((ph1.l) this.f163731a.f373357a).dismiss();
        }
        if (c3897xbc286aa1 == null) {
            km5.u.b().a(new java.lang.Exception("get attrs failed"));
            return null;
        }
        if (android.text.TextUtils.isEmpty(c3897xbc286aa1.f158811d)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            km5.u.b().a(new java.lang.Exception("get invalid appId"));
            return null;
        }
        if (!this.f163732b.mo50262x39e05d35()) {
            km5.u.b().a(new java.lang.Exception("fail:interrupted"));
            return null;
        }
        ze.n nVar = (ze.n) this.f163732b.mo32091x9a3f0ba2();
        if (nVar == null) {
            km5.u.b().a(new java.lang.Exception("fail:internal error"));
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar = this.f163733c;
        if (gVar != null) {
            gVar.b(c3897xbc286aa1);
        }
        c3897xbc286aa1.X = nVar.u0().X;
        if (c3897xbc286aa1.h() && !c3897xbc286aa1.k()) {
            this.f163736f.a(c3897xbc286aa1.A1.f158733e, this.f163734d);
        }
        nVar.u2(c3897xbc286aa1, this.f163735e.f166443o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g gVar2 = this.f163733c;
        if (gVar2 == null) {
            return null;
        }
        gVar2.a(true, "ok");
        return null;
    }
}
