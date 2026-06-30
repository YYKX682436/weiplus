package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class c1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 f93516d;

    public c1(p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var) {
        this.f93516d = d1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f93516d.f93531s = valueAnimator.getAnimatedFraction();
    }
}
