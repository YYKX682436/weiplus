package ey5;

/* loaded from: classes13.dex */
public class p implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener f339193a;

    public p(ey5.r rVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener onScreenShotListener) {
        this.f339193a = onScreenShotListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback
    /* renamed from: onSnapshotReady */
    public void mo99173x79b9f2a0(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener onScreenShotListener = this.f339193a;
        if (onScreenShotListener != null) {
            onScreenShotListener.mo99033x2d275c63(bitmap);
        }
    }
}
