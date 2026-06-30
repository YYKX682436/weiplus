package com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566;

/* loaded from: classes8.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 f290113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qj5.q f290114g;

    public x0(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var, qj5.q qVar) {
        this.f290111d = context;
        this.f290112e = str;
        this.f290113f = j1Var;
        this.f290114g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.STORAGE;
        d85.f0 f0Var = d85.f0.M;
        com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = this.f290113f;
        qj5.q qVar = this.f290114g;
        android.content.Context context = this.f290111d;
        java.lang.String str = this.f290112e;
        if (((d85.d1) m0Var).Di(g0Var, f0Var, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.w0(j1Var, qVar, context, str))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "permission ungranted");
            return;
        }
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(context, str, new com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.v0(context, j1Var));
    }
}
