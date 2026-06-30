package sr2;

/* loaded from: classes10.dex */
public final class q extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.r f493209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f493210e;

    public q(sr2.r rVar, int i17) {
        this.f493209d = rVar;
        this.f493210e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        sr2.r rVar = this.f493209d;
        android.view.View view = rVar.f493222a;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        int i17 = this.f493210e;
        layoutParams2.bottomMargin = (int) (i17 > 0 ? i17 * f17 : java.lang.Math.abs(i17) * (1 - f17));
        rVar.f493222a.setLayoutParams(layoutParams2);
    }
}
