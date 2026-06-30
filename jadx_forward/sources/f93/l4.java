package f93;

/* loaded from: classes11.dex */
public class l4 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelUI", "onAnimationUpdate %s", java.lang.Float.valueOf(((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue()));
    }
}
