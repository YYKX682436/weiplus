package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0 f235489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f235490e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0 o0Var, android.content.Intent intent) {
        this.f235489d = o0Var;
        this.f235490e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/ModLabelUI$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0 o0Var = this.f235489d;
        o0Var.f235495u = true;
        ((j93.n) ((jz5.n) o0Var.f235494t).mo141623x754a37bb()).V6(600, this.f235490e, false, new java.util.ArrayList(o0Var.f235492r));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/ModLabelUI$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
