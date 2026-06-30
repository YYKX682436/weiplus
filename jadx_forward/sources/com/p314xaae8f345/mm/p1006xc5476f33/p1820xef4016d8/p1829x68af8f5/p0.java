package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.q0 f227433d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.q0 q0Var) {
        this.f227433d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.q0 q0Var = this.f227433d;
        android.widget.ProgressBar progressBar = q0Var.f227435d.f227372s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.view.View findViewById = q0Var.f227435d.f227366m.findViewById(com.p314xaae8f345.mm.R.id.f569096p06);
        if (findViewById != null) {
            android.view.View view = (android.view.View) findViewById.getParent();
            view.setFocusable(false);
            ((android.view.View) view.getParent()).setFocusable(false);
        }
        if (q0Var.f227435d.f227366m.getParent() != null) {
            ((android.view.ViewGroup) q0Var.f227435d.f227366m.getParent()).bringToFront();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = q0Var.f227435d;
        if (b1Var.f227359f || !q0Var.f227436e.f227338g) {
            return;
        }
        b1Var.f227370q.setVisibility(0);
    }
}
