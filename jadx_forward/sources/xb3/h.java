package xb3;

/* loaded from: classes9.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c f534435a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c) {
        this.f534435a = activityC16335x1879211c;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = this.f534435a;
        activityC16335x1879211c.f226674o.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.H(activityC16335x1879211c.f226675p);
        activityC16335x1879211c.f226674o.setClickable(true);
        activityC16335x1879211c.W6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.r43 r43Var = (r45.r43) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(r43Var.f466055d), r43Var.f466056e);
            int i17 = r43Var.f466055d;
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.up.a(activityC16335x1879211c.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f573947gj5);
                r45.q34 q34Var = r43Var.I;
                if (q34Var != null) {
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0.d(q34Var).g(activityC16335x1879211c.mo55332x76847179(), new xb3.g(this, r43Var));
                    return java.lang.Boolean.TRUE;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n.b(r43Var.L);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(b17)) {
                    activityC16335x1879211c.mo67598xf0aced2e(4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(activityC16335x1879211c);
                    l0Var.f262454a = true;
                    l0Var.b(b17, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b0(l0Var));
                    return java.lang.Boolean.TRUE;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.V6(activityC16335x1879211c, r43Var);
            } else if (i17 == 416) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "need verify realname");
                r45.lj5 lj5Var = r43Var.D;
                if (lj5Var != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".hk.ui.LuckyMoneyHKReceiveUI");
                    bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                    activityC16335x1879211c.f226674o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3t);
                    int i18 = lj5Var.f461056d;
                    if (i18 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "showRealnameDialog");
                        zs4.q.g(activityC16335x1879211c.mo55332x76847179(), lj5Var.f461057e, 0, lj5Var.f461058f, lj5Var.f461059g, bundle, false, null, null, 1003, 2);
                    } else if (i18 == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lj5Var.f461060h)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "showUploadCreditDialog");
                        zs4.q.h(activityC16335x1879211c.mo55332x76847179(), lj5Var.f461057e, lj5Var.f461060h, lj5Var.f461058f, lj5Var.f461059g, false, null);
                    }
                }
            } else {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.B;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r43Var.f466056e)) {
                    str = r43Var.f466056e;
                }
                db5.e1.T(activityC16335x1879211c.mo55332x76847179(), str);
                activityC16335x1879211c.finish();
            }
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c.B;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f152150c)) {
                str2 = fVar.f152150c;
            }
            db5.e1.T(activityC16335x1879211c.mo55332x76847179(), str2);
            activityC16335x1879211c.finish();
        }
        return null;
    }
}
