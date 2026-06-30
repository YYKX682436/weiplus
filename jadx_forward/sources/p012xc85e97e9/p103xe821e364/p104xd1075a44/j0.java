package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 f93616d;

    public j0(p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var) {
        this.f93616d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var = this.f93616d;
        int i17 = n0Var.G;
        android.animation.ValueAnimator valueAnimator = n0Var.F;
        if (i17 == 1) {
            valueAnimator.cancel();
        } else if (i17 != 2) {
            return;
        }
        n0Var.G = 3;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
