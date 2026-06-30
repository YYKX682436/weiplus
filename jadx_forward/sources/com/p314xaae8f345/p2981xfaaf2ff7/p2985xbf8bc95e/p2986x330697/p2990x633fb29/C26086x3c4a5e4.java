package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList */
/* loaded from: classes13.dex */
public class C26086x3c4a5e4 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 {

    /* renamed from: mListeners */
    private java.util.ArrayList<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426> f49782x32131c52 = new java.util.ArrayList<>();

    /* renamed from: addListener */
    public synchronized void m99987x162a7075(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        if (interfaceC26085x16ab0426 != null) {
            if (!this.f49782x32131c52.contains(interfaceC26085x16ab0426)) {
                this.f49782x32131c52.add(interfaceC26085x16ab0426);
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onDoubleTap */
    public synchronized boolean mo99975xce1d2af3(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99975xce1d2af3(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onDown */
    public synchronized boolean mo99976xc3989f21(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99976xc3989f21(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onFling */
    public synchronized boolean mo99977xaf95e2bd(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99977xaf95e2bd(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onLongPress */
    public synchronized boolean mo99978x4f8d808(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99978x4f8d808(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onMapStable */
    public synchronized void mo99979x348be498() {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99979x348be498();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onScroll */
    public synchronized boolean mo99980x58dabd8c(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99980x58dabd8c(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onSingleTap */
    public synchronized boolean mo99981xa5153b1c(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99981xa5153b1c(f17, f18);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onTwoFingerMoveAgainst */
    public synchronized boolean mo99982x56a01d1a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99982x56a01d1a(twoFingerMoveAgainstStatus, c26015xa89e978e);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onUp */
    public synchronized boolean mo99983x341cda(float f17, float f18) {
        for (int size = this.f49782x32131c52.size() - 1; size >= 0; size--) {
            this.f49782x32131c52.get(size).mo99983x341cda(f17, f18);
        }
        return false;
    }

    /* renamed from: removeListener */
    public synchronized void m99988xf1335d58(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        this.f49782x32131c52.remove(interfaceC26085x16ab0426);
    }
}
