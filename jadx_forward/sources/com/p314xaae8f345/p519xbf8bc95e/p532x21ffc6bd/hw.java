package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class hw extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26026x53207927 {
    public hw(boolean z17) {
        if (this.f131394a == null) {
            this.f131394a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.in(z17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26026x53207927
    /* renamed from: addAnimation */
    public final boolean mo36789x3a72e7e3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 interfaceC26003xba1d3b64) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar2;
        if (interfaceC26003xba1d3b64 == null || !(interfaceC26003xba1d3b64 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv) || (imVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv) interfaceC26003xba1d3b64).f131394a) == null || (imVar2 = this.f131394a) == null) {
            return false;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.in) imVar2).a(imVar);
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26026x53207927
    /* renamed from: cleanAnimation */
    public final void mo36790x1d75873b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131394a;
        if (imVar == null) {
            return;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.in) imVar).c();
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
