package gt4;

/* loaded from: classes3.dex */
public class u1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.ScaleAnimation f357099b;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.ActivityC19150xb217ed93 activityC19150xb217ed93, android.view.View view, android.view.animation.ScaleAnimation scaleAnimation) {
        this.f357098a = view;
        this.f357099b = scaleAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f357098a.startAnimation(this.f357099b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
