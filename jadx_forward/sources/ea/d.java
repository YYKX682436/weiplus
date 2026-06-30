package ea;

/* loaded from: classes15.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ea.l f332003e;

    public d(ea.l lVar, boolean z17, ea.i iVar) {
        this.f332003e = lVar;
        this.f332002d = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ea.l lVar = this.f332003e;
        lVar.f332013a = 0;
        lVar.f332014b = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ea.l lVar = this.f332003e;
        lVar.f332031s.a(0, this.f332002d);
        lVar.f332013a = 2;
        lVar.f332014b = animator;
    }
}
