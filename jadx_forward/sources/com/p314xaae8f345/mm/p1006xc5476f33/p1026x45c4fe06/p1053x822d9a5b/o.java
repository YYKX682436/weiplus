package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qp1.k0 f159659a;

    public o(qp1.k0 k0Var) {
        this.f159659a = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11871xe9608eb1 c11871xe9608eb1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.C11871xe9608eb1) abstractC11888x1a859600;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(c11871xe9608eb1 != null && c11871xe9608eb1.f159593d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, checkFloatBallPermission isOK:%b", objArr);
        qp1.k0 k0Var = this.f159659a;
        if (k0Var != null) {
            k0Var.b((c11871xe9608eb1 == null || !c11871xe9608eb1.f159593d) ? qp1.j0.Cancel : qp1.j0.Allow);
        }
    }
}
