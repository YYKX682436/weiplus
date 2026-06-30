package cw2;

/* loaded from: classes10.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6 f305493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f305494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305495f;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6 c15168x82e675a6, float f17, android.content.Context context) {
        this.f305493d = c15168x82e675a6;
        this.f305494e = f17;
        this.f305495f = context;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15168x82e675a6 c15168x82e675a6 = this.f305493d;
        c15168x82e675a6.f212032m = floatValue;
        float f17 = c15168x82e675a6.f212032m;
        float f18 = c15168x82e675a6.f212038s;
        float f19 = (f17 - f18) / (1.0f - f18);
        float f27 = this.f305494e;
        c15168x82e675a6.f212031i = (float) (f27 * java.lang.Math.pow(1.0d / f27, f19));
        float f28 = c15168x82e675a6.f212035p;
        c15168x82e675a6.f212033n = java.lang.String.valueOf(c15168x82e675a6.U6(f28 + ((c15168x82e675a6.f212037r - f28) * f19)));
        c15168x82e675a6.V6(c15168x82e675a6.f212033n, c15168x82e675a6.f212037r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioVolumeController", "animateChangeVolume curVolumeUpdateValue:" + c15168x82e675a6.f212032m + " updatePercent:" + f19 + " curPlayerGainPercent:" + c15168x82e675a6.f212031i + " curScaleGainStr:" + c15168x82e675a6.f212033n + ' ');
        cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).S6(this.f305495f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = S6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) S6 : null;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.m61435x27f73e1c(c15168x82e675a6.f212031i);
        }
    }
}
