package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class k3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c f260557a;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c) {
        this.f260557a = activityC19056xd4c1806c;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19056xd4c1806c activityC19056xd4c1806c = this.f260557a;
        android.app.Dialog dialog = activityC19056xd4c1806c.f260501q;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC19056xd4c1806c.mo55332x76847179(), "");
            activityC19056xd4c1806c.f260498n.m81392x52cfa5c6(false);
            return null;
        }
        r45.z15 z15Var = (r45.z15) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletUniversalPayOrderUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(z15Var.f473140d), ((r45.z15) fVar.f152151d).f473141e);
        if (z15Var.f473140d != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.L(z15Var.f473141e);
            activityC19056xd4c1806c.f260498n.m81392x52cfa5c6(false);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o3 o3Var = activityC19056xd4c1806c.f260492e;
        o3Var.f260579e = z15Var.f473142f;
        o3Var.notifyDataSetChanged();
        activityC19056xd4c1806c.setResult(-1);
        return null;
    }
}
