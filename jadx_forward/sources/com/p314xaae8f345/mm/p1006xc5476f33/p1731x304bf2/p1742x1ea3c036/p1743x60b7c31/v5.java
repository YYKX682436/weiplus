package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m33.k1 f221296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x5 f221297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221299h;

    public v5(android.content.Context context, m33.k1 k1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x5 x5Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221295d = context;
        this.f221296e = k1Var;
        this.f221297f = x5Var;
        this.f221298g = str;
        this.f221299h = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        final android.content.Context context = this.f221295d;
        m33.k1 k1Var = this.f221296e;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5 u5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.u5(this.f221297f, this.f221298g, this.f221299h);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var;
        p0Var.getClass();
        if (!com.p314xaae8f345.mm.vfs.w6.j(k1Var.f404838c)) {
            u5Var.a("file not exist");
            return;
        }
        final l53.i iVar = new l53.i(k1Var, 3);
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnv), true, 3, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.game.p0$$a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                l53.i.this.a();
            }
        });
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.p0$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0.this;
                p0Var2.getClass();
                iVar.b(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.x0(p0Var2, u5Var, f17));
            }
        });
    }
}
