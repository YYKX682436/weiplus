package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 f218787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 f218788e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 b0Var) {
        this.f218788e = d0Var;
        this.f218787d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = this.f218788e;
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0.a(d0Var);
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "reopen Camera");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            d0Var.getClass();
            g0Var.mo68477x336bdfd8(917L, 39L, 1L, false);
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0.a(d0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "isOpenCamera：%s", java.lang.Boolean.valueOf(a17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        d0Var.getClass();
        g0Var2.mo68477x336bdfd8(917L, 38L, 1L, false);
        this.f218787d.a(java.lang.Boolean.valueOf(a17), d0Var);
    }
}
