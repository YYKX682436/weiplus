package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class z0 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 f154436a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2) {
        this.f154436a = activityC11343xa72aeaf2;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2 = this.f154436a;
            activityC11343xa72aeaf2.f154001x = null;
            activityC11343xa72aeaf2.k7();
        } else {
            this.f154436a.f154001x = charSequence.toString();
            this.f154436a.k7();
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.y0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(y0Var, 300L, false);
        return true;
    }
}
