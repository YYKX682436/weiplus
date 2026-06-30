package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y f169094d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar) {
        this.f169094d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.y yVar = this.f169094d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f169100a.f169051a, "onPlayEnd, onPlayEndWorkaround");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = yVar.f169100a;
        pd1.l lVar = o0Var.f169062l;
        if (lVar == null || (view = o0Var.f169060j) == null) {
            return;
        }
        lVar.f(view);
    }
}
