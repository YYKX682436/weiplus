package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hu extends com.tencent.mapsdk.internal.hv implements com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation {
    public hu(float f17, float f18) {
        if (this.f49861a == null) {
            this.f49861a = new com.tencent.mapsdk.internal.il(f17, f18);
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
