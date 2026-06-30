package ug5;

/* loaded from: classes3.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f509160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f509161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f509162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f509163h;

    public l(ug5.v vVar, float f17, float f18, android.widget.FrameLayout frameLayout, android.graphics.Rect rect) {
        this.f509159d = vVar;
        this.f509160e = f17;
        this.f509161f = f18;
        this.f509162g = frameLayout;
        this.f509163h = rect;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        ug5.v vVar = this.f509159d;
        ug5.g gVar = vVar.f509191a;
        gVar.A++;
        float animatedFraction = gVar.f509120a != ug5.b.f509115e ? animator.getAnimatedFraction() : 1.0f - animator.getAnimatedFraction();
        float f17 = 1.0f - animatedFraction;
        float f18 = (this.f509160e * f17) + animatedFraction;
        float f19 = (this.f509161f * f17) + animatedFraction;
        android.widget.FrameLayout frameLayout = this.f509162g;
        android.graphics.RectF a17 = ug5.v.a(vVar, frameLayout.getWidth(), frameLayout.getHeight(), f18, f19);
        ug5.h hVar = vVar.f509191a.f509125f;
        if (hVar != null) {
            float animatedFraction2 = animator.getAnimatedFraction();
            android.graphics.Rect rect = new android.graphics.Rect();
            a17.roundOut(rect);
            hVar.d(animatedFraction2, rect, this.f509163h, vVar);
        }
        if (frameLayout instanceof ug5.d) {
            float[] fArr = vVar.f509191a.f509145z;
            ((ug5.d) frameLayout).a(a17, fArr[0], fArr[1], fArr[2], fArr[3]);
            frameLayout.invalidate();
        }
        ug5.h hVar2 = vVar.f509191a.f509125f;
        if (hVar2 != null) {
            hVar2.onAnimationUpdate(animator);
        }
    }
}
