package al5;

/* loaded from: classes5.dex */
public class y4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al5.z4 f6103a;

    public y4(al5.z4 z4Var, com.tencent.mm.ui.widget.WeSwitch weSwitch) {
        this.f6103a = z4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        al5.z4 z4Var = this.f6103a;
        com.tencent.mm.ui.widget.WeSwitch weSwitch = z4Var.f6109g;
        boolean z17 = weSwitch.f211515x;
        int i17 = z4Var.f6106d;
        if (z17 != (i17 == 1)) {
            weSwitch.f211515x = i17 == 1;
            weSwitch.post(new al5.x4(this));
        }
        z4Var.f6109g.f211506o = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
