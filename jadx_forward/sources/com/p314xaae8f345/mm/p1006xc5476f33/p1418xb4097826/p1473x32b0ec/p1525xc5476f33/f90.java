package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f194055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 f194056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1 f194057f;

    public f90(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1 z1Var) {
        this.f194055d = view;
        this.f194056e = g90Var;
        this.f194057f = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f194055d;
        java.lang.Object parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g90 g90Var = this.f194056e;
        g90Var.f194186c.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        g90Var.a(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.f194057f).d());
        android.os.Bundle bundle = new android.os.Bundle();
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", c1Var != null ? c1Var.l7() : false);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", true);
        g90Var.f194185b.f194858g.mo46557x60d69242(qo0.b.f446899i4, bundle);
    }
}
