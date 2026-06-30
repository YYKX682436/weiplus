package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f261887d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f261887d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f261887d;
        java.util.List a17 = activityC19108xd69d11c7.W.a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d.b(activityC19108xd69d11c7.mo55332x76847179(), ((java.lang.Integer) it.next()).intValue()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c2(activityC19108xd69d11c7);
        activityC19108xd69d11c7.f261448m2 = -1;
        activityC19108xd69d11c7.f261450n2 = a17.indexOf(java.lang.Integer.valueOf(activityC19108xd69d11c7.B1));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC19108xd69d11c7.mo55332x76847179());
        u1Var.u(activityC19108xd69d11c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.khn));
        u1Var.t(arrayList2, c2Var, activityC19108xd69d11c7.f261450n2);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d2(activityC19108xd69d11c7));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
