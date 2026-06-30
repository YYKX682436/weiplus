package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c7 f171037d;

    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c7 c7Var) {
        this.f171037d = c7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d7 d7Var = this.f171037d.f171159e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d7.A;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) d7Var.findViewById(com.p314xaae8f345.mm.R.id.lbi);
        if (progressBar == null || !(progressBar.getIndeterminateDrawable() instanceof android.graphics.drawable.Animatable)) {
            return;
        }
        ((android.graphics.drawable.Animatable) progressBar.getIndeterminateDrawable()).stop();
    }
}
