package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzgi */
/* loaded from: classes16.dex */
public final class C2244x394c22 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: zzaly */
    private final java.lang.String f6721x6f0226e;

    /* renamed from: zzalz */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 f6722x6f0226f;

    public C2244x394c22(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20 c2242x394c20, java.lang.String str) {
        this.f6722x6f0226f = c2242x394c20;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.f6721x6f0226e = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        this.f6722x6f0226f.mo18976x394c1e().m19108x394c64().zzg(this.f6721x6f0226e, th6);
    }
}
