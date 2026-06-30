package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x5 f221303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221304g;

    public w5(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x5 x5Var, android.content.Context context) {
        this.f221301d = str;
        this.f221302e = q5Var;
        this.f221303f = x5Var;
        this.f221304g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class));
        java.lang.String str = this.f221301d;
        m33.g1 mj6 = p0Var.mj(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221302e;
        if (mj6 == null) {
            q5Var.a("videoId not exist in client", null);
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(mj6.f404823d)) {
            this.f221303f.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + str + ", local file not exist");
            q5Var.a("local file not exist", null);
            return;
        }
        m33.k1 k1Var = new m33.k1();
        k1Var.f404836a = mj6.f404821b;
        k1Var.f404839d = mj6.f404829j;
        k1Var.f404837b = mj6.f404822c;
        k1Var.f404838c = mj6.f404823d;
        k1Var.f404840e = mj6.f404827h;
        k1Var.f404841f = mj6.f404828i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.v5(this.f221304g, k1Var, this.f221303f, this.f221301d, this.f221302e));
    }
}
