package qg1;

/* loaded from: classes7.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.v54 f444298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg1.d f444299b;

    public g(qg1.d dVar, r45.v54 v54Var) {
        this.f444299b = dVar;
        this.f444298a = v54Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        qg1.d dVar = this.f444299b;
        int i17 = dVar.E().f468592h.f455779d;
        r45.ze5 ze5Var = this.f444298a.f469438g;
        java.lang.Runnable runnable = dVar.f444290w;
        if (ze5Var == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(ze5Var.f473489g);
        objArr[2] = java.lang.Boolean.valueOf(ze5Var.f473490h > 0);
        objArr[3] = java.lang.Boolean.valueOf(ze5Var.f473492m);
        objArr[4] = java.lang.Boolean.valueOf(ze5Var.f473486d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibVersionChecker", "updateByLaunchWxaApp, reqVersion:%d, respVersion:%d, force_update:%b, rely_update:%b, need_update:%b", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 21);
        r45.fc7 fc7Var = new r45.fc7();
        fc7Var.f455743d = ze5Var.f473487e;
        fc7Var.f455744e = ze5Var.f473488f;
        fc7Var.f455745f = ze5Var.f473489g;
        fc7Var.f455747h = ze5Var.f473490h;
        fc7Var.f455748i = (ze5Var.f473486d || ze5Var.f473492m) ? 1 : 0;
        fc7Var.f455749m = ze5Var.f473491i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Bi().wi(i17, fc7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8.Launch, runnable);
        return null;
    }
}
