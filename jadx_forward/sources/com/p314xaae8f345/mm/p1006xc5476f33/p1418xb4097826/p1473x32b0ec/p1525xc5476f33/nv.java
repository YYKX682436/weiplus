package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nv implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float f195212a;

    /* renamed from: b, reason: collision with root package name */
    public final float f195213b;

    public nv(android.graphics.PointF divide) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(divide, "divide");
        this.f195212a = divide.x;
        this.f195213b = divide.y;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = this.f195212a;
        float f19 = this.f195213b;
        if (f17 < f18) {
            return (f17 / f18) * f19;
        }
        float f27 = 1;
        return f19 + (((f17 - f18) / (f27 - f18)) * (f27 - f19));
    }
}
