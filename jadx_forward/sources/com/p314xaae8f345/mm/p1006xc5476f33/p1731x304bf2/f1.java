package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 f220980d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var) {
        this.f220980d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread.sleep(5000L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var = this.f220980d;
        if (l1Var.f221004g) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1.wi(l1Var);
    }
}
