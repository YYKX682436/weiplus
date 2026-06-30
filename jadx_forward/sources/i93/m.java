package i93;

/* loaded from: classes11.dex */
public class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 f371288d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530) {
        this.f371288d = activityC16176xdf6c8530;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("translationY")).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530 = this.f371288d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC16176xdf6c8530.f224919d;
        if (c1163xf1deaba4 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) (((activityC16176xdf6c8530.f224922g == 0) || activityC16176xdf6c8530.f224929q.getVisibility() != 0) ? 0.0f : activityC16176xdf6c8530.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) - floatValue);
                activityC16176xdf6c8530.f224919d.setLayoutParams(layoutParams);
            }
        }
    }
}
