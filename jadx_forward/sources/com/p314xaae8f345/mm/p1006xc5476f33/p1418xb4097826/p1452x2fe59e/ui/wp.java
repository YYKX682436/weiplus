package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class wp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14122xff3e485 f192245d;

    public wp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14122xff3e485 activityC14122xff3e485) {
        this.f192245d = activityC14122xff3e485;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14122xff3e485 activityC14122xff3e485 = this.f192245d;
        if (activityC14122xff3e485.E == null) {
            activityC14122xff3e485.E = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activityC14122xff3e485);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14122xff3e485 activityC14122xff3e4852 = this.f192245d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = activityC14122xff3e4852.E;
            if (f5Var != null) {
                f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vp(activityC14122xff3e4852);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f192245d.E;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
