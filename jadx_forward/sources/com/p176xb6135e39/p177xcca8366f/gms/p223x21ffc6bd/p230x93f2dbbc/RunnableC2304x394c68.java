package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zziq */
/* loaded from: classes16.dex */
public final class RunnableC2304x394c68 implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6915x6f02298;

    /* renamed from: zzanj */
    private final /* synthetic */ java.lang.String f6916x6f0229d;

    /* renamed from: zzank */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 f6917x6f0229e;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6918x6f022d6;

    /* renamed from: zzapg */
    private final /* synthetic */ boolean f6919x6f022d8 = true;

    /* renamed from: zzaph */
    private final /* synthetic */ boolean f6920x6f022d9;

    public RunnableC2304x394c68(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, boolean z17, boolean z18, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2204x394bf0 c2204x394bf0, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6, java.lang.String str) {
        this.f6918x6f022d6 = c2296x394c60;
        this.f6920x6f022d9 = z18;
        this.f6917x6f0229e = c2204x394bf0;
        this.f6915x6f02298 = c2183x394bd6;
        this.f6916x6f0229d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        interfaceC2208x394bf4 = this.f6918x6f022d6.f6896x6f022cb;
        if (interfaceC2208x394bf4 == null) {
            this.f6918x6f022d6.mo18976x394c1e().m19108x394c64().log("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6919x6f022d8) {
            this.f6918x6f022d6.zza(interfaceC2208x394bf4, this.f6920x6f022d9 ? null : this.f6917x6f0229e, this.f6915x6f02298);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.f6916x6f0229d)) {
                    interfaceC2208x394bf4.zza(this.f6917x6f0229e, this.f6915x6f02298);
                } else {
                    interfaceC2208x394bf4.zza(this.f6917x6f0229e, this.f6916x6f0229d, this.f6918x6f022d6.mo18976x394c1e().m19116x394c6d());
                }
            } catch (android.os.RemoteException e17) {
                this.f6918x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Failed to send event to the service", e17);
            }
        }
        this.f6918x6f022d6.m19225x394bb2();
    }
}
