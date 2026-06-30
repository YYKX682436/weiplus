package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.j1 f222814e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.j1 j1Var, java.lang.String str) {
        this.f222814e = j1Var;
        this.f222813d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.j1 j1Var = this.f222814e;
        p53.u uVar = j1Var.f222817e.f222730m;
        if (uVar != null) {
            uVar.m157861x421622b1().e(j1Var.f222817e.f222731n, this.f222813d);
        }
    }
}
