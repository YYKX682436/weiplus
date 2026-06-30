package aw2;

/* loaded from: classes10.dex */
public final class z extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.c0 f96357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96358e;

    public z(aw2.c0 c0Var, int i17) {
        this.f96357d = c0Var;
        this.f96358e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        aw2.c0 c0Var = this.f96357d;
        android.view.ViewGroup.LayoutParams layoutParams = c0Var.d().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = (int) (this.f96358e * f17);
        c0Var.d().setLayoutParams(layoutParams2);
    }
}
