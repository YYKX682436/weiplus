package ym5;

/* loaded from: classes3.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f544802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 f544803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f544804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f544805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f544806h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae f544807i;

    public f(com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae, android.view.View view, com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 c22815x98b0aff3, android.view.View view2, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f544807i = c22779x313407ae;
        this.f544802d = view;
        this.f544803e = c22815x98b0aff3;
        this.f544804f = view2;
        this.f544805g = animatorListener;
        this.f544806h = animatorUpdateListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f544802d;
        com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae = this.f544807i;
        android.graphics.Rect rect = ym5.u6.b(c22779x313407ae, view).f295046d;
        com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 c22815x98b0aff3 = this.f544803e;
        float width = (rect.width() * 1.0f) / c22815x98b0aff3.f295046d.width();
        float height = (rect.height() * 1.0f) / c22815x98b0aff3.f295046d.height();
        float f17 = width > height ? width : 1.0f;
        float f18 = height > width ? height : 1.0f;
        ym5.u6.a(c22779x313407ae, this.f544804f, c22815x98b0aff3, this.f544805g, (f17 > 1.0f || f18 > 1.0f) ? new ym5.e(this, f17, height, width, f18) : null);
    }
}
