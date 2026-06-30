package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ip extends com.tencent.mapsdk.internal.im {

    /* renamed from: i, reason: collision with root package name */
    private float f49914i;

    /* renamed from: j, reason: collision with root package name */
    private float f49915j;

    /* renamed from: k, reason: collision with root package name */
    private float f49916k;

    /* renamed from: l, reason: collision with root package name */
    private float f49917l;

    /* renamed from: m, reason: collision with root package name */
    private float f49918m;

    public ip(float f17, float f18, float f19, float f27, float f28) {
        this.f49914i = f17;
        this.f49915j = f18;
        this.f49916k = f19;
        this.f49917l = f27;
        this.f49918m = f28;
    }

    @Override // com.tencent.mapsdk.internal.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        float interpolation = this.f49914i + ((this.f49915j - this.f49914i) * interpolator.getInterpolation(f17));
        com.tencent.mapsdk.internal.im.b bVar = this.f49910h;
        if (bVar != null) {
            bVar.a(interpolation, this.f49916k, this.f49917l, this.f49918m);
        }
    }
}
