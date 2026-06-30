package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 f167956d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var) {
        this.f167956d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37;
        al1.b r17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = this.f167956d;
        if (y1Var.A1 || (mo14682x9dee9c37 = y1Var.mo14682x9dee9c37()) == null || (r17 = mo14682x9dee9c37.r1()) == null) {
            return;
        }
        mo14682x9dee9c37.P1().d(r17.getTop() + r17.getMeasuredHeight());
    }
}
