package df2;

/* loaded from: classes3.dex */
public final class a3 {

    /* renamed from: k, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f311193k = new android.view.animation.PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f311194a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f311195b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f311196c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f311197d;

    /* renamed from: e, reason: collision with root package name */
    public int f311198e;

    /* renamed from: f, reason: collision with root package name */
    public int f311199f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f311200g;

    /* renamed from: h, reason: collision with root package name */
    public int f311201h;

    /* renamed from: i, reason: collision with root package name */
    public final float f311202i;

    /* renamed from: j, reason: collision with root package name */
    public final df2.z2 f311203j;

    public a3(android.view.View micCenterView, android.view.View view, android.view.ViewGroup wrapperView, java.util.List exclusiveViews) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCenterView, "micCenterView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wrapperView, "wrapperView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exclusiveViews, "exclusiveViews");
        this.f311194a = micCenterView;
        this.f311195b = view;
        this.f311196c = wrapperView;
        this.f311197d = exclusiveViews;
        this.f311202i = micCenterView.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        this.f311203j = new df2.z2(this);
    }

    public final void a(float f17) {
        if (this.f311198e <= 0) {
            return;
        }
        int i17 = (int) (this.f311199f + ((r0 - r1) * f17));
        android.view.ViewGroup viewGroup = this.f311196c;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams.height != i17) {
            layoutParams.height = i17;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public final void b() {
        this.f311201h++;
        android.animation.ValueAnimator valueAnimator = this.f311200g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f311200g = null;
        android.view.View view = this.f311194a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f311194a.setClipToOutline(false);
        for (android.view.View view2 : this.f311197d) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void c(float f17, float f18, yz5.a aVar) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(f311193k);
        ofFloat.addUpdateListener(new df2.x2(this));
        ofFloat.addListener(new df2.y2(aVar));
        ofFloat.start();
        this.f311200g = ofFloat;
    }
}
