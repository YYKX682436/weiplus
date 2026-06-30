package e33;

/* loaded from: classes10.dex */
public class x2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 f329074a;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14) {
        this.f329074a = c15655x4db85b14;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = this.f329074a;
        c15655x4db85b14.f220093e.setVisibility(8);
        c15655x4db85b14.f220098m = false;
        c15655x4db85b14.f220099n = false;
        e33.g3 g3Var = c15655x4db85b14.f220103r;
        if (g3Var != null) {
            ((e33.f0) g3Var).a(false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
