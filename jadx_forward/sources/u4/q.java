package u4;

/* loaded from: classes13.dex */
public class q extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f506064d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f506065e = new android.graphics.Matrix();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f506066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f506067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f506068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u4.t f506069i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u4.s f506070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p112x993b6d55.C1177xf3af557c f506071n;

    public q(p012xc85e97e9.p112x993b6d55.C1177xf3af557c c1177xf3af557c, boolean z17, android.graphics.Matrix matrix, android.view.View view, u4.t tVar, u4.s sVar) {
        this.f506071n = c1177xf3af557c;
        this.f506066f = z17;
        this.f506067g = matrix;
        this.f506068h = view;
        this.f506069i = tVar;
        this.f506070m = sVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f506064d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        boolean z17 = this.f506064d;
        u4.t tVar = this.f506069i;
        android.view.View view = this.f506068h;
        if (!z17) {
            if (this.f506066f && this.f506071n.L) {
                android.graphics.Matrix matrix = this.f506065e;
                matrix.set(this.f506067g);
                view.setTag(com.p314xaae8f345.mm.R.id.oj9, matrix);
                tVar.getClass();
                java.lang.String[] strArr = p012xc85e97e9.p112x993b6d55.C1177xf3af557c.P;
                view.setTranslationX(tVar.f506080a);
                view.setTranslationY(tVar.f506081b);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.w(view, tVar.f506082c);
                view.setScaleX(tVar.f506083d);
                view.setScaleY(tVar.f506084e);
                view.setRotationX(tVar.f506085f);
                view.setRotationY(tVar.f506086g);
                view.setRotation(tVar.f506087h);
            } else {
                view.setTag(com.p314xaae8f345.mm.R.id.oj9, null);
                view.setTag(com.p314xaae8f345.mm.R.id.f567795kp3, null);
            }
        }
        u4.w1.a(view, null);
        tVar.getClass();
        java.lang.String[] strArr2 = p012xc85e97e9.p112x993b6d55.C1177xf3af557c.P;
        view.setTranslationX(tVar.f506080a);
        view.setTranslationY(tVar.f506081b);
        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
        n3.a1.w(view, tVar.f506082c);
        view.setScaleX(tVar.f506083d);
        view.setScaleY(tVar.f506084e);
        view.setRotationX(tVar.f506085f);
        view.setRotationY(tVar.f506086g);
        view.setRotation(tVar.f506087h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        android.graphics.Matrix matrix = this.f506070m.f506075a;
        android.graphics.Matrix matrix2 = this.f506065e;
        matrix2.set(matrix);
        android.view.View view = this.f506068h;
        view.setTag(com.p314xaae8f345.mm.R.id.oj9, matrix2);
        u4.t tVar = this.f506069i;
        tVar.getClass();
        java.lang.String[] strArr = p012xc85e97e9.p112x993b6d55.C1177xf3af557c.P;
        view.setTranslationX(tVar.f506080a);
        view.setTranslationY(tVar.f506081b);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.w(view, tVar.f506082c);
        view.setScaleX(tVar.f506083d);
        view.setScaleY(tVar.f506084e);
        view.setRotationX(tVar.f506085f);
        view.setRotationY(tVar.f506086g);
        view.setRotation(tVar.f506087h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        java.lang.String[] strArr = p012xc85e97e9.p112x993b6d55.C1177xf3af557c.P;
        android.view.View view = this.f506068h;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
