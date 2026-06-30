package mr3;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f412390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f412391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f412392f;

    public e(in5.s0 s0Var, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        this.f412390d = s0Var;
        this.f412391e = linearLayout;
        this.f412392f = linearLayout2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f412390d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s0Var.f374654e, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s0Var.o(), "getRecyclerView(...)");
        int width = (int) ((r0.getWidth() - (6 * ((float) java.lang.Math.rint(i65.a.g(r1) * 4)))) / 3);
        android.widget.LinearLayout linearLayout = this.f412391e;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = width;
        linearLayout.setLayoutParams(layoutParams);
        this.f412392f.setLayoutParams(layoutParams);
        linearLayout.setVisibility(0);
    }
}
