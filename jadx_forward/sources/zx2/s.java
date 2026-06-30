package zx2;

/* loaded from: classes14.dex */
public class s extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f558602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx2.t f558603e;

    public s(zx2.t tVar, int i17) {
        this.f558603e = tVar;
        this.f558602d = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = this.f558602d;
        zx2.t tVar = this.f558603e;
        tVar.f558607g = i17;
        tVar.f558608h = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CustomTabLayout", "onAnimationStart : " + z17);
    }
}
