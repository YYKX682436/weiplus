package ca5;

/* loaded from: classes5.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f121619e;

    public f(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d, int i17) {
        this.f121619e = c21330xc127fb4d;
        this.f121618d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f121619e;
        c21330xc127fb4d.f277963g.set(this.f121618d, (java.lang.Integer) valueAnimator.getAnimatedValue());
        c21330xc127fb4d.invalidate();
    }
}
