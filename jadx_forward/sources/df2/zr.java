package df2;

/* loaded from: classes3.dex */
public final class zr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f313521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f313522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f313523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lt f313524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f313525h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f313526i;

    public zr(android.view.ViewGroup viewGroup, int[] iArr, int[] iArr2, df2.lt ltVar, int i17, int i18) {
        this.f313521d = viewGroup;
        this.f313522e = iArr;
        this.f313523f = iArr2;
        this.f313524g = ltVar;
        this.f313525h = i17;
        this.f313526i = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        int[] iArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.ViewGroup viewGroup = this.f313521d;
        if (viewGroup != null) {
            android.view.ViewGroup viewGroup2 = this.f313524g.f312237J;
            if (this.f313522e != null && (iArr = this.f313523f) != null && viewGroup2 != null) {
                float f17 = 1 - floatValue;
                viewGroup.setTranslationX((((r2[0] + (viewGroup2.getWidth() / 2)) - iArr[0]) - (this.f313525h / 2)) * f17);
                viewGroup.setTranslationY(-(f17 * (((iArr[1] + (this.f313526i / 2)) - r2[1]) - (viewGroup2.getHeight() / 2))));
            }
            viewGroup.setScaleX(floatValue);
            viewGroup.setScaleY(floatValue);
            viewGroup.setAlpha(floatValue);
            viewGroup.requestLayout();
        }
    }
}
