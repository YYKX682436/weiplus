package zl2;

/* loaded from: classes2.dex */
public final class j4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f555376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f555377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f555378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f555379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f555381i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f555382m;

    public j4(int i17, android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, yz5.l lVar, int i18, int i19) {
        this.f555376d = i17;
        this.f555377e = view;
        this.f555378f = e0Var;
        this.f555379g = e0Var2;
        this.f555380h = lVar;
        this.f555381i = i18;
        this.f555382m = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        int i17 = this.f555376d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(animatedValue, java.lang.Integer.valueOf(i17));
        yz5.l lVar = this.f555380h;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f555379g;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = this.f555378f;
        android.view.View view = this.f555377e;
        if (b17) {
            view.getLayoutParams().width = i17;
            view.requestLayout();
            e0Var2.f391648d = 1.0f;
            if (!(1.0f == e0Var.f391648d) && lVar != null) {
                lVar.mo146xb9724478(java.lang.Float.valueOf(1.0f));
            }
            e0Var.f391648d = e0Var2.f391648d;
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        java.lang.Object animatedValue2 = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((java.lang.Integer) animatedValue2).intValue();
        view.requestLayout();
        e0Var2.f391648d = (view.getLayoutParams().width - this.f555381i) / this.f555382m;
        float f17 = e0Var2.f391648d;
        if (!(f17 == e0Var.f391648d) && lVar != null) {
            lVar.mo146xb9724478(java.lang.Float.valueOf(f17));
        }
        e0Var.f391648d = e0Var2.f391648d;
    }
}
