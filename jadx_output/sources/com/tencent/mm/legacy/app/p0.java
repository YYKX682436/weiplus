package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class p0 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f68512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.splash.v f68513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.legacy.app.WeChatSplashStartup f68514f;

    public p0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup, boolean z17, com.tencent.mm.splash.v vVar) {
        this.f68514f = weChatSplashStartup;
        this.f68512d = z17;
        this.f68513e = vVar;
    }

    @Override // hm0.t
    public void b() {
        if (this.f68512d) {
            com.tencent.mm.splash.j.d("MicroMsg.FigLeaf", "deleteRequest ", new java.lang.Object[0]);
            java.lang.String str = com.tencent.mm.splash.a.f193640a;
            if (str == null) {
                com.tencent.mm.splash.j.d("MicroMsg.FigLeaf", "deleteRequest, not init.", new java.lang.Object[0]);
            } else {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.splash.a.f193640a + "/main-process-blocking");
                    if (r6Var.m()) {
                        com.tencent.mm.splash.j.d("MicroMsg.FigLeaf", "deleteRequest result %s.", java.lang.Boolean.valueOf(r6Var.l()));
                    }
                } else {
                    com.tencent.mm.splash.j.d("MicroMsg.FigLeaf", "deleteRequest dex opt dir not exists.", new java.lang.Object[0]);
                }
            }
        } else {
            this.f68513e.a();
        }
        nm.a.a(512);
        if (!com.tencent.mm.sdk.platformtools.x2.r()) {
            com.tencent.mm.app.n2 n2Var = com.tencent.mm.app.m2.f53515a;
            synchronized (n2Var) {
                n2Var.f53526b = true;
            }
        }
        if (com.tencent.mm.app.v5.a(this.f68514f.f68486a).f53869f) {
            this.f68514f.f68486a.registerActivityLifecycleCallbacks(com.tencent.mm.app.y6.f53934a);
        }
    }
}
