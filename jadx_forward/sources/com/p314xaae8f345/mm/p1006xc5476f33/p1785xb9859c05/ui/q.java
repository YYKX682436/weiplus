package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16125x200eafe3 f224517d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16125x200eafe3 activityC16125x200eafe3) {
        this.f224517d = activityC16125x200eafe3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16125x200eafe3 activityC16125x200eafe3 = this.f224517d;
        if (activityC16125x200eafe3.f224067m.f486398e == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAcitivityUI", "click activity, go to IPCallPackageUI");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC16125x200eafe3.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16146xeed29e14.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16125x200eafe3 activityC16125x200eafe32 = this.f224517d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16125x200eafe32, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16125x200eafe32.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16125x200eafe32, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(activityC16125x200eafe3.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16125x200eafe3 activityC16125x200eafe33 = this.f224517d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC16125x200eafe33, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16125x200eafe33.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC16125x200eafe33, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        activityC16125x200eafe3.f224066i = true;
        activityC16125x200eafe3.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
