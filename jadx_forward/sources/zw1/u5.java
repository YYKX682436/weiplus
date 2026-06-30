package zw1;

/* loaded from: classes14.dex */
public class u5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558355d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.b3 b3Var) {
        this.f558355d = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f558355d.f531661d0.setRotation(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
