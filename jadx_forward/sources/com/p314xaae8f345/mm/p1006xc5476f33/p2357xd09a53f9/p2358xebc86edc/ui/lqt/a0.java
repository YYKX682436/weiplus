package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 f259620a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4) {
        this.f259620a = activityC19009xdf81ddb4;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "qry back: %s, %s, %s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152148a));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4 = this.f259620a;
        if (i17 != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC19009xdf81ddb4.mo55332x76847179(), fVar.f152150c);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(((r45.xg5) fVar.f152151d).f471617o);
        r45.xg5 xg5Var = (r45.xg5) fVar.f152151d;
        if (xg5Var.f471609d != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(activityC19009xdf81ddb4.mo55332x76847179(), ((r45.xg5) fVar.f152151d).f471610e);
            return null;
        }
        activityC19009xdf81ddb4.f259476q = xg5Var.f471615m;
        activityC19009xdf81ddb4.f259477r = xg5Var.f471616n;
        activityC19009xdf81ddb4.f259470h.setText(xg5Var.f471611f);
        activityC19009xdf81ddb4.f259471i.setText(xg5Var.f471612g);
        r45.e1 e1Var = xg5Var.f471613h;
        if (e1Var != null) {
            activityC19009xdf81ddb4.f259467e.setText(e1Var.f454430d);
            int i18 = xg5Var.f471613h.f454431e;
            if (i18 == 0) {
                activityC19009xdf81ddb4.X6();
            } else if (i18 == 1) {
                activityC19009xdf81ddb4.W6();
            } else if (i18 == 2) {
                activityC19009xdf81ddb4.f259466d.m81392x52cfa5c6(false);
                activityC19009xdf81ddb4.f259466d.setEnabled(false);
                android.view.View view = activityC19009xdf81ddb4.f259478s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAcctountDisabled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtBalanceAutoTransferUI", "setAcctountDisabled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC19009xdf81ddb4.U6();
            }
        }
        r45.bm6 bm6Var = xg5Var.f471614i;
        if (bm6Var == null) {
            return null;
        }
        activityC19009xdf81ddb4.f259468f.setText(bm6Var.f452408d);
        r45.dm6 dm6Var = xg5Var.f471614i.f452409e;
        if (dm6Var == null) {
            return null;
        }
        activityC19009xdf81ddb4.getClass();
        activityC19009xdf81ddb4.f259474o = dm6Var.f454111d / 60;
        activityC19009xdf81ddb4.f259469g.setText(activityC19009xdf81ddb4.V6(dm6Var, com.p314xaae8f345.mm.R.C30867xcad56011.kop));
        return null;
    }
}
