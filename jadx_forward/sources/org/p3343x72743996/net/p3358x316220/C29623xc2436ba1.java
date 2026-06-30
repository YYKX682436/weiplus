package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.NetworkExceptionImpl */
/* loaded from: classes16.dex */
public class C29623xc2436ba1 extends org.p3343x72743996.net.AbstractC29535xf3bc6de1 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74801x7118e671 = false;

    /* renamed from: mCronetInternalErrorCode */
    protected final int f74802x1dcc306e;

    /* renamed from: mErrorCode */
    protected final int f74803x8e53fa28;

    public C29623xc2436ba1(java.lang.String str, int i17, int i18) {
        super(str, null);
        this.f74803x8e53fa28 = i17;
        this.f74802x1dcc306e = i18;
    }

    @Override // org.p3343x72743996.net.AbstractC29535xf3bc6de1
    /* renamed from: getCronetInternalErrorCode */
    public int mo153434xe755eb65() {
        return this.f74802x1dcc306e;
    }

    @Override // org.p3343x72743996.net.AbstractC29535xf3bc6de1
    /* renamed from: getErrorCode */
    public int mo153435x130a215f() {
        return this.f74803x8e53fa28;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(super.getMessage());
        sb6.append(", ErrorCode=");
        sb6.append(this.f74803x8e53fa28);
        if (this.f74802x1dcc306e != 0) {
            sb6.append(", InternalErrorCode=");
            sb6.append(this.f74802x1dcc306e);
        }
        sb6.append(", Retryable=");
        sb6.append(mo153436x442c64a4());
        return sb6.toString();
    }

    @Override // org.p3343x72743996.net.AbstractC29535xf3bc6de1
    /* renamed from: immediatelyRetryable */
    public boolean mo153436x442c64a4() {
        int i17 = this.f74803x8e53fa28;
        return i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 8;
    }
}
