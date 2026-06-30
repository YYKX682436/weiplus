package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f224304d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var) {
        this.f224304d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var = this.f224304d;
        f2Var.dismiss();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("IPCallShareCouponCardUI_KFrom", 2);
        intent.setClass(f2Var.f224342h, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144.class);
        android.content.Context context = f2Var.f224342h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        int i17 = f2Var.f224353v;
        q83.c.a(1, -1, i17, f2Var.e(i17), 1, 1, -1, f2Var.f224339e, f2Var.f224340f);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
