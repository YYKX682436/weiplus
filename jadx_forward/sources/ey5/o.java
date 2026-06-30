package ey5;

/* loaded from: classes13.dex */
public class o implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener f339192a;

    public o(ey5.r rVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener) {
        this.f339192a = tencentMapGestureListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onDoubleTap */
    public boolean mo99975xce1d2af3(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99034xce1d2af3(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onDown */
    public boolean mo99976xc3989f21(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99035xc3989f21(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onFling */
    public boolean mo99977xaf95e2bd(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99036xaf95e2bd(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onLongPress */
    public boolean mo99978x4f8d808(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99037x4f8d808(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onMapStable */
    public void mo99979x348be498() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return;
        }
        tencentMapGestureListener.mo99038x348be498();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onScroll */
    public boolean mo99980x58dabd8c(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99039x58dabd8c(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onSingleTap */
    public boolean mo99981xa5153b1c(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99040xa5153b1c(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onTwoFingerMoveAgainst */
    public boolean mo99982x56a01d1a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99041x56a01d1a(twoFingerMoveAgainstStatus, c26015xa89e978e);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426
    /* renamed from: onUp */
    public boolean mo99983x341cda(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener = this.f339192a;
        if (tencentMapGestureListener == null) {
            return false;
        }
        return tencentMapGestureListener.mo99042x341cda(f17, f18);
    }
}
