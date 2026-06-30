package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzhl */
/* loaded from: classes16.dex */
public final class RunnableC2273x394c44 implements java.lang.Runnable {

    /* renamed from: zzanv */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6824x6f022a9;

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6825x6f022aa;

    public RunnableC2273x394c44(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f6825x6f022aa = c2272x394c43;
        this.f6824x6f022a9 = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6824x6f022a9) {
            try {
                this.f6824x6f022a9.set(java.lang.Boolean.valueOf(this.f6825x6f022aa.mo18978x394c20().m19036x394c44()));
            } finally {
                this.f6824x6f022a9.notify();
            }
        }
    }
}
