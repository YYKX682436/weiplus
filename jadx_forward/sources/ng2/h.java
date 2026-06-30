package ng2;

/* loaded from: classes10.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f418499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f418500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f418501f;

    public h(ng2.s sVar, float f17, float f18) {
        this.f418499d = sVar;
        this.f418500e = f17;
        this.f418501f = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ng2.s sVar = this.f418499d;
        ig2.q qVar = sVar.f418520v;
        if (qVar != null) {
            if (qg2.d.f444326a.i(sVar.d())) {
                qVar.setScaleX(1.0f - (floatValue * (1.0f - this.f418500e)));
            } else {
                qVar.setScaleY(1.0f - (floatValue * (1.0f - this.f418501f)));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f400090e, "addTransition maskView scaleX = " + qVar.getScaleX() + " scaleY = " + qVar.getScaleY());
        }
    }
}
