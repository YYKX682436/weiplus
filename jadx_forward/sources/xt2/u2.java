package xt2;

/* loaded from: classes3.dex */
public final class u2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538582e;

    public u2(xt2.e3 e3Var, cm2.m0 m0Var) {
        this.f538581d = e3Var;
        this.f538582e = m0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        xt2.e3 e3Var = this.f538581d;
        e3Var.f538241m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        cm2.m0 m0Var = this.f538582e;
        java.util.LinkedList m75941xfb821914 = m0Var.f124901v.m75941xfb821914(54);
        if (m75941xfb821914.size() <= 1) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = e3Var.F;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            e3Var.f(m0Var, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "product " + m0Var.f124902w + " parse showbox directly");
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = e3Var.F;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        e3Var.F = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(e3Var.m175930x2a5e9229(), null, null, new xt2.t2(e3Var, m0Var, m75941xfb821914, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "product " + m0Var.f124902w + " start play showBox with item size " + m75941xfb821914.size() + ", job = " + e3Var.F);
    }
}
