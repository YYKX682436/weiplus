package ym5;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f544736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 f544737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f544738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f544739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f544740h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae f544741i;

    public b(com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae, android.view.View view, com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 c22815x98b0aff3, android.view.View view2, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f544741i = c22779x313407ae;
        this.f544736d = view;
        this.f544737e = c22815x98b0aff3;
        this.f544738f = view2;
        this.f544739g = animatorListener;
        this.f544740h = animatorUpdateListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f544736d;
        com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae = this.f544741i;
        android.graphics.Rect rect = ym5.u6.b(c22779x313407ae, view).f295046d;
        com.p314xaae8f345.mm.p2776x373aa5.C22815x98b0aff3 c22815x98b0aff3 = this.f544737e;
        float width = (rect.width() * 1.0f) / c22815x98b0aff3.f295046d.width();
        float height = (rect.height() * 1.0f) / c22815x98b0aff3.f295046d.height();
        float f17 = width > height ? width : 1.0f;
        float f18 = height > width ? height : 1.0f;
        ym5.u6.a(c22779x313407ae, this.f544738f, c22815x98b0aff3, this.f544739g, (f17 > 1.0f || f18 > 1.0f) ? new ym5.a(this, f17, width, height, f18) : null);
    }
}
