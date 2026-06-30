package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class hv implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im f131394a = null;

    /* renamed from: b, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.hv.a f131395b;

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.im.a {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26004x5184c038 f131396a;

        public a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26004x5184c038 interfaceC26004x5184c038) {
            this.f131396a = interfaceC26004x5184c038;
        }

        @Override // com.tencent.mapsdk.internal.im.a
        public final void b() {
            if (this.f131396a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.hv.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.hv.a.this.f131396a.m99294xbb3aa236();
                    }
                });
            }
        }

        @Override // com.tencent.mapsdk.internal.im.a
        public final void a() {
            if (this.f131396a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.hv.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.hv.a.this.f131396a.m99295xd7e2f2fd();
                    }
                });
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64
    /* renamed from: getAnimationListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26004x5184c038 mo36785xb9f507a2() {
        com.tencent.mapsdk.internal.hv.a aVar = this.f131395b;
        if (aVar != null) {
            return aVar.f131396a;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64
    /* renamed from: getDuration */
    public long mo36786x51e8b0a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131394a;
        if (imVar != null) {
            return imVar.a();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64
    /* renamed from: getInterpolator */
    public android.view.animation.Interpolator mo36787xdde4db3d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131394a;
        if (imVar != null) {
            return imVar.f131441f;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64
    /* renamed from: setAnimationListener */
    public void mo36788x958b1416(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26004x5184c038 interfaceC26004x5184c038) {
        com.tencent.mapsdk.internal.hv.a aVar = new com.tencent.mapsdk.internal.hv.a(interfaceC26004x5184c038);
        this.f131395b = aVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.f131394a;
        if (imVar != null) {
            imVar.a(aVar);
        }
    }
}
