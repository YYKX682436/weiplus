package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v4 f198986d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v4 v4Var) {
        this.f198986d = v4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v4 v4Var = this.f198986d;
        if (v4Var.f199006e == null) {
            v4Var.f199006e = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(v4Var.m80379x76847179());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v4 v4Var2 = this.f198986d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = v4Var2.f199006e;
            if (f5Var != null) {
                f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t4(v4Var2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f198986d.f199006e;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
