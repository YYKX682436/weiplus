package gt4;

/* loaded from: classes9.dex */
public class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 f357104d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18) {
        this.f357104d = c19146xd2600a18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f357104d.f262235d.setRotation(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
