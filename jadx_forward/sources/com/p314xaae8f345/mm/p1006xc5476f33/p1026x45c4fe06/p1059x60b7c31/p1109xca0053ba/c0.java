package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes7.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f164525d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f164526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.d0 f164527f;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 b0Var, android.view.ViewTreeObserver viewTreeObserver, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.d0 d0Var) {
        this.f164526e = viewTreeObserver;
        this.f164527f = d0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f164525d + 1;
        this.f164525d = i17;
        if (i17 < 2) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = this.f164526e;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.d0 d0Var = this.f164527f;
        if (d0Var.f164529d.getAndSet(true)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.b0 b0Var = d0Var.f164531f;
        java.lang.String str = b0Var.f164517b;
        b0Var.c(d0Var.f164530e);
    }
}
