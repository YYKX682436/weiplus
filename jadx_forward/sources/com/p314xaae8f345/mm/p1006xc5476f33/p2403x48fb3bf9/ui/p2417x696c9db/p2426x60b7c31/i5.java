package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class i5 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266725a;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var) {
        this.f266725a = c1Var;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public void mo14305x341c20(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266725a;
        if (booleanValue) {
            c1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onBusinessPermissionGranted!");
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
            c1Var.E5();
            return;
        }
        c1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onBusinessPermissionDenied");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
        c1Var.i5(c1Var.f266509e, "geo_location:fail_business_permission", null);
    }
}
