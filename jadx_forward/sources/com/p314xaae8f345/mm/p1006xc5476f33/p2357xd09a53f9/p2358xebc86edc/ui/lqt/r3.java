package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class r3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f259883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f259884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259885f;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, float f17, float f18) {
        this.f259885f = activityC19014x45f83936;
        this.f259883d = f17;
        this.f259884e = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float abs = (int) java.lang.Math.abs(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        float f17 = this.f259883d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259885f;
        if (abs >= f17) {
            float f18 = this.f259884e;
            if (abs <= f18) {
                if (!activityC19014x45f83936.D) {
                    activityC19014x45f83936.m78586xb1075be8(0.0f);
                    activityC19014x45f83936.mo54450xbf7c1df6(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19014x45f83936.E) ? activityC19014x45f83936.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqr) : activityC19014x45f83936.E);
                }
                activityC19014x45f83936.D = true;
                activityC19014x45f83936.m78586xb1075be8((abs - f17) / (f18 - f17));
                return;
            }
        }
        if (activityC19014x45f83936.D) {
            activityC19014x45f83936.mo64405x4dab7448(activityC19014x45f83936.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        activityC19014x45f83936.D = false;
    }
}
