package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class il extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im {

    /* renamed from: i, reason: collision with root package name */
    private float f131434i;

    /* renamed from: j, reason: collision with root package name */
    private float f131435j;

    public il(float f17, float f18) {
        this.f131434i = f17;
        this.f131435j = f18;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        float interpolation = this.f131434i + ((this.f131435j - this.f131434i) * interpolator.getInterpolation(f17));
        com.tencent.mapsdk.internal.im.b bVar = this.f131443h;
        if (bVar != null) {
            bVar.a(interpolation);
        }
    }
}
