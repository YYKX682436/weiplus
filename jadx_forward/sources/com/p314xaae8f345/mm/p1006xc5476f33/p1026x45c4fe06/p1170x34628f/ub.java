package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class ub implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnLayoutChangeListener f168678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vb f168679e;

    public ub(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.vb vbVar, android.view.View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f168679e = vbVar;
        this.f168678d = onLayoutChangeListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f168679e.f168714d.f168072a.mo51313xaf0c0532().removeOnLayoutChangeListener(this.f168678d);
    }
}
