package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f292034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f292035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f292036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f292037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f292038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f292039i;

    public j1(qk.o oVar, android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, boolean z17, int i17, java.lang.Runnable runnable) {
        this.f292034d = oVar;
        this.f292035e = activity;
        this.f292036f = z3Var;
        this.f292037g = z17;
        this.f292038h = i17;
        this.f292039i = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17 = this.f292037g;
        int i18 = this.f292038h;
        qk.o oVar = this.f292034d;
        android.app.Activity activity = this.f292035e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f292036f;
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.a(oVar, activity, z3Var, z17, i18);
        ((qk.s6) gm0.j1.s(qk.s6.class)).da(oVar);
        java.lang.Runnable runnable = this.f292039i;
        if (runnable != null) {
            runnable.run();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(z3Var.d1())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj().J0(gm0.j1.b().k());
        }
    }
}
