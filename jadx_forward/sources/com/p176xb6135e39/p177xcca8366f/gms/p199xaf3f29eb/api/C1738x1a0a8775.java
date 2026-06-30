package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.ApiException */
/* loaded from: classes13.dex */
public class C1738x1a0a8775 extends java.lang.Exception {

    /* renamed from: mStatus */
    @java.lang.Deprecated
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 f5871x1a39f6bf;

    public C1738x1a0a8775(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        super(c1763x9432bc12.m17849xfd0160f5() + ": " + (c1763x9432bc12.m17850x843b0fff() != null ? c1763x9432bc12.m17850x843b0fff() : ""));
        this.f5871x1a39f6bf = c1763x9432bc12;
    }

    /* renamed from: getStatus */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 m17724x2fe4f2e8() {
        return this.f5871x1a39f6bf;
    }

    /* renamed from: getStatusCode */
    public int m17725xfd0160f5() {
        return this.f5871x1a39f6bf.m17849xfd0160f5();
    }

    @java.lang.Deprecated
    /* renamed from: getStatusMessage */
    public java.lang.String m17726x843b0fff() {
        return this.f5871x1a39f6bf.m17850x843b0fff();
    }
}
