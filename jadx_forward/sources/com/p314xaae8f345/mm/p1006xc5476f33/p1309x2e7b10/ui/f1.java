package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 f176537d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17) {
        this.f176537d = viewOnClickListenerC13051xc6cfcc17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardGiftReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17 = this.f176537d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC13051xc6cfcc17.f176355f.f176199x0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = viewOnClickListenerC13051xc6cfcc17.f176355f;
            int i17 = c13037x580b4d4e.X;
            if (i17 == 1) {
                if ("cardhomepage".equals(c13037x580b4d4e.Y)) {
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
            } else if (i17 == 2) {
                lu1.d.d(c13037x580b4d4e.H, c13037x580b4d4e.Z, c13037x580b4d4e.f176190p0, 1028, 0);
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = viewOnClickListenerC13051xc6cfcc17.mo55332x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293262s = viewOnClickListenerC13051xc6cfcc17.f176355f.f176199x0;
            aVar.f293266w = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.e1(this);
            aVar.Z = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
