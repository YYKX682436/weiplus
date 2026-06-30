package cf2;

/* loaded from: classes3.dex */
public class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf2.h f122444d;

    public g(cf2.h hVar) {
        this.f122444d = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.view.ViewGroup viewGroup = this.f122444d.L;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
