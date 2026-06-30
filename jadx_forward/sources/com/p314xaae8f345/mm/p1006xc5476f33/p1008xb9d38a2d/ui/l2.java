package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m2 f155528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f155529e;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m2 m2Var, android.widget.CheckBox checkBox) {
        this.f155528d = m2Var;
        this.f155529e = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/GatewayLoginConfirmDialog$show$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m2 m2Var = this.f155528d;
        boolean z17 = !m2Var.M;
        m2Var.M = z17;
        this.f155529e.setChecked(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/GatewayLoginConfirmDialog$show$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
