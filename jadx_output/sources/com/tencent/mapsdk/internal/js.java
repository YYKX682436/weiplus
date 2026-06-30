package com.tencent.mapsdk.internal;

/* loaded from: classes2.dex */
public final class js implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        double d17 = f17 - 1.0d;
        double d18 = d17 * d17;
        double d19 = d18 * d18;
        return (float) (1.0d - (d19 * d19));
    }
}
