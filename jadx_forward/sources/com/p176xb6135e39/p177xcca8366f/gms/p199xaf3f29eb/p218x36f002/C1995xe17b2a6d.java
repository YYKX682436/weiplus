package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.DefaultClock */
/* loaded from: classes13.dex */
public class C1995xe17b2a6d implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1995xe17b2a6d zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1995xe17b2a6d();

    private C1995xe17b2a6d() {
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee m18555x9cf0d20b() {
        return zza;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee
    /* renamed from: currentThreadTimeMillis */
    public final long mo18535xf8b620b6() {
        return android.os.SystemClock.currentThreadTimeMillis();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee
    /* renamed from: currentTimeMillis */
    public final long mo18536x5cbba1cc() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee
    /* renamed from: elapsedRealtime */
    public final long mo18537x79952707() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee
    /* renamed from: nanoTime */
    public final long mo18538x6ff6c7a1() {
        return java.lang.System.nanoTime();
    }
}
