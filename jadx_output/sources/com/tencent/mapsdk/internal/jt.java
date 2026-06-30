package com.tencent.mapsdk.internal;

/* loaded from: classes2.dex */
public final class jt implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        double d17 = f17 / 0.5d;
        return (float) ((d17 < 1.0d ? java.lang.Math.pow(d17, 3.0d) : java.lang.Math.pow(d17 - 2.0d, 3.0d) + 2.0d) * 0.5d);
    }
}
