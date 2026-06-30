package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class y0 implements java.lang.Runnable {
    public y0(com.tencent.mm.console.z0 z0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.database.Cursor cursor;
        android.database.Cursor b76 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b7(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, new java.lang.String[]{"msgId", "msgSvrId", "lvbuffer"}, 3);
        int i17 = 0;
        long j17 = 0;
        while (b76.moveToNext()) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.convertFrom(b76);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            if (((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).mj(f9Var, b27.f322639g) || b27.f322651s == 1) {
                cursor = b76;
                java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.c0.f22550a.d(b27.l()), b27.f322637e, "", "", true, false);
                java.lang.String bj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f22564i, b27.f322639g, "", "", true, false);
                if (com.tencent.mm.vfs.w6.j(bj7) && (com.tencent.mm.vfs.w6.j(bj6) || f9Var.z2())) {
                    com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(bj7 + "hd");
                    if (m17 != null) {
                        boolean b17 = m17.b(true);
                        if (b17) {
                            mt1.b0.f331191a.q(f9Var.getMsgId(), f9Var.Q0());
                            i17++;
                            j17 += m17.f213234d;
                        }
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.l0 Di = m11.b1.Di();
                        Di.getClass();
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "clearUrlToFullPathMaps, stack:%s", new com.tencent.mm.sdk.platformtools.z3());
                        ((java.util.HashMap) Di.f322745o).clear();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "clean hd thumb, path = " + m17.f213231a + ", deleteRet = " + b17);
                    }
                }
            } else {
                cursor = b76;
            }
            b76 = cursor;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "clean hd thumb, total count = " + i17 + ", diskSpace = " + j17);
    }
}
