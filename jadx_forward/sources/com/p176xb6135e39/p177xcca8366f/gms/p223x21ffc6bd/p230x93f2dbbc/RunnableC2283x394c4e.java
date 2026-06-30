package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzhv */
/* loaded from: classes16.dex */
public final class RunnableC2283x394c4e implements java.lang.Runnable {

    /* renamed from: zzanv */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6854x6f022a9;

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6855x6f022aa;

    public RunnableC2283x394c4e(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f6855x6f022aa = c2272x394c43;
        this.f6854x6f022a9 = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6854x6f022a9) {
            try {
                this.f6854x6f022a9.set(this.f6855x6f022aa.mo18978x394c20().m19037x394c45());
            } finally {
                this.f6854x6f022a9.notify();
            }
        }
    }
}
