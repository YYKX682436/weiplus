package u4;

/* loaded from: classes13.dex */
public class x0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 f506111d;

    public x0(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        this.f506111d = abstractC1183x100d4975;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f506111d.p();
        animator.removeListener(this);
    }
}
