package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzem */
/* loaded from: classes16.dex */
public abstract class AbstractC2196x394be8 {

    /* renamed from: handler */
    private static volatile android.os.Handler f6501x294b574a;

    /* renamed from: zzafj */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2270x394c41 f6502x6f021a5;

    /* renamed from: zzyd */
    private final java.lang.Runnable f6503x394e4b;

    /* renamed from: zzye */
    private volatile long f6504x394e4c;

    public AbstractC2196x394be8(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2270x394c41 interfaceC2270x394c41) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC2270x394c41);
        this.f6502x6f021a5 = interfaceC2270x394c41;
        this.f6503x394e4b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2197x394be9(this, interfaceC2270x394c41);
    }

    /* renamed from: getHandler */
    private final android.os.Handler m19066x67189314() {
        android.os.Handler handler;
        if (f6501x294b574a != null) {
            return f6501x294b574a;
        }
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8.class) {
            if (f6501x294b574a == null) {
                f6501x294b574a = new android.os.Handler(this.f6502x6f021a5.mo18960x76847179().getMainLooper());
            }
            handler = f6501x294b574a;
        }
        return handler;
    }

    public static /* synthetic */ long zza(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 abstractC2196x394be8, long j17) {
        abstractC2196x394be8.f6504x394e4c = 0L;
        return 0L;
    }

    /* renamed from: cancel */
    public final void m19067xae7a2e7a() {
        this.f6504x394e4c = 0L;
        m19066x67189314().removeCallbacks(this.f6503x394e4b);
    }

    public abstract void run();

    /* renamed from: zzef */
    public final boolean m19068x394be1() {
        return this.f6504x394e4c != 0;
    }

    public final void zzh(long j17) {
        m19067xae7a2e7a();
        if (j17 >= 0) {
            this.f6504x394e4c = this.f6502x6f021a5.mo18962x394b92().mo18536x5cbba1cc();
            if (m19066x67189314().postDelayed(this.f6503x394e4b, j17)) {
                return;
            }
            this.f6502x6f021a5.mo18976x394c1e().m19108x394c64().zzg("Failed to schedule delayed post. time", java.lang.Long.valueOf(j17));
        }
    }
}
