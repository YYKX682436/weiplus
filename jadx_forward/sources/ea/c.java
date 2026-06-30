package ea;

/* loaded from: classes15.dex */
public class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f331999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ea.l f332001f;

    public c(ea.l lVar, boolean z17, ea.i iVar) {
        this.f332001f = lVar;
        this.f332000e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f331999d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ea.l lVar = this.f332001f;
        lVar.f332013a = 0;
        lVar.f332014b = null;
        if (this.f331999d) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 c2711x10f79281 = lVar.f332031s;
        boolean z17 = this.f332000e;
        c2711x10f79281.a(z17 ? 8 : 4, z17);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        ea.l lVar = this.f332001f;
        lVar.f332031s.a(0, this.f332000e);
        lVar.f332013a = 1;
        lVar.f332014b = animator;
        this.f331999d = false;
    }
}
