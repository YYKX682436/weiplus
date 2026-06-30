package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f289764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 f289765e;

    public x5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 b6Var, boolean z17) {
        this.f289765e = b6Var;
        this.f289764d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 b6Var = this.f289765e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = b6Var.f289012e.f289534d;
        if (j0Var != null && j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "update dialog is showing.");
            return;
        }
        r45.mm6 mm6Var = b6Var.f289011d;
        if (mm6Var.f462215u == 1) {
            if (mm6Var.f462214t == 4) {
                xv.h0 h0Var = (xv.h0) i95.n0.c(xv.h0.class);
                int i17 = b6Var.f289011d.f462214t;
                ((wv.a) h0Var).getClass();
                w73.a.e("mmdiff_apk_has_ready", 0, i17);
                ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                w73.f.k(121);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 121L, 1L, false);
            } else {
                xv.h0 h0Var2 = (xv.h0) i95.n0.c(xv.h0.class);
                int i18 = b6Var.f289011d.f462214t;
                ((wv.a) h0Var2).getClass();
                w73.a.e("mmdiff_apk_has_ready", 0, i18);
                ((wv.e0) ((xv.l0) i95.n0.c(xv.l0.class))).getClass();
                w73.f.k(60);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(614L, 60L, 1L, false);
            }
        }
        if (!this.f289764d) {
            r45.mm6 mm6Var2 = b6Var.f289011d;
            if (mm6Var2.f462217w != 1) {
                if (mm6Var2.f462216v == 1) {
                    int i19 = mm6Var2.f462214t;
                    if (i19 == 4 || i19 == 3) {
                        ((un4.e) i95.n0.c(un4.e.class)).getClass();
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).uj(b6Var.f289011d.f462213s);
                    } else {
                        ((un4.e) i95.n0.c(un4.e.class)).getClass();
                        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).tj(b6Var.f289011d.f462213s);
                    }
                }
                k35.n1.a();
            }
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = b6Var.f289012e;
        android.app.Activity activity = q5Var.f289542o;
        r45.mm6 mm6Var3 = b6Var.f289011d;
        q5Var.f289534d = db5.e1.C(activity, mm6Var3.f462207m, mm6Var3.f462206i, mm6Var3.f462208n, mm6Var3.f462209o, false, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v5(this), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w5(this));
        k35.n1.a();
    }
}
