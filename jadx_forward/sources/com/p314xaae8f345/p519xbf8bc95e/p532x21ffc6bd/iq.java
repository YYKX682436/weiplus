package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class iq extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im {

    /* renamed from: i, reason: collision with root package name */
    private float f131452i;

    /* renamed from: j, reason: collision with root package name */
    private float f131453j;

    /* renamed from: k, reason: collision with root package name */
    private float f131454k;

    /* renamed from: l, reason: collision with root package name */
    private float f131455l;

    public iq(float f17, float f18, float f19, float f27) {
        this.f131452i = f17;
        this.f131453j = f18;
        this.f131454k = f19;
        this.f131455l = f27;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        if (f17 < 0.0f) {
            return;
        }
        float f18 = this.f131453j - this.f131452i;
        float f19 = this.f131455l - this.f131454k;
        float interpolation = interpolator.getInterpolation(f17);
        float f27 = this.f131452i + (f18 * interpolation);
        float f28 = this.f131454k + (f19 * interpolation);
        com.tencent.mapsdk.internal.im.b bVar = this.f131443h;
        if (bVar != null) {
            bVar.a(f27, f28);
        }
    }
}
