package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class v9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f168711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 f168712e;

    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var, java.lang.Runnable runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l9 l9Var) {
        this.f168712e = w9Var;
        this.f168711d = runnable;
        w9Var.D.add(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f168712e.D.remove(this);
        this.f168711d.run();
    }
}
