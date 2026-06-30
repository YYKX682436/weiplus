package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class k implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.l f64817d;

    public k(com.tencent.mm.console.l lVar) {
        this.f64817d = lVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "copypackage";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.console.l lVar = this.f64817d;
        try {
            java.lang.String e07 = lp0.b.e0();
            c01.d9.b().getClass();
            java.lang.String a17 = zz1.a.a();
            java.lang.String D = lp0.b.D();
            java.lang.String substring = a17.substring(e07.length());
            com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d, root:%s, pkgFullPath:%s, sysPath:%s, pkgPath:%s", java.lang.Integer.valueOf(lVar.f64819d), e07, a17, D, substring);
            for (int i17 = 0; i17 < lVar.f64819d; i17++) {
                java.lang.String str = ((com.tencent.mm.sdk.platformtools.n7) lVar.f64820e.get(i17)).f192876b;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !e07.contains(str)) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str + substring);
                    if (r6Var.m() && r6Var.y()) {
                        boolean b17 = com.tencent.mm.vfs.w6.b(r6Var.o(), a17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "summercmd copypackage done pkgFullPath:%s, old:%s, ret:%b", a17, r6Var.o(), java.lang.Boolean.valueOf(b17));
                        if (b17) {
                            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.console.i(this));
                            return;
                        }
                    }
                }
            }
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.console.j(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CommandProcessor", "summercmd copypackage e:%s", e17.getMessage());
        }
    }
}
