package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f158303d;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f158303d = o6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f158303d;
        if (this == o6Var.f167702f3.d() && (qVar = o6Var.f156343s) != null && qVar.getHeight() > 0 && o6Var.x0() != null) {
            o6Var.K("MoveOffScreenFunc getPageContainer().setTranslationY(%d)", java.lang.Integer.valueOf(o6Var.f156343s.getHeight()));
            o6Var.x0().setTranslationY(o6Var.f156343s.getHeight());
        }
    }
}
