package rp1;

/* loaded from: classes14.dex */
public class m1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f480011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f480012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f480013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f480014g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f480015h;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0, android.widget.FrameLayout.LayoutParams layoutParams, android.graphics.Point point, android.graphics.Point point2, android.view.View view) {
        this.f480015h = c12929x567537a0;
        this.f480011d = layoutParams;
        this.f480012e = point;
        this.f480013f = point2;
        this.f480014g = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.graphics.Point point = this.f480012e;
        int i17 = point.x;
        android.graphics.Point point2 = this.f480013f;
        int a17 = qp1.e0.a((int) (i17 + ((point2.x - i17) * floatValue)));
        android.widget.FrameLayout.LayoutParams layoutParams = this.f480011d;
        layoutParams.width = a17;
        layoutParams.height = qp1.e0.a((int) (point.y + (floatValue * (point2.y - r0))));
        int i18 = layoutParams.width;
        int i19 = layoutParams.height;
        this.f480015h.f175062f2.post(new rp1.l1(this));
    }
}
