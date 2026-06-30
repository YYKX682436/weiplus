package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269535e;

    public d0(ug3.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var) {
        this.f269534d = kVar;
        this.f269535e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ug3.k kVar = this.f269534d;
        boolean z17 = kVar.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var = this.f269535e;
        if (z17) {
            ug3.i.H(kVar, com.p314xaae8f345.mm.p957x53236a1b.r1.f152936e);
            kVar.L = false;
            k0Var.D.setChecked(!r9.isChecked());
        } else {
            android.content.Context context = k0Var.f269554d;
            java.lang.String str = kVar.A;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7p);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = string;
            }
            db5.e1.A(context, str, k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7r), k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7q), k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.b0(kVar, k0Var), com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.c0.f269532d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
