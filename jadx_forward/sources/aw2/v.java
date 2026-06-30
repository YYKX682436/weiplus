package aw2;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f96334d;

    public v(aw2.c0 c0Var) {
        this.f96334d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aw2.c0 c0Var = this.f96334d;
        c0Var.d().setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.View decorView = c0Var.f96257d.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(c0Var.d(), layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 d17 = c0Var.d();
        aw2.t tVar = new aw2.t(c0Var);
        aw2.u uVar = new aw2.u(c0Var);
        d17.getClass();
        d17.f212664i = tVar;
        d17.f212665m = uVar;
    }
}
