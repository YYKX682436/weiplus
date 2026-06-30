package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes15.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a2 f90159d;

    public u1(com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var) {
        this.f90159d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var = this.f90159d;
        java.util.Iterator it = a2Var.f90027J.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = (com.tencent.mm.plugin.appbrand.ui.recents.c1) it.next();
            a2Var.getClass();
            n3.z1 a17 = n3.l1.a(c1Var.itemView);
            a2Var.K.add(c1Var);
            a17.g(0.0f);
            a17.c(a2Var.f12170e);
            a17.d(new com.tencent.mm.plugin.appbrand.ui.recents.v1(a2Var, c1Var, a17));
            a17.f();
        }
        a2Var.f90027J.clear();
    }
}
