package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzen */
/* loaded from: classes16.dex */
public final class RunnableC2197x394be9 implements java.lang.Runnable {

    /* renamed from: zzafk */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2270x394c41 f6505x6f021a6;

    /* renamed from: zzafl */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 f6506x6f021a7;

    public RunnableC2197x394be9(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8 abstractC2196x394be8, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2270x394c41 interfaceC2270x394c41) {
        this.f6506x6f021a7 = abstractC2196x394be8;
        this.f6505x6f021a6 = interfaceC2270x394c41;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6505x6f021a6.mo18975x394c1d();
        if (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.m19155x9e2d0ded()) {
            this.f6505x6f021a6.mo18975x394c1d().zzc(this);
            return;
        }
        boolean m19068x394be1 = this.f6506x6f021a7.m19068x394be1();
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2196x394be8.zza(this.f6506x6f021a7, 0L);
        if (m19068x394be1) {
            this.f6506x6f021a7.run();
        }
    }
}
