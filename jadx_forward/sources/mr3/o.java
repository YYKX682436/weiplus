package mr3;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f412420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f412421e;

    public o(in5.s0 s0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d) {
        this.f412420d = s0Var;
        this.f412421e = c22628xfde5d61d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f412420d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s0Var.f374654e, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s0Var.o(), "getRecyclerView(...)");
        int width = (int) ((r0.getWidth() - (6 * ((float) java.lang.Math.rint(i65.a.g(r1) * 4)))) / 3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f412421e;
        android.view.ViewGroup.LayoutParams layoutParams = c22628xfde5d61d.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        c22628xfde5d61d.setLayoutParams(layoutParams);
        c22628xfde5d61d.setVisibility(0);
    }
}
