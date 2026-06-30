package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes3.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224321d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var) {
        this.f224321d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224321d;
        intent.setClass(m0Var.f224465d, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16128x168466e3 activityC16128x168466e3 = m0Var.f224465d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16128x168466e3, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16128x168466e3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16128x168466e3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
