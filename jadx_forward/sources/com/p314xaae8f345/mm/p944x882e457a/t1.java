package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class t1 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.u1 f152340a;

    public t1(com.p314xaae8f345.mm.p944x882e457a.u1 u1Var) {
        this.f152340a = u1Var;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        com.p314xaae8f345.mm.p944x882e457a.j1 j1Var = (com.p314xaae8f345.mm.p944x882e457a.j1) nVar;
        if (j1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneQueue", "%s returns null, skip notifying.", j1Var);
            return false;
        }
        com.p314xaae8f345.mm.p944x882e457a.u1 u1Var = this.f152340a;
        j1Var.mo10099x76e0bfae(u1Var.f152347e, u1Var.f152348f, u1Var.f152349g, u1Var.f152346d);
        return false;
    }
}
