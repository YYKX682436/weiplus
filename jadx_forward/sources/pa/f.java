package pa;

/* loaded from: classes13.dex */
public class f extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca.j f434474d;

    public f(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p264x9c651309.AbstractC2724x48049842 abstractC2724x48049842, ca.j jVar) {
        this.f434474d = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ca.j jVar = this.f434474d;
        ca.i mo14552xa22fca11 = jVar.mo14552xa22fca11();
        mo14552xa22fca11.f121297c = Float.MAX_VALUE;
        jVar.mo14555xd054181d(mo14552xa22fca11);
    }
}
