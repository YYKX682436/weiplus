package com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b;

/* renamed from: com.tencent.wechat.zrpc.ZIDL_c9_jRtgnB */
/* loaded from: classes16.dex */
class C27715x24512250 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d f301565a;

    public C27715x24512250(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d dVar = (com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d) obj;
        this.f301565a = dVar;
        dVar.l(this);
    }

    /* renamed from: ZIDL_CX */
    private native void m119658x1964d1bd(long j17, long j18, boolean z17);

    /* renamed from: ZIDL_DI */
    private native void m119659x1964d1cd(long j17, byte[] bArr, int i17);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c
    public void Q(byte[] bArr, int i17) {
        m119659x1964d1cd(this.f60633xf042a733, bArr, i17);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c
    public void R(long j17, boolean z17) {
        m119658x1964d1bd(this.f60633xf042a733, j17, z17);
    }

    /* renamed from: ZIDL_A */
    public void m119660x9db8edf9() {
        this.f301565a.e();
    }

    /* renamed from: ZIDL_B */
    public void m119661x9db8edfa() {
        this.f301565a.j();
    }

    /* renamed from: ZIDL_CV */
    public void m119662x1964d1bb(long j17, byte[] bArr, long j18) {
        this.f301565a.p(j17, bArr, j18);
    }

    /* renamed from: ZIDL_E */
    public void m119663x9db8edfd() {
        this.f301565a.mo119687x5a5ddf8();
    }

    /* renamed from: ZIDL_F */
    public boolean m119664x9db8edfe() {
        return this.f301565a.mo119689x23b734ff();
    }

    /* renamed from: ZIDL_G */
    public int m119665x9db8edff() {
        return this.f301565a.k();
    }

    /* renamed from: ZIDL_H */
    public java.lang.String m119666x9db8ee00() {
        return this.f301565a.mo119688x74653a5a();
    }
}
