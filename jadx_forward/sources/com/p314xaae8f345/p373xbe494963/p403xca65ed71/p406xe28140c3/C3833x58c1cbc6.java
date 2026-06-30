package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoconsumer.renderer.NativeRenderViewListener */
/* loaded from: classes13.dex */
class C3833x58c1cbc6 implements com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener {

    /* renamed from: mNativeHandler */
    private long f15006x4b50afc6;

    public C3833x58c1cbc6(long j17) {
        this.f15006x4b50afc6 = j17;
    }

    /* renamed from: nativeOnRequestRedraw */
    private static native void m31292x74a89cb0(long j17, android.graphics.Bitmap bitmap);

    /* renamed from: nativeOnSurfaceChanged */
    private static native void m31293xf89b0f3d(long j17, android.view.Surface surface, boolean z17);

    /* renamed from: nativeOnSurfaceDestroy */
    private static native void m31294x29634c83(long j17);

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener
    /* renamed from: onRequestRedraw */
    public synchronized void mo31295x842745c7(android.graphics.Bitmap bitmap) {
        long j17 = this.f15006x4b50afc6;
        if (j17 != 0) {
            m31292x74a89cb0(j17, bitmap);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener
    /* renamed from: onSurfaceChanged */
    public synchronized void mo31296xd8f18906(android.view.Surface surface, boolean z17) {
        long j17 = this.f15006x4b50afc6;
        if (j17 != 0) {
            m31293xf89b0f3d(j17, surface, z17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener
    /* renamed from: onSurfaceDestroy */
    public synchronized void mo31297x9b9c64c() {
        long j17 = this.f15006x4b50afc6;
        if (j17 != 0) {
            m31294x29634c83(j17);
        }
    }

    /* renamed from: resetNativeHandle */
    public synchronized void m31298xfcc9f00e() {
        this.f15006x4b50afc6 = 0L;
    }
}
