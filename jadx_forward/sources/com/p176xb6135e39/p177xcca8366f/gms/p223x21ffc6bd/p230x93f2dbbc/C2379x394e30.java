package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzxh */
/* loaded from: classes13.dex */
final class C2379x394e30 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2376x394e2d {

    /* renamed from: zzbod */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2377x394e2e f7203x6f02677 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2377x394e2e();

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2376x394e2d
    public final void zza(java.lang.Throwable th6, java.io.PrintStream printStream) {
        th6.printStackTrace(printStream);
        java.util.List<java.lang.Throwable> zza = this.f7203x6f02677.zza(th6, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (java.lang.Throwable th7 : zza) {
                printStream.print("Suppressed: ");
                th7.printStackTrace(printStream);
            }
        }
    }
}
