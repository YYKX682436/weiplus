package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269601e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var, ug3.k kVar) {
        this.f269600d = k0Var;
        this.f269601e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var = this.f269600d;
        boolean z17 = k0Var.f269553J;
        ug3.k kVar = this.f269601e;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(k0Var.f269554d, 1, true);
            k0Var2.r(k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ghu), 17, i65.a.b(k0Var.f269554d, 14), null);
            k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.t(k0Var);
            k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.u(kVar, k0Var);
            k0Var2.v();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceAdapter", kVar.f474004n + ", open message notify");
            com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0.i(k0Var, kVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
