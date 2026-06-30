package qa5;

/* loaded from: classes3.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f442641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f442642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 f442643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f442644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f442645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f442646i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f442647m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f442648n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f442649o;

    public a(int i17, int i18, com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f442641d = i17;
        this.f442642e = i18;
        this.f442643f = c21455x9ab6ec3;
        this.f442644g = i19;
        this.f442645h = i27;
        this.f442646i = i28;
        this.f442647m = i29;
        this.f442648n = i37;
        this.f442649o = i38;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        float f17 = this.f442641d + ((this.f442642e - r0) * animatedFraction);
        com.p314xaae8f345.mm.ui.p2635x2dc211.p2636x38b73479.C21455x9ab6ec3 c21455x9ab6ec3 = this.f442643f;
        android.view.ViewGroup.LayoutParams layoutParams = c21455x9ab6ec3.getLayoutParams();
        layoutParams.width = (int) f17;
        c21455x9ab6ec3.setLayoutParams(layoutParams);
        float f18 = this.f442644g + ((this.f442645h - r1) * animatedFraction);
        float f19 = this.f442646i + ((this.f442647m - r1) * animatedFraction);
        float f27 = this.f442648n + ((this.f442649o - r1) * animatedFraction);
        c21455x9ab6ec3.setPadding((int) f18, c21455x9ab6ec3.getPaddingTop(), (int) f19, c21455x9ab6ec3.getPaddingBottom());
        android.graphics.drawable.Drawable background = c21455x9ab6ec3.getBackground();
        if (background == null) {
            return;
        }
        background.setAlpha((int) f27);
    }
}
