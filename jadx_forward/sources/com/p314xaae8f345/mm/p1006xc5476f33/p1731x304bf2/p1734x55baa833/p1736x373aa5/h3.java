package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 f220679d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var) {
        this.f220679d = i3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220679d;
        java.util.Iterator it = ((java.util.HashSet) i3Var.f220703i).iterator();
        while (it.hasNext()) {
            c43.x xVar = (c43.x) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
            if (c15731x94356d67 != null) {
                long j17 = c15731x94356d67.seq;
                long j18 = i3Var.f220709r.J2;
                if (j17 == j18) {
                    xVar.R = j18;
                    xVar.r();
                    i3Var.f220709r.J2 = -1L;
                }
            }
        }
    }
}
