package hr3;

/* loaded from: classes5.dex */
public class rh implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f365490d;

    public rh(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a, android.widget.TextView textView) {
        this.f365490d = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f365490d.setTextColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
