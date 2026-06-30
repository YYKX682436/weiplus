package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class hu extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26025xbcba4c6f {
    public hu(float f17, float f18) {
        if (this.f131394a == null) {
            this.f131394a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.il(f17, f18);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64
    /* renamed from: setDuration */
    public final void mo36783xffd6ec16(long j17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131394a;
        if (imVar == null) {
            return;
        }
        imVar.a(j17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64
    /* renamed from: setInterpolator */
    public final void mo36784x142dd649(android.view.animation.Interpolator interpolator) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131394a;
        if (imVar == null || interpolator == null) {
            return;
        }
        imVar.f131441f = interpolator;
    }
}
