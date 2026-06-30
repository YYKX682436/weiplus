package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zziv */
/* loaded from: classes16.dex */
public final class RunnableC2309x394c6d implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6944x6f02298;

    /* renamed from: zzanz */
    private final /* synthetic */ boolean f6945x6f022ad;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6946x6f022d6;

    /* renamed from: zzapf */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6947x6f022d7;

    public RunnableC2309x394c6d(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, java.util.concurrent.atomic.AtomicReference atomicReference, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6, boolean z17) {
        this.f6946x6f022d6 = c2296x394c60;
        this.f6947x6f022d7 = atomicReference;
        this.f6944x6f02298 = c2183x394bd6;
        this.f6945x6f022ad = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        synchronized (this.f6947x6f022d7) {
            try {
                try {
                    interfaceC2208x394bf4 = this.f6946x6f022d6.f6896x6f022cb;
                } catch (android.os.RemoteException e17) {
                    this.f6946x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Failed to get user properties", e17);
                    atomicReference = this.f6947x6f022d7;
                }
                if (interfaceC2208x394bf4 == null) {
                    this.f6946x6f022d6.mo18976x394c1e().m19108x394c64().log("Failed to get user properties");
                    return;
                }
                this.f6947x6f022d7.set(interfaceC2208x394bf4.zza(this.f6944x6f02298, this.f6945x6f022ad));
                this.f6946x6f022d6.m19225x394bb2();
                atomicReference = this.f6947x6f022d7;
                atomicReference.notify();
            } finally {
                this.f6947x6f022d7.notify();
            }
        }
    }
}
