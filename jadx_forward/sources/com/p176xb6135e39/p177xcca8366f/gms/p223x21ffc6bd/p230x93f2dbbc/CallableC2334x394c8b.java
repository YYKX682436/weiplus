package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzju */
/* loaded from: classes16.dex */
public final class CallableC2334x394c8b implements java.util.concurrent.Callable<java.lang.String> {

    /* renamed from: zzane */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 f7013x6f02298;

    /* renamed from: zzaqu */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 f7014x6f02305;

    public CallableC2334x394c8b(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2183x394bd6 c2183x394bd6) {
        this.f7014x6f02305 = c2331x394c88;
        this.f7013x6f02298 = c2183x394bd6;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.String call() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2182x394bd5 zzg = this.f7014x6f02305.mo19176x394c20().m19031x394b79(this.f7013x6f02298.f6455x362a8ff1) ? this.f7014x6f02305.zzg(this.f7013x6f02298) : this.f7014x6f02305.m19269x394c6f().m19053x394b81(this.f7013x6f02298.f6455x362a8ff1);
        if (zzg != null) {
            return zzg.m18979x4b6169db();
        }
        this.f7014x6f02305.mo18976x394c1e().m19111x394c67().log("App info was null when attempting to get app instance id");
        return null;
    }
}
