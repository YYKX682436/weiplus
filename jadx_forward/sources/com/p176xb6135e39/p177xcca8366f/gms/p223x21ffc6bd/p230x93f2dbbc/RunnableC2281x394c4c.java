package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzht */
/* loaded from: classes16.dex */
public final class RunnableC2281x394c4c implements java.lang.Runnable {

    /* renamed from: zzanh */
    private final /* synthetic */ java.lang.String f6843x6f0229b;

    /* renamed from: zzani */
    private final /* synthetic */ java.lang.String f6844x6f0229c;

    /* renamed from: zzanj */
    private final /* synthetic */ java.lang.String f6845x6f0229d;

    /* renamed from: zzanv */
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReference f6846x6f022a9;

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6847x6f022aa;

    public RunnableC2281x394c4c(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f6847x6f022aa = c2272x394c43;
        this.f6846x6f022a9 = atomicReference;
        this.f6845x6f0229d = str;
        this.f6843x6f0229b = str2;
        this.f6844x6f0229c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6847x6f022aa.f6815x6f02155.m19169x394c12().zza(this.f6846x6f022a9, this.f6845x6f0229d, this.f6843x6f0229b, this.f6844x6f0229c);
    }
}
