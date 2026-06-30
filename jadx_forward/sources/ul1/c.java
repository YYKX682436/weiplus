package ul1;

/* loaded from: classes7.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul1.d f510097d;

    public c(ul1.d dVar) {
        this.f510097d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f510097d.f510102h = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ul1.d dVar = this.f510097d;
        dVar.setVisibility(8);
        dVar.f510102h = null;
    }
}
