package db5;

/* loaded from: classes8.dex */
public class h9 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be f309924a;

    public h9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be) {
        this.f309924a = c21532x4955f5be;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21532x4955f5be c21532x4955f5be = this.f309924a;
        c21532x4955f5be.f279236w = null;
        c21532x4955f5be.f279223g.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
