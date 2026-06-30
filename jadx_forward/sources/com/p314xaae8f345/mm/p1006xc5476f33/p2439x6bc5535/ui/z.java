package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f269611f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var, ug3.k kVar, android.animation.Animator animator) {
        this.f269609d = k0Var;
        this.f269610e = kVar;
        this.f269611f = animator;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var = this.f269609d;
        if (k0Var.K) {
            k0Var.f269568u.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562799oy);
            k0Var.f269569v.m82040x7541828(k0Var.f269554d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            k0Var.f269568u.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562800oz);
            k0Var.f269569v.m82040x7541828(k0Var.f269554d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ug3.k kVar = this.f269610e;
        sb6.append(kVar.f474004n);
        sb6.append(", lockUnlockWebEx isLock:");
        sb6.append(k0Var.K);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        int i17 = k0Var.K ? 2 : 1;
        int i18 = kVar.f473997d;
        k0Var.getClass();
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) iy4.w0.f377551g).get(java.lang.Integer.valueOf(i18));
        if (num != null) {
            i18 = num.intValue();
        }
        new iy4.w0(i17, i18, kVar.f474006p, 1).mo807x6c193ac1(gm0.j1.d().f152297d, new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.y(k0Var, kVar));
        k0Var.f269571x.setVisibility(0);
        this.f269611f.start();
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
