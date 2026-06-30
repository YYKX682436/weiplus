package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j4 f221209g;

    public i4(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j4 j4Var) {
        this.f221206d = str;
        this.f221207e = q5Var;
        this.f221208f = context;
        this.f221209g = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class));
        java.lang.String str = this.f221206d;
        m33.g1 mj6 = p0Var.mj(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221207e;
        if (mj6 == null) {
            q5Var.a("videoId not exist in client", null);
        }
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(mj6.f404823d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j4 j4Var = this.f221209g;
        if (j17) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            java.lang.String str2 = mj6.f404823d;
            android.content.Context context = this.f221208f;
            ((yb0.g) b0Var).Bi(context, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.h4(j4Var, context, q5Var, str));
            return;
        }
        j4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, error videoId = " + str + ", local file not exist");
        q5Var.a("local file not exist", null);
    }
}
