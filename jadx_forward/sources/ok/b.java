package ok;

/* loaded from: classes10.dex */
public class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.c f427444d;

    public b(ok.c cVar) {
        this.f427444d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ok.c cVar = this.f427444d;
        cVar.f427460a = true;
        cVar.f427461b = false;
        cVar.f427453k = 0L;
        cVar.f427446d.O();
        cVar.f427446d.s();
        android.animation.Animator.AnimatorListener animatorListener = cVar.f427454l;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ok.c cVar = this.f427444d;
        cVar.f427446d.P = true;
        cVar.f427460a = false;
        cVar.f427461b = true;
    }
}
