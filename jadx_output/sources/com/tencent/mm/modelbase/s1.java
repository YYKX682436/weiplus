package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class s1 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.u1 f70802a;

    public s1(com.tencent.mm.modelbase.u1 u1Var) {
        this.f70802a = u1Var;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        com.tencent.mm.modelbase.j1 j1Var = (com.tencent.mm.modelbase.j1) nVar;
        if (j1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueue", "%s returns null, skip notifying.", j1Var);
            return false;
        }
        com.tencent.mm.modelbase.u1 u1Var = this.f70802a;
        j1Var.onSceneEnd(u1Var.f70814e, u1Var.f70815f, u1Var.f70816g, u1Var.f70813d);
        return false;
    }
}
