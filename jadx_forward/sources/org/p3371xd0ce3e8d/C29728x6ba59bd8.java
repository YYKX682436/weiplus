package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.BaseBitrateAdjuster */
/* loaded from: classes15.dex */
class C29728x6ba59bd8 implements org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9 {

    /* renamed from: targetBitrateBps */
    protected int f75126x661583a9;

    /* renamed from: targetFramerateFps */
    protected double f75127xbc6a620d;

    @Override // org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: getAdjustedBitrateBps */
    public int mo155138x5cbee03c() {
        return this.f75126x661583a9;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: getAdjustedFramerateFps */
    public double mo155139xae2ee5e0() {
        return this.f75127xbc6a620d;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: reportEncodedFrame */
    public void mo155140x9acaa853(int i17) {
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: setTargets */
    public void mo155141x558e4a40(int i17, double d17) {
        this.f75126x661583a9 = i17;
        this.f75127xbc6a620d = d17;
    }
}
