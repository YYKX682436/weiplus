package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 f254565d;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9) {
        this.f254565d = activityC18580x3cc47ed9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long i17 = c01.z1.i();
        boolean z17 = (4398046511104L & i17) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigStorageLogic", "isCNPayWalletRegion() walletRegion:%s: force:%s", java.lang.Long.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = this.f254565d;
        if (z17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.I;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC18580x3cc47ed9.mo55332x76847179());
            u1Var.g(activityC18580x3cc47ed9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574862ol1));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            u1Var.k(activityC18580x3cc47ed9.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            u1Var.q(false);
        } else {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.I;
            activityC18580x3cc47ed9.getClass();
            activityC18580x3cc47ed9.f254384e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC18580x3cc47ed9, 1, true);
            android.widget.TextView textView = new android.widget.TextView(activityC18580x3cc47ed9.mo55332x76847179());
            textView.setGravity(17);
            textView.setHeight(i65.a.b(activityC18580x3cc47ed9.mo55332x76847179(), 40));
            textView.setTextSize(12.0f);
            textView.setTextColor(activityC18580x3cc47ed9.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            textView.setText(activityC18580x3cc47ed9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrk));
            activityC18580x3cc47ed9.f254384e.s(textView, false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC18580x3cc47ed9.f254384e;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p4(activityC18580x3cc47ed9);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.s4(activityC18580x3cc47ed9);
            k0Var.T1 = true;
            k0Var.X1 = true;
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
