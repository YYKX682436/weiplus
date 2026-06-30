package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class w0 implements l53.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f223449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m33.i1 f223450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f223451c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m33.k1 f223452d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, m33.i1 i1Var, int i17, m33.k1 k1Var) {
        this.f223449a = u3Var;
        this.f223450b = i1Var;
        this.f223451c = i17;
        this.f223452d = k1Var;
    }

    @Override // l53.a
    public void a(java.lang.String str) {
        m33.i1 i1Var = this.f223450b;
        if (i1Var != null) {
            i1Var.a(str);
        }
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f223449a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.w0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.this.dismiss();
            }
        });
        int i17 = this.f223451c;
        m33.k1 k1Var = this.f223452d;
        if (i17 == 2) {
            n53.b.b(k1Var.f404836a, 3L, 102, 10, 1, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
        } else {
            n53.b.b(k1Var.f404836a, 3L, 101, 10, 1, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
        }
    }

    @Override // l53.a
    public void b(java.lang.String str, java.lang.String str2) {
    }

    @Override // l53.a
    public void c() {
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f223449a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.w0$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.this.dismiss();
            }
        });
    }

    @Override // l53.a
    /* renamed from: onCancel */
    public void mo64831x3d6f0539() {
        m33.i1 i1Var = this.f223450b;
        if (i1Var != null) {
            i1Var.mo74225x3d6f0539();
        }
    }

    @Override // l53.a
    /* renamed from: onSuccess */
    public void mo64832xe05b4124() {
        m33.i1 i1Var = this.f223450b;
        if (i1Var != null) {
            i1Var.mo74226xe05b4124();
        }
        int i17 = this.f223451c;
        m33.k1 k1Var = this.f223452d;
        if (i17 == 2) {
            n53.b.b(k1Var.f404836a, 3L, 102, 10, 0, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
        } else {
            n53.b.b(k1Var.f404836a, 3L, 101, 10, 0, k1Var.f404839d, k1Var.f404843h, k1Var.f404842g);
        }
    }
}
