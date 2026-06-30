package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class d8 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f266590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266591e;

    public d8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, long j17) {
        this.f266591e = c1Var;
        this.f266590d = j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doUxSearchOpLog rsp errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.k77 k77Var = (r45.k77) oVar.f152244b.f152233a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("reqId", this.f266590d);
        bundle.putInt("ret", i18);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = k77Var.f460011d;
        if (gVar != null) {
            gVar.i();
            bundle.putString("json", k77Var.f460011d.i());
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = this.f266591e.f266531y;
            if (z0Var != null) {
                z0Var.mo70207xf5bc2045(147, bundle);
            }
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MsgHandler", e17, "", new java.lang.Object[0]);
        }
        return 0;
    }
}
