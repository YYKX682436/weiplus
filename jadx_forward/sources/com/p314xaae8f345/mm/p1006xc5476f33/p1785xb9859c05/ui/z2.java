package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class z2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 f224627d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5) {
        this.f224627d = activityC16141x4dcd32b5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b5 = this.f224627d;
        q83.e eVar = activityC16141x4dcd32b5.f224182n;
        eVar.f442295h++;
        eVar.b();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC16141x4dcd32b5.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16141x4dcd32b5 activityC16141x4dcd32b52 = this.f224627d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16141x4dcd32b52, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16141x4dcd32b52.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16141x4dcd32b52, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16141x4dcd32b5.finish();
    }
}
