package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class p7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.t7 f72772d;

    public p7(com.tencent.mm.plugin.aa.ui.t7 t7Var) {
        this.f72772d = t7Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        r45.h hVar;
        g4Var.add(0, 1, 1, com.tencent.mm.R.string.hh7);
        com.tencent.mm.plugin.aa.ui.t7 t7Var = this.f72772d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f72817e.f72544J) && t7Var.f72817e.f72544J.equals(c01.z1.r())) {
            r45.d0 d0Var = t7Var.f72816d;
            if (d0Var.f371965q == 1 && d0Var.f371963o < d0Var.f371961m) {
                g4Var.d(2, t7Var.f72817e.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), t7Var.f72817e.getString(com.tencent.mm.R.string.f489724x));
            }
        }
        int i17 = 4;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f72817e.f72544J) && t7Var.f72817e.f72544J.equals(c01.z1.r())) {
            r45.d0 d0Var2 = t7Var.f72816d;
            if (d0Var2.f371965q == 1 && d0Var2.f371959h == 4) {
                g4Var.d(2, t7Var.f72817e.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), t7Var.f72817e.getString(com.tencent.mm.R.string.f489724x));
            }
        }
        java.util.LinkedList linkedList = t7Var.f72816d.I;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        for (r45.h0 h0Var : t7Var.f72816d.I) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h0Var.f375698d) && (hVar = h0Var.f375699e) != null && hVar.f375694d != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "add option :%s", h0Var.f375698d);
                g4Var.f(i17, h0Var.f375698d);
            }
            i17++;
        }
    }
}
