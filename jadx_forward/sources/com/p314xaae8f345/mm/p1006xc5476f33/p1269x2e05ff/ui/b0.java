package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes3.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0 f174812d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0 d0Var) {
        this.f174812d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0 d0Var = this.f174812d;
        if (d0Var.f174818e.getParent() != null) {
            ((android.view.ViewGroup) d0Var.f174818e.getParent()).removeView(d0Var.f174818e);
        }
    }
}
