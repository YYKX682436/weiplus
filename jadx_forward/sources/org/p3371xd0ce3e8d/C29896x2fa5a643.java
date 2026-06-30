package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoEncoderFallback */
/* loaded from: classes6.dex */
public class C29896x2fa5a643 extends org.p3371xd0ce3e8d.AbstractC29916xb5c6bb1d {

    /* renamed from: fallback */
    private final org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 f76091x2d5fa6e2;

    /* renamed from: primary */
    private final org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 f76092xed3d0e02;

    public C29896x2fa5a643(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 interfaceC29894xa1376c41, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 interfaceC29894xa1376c412) {
        this.f76091x2d5fa6e2 = interfaceC29894xa1376c41;
        this.f76092xed3d0e02 = interfaceC29894xa1376c412;
    }

    /* renamed from: nativeCreateEncoder */
    private static native long m156528xc9a4a5a9(org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 interfaceC29894xa1376c41, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 interfaceC29894xa1376c412);

    @Override // org.p3371xd0ce3e8d.AbstractC29916xb5c6bb1d, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: createNativeVideoEncoder */
    public long mo155660xce00e7f4() {
        return m156528xc9a4a5a9(this.f76091x2d5fa6e2, this.f76092xed3d0e02);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29916xb5c6bb1d, org.p3371xd0ce3e8d.InterfaceC29894xa1376c41
    /* renamed from: isHardwareEncoder */
    public boolean mo155661x488cb38a() {
        return this.f76092xed3d0e02.mo155661x488cb38a();
    }
}
