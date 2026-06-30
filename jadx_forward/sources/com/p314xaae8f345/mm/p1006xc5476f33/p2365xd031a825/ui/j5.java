package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes11.dex */
public class j5 implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k5 f261893a;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k5 k5Var) {
        this.f261893a = k5Var;
    }

    @Override // bi4.l1
    /* renamed from: onFinishAction */
    public void mo10624xfbbb8828(int i17, java.lang.String str, pj4.r0 r0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction result :%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k5 k5Var = this.f261893a;
        if (i17 != 0) {
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click error");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 4, k5Var.f261912m.f261565p);
                db5.e1.y(k5Var.f261912m.mo55332x76847179(), k5Var.f261912m.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksj), "", k5Var.f261912m.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i5(this));
                return;
            } else if (i17 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction default");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click cancel");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 2, k5Var.f261912m.f261565p);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "onFinishAction click ok");
        if (r0Var == null || r0Var.f436805d != 2) {
            return;
        }
        if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k5Var.f261909g)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = k5Var.f261912m.f261577x1;
            java.lang.String str2 = k5Var.f261911i;
            int i18 = k5Var.f261910h;
            c19659x677e0913.b(str2, i18, i18, -1);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e09132 = k5Var.f261912m.f261577x1;
            java.lang.String str3 = k5Var.f261909g;
            int i19 = k5Var.f261910h;
            c19659x677e09132.b(str3, i19, i19, -1);
        }
        java.lang.String str4 = r0Var.f436806e.f436844d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = k5Var.f261912m;
        activityC19116x82bf90f1.f261580y1.setText(activityC19116x82bf90f1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ksi, str4));
        k5Var.f261912m.f261582z1.setVisibility(8);
        k5Var.f261912m.f261567p1.setOnClickListener(null);
        k5Var.f261912m.f261567p1.setBackground(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24498, 3, k5Var.f261912m.f261565p);
    }
}
