package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269548e;

    public i0(ug3.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var) {
        this.f269547d = kVar;
        this.f269548e = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ug3.k kVar = this.f269547d;
        boolean z17 = kVar.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var = this.f269548e;
        if (!z17) {
            android.content.Context context = k0Var.f269554d;
            java.lang.String str = kVar.C;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3k);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = string;
            }
            db5.e1.A(context, str, k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3l), k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7q), k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.g0(kVar, k0Var), com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.h0.f269545d);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.D)) {
            ug3.i.I(kVar, r45.l44.kKeepLoggedInDisabled);
            kVar.N = false;
            k0Var.F.setChecked(!r11.isChecked());
        } else {
            android.content.Context context2 = k0Var.f269554d;
            db5.e1.A(context2, kVar.D, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3j), k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571889so), k0Var.f269554d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.e0(kVar, k0Var), com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.f0.f269539d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
