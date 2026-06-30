package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m1 f168313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 f168314e;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m1 m1Var) {
        this.f168314e = o1Var;
        this.f168313d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var = this.f168314e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a = o1Var.f168475c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m1 m1Var = this.f168313d;
        if (c19777x35cb352a != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) m1Var).b(c19777x35cb352a, false, o1Var.f168476d);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o1Var.f168474b)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) m1Var).a(o1Var.f168474b);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o1Var.f168477e)) {
            return;
        }
        java.lang.String str = o1Var.f168477e;
        android.widget.TextView textView = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p0) m1Var).f168515d;
        textView.setText(str);
        textView.setVisibility(0);
    }
}
