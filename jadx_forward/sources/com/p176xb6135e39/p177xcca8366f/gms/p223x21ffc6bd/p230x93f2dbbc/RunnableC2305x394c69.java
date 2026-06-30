package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzir */
/* loaded from: classes16.dex */
public final class RunnableC2305x394c69 implements java.lang.Runnable {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f6921x6f02298;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6922x6f022d6;

    /* renamed from: zzapg */
    private final /* synthetic */ boolean f6923x6f022d8 = true;

    /* renamed from: zzaph */
    private final /* synthetic */ boolean f6924x6f022d9;

    /* renamed from: zzapi */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf f6925x6f022da;

    /* renamed from: zzapj */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf f6926x6f022db;

    public RunnableC2305x394c69(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, boolean z17, boolean z18, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2187x394bdf c2187x394bdf2) {
        this.f6922x6f022d6 = c2296x394c60;
        this.f6924x6f022d9 = z18;
        this.f6925x6f022da = c2187x394bdf;
        this.f6921x6f02298 = c2183x394bd6;
        this.f6926x6f022db = c2187x394bdf2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        interfaceC2208x394bf4 = this.f6922x6f022d6.f6896x6f022cb;
        if (interfaceC2208x394bf4 == null) {
            this.f6922x6f022d6.mo18976x394c1e().m19108x394c64().log("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f6923x6f022d8) {
            this.f6922x6f022d6.zza(interfaceC2208x394bf4, this.f6924x6f022d9 ? null : this.f6925x6f022da, this.f6921x6f02298);
        } else {
            try {
                if (android.text.TextUtils.isEmpty(this.f6926x6f022db.f6476x362a8ff1)) {
                    interfaceC2208x394bf4.zza(this.f6925x6f022da, this.f6921x6f02298);
                } else {
                    interfaceC2208x394bf4.zzb(this.f6925x6f022da);
                }
            } catch (android.os.RemoteException e17) {
                this.f6922x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Failed to send conditional user property to the service", e17);
            }
        }
        this.f6922x6f022d6.m19225x394bb2();
    }
}
