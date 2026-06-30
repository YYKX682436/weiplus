package s4;

/* loaded from: classes15.dex */
public class j implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb f484420a;

    public j(p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb) {
        this.f484420a = c1170xe46664eb;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44.C1170xe46664eb c1170xe46664eb = this.f484420a;
        c1170xe46664eb.getClass();
        s4.h hVar = new s4.h(c1170xe46664eb);
        c1170xe46664eb.F = hVar;
        hVar.setDuration(150L);
        s4.a aVar = c1170xe46664eb.f93904x;
        aVar.f484379d = null;
        aVar.clearAnimation();
        c1170xe46664eb.f93904x.startAnimation(c1170xe46664eb.F);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
