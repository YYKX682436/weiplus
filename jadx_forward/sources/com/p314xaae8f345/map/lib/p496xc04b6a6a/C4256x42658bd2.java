package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.OverlayListenerInfo */
/* loaded from: classes13.dex */
public class C4256x42658bd2 {

    /* renamed from: innerListener */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener f16575xd7e1c12a = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener() { // from class: com.tencent.map.lib.models.OverlayListenerInfo.1
        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener
        /* renamed from: onVectorOverlayLoaded */
        public final void mo35424xb494ef93(final boolean z17) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.map.lib.models.OverlayListenerInfo.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener onVectorOverlayLoadListener = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2.this.f16577xf669cf14;
                    if (onVectorOverlayLoadListener != null) {
                        onVectorOverlayLoadListener.mo35424xb494ef93(z17);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "TMS vetorOverlay loaded status: " + z17);
                    }
                }
            });
        }
    };

    /* renamed from: outterVectorOverlayClickListener */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener f16576x2ddfaa42;

    /* renamed from: outterVectorOverlayLoadListener */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener f16577xf669cf14;

    /* renamed from: getOutterVectorOverlayClickListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener m35421xac5665b8() {
        return this.f16576x2ddfaa42;
    }

    /* renamed from: setOutterVectorOverlayClickListener */
    public void m35422x7e7f62c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.f16576x2ddfaa42 = onVectorOverlayClickListener;
    }

    /* renamed from: setOutterVectorOverlayLoadListener */
    public void m35423x2a8ffe52(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener onVectorOverlayLoadListener) {
        this.f16577xf669cf14 = onVectorOverlayLoadListener;
    }
}
