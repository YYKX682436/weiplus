package g10;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f349063e;

    public k(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f349062d = str;
        this.f349063e = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f349062d;
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Di(), "mbpkgs");
            com.p314xaae8f345.mm.vfs.w6.u(r6Var.o());
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str + ".wspkg");
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(this.f349063e.o());
            try {
                java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(r6Var2.o(), false);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(E);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K);
                    vz5.a.b(E, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(E, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: copied debug pkg to " + r6Var2.o() + ", length: " + com.p314xaae8f345.mm.vfs.w6.k(r6Var2.o()));
                    pm0.v.X(g10.j.f349061d);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicEcsNirvanaFeatureService", e17, "hy: failed to copy debug pkg for bizName: " + str, new java.lang.Object[0]);
        }
    }
}
