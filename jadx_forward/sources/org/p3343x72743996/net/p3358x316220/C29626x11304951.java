package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.QuicExceptionImpl */
/* loaded from: classes16.dex */
public class C29626x11304951 extends org.p3343x72743996.net.AbstractC29547x559ba391 {

    /* renamed from: mNetworkException */
    private final org.p3343x72743996.net.p3358x316220.C29623xc2436ba1 f74804x4c0ff44e;

    /* renamed from: mQuicDetailedErrorCode */
    private final int f74805x63a83a;

    public C29626x11304951(java.lang.String str, int i17, int i18, int i19) {
        super(str, null);
        this.f74804x4c0ff44e = new org.p3343x72743996.net.p3358x316220.C29623xc2436ba1(str, i17, i18);
        this.f74805x63a83a = i19;
    }

    @Override // org.p3343x72743996.net.AbstractC29535xf3bc6de1
    /* renamed from: getCronetInternalErrorCode */
    public int mo153434xe755eb65() {
        return this.f74804x4c0ff44e.mo153434xe755eb65();
    }

    @Override // org.p3343x72743996.net.AbstractC29535xf3bc6de1
    /* renamed from: getErrorCode */
    public int mo153435x130a215f() {
        return this.f74804x4c0ff44e.mo153435x130a215f();
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f74804x4c0ff44e.getMessage() + ", QuicDetailedErrorCode=" + this.f74805x63a83a;
    }

    @Override // org.p3343x72743996.net.AbstractC29547x559ba391
    /* renamed from: getQuicDetailedErrorCode */
    public int mo153472x583db4f1() {
        return this.f74805x63a83a;
    }

    @Override // org.p3343x72743996.net.AbstractC29535xf3bc6de1
    /* renamed from: immediatelyRetryable */
    public boolean mo153436x442c64a4() {
        return this.f74804x4c0ff44e.mo153436x442c64a4();
    }
}
