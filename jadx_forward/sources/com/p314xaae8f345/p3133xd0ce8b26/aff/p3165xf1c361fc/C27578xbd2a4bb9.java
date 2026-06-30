package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.ZIDL_flS4gctrB */
/* loaded from: classes16.dex */
class C27578xbd2a4bb9 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback {

    /* renamed from: stub */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f f60568x3608ae;

    /* renamed from: ZIDL_DX */
    private native void m117761x1964d1dc(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_EX */
    private native void m117762x1964d1fb(long j17, long j18, int i17);

    /* renamed from: ZIDL_HI */
    private native void m117763x1964d249(long j17, byte[] bArr, byte[] bArr2);

    /* renamed from: ZIDL_B */
    public void m117764x9db8edfa(double d17, boolean z17) {
        this.f60568x3608ae.mo14830x800200d4(d17, z17);
    }

    /* renamed from: ZIDL_C */
    public void m117765x9db8edfb(boolean z17) {
        this.f60568x3608ae.mo14834x5a8f48a5(z17);
    }

    /* renamed from: ZIDL_DV */
    public void m117766x1964d1da(long j17) {
        this.f60568x3608ae.mo14832x6fa537ec(j17);
    }

    /* renamed from: ZIDL_EV */
    public void m117767x1964d1f9(long j17, boolean z17) {
        this.f60568x3608ae.mo14833xab4e0a19(j17, z17);
    }

    /* renamed from: ZIDL_F */
    public void m117768x9db8edfe(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f60568x3608ae.mo14835x93387072(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr5, java.nio.charset.StandardCharsets.UTF_8));
    }

    /* renamed from: ZIDL_G */
    public void m117769x9db8edff(int i17) {
        this.f60568x3608ae.mo14831x63a5261f(i17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f interfaceC27574x746b60f = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f) obj;
        this.f60568x3608ae = interfaceC27574x746b60f;
        interfaceC27574x746b60f.mo14836x6c4ebec7(this);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback
    /* renamed from: onGetWebViewPixelsComplete */
    public void mo117736x4d420ac8(long j17, byte[] bArr) {
        m117761x1964d1dc(this.f60633xf042a733, j17, bArr);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback
    /* renamed from: onNativeEventsEvent */
    public void mo117737xa248684b(java.lang.String str, java.lang.String str2) {
        m117763x1964d249(this.f60633xf042a733, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback
    /* renamed from: onNotifyFilterShowOrHideComplete */
    public void mo117738xc9b6723b(long j17, int i17) {
        m117762x1964d1fb(this.f60633xf042a733, j17, i17);
    }
}
