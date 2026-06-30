package bb2;

/* loaded from: classes5.dex */
public final class q0 extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f18951d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.StrokeTextView f18952e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.StrokeTextView f18953f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f18954g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ObjectAnimator f18955h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f18956i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.AnimatorSet f18957j;

    /* renamed from: k, reason: collision with root package name */
    public android.animation.ObjectAnimator f18958k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f18951d = itemView;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.sni);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f18952e = (com.tencent.mm.plugin.finder.view.StrokeTextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.snj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f18953f = (com.tencent.mm.plugin.finder.view.StrokeTextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.sno);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f18954g = findViewById3;
    }

    @Override // yp.o
    public void f() {
        android.animation.AnimatorSet animatorSet = this.f18957j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.ObjectAnimator objectAnimator = this.f18955h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator = this.f18956i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f18953f.animate().cancel();
        android.animation.ObjectAnimator objectAnimator2 = this.f18958k;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f18957j = null;
        this.f18955h = null;
        this.f18956i = null;
        this.f18958k = null;
        this.f18954g.setOnClickListener(null);
    }
}
