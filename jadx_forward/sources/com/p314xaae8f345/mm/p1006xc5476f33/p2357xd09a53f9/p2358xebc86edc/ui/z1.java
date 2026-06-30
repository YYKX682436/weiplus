package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss4.l0 f260071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 f260072e;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734, ss4.l0 l0Var) {
        this.f260072e = activityC19003x7959c734;
        this.f260071d = l0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ss4.l0 l0Var = this.f260071d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "click open lqt: %s", java.lang.Integer.valueOf(l0Var.f493623c));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17084, 8);
        int i18 = l0Var.f493623c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734 = this.f260072e;
        if (i18 == 2) {
            activityC19003x7959c734.f259376s = true;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC19003x7959c734.mo55332x76847179(), l0Var.f493622b, true);
        } else if (i18 == 3) {
            activityC19003x7959c734.f259376s = true;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(l0Var.f493624d, l0Var.f493622b, 0, 1000);
        }
    }
}
