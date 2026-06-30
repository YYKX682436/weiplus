package za3;

/* loaded from: classes15.dex */
public class t implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 f552555d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f586) {
        this.f552555d = c16286x1df9f586;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16286x1df9f586 c16286x1df9f586 = this.f552555d;
        if (valueAnimator == c16286x1df9f586.f226172q) {
            int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PoiPoint", "greenRadiusChangeAnim, val: %s.", java.lang.Integer.valueOf(intValue));
            c16286x1df9f586.f226167i = intValue;
        } else if (valueAnimator == c16286x1df9f586.f226173r) {
            int intValue2 = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PoiPoint", "whiteRadiusChangeAnim, val: %s.", java.lang.Integer.valueOf(intValue2));
            c16286x1df9f586.f226169n = intValue2;
        } else if (valueAnimator == c16286x1df9f586.f226174s) {
            int intValue3 = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PoiPoint", "greenLineChangeAnim, val: %s.", java.lang.Integer.valueOf(intValue3));
            c16286x1df9f586.f226171p = intValue3;
        }
        if (c16286x1df9f586.f226175t) {
            c16286x1df9f586.f226163e.mo1019xf5f903a8(c16286x1df9f586);
        }
    }
}
