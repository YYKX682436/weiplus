package al5;

/* loaded from: classes10.dex */
public class e2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al5.f2 f87417a;

    public e2(al5.f2 f2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8) {
        this.f87417a = f2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        al5.f2 f2Var = this.f87417a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = f2Var.f87439g;
        boolean z17 = viewOnClickListenerC22631x1cc07cc8.f292896x;
        int i17 = f2Var.f87436d;
        if (z17 != (i17 == 1)) {
            boolean z18 = i17 == 1;
            viewOnClickListenerC22631x1cc07cc8.f292896x = z18;
            if (viewOnClickListenerC22631x1cc07cc8.P) {
                al5.c2 c2Var = viewOnClickListenerC22631x1cc07cc8.N;
                if (c2Var != null) {
                    c2Var.mo2289xd6191dc1(z18);
                }
            } else {
                viewOnClickListenerC22631x1cc07cc8.post(new al5.d2(this));
            }
        }
        f2Var.f87439g.f292887o = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
