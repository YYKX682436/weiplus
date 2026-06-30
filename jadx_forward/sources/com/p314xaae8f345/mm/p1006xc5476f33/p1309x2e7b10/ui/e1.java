package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f1 f176520d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f1 f1Var) {
        this.f176520d = f1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f1 f1Var = this.f176520d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = f1Var.f176537d.f176355f;
        int i18 = c13037x580b4d4e.X;
        if (i18 != 1) {
            if (i18 == 2) {
                lu1.d.d(c13037x580b4d4e.H, c13037x580b4d4e.Z, c13037x580b4d4e.f176190p0, 1028, 0);
                return;
            }
            return;
        }
        boolean equals = "cardhomepage".equals(c13037x580b4d4e.Y);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = f1Var.f176537d;
        if (equals) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9 c5631x90d66b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9();
            c5631x90d66b9.f135958g.f87687a = viewOnClickListenerC13051xc6cfcc17.mo55332x76847179();
            c5631x90d66b9.e();
        } else if ("cardhomepage/couponandgiftcard".equals(viewOnClickListenerC13051xc6cfcc17.f176355f.Y)) {
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                j45.l.j(viewOnClickListenerC13051xc6cfcc17.mo55332x76847179(), "card", ".ui.v3.CouponCardListUI", intent, null);
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9 c5631x90d66b92 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9();
                c5631x90d66b92.f135958g.f87687a = viewOnClickListenerC13051xc6cfcc17.mo55332x76847179();
                c5631x90d66b92.e();
            }
        }
    }
}
