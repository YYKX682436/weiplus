package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzit */
/* loaded from: classes16.dex */
public final class RunnableC2307x394c6b implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6933x6f02298;

    /* renamed from: zzanh */
    private final /* synthetic */ java.lang.String f6934x6f0229b;

    /* renamed from: zzani */
    private final /* synthetic */ java.lang.String f6935x6f0229c;

    /* renamed from: zzanj */
    private final /* synthetic */ java.lang.String f6936x6f0229d;

    /* renamed from: zzanz */
    private final /* synthetic */ boolean f6937x6f022ad;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6938x6f022d6;

    /* renamed from: zzapf */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6939x6f022d7;

    public RunnableC2307x394c6b(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        this.f6938x6f022d6 = c2296x394c60;
        this.f6939x6f022d7 = atomicReference;
        this.f6936x6f0229d = str;
        this.f6934x6f0229b = str2;
        this.f6935x6f0229c = str3;
        this.f6937x6f022ad = z17;
        this.f6933x6f02298 = c2183x394bd6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> zza;
        synchronized (this.f6939x6f022d7) {
            try {
                try {
                    interfaceC2208x394bf4 = this.f6938x6f022d6.f6896x6f022cb;
                } catch (android.os.RemoteException e17) {
                    this.f6938x6f022d6.mo18976x394c1e().m19108x394c64().zzd("Failed to get user properties", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(this.f6936x6f0229d), this.f6934x6f0229b, e17);
                    this.f6939x6f022d7.set(java.util.Collections.emptyList());
                    atomicReference = this.f6939x6f022d7;
                }
                if (interfaceC2208x394bf4 == null) {
                    this.f6938x6f022d6.mo18976x394c1e().m19108x394c64().zzd("Failed to get user properties", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01.m19104x394b8b(this.f6936x6f0229d), this.f6934x6f0229b, this.f6935x6f0229c);
                    this.f6939x6f022d7.set(java.util.Collections.emptyList());
                    return;
                }
                if (android.text.TextUtils.isEmpty(this.f6936x6f0229d)) {
                    atomicReference2 = this.f6939x6f022d7;
                    zza = interfaceC2208x394bf4.zza(this.f6934x6f0229b, this.f6935x6f0229c, this.f6937x6f022ad, this.f6933x6f02298);
                } else {
                    atomicReference2 = this.f6939x6f022d7;
                    zza = interfaceC2208x394bf4.zza(this.f6936x6f0229d, this.f6934x6f0229b, this.f6935x6f0229c, this.f6937x6f022ad);
                }
                atomicReference2.set(zza);
                this.f6938x6f022d6.m19225x394bb2();
                atomicReference = this.f6939x6f022d7;
                atomicReference.notify();
            } finally {
                this.f6939x6f022d7.notify();
            }
        }
    }
}
