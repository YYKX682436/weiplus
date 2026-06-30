package ww1;

/* loaded from: classes14.dex */
public class w2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.AnimationSet f531857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.x2 f531858b;

    public w2(ww1.x2 x2Var, android.view.animation.AnimationSet animationSet) {
        this.f531858b = x2Var;
        this.f531857a = animationSet;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        android.view.animation.AnimationSet animationSet = this.f531857a;
        animationSet.setStartOffset(1700L);
        this.f531858b.f531879e.f531655a0.startAnimation(animationSet);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f531858b.f531879e.f531655a0.setVisibility(0);
    }
}
