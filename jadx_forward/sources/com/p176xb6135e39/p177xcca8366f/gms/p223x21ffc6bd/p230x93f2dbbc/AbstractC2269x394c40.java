package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzhh */
/* loaded from: classes16.dex */
public abstract class AbstractC2269x394c40 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2268x394c3f {

    /* renamed from: zzvo */
    private boolean f6816x394df9;

    public AbstractC2269x394c40(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        super(c2247x394c25);
        this.f6815x6f02155.zzb(this);
    }

    /* renamed from: isInitialized */
    public final boolean m19185xf582434a() {
        return this.f6816x394df9;
    }

    /* renamed from: zzch */
    public final void m19186x394ba5() {
        if (!m19185xf582434a()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    /* renamed from: zzhf */
    public abstract boolean mo19069x394c3e();

    /* renamed from: zzih */
    public void mo19093x394c5f() {
    }

    /* renamed from: zzjw */
    public final void m19187x394c8d() {
        if (this.f6816x394df9) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        mo19093x394c5f();
        this.f6815x6f02155.m19183x394c8b();
        this.f6816x394df9 = true;
    }

    public final void zzm() {
        if (this.f6816x394df9) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (mo19069x394c3e()) {
            return;
        }
        this.f6815x6f02155.m19183x394c8b();
        this.f6816x394df9 = true;
    }
}
