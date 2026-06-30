package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class q4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 f227096d;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var) {
        this.f227096d = r4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var = this.f227096d;
        if (r4Var.f227112h == null || !r4Var.f227110f.isEmpty()) {
            return;
        }
        r4Var.f227112h.dismiss();
        java.util.Iterator it = r4Var.f227111g.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.d(m1Var);
        }
        r4Var.f227111g.clear();
    }
}
