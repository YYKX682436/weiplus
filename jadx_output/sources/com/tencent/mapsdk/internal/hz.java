package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hz extends com.tencent.mapsdk.internal.hv implements com.tencent.tencentmap.mapsdk.maps.model.IScaleAnimation {
    public hz(float f17, float f18, float f19, float f27) {
        if (this.f49861a == null) {
            this.f49861a = new com.tencent.mapsdk.internal.iq(f17, f18, f19, f27);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setDuration(long j17) {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar == null) {
            return;
        }
        imVar.a(j17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public final void setInterpolator(android.view.animation.Interpolator interpolator) {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar == null || interpolator == null) {
            return;
        }
        imVar.f49908f = interpolator;
    }
}
