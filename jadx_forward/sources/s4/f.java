package s4;

/* loaded from: classes15.dex */
public class f implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb f484414a;

    public f(p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb) {
        this.f484414a = c1170xe46664eb;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb = this.f484414a;
        if (!c1170xe46664eb.f93888e) {
            c1170xe46664eb.f();
            return;
        }
        c1170xe46664eb.D.setAlpha(255);
        c1170xe46664eb.D.start();
        if (c1170xe46664eb.I) {
            c1170xe46664eb.getClass();
        }
        c1170xe46664eb.f93898r = c1170xe46664eb.f93904x.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
