package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class il extends com.tencent.mapsdk.internal.im {

    /* renamed from: i, reason: collision with root package name */
    private float f49901i;

    /* renamed from: j, reason: collision with root package name */
    private float f49902j;

    public il(float f17, float f18) {
        this.f49901i = f17;
        this.f49902j = f18;
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        float interpolation = this.f49901i + ((this.f49902j - this.f49901i) * interpolator.getInterpolation(f17));
        com.tencent.mapsdk.internal.im.b bVar = this.f49910h;
        if (bVar != null) {
            bVar.a(interpolation);
        }
    }
}
