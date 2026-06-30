package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzil */
/* loaded from: classes16.dex */
public final class RunnableC2299x394c63 implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6905x6f02298;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6906x6f022d6;

    /* renamed from: zzapf */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6907x6f022d7;

    public RunnableC2299x394c63(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, java.util.concurrent.atomic.AtomicReference atomicReference, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        this.f6906x6f022d6 = c2296x394c60;
        this.f6907x6f022d7 = atomicReference;
        this.f6905x6f02298 = c2183x394bd6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        synchronized (this.f6907x6f022d7) {
            try {
                try {
                    interfaceC2208x394bf4 = this.f6906x6f022d6.f6896x6f022cb;
                } catch (android.os.RemoteException e17) {
                    this.f6906x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Failed to get app instance id", e17);
                    atomicReference = this.f6907x6f022d7;
                }
                if (interfaceC2208x394bf4 == null) {
                    this.f6906x6f022d6.mo18976x394c1e().m19108x394c64().log("Failed to get app instance id");
                    return;
                }
                this.f6907x6f022d7.set(interfaceC2208x394bf4.zzc(this.f6905x6f02298));
                java.lang.String str = (java.lang.String) this.f6907x6f022d7.get();
                if (str != null) {
                    this.f6906x6f022d6.mo18966x394c0f().m19207x394b90(str);
                    this.f6906x6f022d6.mo18977x394c1f().f6655x6f02238.m19139x394b91(str);
                }
                this.f6906x6f022d6.m19225x394bb2();
                atomicReference = this.f6907x6f022d7;
                atomicReference.notify();
            } finally {
                this.f6907x6f022d7.notify();
            }
        }
    }
}
