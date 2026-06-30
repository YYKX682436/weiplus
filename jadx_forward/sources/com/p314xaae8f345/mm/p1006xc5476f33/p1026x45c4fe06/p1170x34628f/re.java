package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class re extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ue f168598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f168599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne f168601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ue ueVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne neVar) {
        super(1);
        this.f168598d = ueVar;
        this.f168599e = context;
        this.f168600f = n7Var;
        this.f168601g = neVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ue.f168684b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ue ueVar = this.f168598d;
        ueVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ueVar.f168685a, "performRecentlyForwardClick, toUser: ".concat(username));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168600f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(n7Var.mo48798x74292566(), n7Var.X1(), 50, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 H1 = n7Var.H1(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.z0.b(this.f168599e, n7Var, H1, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oe(H1, username));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne neVar = this.f168601g;
        neVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(neVar.f168464a, "onRecentForwardClick, username: ".concat(username));
        neVar.f168465b = username;
        neVar.a(true);
        return jz5.f0.f384359a;
    }
}
