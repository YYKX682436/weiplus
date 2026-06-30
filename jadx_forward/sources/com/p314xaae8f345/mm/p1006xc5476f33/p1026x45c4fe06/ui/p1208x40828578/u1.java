package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes15.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 f171692d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var) {
        this.f171692d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.a2 a2Var = this.f171692d;
        java.util.Iterator it = a2Var.f171560J.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) it.next();
            a2Var.getClass();
            n3.z1 a17 = n3.l1.a(c1Var.f3639x46306858);
            a2Var.K.add(c1Var);
            a17.g(0.0f);
            a17.c(a2Var.f93703e);
            a17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.v1(a2Var, c1Var, a17));
            a17.f();
        }
        a2Var.f171560J.clear();
    }
}
