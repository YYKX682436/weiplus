package s4;

/* loaded from: classes15.dex */
public class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s4.d f484382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4.e f484383e;

    public c(s4.e eVar, s4.d dVar) {
        this.f484383e = eVar;
        this.f484382d = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        s4.e eVar = this.f484383e;
        s4.d dVar = this.f484382d;
        eVar.a(1.0f, dVar, true);
        dVar.f484394k = dVar.f484388e;
        dVar.f484395l = dVar.f484389f;
        dVar.f484396m = dVar.f484390g;
        dVar.a((dVar.f484393j + 1) % dVar.f484392i.length);
        if (!eVar.f484413i) {
            eVar.f484412h += 1.0f;
            return;
        }
        eVar.f484413i = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f484397n) {
            dVar.f484397n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f484383e.f484412h = 0.0f;
    }
}
