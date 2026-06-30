package hl1;

/* loaded from: classes7.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl1.b f363609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f363610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f363612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f363613h;

    public a(hl1.b bVar, int i17, int i18, long j17, android.view.View view) {
        this.f363609d = bVar;
        this.f363610e = i17;
        this.f363611f = i18;
        this.f363612g = j17;
        this.f363613h = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f363609d.i(this.f363610e, this.f363611f, this.f363612g, animation);
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f363609d.f363616d = ((java.lang.Integer) animatedValue).intValue();
        android.view.View view = this.f363613h;
        if (view != null) {
            view.invalidate();
        }
    }
}
