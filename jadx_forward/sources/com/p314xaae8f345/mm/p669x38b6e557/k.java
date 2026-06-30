package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class k implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p669x38b6e557.l f146350d;

    public k(com.p314xaae8f345.mm.p669x38b6e557.l lVar) {
        this.f146350d = lVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "copypackage";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p669x38b6e557.l lVar = this.f146350d;
        try {
            java.lang.String e07 = lp0.b.e0();
            c01.d9.b().getClass();
            java.lang.String a17 = zz1.a.a();
            java.lang.String D = lp0.b.D();
            java.lang.String substring = a17.substring(e07.length());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d, root:%s, pkgFullPath:%s, sysPath:%s, pkgPath:%s", java.lang.Integer.valueOf(lVar.f146352d), e07, a17, D, substring);
            for (int i17 = 0; i17 < lVar.f146352d; i17++) {
                java.lang.String str = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) lVar.f146353e.get(i17)).f274409b;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !e07.contains(str)) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str + substring);
                    if (r6Var.m() && r6Var.y()) {
                        boolean b17 = com.p314xaae8f345.mm.vfs.w6.b(r6Var.o(), a17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandProcessor", "summercmd copypackage done pkgFullPath:%s, old:%s, ret:%b", a17, r6Var.o(), java.lang.Boolean.valueOf(b17));
                        if (b17) {
                            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p669x38b6e557.i(this));
                            return;
                        }
                    }
                }
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p669x38b6e557.j(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CommandProcessor", "summercmd copypackage e:%s", e17.getMessage());
        }
    }
}
