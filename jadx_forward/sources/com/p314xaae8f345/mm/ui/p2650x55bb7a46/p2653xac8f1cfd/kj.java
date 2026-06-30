package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class kj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pj f280904e;

    public kj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pj pjVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f280904e = pjVar;
        this.f280903d = f9Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pj pjVar = this.f280904e;
            pjVar.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280903d;
            if (c01.id.c() - f9Var.mo78012x3fdd41df() > ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_transfer_revoke_timelimit, u04.d.f505010c)) {
                db5.e1.y(pjVar.f280113d.g(), pjVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5t), "", pjVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lj(pjVar));
                return;
            }
            java.lang.String U1 = f9Var.U1();
            if (U1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRevokeComponent", "xml is null");
                return;
            }
            ot0.q v17 = ot0.q.v(U1);
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRevokeComponent", "content is null");
                return;
            }
            ot0.n nVar = (ot0.n) v17.y(ot0.n.class);
            if (nVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceRevokeComponent", "piece is null");
                return;
            }
            qg0.b0 b0Var = (qg0.b0) i95.n0.c(qg0.b0.class);
            java.lang.String str = nVar.f430127c;
            java.lang.String x17 = pjVar.f280113d.x();
            java.lang.String str2 = v17.L0;
            ((pg0.a3) b0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d(str, x17, str2);
            yb5.d dVar2 = pjVar.f280113d;
            dVar2.W(dVar2.g(), null, pjVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5q), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mj(pjVar, f9Var, dVar));
            dVar.l().q(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oj(pjVar, f9Var));
        }
    }
}
