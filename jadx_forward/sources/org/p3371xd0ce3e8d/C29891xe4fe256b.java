package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.VideoDecoderFallback */
/* loaded from: classes6.dex */
public class C29891xe4fe256b extends org.p3371xd0ce3e8d.AbstractC29915x7184e245 {

    /* renamed from: fallback */
    private final org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 f76071x2d5fa6e2;

    /* renamed from: primary */
    private final org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 f76072xed3d0e02;

    public C29891xe4fe256b(org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 interfaceC29889x5cf59369, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 interfaceC29889x5cf593692) {
        this.f76071x2d5fa6e2 = interfaceC29889x5cf59369;
        this.f76072xed3d0e02 = interfaceC29889x5cf593692;
    }

    /* renamed from: nativeCreateDecoder */
    private static native long m156510x8562ccd1(org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 interfaceC29889x5cf59369, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 interfaceC29889x5cf593692);

    @Override // org.p3371xd0ce3e8d.AbstractC29915x7184e245, org.p3371xd0ce3e8d.InterfaceC29889x5cf59369
    /* renamed from: createNativeVideoDecoder */
    public long mo155657x89bf0f1c() {
        return m156510x8562ccd1(this.f76071x2d5fa6e2, this.f76072xed3d0e02);
    }
}
