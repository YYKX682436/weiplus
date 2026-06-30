package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class iq extends com.tencent.mapsdk.internal.im {

    /* renamed from: i, reason: collision with root package name */
    private float f49919i;

    /* renamed from: j, reason: collision with root package name */
    private float f49920j;

    /* renamed from: k, reason: collision with root package name */
    private float f49921k;

    /* renamed from: l, reason: collision with root package name */
    private float f49922l;

    public iq(float f17, float f18, float f19, float f27) {
        this.f49919i = f17;
        this.f49920j = f18;
        this.f49921k = f19;
        this.f49922l = f27;
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        if (f17 < 0.0f) {
            return;
        }
        float f18 = this.f49920j - this.f49919i;
        float f19 = this.f49922l - this.f49921k;
        float interpolation = interpolator.getInterpolation(f17);
        float f27 = this.f49919i + (f18 * interpolation);
        float f28 = this.f49921k + (f19 * interpolation);
        com.tencent.mapsdk.internal.im.b bVar = this.f49910h;
        if (bVar != null) {
            bVar.a(f27, f28);
        }
    }
}
