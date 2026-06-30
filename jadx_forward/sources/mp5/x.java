package mp5;

/* loaded from: classes9.dex */
public class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 f412036d;

    public x(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49) {
        this.f412036d = c22895xa563bc49;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49 = this.f412036d;
        c22895xa563bc49.f295369s = intValue;
        int i17 = c22895xa563bc49.f295369s;
        if (c22895xa563bc49.f295369s <= c22895xa563bc49.f295367q) {
            c22895xa563bc49.A = true;
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c22895xa563bc49.getLayoutParams();
            int i18 = c22895xa563bc49.f295364n;
            int i19 = c22895xa563bc49.f295367q;
            layoutParams.height = ((i18 - i19) / 2) + i19;
            c22895xa563bc49.setLayoutParams(layoutParams);
        }
        c22895xa563bc49.invalidate();
    }
}
