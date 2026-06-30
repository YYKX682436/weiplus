package g10;

/* loaded from: classes5.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349075d;

    public p(java.lang.String str) {
        this.f349075d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f349075d;
        try {
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Di(), "mbpkgs"), str + ".wspkg").o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                com.p314xaae8f345.mm.vfs.w6.h(o17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: deleted debug pkg: ".concat(o17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: debug pkg not found, skip delete: ".concat(o17));
            }
            m45.b.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand1");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicEcsNirvanaFeatureService", e17, "hy: failed to delete debug pkg for bizName: " + str, new java.lang.Object[0]);
        }
    }
}
