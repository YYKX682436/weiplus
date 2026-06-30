package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n0 f12083d;

    public j0(androidx.recyclerview.widget.n0 n0Var) {
        this.f12083d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.n0 n0Var = this.f12083d;
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
