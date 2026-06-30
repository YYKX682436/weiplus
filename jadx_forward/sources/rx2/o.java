package rx2;

/* loaded from: classes10.dex */
public final class o extends android.view.animation.Animation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f482514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f482515e;

    public o(rx2.p pVar, int i17) {
        this.f482514d = pVar;
        this.f482515e = i17;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f17, android.view.animation.Transformation t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        rx2.p pVar = this.f482514d;
        android.view.ViewGroup.LayoutParams layoutParams = pVar.f482519g.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = (int) (this.f482515e * f17);
        pVar.f482519g.setLayoutParams(layoutParams2);
    }
}
