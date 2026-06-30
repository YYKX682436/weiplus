package ub3;

/* loaded from: classes5.dex */
public class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 f507679d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95) {
        this.f507679d = activityC16331x46dfff95;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f507679d.f226628g.setTranslationY((-floatValue) * r0.f226639u.heightPixels);
    }
}
