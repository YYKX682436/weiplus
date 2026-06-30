package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d f220876d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d) {
        this.f220876d = c15859x7405890d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k3 k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220876d;
        if (c15859x7405890d.H2.size() == 0) {
            return;
        }
        java.util.Iterator it = c15859x7405890d.H2.iterator();
        while (true) {
            if (!it.hasNext()) {
                k3Var = null;
                break;
            } else {
                k3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k3) it.next();
                if (!k3Var.f220736b) {
                    break;
                }
            }
        }
        if (k3Var != null) {
            c15859x7405890d.m64429xcced5360(k3Var);
        }
    }
}
