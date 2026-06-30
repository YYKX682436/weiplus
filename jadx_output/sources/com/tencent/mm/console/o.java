package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.p f64825d;

    public o(com.tencent.mm.console.p pVar) {
        this.f64825d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.console.p pVar = this.f64825d;
        try {
            java.lang.String substring = pVar.f64828d.substring(10);
            java.lang.String e07 = lp0.b.e0();
            gm0.j1.i();
            java.lang.String d17 = gm0.j1.u().d();
            java.lang.String str = d17 + substring;
            java.lang.String substring2 = str.substring(e07.length());
            com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "summercmd copy -n subDir:%s, root:%s, accPath:%s destPath:%s, subPath:%s", substring, e07, d17, str, substring2);
            for (int i17 = 0; i17 < pVar.f64829e; i17++) {
                java.lang.String str2 = ((com.tencent.mm.sdk.platformtools.n7) pVar.f64830f.get(i17)).f192876b;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !e07.contains(str2)) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2 + substring2);
                    if (r6Var.m() && r6Var.y()) {
                        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                        if (!r6Var2.m()) {
                            r6Var2.J();
                        }
                        boolean b17 = com.tencent.mm.vfs.w6.b(r6Var.o(), r6Var2.o());
                        com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "summercmd copy -n done new:%s, old:%s, ret:%b", r6Var2.o(), r6Var.o(), java.lang.Boolean.valueOf(b17));
                        if (b17) {
                            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.console.m(this));
                            return;
                        }
                    }
                }
            }
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.console.n(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CommandProcessor", "summercmd copy -n e:%s", e17.getMessage());
        }
    }
}
