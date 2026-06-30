package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzin */
/* loaded from: classes16.dex */
public final class RunnableC2301x394c65 implements java.lang.Runnable {

    /* renamed from: zzaow */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6910x6f022c9;

    /* renamed from: zzape */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 f6911x6f022d6;

    public RunnableC2301x394c65(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2296x394c60 c2296x394c60, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c) {
        this.f6911x6f022d6 = c2296x394c60;
        this.f6910x6f022c9 = c2292x394c5c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2208x394bf4 interfaceC2208x394bf4;
        long j17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String packageName;
        interfaceC2208x394bf4 = this.f6911x6f022d6.f6896x6f022cb;
        if (interfaceC2208x394bf4 == null) {
            this.f6911x6f022d6.mo18976x394c1e().m19108x394c64().log("Failed to send current screen to service");
            return;
        }
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c = this.f6910x6f022c9;
            if (c2292x394c5c == null) {
                j17 = 0;
                str = null;
                str2 = null;
                packageName = this.f6911x6f022d6.mo18960x76847179().getPackageName();
            } else {
                j17 = c2292x394c5c.f6879x6f022bc;
                str = c2292x394c5c.f6881x394dd7;
                str2 = c2292x394c5c.f6878x6f022bb;
                packageName = this.f6911x6f022d6.mo18960x76847179().getPackageName();
            }
            interfaceC2208x394bf4.zza(j17, str, str2, packageName);
            this.f6911x6f022d6.m19225x394bb2();
        } catch (android.os.RemoteException e17) {
            this.f6911x6f022d6.mo18976x394c1e().m19108x394c64().zzg("Failed to send current screen to the service", e17);
        }
    }
}
