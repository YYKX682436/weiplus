package com.google.android.gms.common;

/* loaded from: classes13.dex */
final class zzv extends com.google.android.gms.common.zzx {
    private final java.util.concurrent.Callable zze;

    public /* synthetic */ zzv(java.util.concurrent.Callable callable, com.google.android.gms.common.zzu zzuVar) {
        super();
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzx
    public final java.lang.String zza() {
        try {
            return (java.lang.String) this.zze.call();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
