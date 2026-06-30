package fc3;

/* loaded from: classes5.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f342606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f342607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc3.s f342608f;

    public r(android.animation.ValueAnimator valueAnimator, java.util.List list, fc3.s sVar) {
        this.f342606d = valueAnimator;
        this.f342607e = list;
        this.f342608f = sVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f342606d.hashCode());
        sb6.append(" stopAll doOnEnd size:");
        java.util.List list = this.f342607e;
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f342608f.b((fc3.k) it.next());
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
