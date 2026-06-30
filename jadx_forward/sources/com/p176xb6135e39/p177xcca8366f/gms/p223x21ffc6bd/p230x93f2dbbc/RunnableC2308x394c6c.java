package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zziu */
/* loaded from: classes16.dex */
public final class RunnableC2308x394c6c implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6940x6f02298;

    /* renamed from: zzanl */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e f6941x6f0229f;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6942x6f022d6;

    /* renamed from: zzaph */
    private final /* synthetic */ boolean f6943x6f022d9;

    public RunnableC2308x394c6c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        this.f6942x6f022d6 = c2296x394c60;
        this.f6943x6f022d9 = z17;
        this.f6941x6f0229f = c2337x394c8e;
        this.f6940x6f02298 = c2183x394bd6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        interfaceC2208x394bf4 = this.f6942x6f022d6.f6896x6f022cb;
        if (interfaceC2208x394bf4 == null) {
            this.f6942x6f022d6.mo18976x394c1e().m19108x394c64().log("Discarding data. Failed to set user attribute");
        } else {
            this.f6942x6f022d6.zza(interfaceC2208x394bf4, this.f6943x6f022d9 ? null : this.f6941x6f0229f, this.f6940x6f02298);
            this.f6942x6f022d6.m19225x394bb2();
        }
    }
}
