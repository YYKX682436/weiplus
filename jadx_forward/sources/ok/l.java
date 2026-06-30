package ok;

/* loaded from: classes10.dex */
public class l implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.m f427473d;

    public l(ok.m mVar) {
        this.f427473d = mVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        ok.m mVar = this.f427473d;
        mVar.f427460a = true;
        mVar.f427479h = 0.0f;
        mVar.f427480i = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ok.m mVar = this.f427473d;
        mVar.f427460a = true;
        mVar.f427479h = 0.0f;
        mVar.f427480i = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ok.m mVar = this.f427473d;
        mVar.f427460a = false;
        mVar.f427479h = 0.0f;
        mVar.f427480i = 0.0f;
    }
}
