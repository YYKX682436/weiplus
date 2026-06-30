package y50;

/* loaded from: classes3.dex */
public final class j implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f540989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y50.e f540990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f540991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f540992g;

    public j(java.lang.Integer num, y50.e eVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        this.f540989d = num;
        this.f540990e = eVar;
        this.f540991f = abstractActivityC21394xb3d2c0cf;
        this.f540992g = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Integer num = this.f540989d;
        y50.e eVar = this.f540990e;
        if (num == null) {
            eVar.f540980c = null;
        }
        eVar.f540979b.mo149xb9724478(this.f540991f, java.lang.Integer.valueOf(this.f540992g));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
