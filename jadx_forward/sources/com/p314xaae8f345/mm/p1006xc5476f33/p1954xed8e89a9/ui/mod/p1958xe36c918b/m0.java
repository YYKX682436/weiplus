package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 f235630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f235631e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 n0Var, android.content.Intent intent) {
        this.f235630d = n0Var;
        this.f235631e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModLabelUIWxContact$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.n0 n0Var = this.f235630d;
        n0Var.f235636u = true;
        ((j93.n) ((jz5.n) n0Var.f235635t).mo141623x754a37bb()).V6(600, this.f235631e, false, new java.util.ArrayList(n0Var.f235633r));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModLabelUIWxContact$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
