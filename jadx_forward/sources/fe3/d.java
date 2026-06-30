package fe3;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final fe3.d f343073a = new fe3.d();

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "doCleanAll start");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd> e17 = fe3.j.b().e();
        if (e17 != null && (!e17.isEmpty())) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd : e17) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229391d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s is busy now", c16421xe4d4fcd.f229391d);
                } else {
                    fe3.j.b().h(c16421xe4d4fcd);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "doCleanAll end");
    }

    public final void b(java.lang.String pkgId, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgId, "pkgId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg start pkgId:%s", pkgId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c17 = fe3.j.b().c(pkgId);
        if (c17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f229391d) || c16421xe4d4fcd == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd.f229391d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg invaild pkgInfo");
            return;
        }
        java.lang.String d17 = fe3.l.d(c17.f229391d);
        if (d17 == null) {
            return;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(d17, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(i17));
        if (r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "pkg patchId:%s,lastpkg patchId:%s", c17.f229398n, c16421xe4d4fcd.f229398n);
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
            if (G != null) {
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "local path:%s", r6Var2.u());
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.u(), com.p314xaae8f345.mm.vfs.w6.i(c17.f229394g, true)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.u(), com.p314xaae8f345.mm.vfs.w6.i(c17.f229395h, true)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.u(), com.p314xaae8f345.mm.vfs.w6.i(c16421xe4d4fcd.f229394g, true)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6Var2.u(), com.p314xaae8f345.mm.vfs.w6.i(c16421xe4d4fcd.f229395h, true))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "delete old version folder.");
                        com.p314xaae8f345.mm.vfs.w6.f(r6Var2.u());
                        com.p314xaae8f345.mm.vfs.w6.h(r6Var2.u());
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "files is empty");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s dir not exist", c17.f229391d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgCleaner", "doCleanBizMagicPkg end");
    }
}
