package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p669x38b6e557.p f146358d;

    public o(com.p314xaae8f345.mm.p669x38b6e557.p pVar) {
        this.f146358d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p669x38b6e557.p pVar = this.f146358d;
        try {
            java.lang.String substring = pVar.f146361d.substring(10);
            java.lang.String e07 = lp0.b.e0();
            gm0.j1.i();
            java.lang.String d17 = gm0.j1.u().d();
            java.lang.String str = d17 + substring;
            java.lang.String substring2 = str.substring(e07.length());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandProcessor", "summercmd copy -n subDir:%s, root:%s, accPath:%s destPath:%s, subPath:%s", substring, e07, d17, str, substring2);
            for (int i17 = 0; i17 < pVar.f146362e; i17++) {
                java.lang.String str2 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n7) pVar.f146363f.get(i17)).f274409b;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !e07.contains(str2)) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2 + substring2);
                    if (r6Var.m() && r6Var.y()) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
                        if (!r6Var2.m()) {
                            r6Var2.J();
                        }
                        boolean b17 = com.p314xaae8f345.mm.vfs.w6.b(r6Var.o(), r6Var2.o());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommandProcessor", "summercmd copy -n done new:%s, old:%s, ret:%b", r6Var2.o(), r6Var.o(), java.lang.Boolean.valueOf(b17));
                        if (b17) {
                            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p669x38b6e557.m(this));
                            return;
                        }
                    }
                }
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p669x38b6e557.n(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CommandProcessor", "summercmd copy -n e:%s", e17.getMessage());
        }
    }
}
