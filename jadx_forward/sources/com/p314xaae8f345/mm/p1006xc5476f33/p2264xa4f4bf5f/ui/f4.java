package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes14.dex */
public final class f4 extends sa5.f {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f255394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(yz5.l update) {
        super(0, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(update, "update");
        this.f255394f = update;
        this.f486882b = new sa5.p(0.0f, 0.0f, null, sa5.r.f486902a, 4, null);
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f255394f.mo146xb9724478(java.lang.Float.valueOf(animation.getAnimatedFraction()));
    }
}
