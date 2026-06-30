package jn5;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f382373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn5.i f382375f;

    public d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, jn5.i iVar) {
        this.f382373d = k3Var;
        this.f382374e = view;
        this.f382375f = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f382373d;
        android.view.ViewParent parent = k3Var.f3639x46306858.getParent();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
        android.view.View view = this.f382374e;
        view.getTop();
        boolean z17 = ((float) view.getBottom()) + view.getTranslationY() > ((float) (c1163xf1deaba4 != null ? c1163xf1deaba4.getHeight() : 0));
        yz5.p pVar = this.f382375f.f382390t;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(z17), k3Var);
        }
    }
}
