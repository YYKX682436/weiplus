package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f221462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u f221463e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar, boolean z17) {
        this.f221463e = uVar;
        this.f221462d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f221462d) {
            this.f221463e.k();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar = this.f221463e;
        synchronized (uVar) {
            android.view.View view = uVar.I;
            if (view != null && view.getParent() != null) {
                uVar.f264233o.removeView(uVar.I);
            }
            uVar.I = null;
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            m02.u uVar2 = uVar.L;
            ((l02.q) sVar).getClass();
            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D.remove(uVar2);
        }
    }
}
