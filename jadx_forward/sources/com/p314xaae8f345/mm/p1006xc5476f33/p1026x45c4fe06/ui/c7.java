package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f171158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d7 f171159e;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d7 d7Var, yz5.a aVar) {
        this.f171159e = d7Var;
        this.f171158d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d7 d7Var = this.f171159e;
        if (d7Var.getParent() instanceof android.view.ViewGroup) {
            d7Var.animate().alpha(0.0f).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b7(this, d7Var, (android.view.ViewGroup) d7Var.getParent())).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a7(this)).start();
        }
    }
}
