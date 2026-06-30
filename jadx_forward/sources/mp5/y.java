package mp5;

/* loaded from: classes9.dex */
public class y implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 f412037d;

    public y(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49) {
        this.f412037d = c22895xa563bc49;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49 = this.f412037d;
        c22895xa563bc49.A = true;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c22895xa563bc49.getLayoutParams();
        int i17 = c22895xa563bc49.f295364n;
        int i18 = c22895xa563bc49.f295367q;
        layoutParams.height = ((i17 - i18) / 2) + i18;
        c22895xa563bc49.setLayoutParams(layoutParams);
        c22895xa563bc49.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
