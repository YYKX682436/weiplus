package y50;

/* loaded from: classes3.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f540982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f540983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y50.e f540984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f540985g;

    public h(int i17, int i18, y50.e eVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f540982d = i17;
        this.f540983e = i18;
        this.f540984f = eVar;
        this.f540985g = abstractActivityC21394xb3d2c0cf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f540984f.f540979b.mo149xb9724478(this.f540985g, java.lang.Integer.valueOf(e3.b.c(this.f540982d, this.f540983e, ((java.lang.Float) animatedValue).floatValue())));
    }
}
