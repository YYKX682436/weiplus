package al5;

/* loaded from: classes10.dex */
public class e2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al5.f2 f5884a;

    public e2(al5.f2 f2Var, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f5884a = f2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        al5.f2 f2Var = this.f5884a;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = f2Var.f5906g;
        boolean z17 = mMSwitchBtn.f211363x;
        int i17 = f2Var.f5903d;
        if (z17 != (i17 == 1)) {
            boolean z18 = i17 == 1;
            mMSwitchBtn.f211363x = z18;
            if (mMSwitchBtn.P) {
                al5.c2 c2Var = mMSwitchBtn.N;
                if (c2Var != null) {
                    c2Var.onStatusChange(z18);
                }
            } else {
                mMSwitchBtn.post(new al5.d2(this));
            }
        }
        f2Var.f5906g.f211354o = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
