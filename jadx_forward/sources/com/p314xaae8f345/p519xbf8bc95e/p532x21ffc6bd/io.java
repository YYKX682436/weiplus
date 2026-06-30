package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class io extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f131446i;

    public io(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f131446i = c26041x873d1d26;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c() {
        return this.f131446i;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        float interpolation = interpolator.getInterpolation(f17);
        com.tencent.mapsdk.internal.im.b bVar = this.f131443h;
        if (bVar != null) {
            bVar.b(interpolation);
        }
    }
}
