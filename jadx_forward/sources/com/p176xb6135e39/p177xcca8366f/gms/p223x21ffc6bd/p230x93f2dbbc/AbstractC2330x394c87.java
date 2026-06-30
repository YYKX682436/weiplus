package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzjq */
/* loaded from: classes16.dex */
public abstract class AbstractC2330x394c87 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2329x394c86 {

    /* renamed from: zzvo */
    private boolean f6988x394df9;

    public AbstractC2330x394c87(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2331x394c88 c2331x394c88) {
        super(c2331x394c88);
        this.f6987x6f02227.zzb(this);
    }

    /* renamed from: isInitialized */
    public final boolean m19256xf582434a() {
        return this.f6988x394df9;
    }

    /* renamed from: zzch */
    public final void m19257x394ba5() {
        if (!m19256xf582434a()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    /* renamed from: zzhf */
    public abstract boolean mo19018x394c3e();

    public final void zzm() {
        if (this.f6988x394df9) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        mo19018x394c3e();
        this.f6987x6f02227.m19274x394caf();
        this.f6988x394df9 = true;
    }
}
