package com.tencent.mapsdk.internal;

/* loaded from: classes3.dex */
public final class ju implements android.view.animation.Interpolator {
    public ju() {
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f17) {
        return f17 * f17;
    }

    private ju(byte b17) {
    }
}
