package oa;

/* loaded from: classes15.dex */
public class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa.h f425301e;

    public g(oa.h hVar, int i17) {
        this.f425301e = hVar;
        this.f425300d = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = this.f425300d;
        oa.h hVar = this.f425301e;
        hVar.f425305g = i17;
        hVar.f425306h = 0.0f;
    }
}
