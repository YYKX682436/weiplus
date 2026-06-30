package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ip extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im {

    /* renamed from: i, reason: collision with root package name */
    private float f131447i;

    /* renamed from: j, reason: collision with root package name */
    private float f131448j;

    /* renamed from: k, reason: collision with root package name */
    private float f131449k;

    /* renamed from: l, reason: collision with root package name */
    private float f131450l;

    /* renamed from: m, reason: collision with root package name */
    private float f131451m;

    public ip(float f17, float f18, float f19, float f27, float f28) {
        this.f131447i = f17;
        this.f131448j = f18;
        this.f131449k = f19;
        this.f131450l = f27;
        this.f131451m = f28;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        float interpolation = this.f131447i + ((this.f131448j - this.f131447i) * interpolator.getInterpolation(f17));
        com.tencent.mapsdk.internal.im.b bVar = this.f131443h;
        if (bVar != null) {
            bVar.a(interpolation, this.f131449k, this.f131450l, this.f131451m);
        }
    }
}
