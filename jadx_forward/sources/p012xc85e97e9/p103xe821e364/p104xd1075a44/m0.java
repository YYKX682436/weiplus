package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class m0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 f93660d;

    public m0(p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var) {
        this.f93660d = n0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int floatValue = (int) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var = this.f93660d;
        n0Var.f93681f.setAlpha(floatValue);
        n0Var.f93682g.setAlpha(floatValue);
        n0Var.f93697y.invalidate();
    }
}
