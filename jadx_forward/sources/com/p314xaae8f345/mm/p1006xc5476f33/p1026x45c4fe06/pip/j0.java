package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f169034d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f169034d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169034d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "transferFrom, dismissTask run");
        o0Var.f169073w = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = o0Var.f169056f;
        if (c12753x672cc895 == null || (view = o0Var.f169060j) == null || o0Var.f169062l == null) {
            return;
        }
        c12753x672cc895.f172538z.removeView(view);
        o0Var.f169062l.b(o0Var.f169060j);
        o0Var.f169056f.setVisibility(4);
        o0Var.f169060j = null;
        o0Var.f169061k = null;
    }
}
