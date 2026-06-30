package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.UserRecoverableException */
/* loaded from: classes13.dex */
public class C1725x583be5bc extends java.lang.Exception {
    private final android.content.Intent zza;

    public C1725x583be5bc(java.lang.String str, android.content.Intent intent) {
        super(str);
        this.zza = intent;
    }

    /* renamed from: getIntent */
    public android.content.Intent m17701x1e885992() {
        return new android.content.Intent(this.zza);
    }
}
