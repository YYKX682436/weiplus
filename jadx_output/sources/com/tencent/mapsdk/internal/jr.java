package com.tencent.mapsdk.internal;

/* loaded from: classes3.dex */
public final class jr implements android.view.animation.Interpolator {
    public jr() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (float) java.lang.Math.sqrt(1.0f - (f18 * f18));
    }

    private jr(byte b17) {
    }
}
