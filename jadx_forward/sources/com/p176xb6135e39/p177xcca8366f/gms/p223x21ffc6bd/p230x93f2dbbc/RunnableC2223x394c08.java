package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzfn */
/* loaded from: classes16.dex */
final class RunnableC2223x394c08 implements java.lang.Runnable {

    /* renamed from: packageName */
    private final java.lang.String f6628x362a8ff1;

    /* renamed from: status */
    private final int f6629xcacdcff2;

    /* renamed from: zzajh */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2222x394c07 f6630x6f0221f;

    /* renamed from: zzaji */
    private final java.lang.Throwable f6631x6f02220;

    /* renamed from: zzajj */
    private final byte[] f6632x6f02221;

    /* renamed from: zzajk */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f6633x6f02222;

    private RunnableC2223x394c08(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2222x394c07 interfaceC2222x394c07, int i17, java.lang.Throwable th6, byte[] bArr, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC2222x394c07);
        this.f6630x6f0221f = interfaceC2222x394c07;
        this.f6629xcacdcff2 = i17;
        this.f6631x6f02220 = th6;
        this.f6632x6f02221 = bArr;
        this.f6628x362a8ff1 = str;
        this.f6633x6f02222 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6630x6f0221f.zza(this.f6628x362a8ff1, this.f6629xcacdcff2, this.f6631x6f02220, this.f6632x6f02221, this.f6633x6f02222);
    }
}
