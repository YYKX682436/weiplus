package ep1;

/* loaded from: classes3.dex */
public final class s implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f337191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f337193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f337195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f337196i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f337197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f337198n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f337199o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f337200p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f337201q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f337202r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f337203s;

    public s(int i17, android.view.View view, boolean z17, android.view.View view2, android.view.View view3, int i18, float f17, float f18, float f19, float f27, boolean z18, float f28, float f29) {
        this.f337191d = i17;
        this.f337192e = view;
        this.f337193f = z17;
        this.f337194g = view2;
        this.f337195h = view3;
        this.f337196i = i18;
        this.f337197m = f17;
        this.f337198n = f18;
        this.f337199o = f19;
        this.f337200p = f27;
        this.f337201q = z18;
        this.f337202r = f28;
        this.f337203s = f29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        ep1.u uVar = ep1.u.f337209a;
        android.view.View view = this.f337192e;
        int i17 = this.f337191d;
        if (i17 == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            if (animatedFraction >= 0.9f) {
                f17 = uVar.a().getInterpolation(1.0f - ((animatedFraction - 0.9f) / (1 - 0.9f)));
                if (!this.f337193f) {
                    ((gp1.v) ((jz5.n) ep1.u.f337211c).mo141623x754a37bb()).W(1.0f - f17);
                }
            } else {
                f17 = 1.0f;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateContentViewAlpha", "(ILandroid/view/View;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f337194g;
        if (view2 != null) {
            float f18 = i17 == 1 ? animatedFraction : 1.0f - animatedFraction;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateBgViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimator", "updateBgViewAlpha", "(ILandroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        int i18 = ep1.u.f337210b;
        float f19 = this.f337196i;
        int i19 = (i18 & 16777215) | (((int) (i17 == 1 ? f19 * animatedFraction : f19 * (1.0f - animatedFraction))) << 24);
        android.view.View view3 = this.f337195h;
        if (view3 != null) {
            view3.setBackgroundColor(i19);
        }
        float f27 = this.f337198n;
        float f28 = this.f337197m;
        android.view.View view4 = this.f337192e;
        view4.setScaleX(((f27 - f28) * animatedFraction) + f28);
        float f29 = this.f337200p;
        float f37 = this.f337199o;
        view4.setScaleY(f37 + ((f29 - f37) * animatedFraction));
        if (this.f337201q) {
            float f38 = this.f337203s;
            float f39 = this.f337202r;
            float max = java.lang.Math.max((view4.getHeight() - (f39 + ((f38 - f39) * animatedFraction))) / 2.0f, 0.0f);
            float intValue = i17 == 1 ? (((java.lang.Number) ((jz5.n) ep1.u.f337212d).mo141623x754a37bb()).intValue() / f28) * (1 - animatedFraction) : (((java.lang.Number) ((jz5.n) ep1.u.f337212d).mo141623x754a37bb()).intValue() / f27) * animatedFraction;
            view4.setClipToOutline(true);
            view4.setOutlineProvider(new ep1.r(max, intValue));
        }
    }
}
