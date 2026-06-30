package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.DataSourceException */
/* loaded from: classes13.dex */
public class C25432x673e7d4a extends java.lang.Exception {

    /* renamed from: errorCode */
    private final int f46107x139cb015;

    public C25432x673e7d4a(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.f46107x139cb015 = i17;
    }

    /* renamed from: getErrorCode */
    public int m94285x130a215f() {
        return this.f46107x139cb015;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "DataSourceException{errorCode=" + this.f46107x139cb015 + "\nmessage=" + getMessage() + '}';
    }
}
