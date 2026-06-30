package u4;

/* loaded from: classes13.dex */
public class b2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.r1 f505979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f505980e;

    public b2(p012xc85e97e9.p112x993b6d55.AbstractC1185xea883f32 abstractC1185xea883f32, u4.r1 r1Var, android.view.View view) {
        this.f505979d = r1Var;
        this.f505980e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f505979d.a(this.f505980e);
    }
}
