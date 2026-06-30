package f12;

/* loaded from: classes4.dex */
public final class h implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340141d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340141d = activityC13254xf536ee79;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public final void mo525x7bb163d5(java.lang.Object obj) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.Boolean) obj, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340141d;
        if (b17) {
            f12.c0 c0Var = activityC13254xf536ee79.f178973f;
            if (c0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var.f340116l.setVisibility(4);
            f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
            if (c0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var2.f340106b.x();
            f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
            if (c0Var3 != null) {
                c0Var3.f340106b.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
        long j17 = activityC13254xf536ee79.f178975h;
        activityC13254xf536ee79.getClass();
        android.animation.PropertyValuesHolder ofKeyframe = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.ROTATION_X, android.animation.Keyframe.ofFloat(0.0f, 90.0f), android.animation.Keyframe.ofFloat(1.0f, 0.0f));
        android.animation.Keyframe ofFloat = android.animation.Keyframe.ofFloat(0.0f, 0.0f);
        android.animation.Keyframe ofFloat2 = android.animation.Keyframe.ofFloat(1.0f, 1.0f);
        android.animation.PropertyValuesHolder ofKeyframe2 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.SCALE_X, ofFloat, ofFloat2);
        android.animation.PropertyValuesHolder ofKeyframe3 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.SCALE_Y, ofFloat, ofFloat2);
        android.animation.PropertyValuesHolder ofKeyframe4 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.ALPHA, android.animation.Keyframe.ofFloat(0.0f, 0.0f), android.animation.Keyframe.ofFloat(1.0f, 1.0f));
        android.animation.PropertyValuesHolder ofKeyframe5 = android.animation.PropertyValuesHolder.ofKeyframe(android.view.View.Y, android.animation.Keyframe.ofFloat(0.0f, -50.0f), android.animation.Keyframe.ofFloat(0.5f, -610.0f), android.animation.Keyframe.ofFloat(1.0f, 0.0f));
        f12.c0 c0Var4 = activityC13254xf536ee79.f178973f;
        if (c0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(c0Var4.f340116l, ofKeyframe, ofKeyframe2, ofKeyframe3, ofKeyframe4, ofKeyframe5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.LinearInterpolator());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (currentTimeMillis < 2000) {
            ofPropertyValuesHolder.setStartDelay(2000 - currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpringLuckyEggActivity", "animator start delay " + ofPropertyValuesHolder.getStartDelay());
        }
        ofPropertyValuesHolder.setDuration(550L);
        ofPropertyValuesHolder.addListener(new f12.e(activityC13254xf536ee79, j17));
        ofPropertyValuesHolder.start();
    }
}
