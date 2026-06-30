package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class y0 implements java.lang.Runnable {
    public y0(com.p314xaae8f345.mm.p669x38b6e557.z0 z0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.database.Cursor cursor;
        android.database.Cursor b76 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b7(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, new java.lang.String[]{"msgId", "msgSvrId", "lvbuffer"}, 3);
        int i17 = 0;
        long j17 = 0;
        while (b76.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(b76);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            if (((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).mj(f9Var, b27.f404172g) || b27.f404184s == 1) {
                cursor = b76;
                java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.c0.f104083a.d(b27.l()), b27.f404170e, "", "", true, false);
                java.lang.String bj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104097i, b27.f404172g, "", "", true, false);
                if (com.p314xaae8f345.mm.vfs.w6.j(bj7) && (com.p314xaae8f345.mm.vfs.w6.j(bj6) || f9Var.z2())) {
                    com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(bj7 + "hd");
                    if (m17 != null) {
                        boolean b17 = m17.b(true);
                        if (b17) {
                            mt1.b0.f412724a.q(f9Var.m124847x74d37ac6(), f9Var.Q0());
                            i17++;
                            j17 += m17.f294767d;
                        }
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.l0 Di = m11.b1.Di();
                        Di.getClass();
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "clearUrlToFullPathMaps, stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                        ((java.util.HashMap) Di.f404278o).clear();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "clean hd thumb, path = " + m17.f294764a + ", deleteRet = " + b17);
                    }
                }
            } else {
                cursor = b76;
            }
            b76 = cursor;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "clean hd thumb, total count = " + i17 + ", diskSpace = " + j17);
    }
}
