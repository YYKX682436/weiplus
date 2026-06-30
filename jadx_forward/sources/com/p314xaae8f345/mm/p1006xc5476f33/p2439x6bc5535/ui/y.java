package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class y implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269608e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var, ug3.k kVar) {
        this.f269607d = k0Var;
        this.f269608e = kVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.m48017xd0f4c159(true);
        iy4.w0 w0Var = (iy4.w0) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var = this.f269607d;
        android.animation.Animator animator = k0Var.I;
        if (animator != null) {
            animator.start();
        }
        boolean Zi = ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(k0Var.f269554d, i17, i18, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ug3.k kVar = this.f269608e;
        sb6.append(kVar.f474004n);
        sb6.append(", NetSceneExtDeviceControl handleErrMsg:");
        sb6.append(Zi);
        sb6.append(" errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        if (Zi) {
            return;
        }
        int i19 = w0Var.f377553e;
        if (i17 != 0 || i18 != 0) {
            if (i19 == 1) {
                android.widget.Toast.makeText(k0Var.f269554d, com.p314xaae8f345.mm.R.C30867xcad56011.l7n, 0).show();
                return;
            } else {
                android.widget.Toast.makeText(k0Var.f269554d, com.p314xaae8f345.mm.R.C30867xcad56011.f575208l83, 0).show();
                return;
            }
        }
        boolean z17 = i19 == 1;
        k0Var.K = z17;
        java.lang.String str2 = ug3.i.f509069g;
        kVar.f509087J = z17;
        if (z17) {
            kVar.f474001h |= 4;
        } else {
            kVar.f474001h &= -5;
        }
        k0Var.l(kVar);
        int i27 = kVar.f474004n;
        boolean z18 = k0Var.K;
    }
}
