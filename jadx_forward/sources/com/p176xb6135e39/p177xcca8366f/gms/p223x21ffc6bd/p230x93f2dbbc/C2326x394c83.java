package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzjm */
/* loaded from: classes16.dex */
public final class C2326x394c83 {

    /* renamed from: startTime */
    private long f6979x81158a4f;

    /* renamed from: zzro */
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee f6980x394d7d;

    public C2326x394c83(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.InterfaceC1991x3e2ebee interfaceC1991x3e2ebee) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1991x3e2ebee);
        this.f6980x394d7d = interfaceC1991x3e2ebee;
    }

    /* renamed from: clear */
    public final void m19250x5a5b64d() {
        this.f6979x81158a4f = 0L;
    }

    /* renamed from: start */
    public final void m19251x68ac462() {
        this.f6979x81158a4f = this.f6980x394d7d.mo18537x79952707();
    }

    public final boolean zzj(long j17) {
        return this.f6979x81158a4f == 0 || this.f6980x394d7d.mo18537x79952707() - this.f6979x81158a4f >= 3600000;
    }
}
