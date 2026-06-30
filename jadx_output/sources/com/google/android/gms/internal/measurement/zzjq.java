package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class zzjq extends com.google.android.gms.internal.measurement.zzjp {
    private boolean zzvo;

    public zzjq(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        super(zzjrVar);
        this.zzajp.zzb(this);
    }

    public final boolean isInitialized() {
        return this.zzvo;
    }

    public final void zzch() {
        if (!isInitialized()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public abstract boolean zzhf();

    public final void zzm() {
        if (this.zzvo) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzhf();
        this.zzajp.zzkz();
        this.zzvo = true;
    }
}
