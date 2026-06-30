package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.UnsupportedApiCallException */
/* loaded from: classes13.dex */
public final class C1765xcf3df3cc extends java.lang.UnsupportedOperationException {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 zza;

    public C1765xcf3df3cc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6 c1702x28db12d6) {
        this.zza = c1702x28db12d6;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return "Missing ".concat(java.lang.String.valueOf(this.zza));
    }
}
