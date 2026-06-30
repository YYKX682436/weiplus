package nh2;

/* loaded from: classes10.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f418641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f418642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 f418643f;

    public h(float f17, float f18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152) {
        this.f418641d = f17;
        this.f418642e = f18;
        this.f418643f = c14230x50345152;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f418642e;
        float f18 = this.f418641d;
        float f19 = f18 - (floatValue * (f18 - f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152 = this.f418643f;
        c14230x50345152.f193216r.setTranslationY(f19);
        c14230x50345152.f193215q.setTranslationY(f19);
    }
}
