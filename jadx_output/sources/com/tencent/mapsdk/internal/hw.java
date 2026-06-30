package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hw extends com.tencent.mapsdk.internal.hv implements com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet {
    public hw(boolean z17) {
        if (this.f49861a == null) {
            this.f49861a = new com.tencent.mapsdk.internal.in(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet
    public final boolean addAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        com.tencent.mapsdk.internal.im imVar;
        com.tencent.mapsdk.internal.im imVar2;
        if (animation == null || !(animation instanceof com.tencent.mapsdk.internal.hv) || (imVar = ((com.tencent.mapsdk.internal.hv) animation).f49861a) == null || (imVar2 = this.f49861a) == null) {
            return false;
        }
        ((com.tencent.mapsdk.internal.in) imVar2).a(imVar);
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet
    public final void cleanAnimation() {
        com.tencent.mapsdk.internal.im imVar = this.f49861a;
        if (imVar == null) {
            return;
        }
        ((com.tencent.mapsdk.internal.in) imVar).c();
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
