package y50;

/* loaded from: classes3.dex */
public final class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y50.e f540986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f540987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f540988f;

    public i(y50.e eVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        this.f540986d = eVar;
        this.f540987e = abstractActivityC21394xb3d2c0cf;
        this.f540988f = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f540986d.f540979b.mo149xb9724478(this.f540987e, java.lang.Integer.valueOf(this.f540988f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
