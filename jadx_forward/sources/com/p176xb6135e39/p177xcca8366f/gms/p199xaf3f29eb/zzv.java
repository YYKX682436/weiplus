package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* loaded from: classes13.dex */
final class zzv extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx {
    private final java.util.concurrent.Callable zze;

    public /* synthetic */ zzv(java.util.concurrent.Callable callable, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzu zzuVar) {
        super();
        this.zze = callable;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zzx
    public final java.lang.String zza() {
        try {
            return (java.lang.String) this.zze.call();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
