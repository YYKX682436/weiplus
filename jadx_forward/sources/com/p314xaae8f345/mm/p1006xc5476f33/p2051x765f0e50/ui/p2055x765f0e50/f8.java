package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class f8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k8 f242559d;

    public f8(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k8 k8Var) {
        this.f242559d = k8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsBindEmailUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k8 k8Var = this.f242559d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(k8Var.m158354x19263085());
        java.lang.String string = k8Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.f293262s = string;
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.j0b);
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h8(k8Var);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.n_z);
        aVar.A = true;
        i0Var.b(true).show();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsBindEmailUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
