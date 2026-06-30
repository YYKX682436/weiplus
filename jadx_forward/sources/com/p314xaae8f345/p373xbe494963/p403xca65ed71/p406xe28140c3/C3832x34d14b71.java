package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoconsumer.renderer.NativeAndroidViewEventListener */
/* loaded from: classes13.dex */
public class C3832x34d14b71 implements com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a {

    /* renamed from: mNativeHandler */
    private long f15005x4b50afc6;

    public C3832x34d14b71(long j17) {
        this.f15005x4b50afc6 = j17;
    }

    /* renamed from: nativeOnTap */
    private static native void m31285x677baf6d(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeOnZoom */
    private static native void m31286x87fd2d49(long j17, float f17);

    /* renamed from: nativeonSizeChanged */
    private static native void m31287xd90e9d5d(long j17, int i17, int i18, int i19, int i27);

    @Override // com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a
    /* renamed from: onSizeChanged */
    public void mo31288x6521d014(int i17, int i18, int i19, int i27) {
        long j17 = this.f15005x4b50afc6;
        if (j17 != 0) {
            m31287xd90e9d5d(j17, i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a
    /* renamed from: onTap */
    public synchronized void mo31289x64f7944(int i17, int i18, int i19, int i27) {
        long j17 = this.f15005x4b50afc6;
        if (j17 != 0) {
            m31285x677baf6d(j17, i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.InterfaceC25489xb6bd843a
    /* renamed from: onZoom */
    public void mo31290xc3a29e52(float f17) {
        long j17 = this.f15005x4b50afc6;
        if (j17 != 0) {
            m31286x87fd2d49(j17, f17);
        }
    }

    /* renamed from: resetNativeHandle */
    public synchronized void m31291xfcc9f00e() {
        this.f15005x4b50afc6 = 0L;
    }
}
