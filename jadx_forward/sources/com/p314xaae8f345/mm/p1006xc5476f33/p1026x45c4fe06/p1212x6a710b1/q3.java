package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q3 f172067a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f172068b;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q3();
        f172067a = q3Var;
        f172068b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p3.f172061d);
        sj1.l.f489907d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n3();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i17 = sj1.l.f489904a;
        int a17 = q3Var.a();
        sj1.l.f489904a = a17;
        if (a17 != -1) {
            sj1.l.f489905b = true;
        }
        java.lang.String c17 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.h2.f128972a.c(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.z1.f129100a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageTraceBooter", "udr path:" + c17);
        if (com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            pb.h.f434649a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o3(c17);
            int i18 = sj1.l.f489904a;
            if (i18 == 1) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    sj1.l.f489904a = -1;
                } else {
                    sj1.l.f489904a = 1;
                    sj1.l.f489905b = true;
                }
                sj1.l.d("", false);
            } else if (i18 == 3) {
                sj1.l.d("", false);
            }
        } else {
            sj1.l.f489904a = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageTraceBooter", "init enableSystrace:false profileMode:" + q3Var.a() + " mode:" + sj1.l.f489904a);
    }

    public final int a() {
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f172068b).mo141623x754a37bb()).getInt("MicroMsg.LuggageTraceBooter", -1);
    }
}
