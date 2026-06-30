package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class t5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f262159a;

    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        this.f262159a = activityC19116x82bf90f1;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f262159a;
        activityC19116x82bf90f1.X1 = null;
        activityC19116x82bf90f1.G1.setVisibility(8);
        activityC19116x82bf90f1.E1.setVisibility(0);
        int i17 = 2;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", java.lang.Integer.valueOf(((r45.h10) fVar.f152151d).f457278d), ((r45.h10) fVar.f152151d).f457279e);
            if (((r45.h10) fVar.f152151d).f457278d == 0) {
                activityC19116x82bf90f1.P1 = true;
                a36.d dVar = activityC19116x82bf90f1.M1.f82648r;
                if (dVar.f82655m == 1 && !activityC19116x82bf90f1.Z1) {
                    a36.h hVar = dVar.f82656n;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "show card mch alert");
                    if (hVar != null) {
                        activityC19116x82bf90f1.Z1 = true;
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19116x82bf90f1.mo55332x76847179();
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                        aVar.f293242a = hVar.f82678d;
                        android.view.View inflate = android.view.View.inflate(activityC19116x82bf90f1.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569873qm, null);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.bzz);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bzy);
                        c19659x677e0913.m75396xca029dad(hVar.f82680f);
                        textView.setText(hVar.f82679e);
                        aVar.L = inflate;
                        aVar.f293265v = hVar.f82681g;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                        j0Var.e(aVar);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                        if (d0Var != null) {
                            d0Var.a(j0Var.f293370r);
                        }
                        j0Var.show();
                        activityC19116x82bf90f1.mo53058xe5d1a549(j0Var);
                    }
                    i17 = 1;
                }
                activityC19116x82bf90f1.k7();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17270, activityC19116x82bf90f1.f261565p, activityC19116x82bf90f1.M1.f82648r.f82659q, 1, 1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17270, activityC19116x82bf90f1.f261565p, activityC19116x82bf90f1.M1.f82648r.f82659q, 1, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17270, activityC19116x82bf90f1.f261565p, activityC19116x82bf90f1.M1.f82648r.f82659q, 1, 2, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return null;
    }
}
