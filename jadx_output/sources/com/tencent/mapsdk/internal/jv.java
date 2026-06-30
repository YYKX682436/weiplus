package com.tencent.mapsdk.internal;

/* loaded from: classes2.dex */
public final class jv implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        return f17 * (2.0f - f17);
    }
}
