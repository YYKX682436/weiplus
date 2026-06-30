package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzfp */
/* loaded from: classes16.dex */
public class C2225x394c0a extends android.content.BroadcastReceiver {

    /* renamed from: zzaaw */
    private static final java.lang.String f6639x6f02117 = "com.google.android.gms.internal.measurement.zzfp";

    /* renamed from: zzaax */
    private boolean f6640x6f02118;

    /* renamed from: zzaay */
    private boolean f6641x6f02119;

    /* renamed from: zzajp */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 f6642x6f02227;

    public C2225x394c0a(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2331x394c88);
        this.f6642x6f02227 = c2331x394c88;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f6642x6f02227.m19271x394ca6();
        java.lang.String action = intent.getAction();
        this.f6642x6f02227.mo18976x394c1e().m19115x394c6b().zzg("NetworkBroadcastReceiver received action", action);
        if (!io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be.equals(action)) {
            this.f6642x6f02227.mo18976x394c1e().m19111x394c67().zzg("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m19117x394bf3 = this.f6642x6f02227.m19270x394ca3().m19117x394bf3();
        if (this.f6641x6f02119 != m19117x394bf3) {
            this.f6641x6f02119 = m19117x394bf3;
            this.f6642x6f02227.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2226x394c0b(this, m19117x394bf3));
        }
    }

    /* renamed from: unregister */
    public final void m19120x31d4943c() {
        this.f6642x6f02227.m19271x394ca6();
        this.f6642x6f02227.mo19164x394b61();
        this.f6642x6f02227.mo19164x394b61();
        if (this.f6640x6f02118) {
            this.f6642x6f02227.mo18976x394c1e().m19115x394c6b().log("Unregistering connectivity change receiver");
            this.f6640x6f02118 = false;
            this.f6641x6f02119 = false;
            try {
                this.f6642x6f02227.mo18960x76847179().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e17) {
                this.f6642x6f02227.mo18976x394c1e().m19108x394c64().zzg("Failed to unregister the network broadcast receiver", e17);
            }
        }
    }

    /* renamed from: zzeu */
    public final void m19121x394bf0() {
        this.f6642x6f02227.m19271x394ca6();
        this.f6642x6f02227.mo19164x394b61();
        if (this.f6640x6f02118) {
            return;
        }
        this.f6642x6f02227.mo18960x76847179().registerReceiver(this, new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be));
        this.f6641x6f02119 = this.f6642x6f02227.m19270x394ca3().m19117x394bf3();
        this.f6642x6f02227.mo18976x394c1e().m19115x394c6b().zzg("Registering connectivity change receiver. Network connected", java.lang.Boolean.valueOf(this.f6641x6f02119));
        this.f6640x6f02118 = true;
    }
}
