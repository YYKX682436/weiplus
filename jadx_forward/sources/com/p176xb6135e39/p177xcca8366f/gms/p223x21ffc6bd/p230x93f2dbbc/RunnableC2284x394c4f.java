package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzhw */
/* loaded from: classes16.dex */
public final class RunnableC2284x394c4f implements java.lang.Runnable {

    /* renamed from: zzanv */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6856x6f022a9;

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6857x6f022aa;

    public RunnableC2284x394c4f(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f6857x6f022aa = c2272x394c43;
        this.f6856x6f022a9 = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6856x6f022a9) {
            try {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.f6856x6f022a9;
                com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2189x394be1 mo18978x394c20 = this.f6857x6f022aa.mo18978x394c20();
                atomicReference.set(java.lang.Long.valueOf(mo18978x394c20.zza(mo18978x394c20.mo18967x394c10().m19091x394b67(), com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2206x394bf2.f6575x6f021eb)));
            } finally {
                this.f6856x6f022a9.notify();
            }
        }
    }
}
