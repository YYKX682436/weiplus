package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzip */
/* loaded from: classes16.dex */
public final class RunnableC2303x394c67 implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6913x6f02298;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6914x6f022d6;

    public RunnableC2303x394c67(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        this.f6914x6f022d6 = c2296x394c60;
        this.f6913x6f02298 = c2183x394bd6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        interfaceC2208x394bf4 = this.f6914x6f022d6.f6896x6f022cb;
        if (interfaceC2208x394bf4 == null) {
            this.f6914x6f022d6.mo18976x394c1e().m19108x394c64().log("Failed to send measurementEnabled to service");
            return;
        }
        try {
            interfaceC2208x394bf4.zzb(this.f6913x6f02298);
            this.f6914x6f022d6.m19225x394bb2();
        } catch (android.os.RemoteException e17) {
            this.f6914x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Failed to send measurementEnabled to the service", e17);
        }
    }
}
