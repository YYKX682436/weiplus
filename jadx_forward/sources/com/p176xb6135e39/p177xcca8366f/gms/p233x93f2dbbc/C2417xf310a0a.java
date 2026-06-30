package com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc;

/* renamed from: com.google.android.gms.measurement.AppMeasurementReceiver */
/* loaded from: classes13.dex */
public final class C2417xf310a0a extends p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97 implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2240x394c1e {

    /* renamed from: zzadd */
    private com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2237x394c1b f7368x6f02161;

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2240x394c1e
    /* renamed from: doGoAsync */
    public final android.content.BroadcastReceiver.PendingResult mo19145x626c3f69() {
        return goAsync();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2240x394c1e
    /* renamed from: doStartService */
    public final void mo19146x1d7e301e(android.content.Context context, android.content.Intent intent) {
        p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7785xce72c1e(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.f7368x6f02161 == null) {
            this.f7368x6f02161 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2237x394c1b(this);
        }
        this.f7368x6f02161.m19144x90287404(context, intent);
    }
}
