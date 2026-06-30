package pk3;

/* loaded from: classes8.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f437977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f437979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f437980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 f437981h;

    public f(int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222) {
        this.f437977d = i17;
        this.f437978e = i18;
        this.f437979f = i19;
        this.f437980g = i27;
        this.f437981h = c16602xcd2cf222;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = this.f437977d;
        int i18 = i17 + ((int) (((this.f437978e * 1.0f) - i17) * floatValue));
        int i19 = this.f437979f;
        int i27 = i19 + ((int) (((this.f437980g * 1.0f) - i19) * floatValue));
        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222 = this.f437981h;
        android.view.ViewGroup.LayoutParams layoutParams = c16602xcd2cf222.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i29 = marginLayoutParams.leftMargin;
        int i37 = marginLayoutParams.topMargin;
        if (i29 == i18 && i37 == i27) {
            return;
        }
        marginLayoutParams.leftMargin = i18;
        marginLayoutParams.topMargin = i27;
        try {
            c16602xcd2cf222.o(i18, i27, false, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallView", th6, "updateBallPosition fail", new java.lang.Object[0]);
        }
    }
}
