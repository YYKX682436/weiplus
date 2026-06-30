package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class p0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f150045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2617xca9a2a67.v f150046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 f150047f;

    public p0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850, boolean z17, com.p314xaae8f345.mm.p2617xca9a2a67.v vVar) {
        this.f150047f = c10820x69adf850;
        this.f150045d = z17;
        this.f150046e = vVar;
    }

    @Override // hm0.t
    public void b() {
        if (this.f150045d) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.FigLeaf", "deleteRequest ", new java.lang.Object[0]);
            java.lang.String str = com.p314xaae8f345.mm.p2617xca9a2a67.a.f275173a;
            if (str == null) {
                com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.FigLeaf", "deleteRequest, not init.", new java.lang.Object[0]);
            } else {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p2617xca9a2a67.a.f275173a + "/main-process-blocking");
                    if (r6Var.m()) {
                        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.FigLeaf", "deleteRequest result %s.", java.lang.Boolean.valueOf(r6Var.l()));
                    }
                } else {
                    com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.FigLeaf", "deleteRequest dex opt dir not exists.", new java.lang.Object[0]);
                }
            }
        } else {
            this.f150046e.a();
        }
        nm.a.a(512);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) {
            com.p314xaae8f345.mm.app.n2 n2Var = com.p314xaae8f345.mm.app.m2.f135048a;
            synchronized (n2Var) {
                n2Var.f135059b = true;
            }
        }
        if (com.p314xaae8f345.mm.app.v5.a(this.f150047f.f150019a).f135402f) {
            this.f150047f.f150019a.registerActivityLifecycleCallbacks(com.p314xaae8f345.mm.app.y6.f135467a);
        }
    }
}
