package al5;

/* loaded from: classes5.dex */
public class y4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al5.z4 f87636a;

    public y4(al5.z4 z4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 viewOnClickListenerC22656xc0bc43c2) {
        this.f87636a = z4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        al5.z4 z4Var = this.f87636a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22656xc0bc43c2 viewOnClickListenerC22656xc0bc43c2 = z4Var.f87642g;
        boolean z17 = viewOnClickListenerC22656xc0bc43c2.f293048x;
        int i17 = z4Var.f87639d;
        if (z17 != (i17 == 1)) {
            viewOnClickListenerC22656xc0bc43c2.f293048x = i17 == 1;
            viewOnClickListenerC22656xc0bc43c2.post(new al5.x4(this));
        }
        z4Var.f87642g.f293039o = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
