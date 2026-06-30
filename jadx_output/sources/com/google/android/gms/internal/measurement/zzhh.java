package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class zzhh extends com.google.android.gms.internal.measurement.zzhg {
    private boolean zzvo;

    public zzhh(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzacw.zzb(this);
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

    public void zzih() {
    }

    public final void zzjw() {
        if (this.zzvo) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzih();
        this.zzacw.zzju();
        this.zzvo = true;
    }

    public final void zzm() {
        if (this.zzvo) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (zzhf()) {
            return;
        }
        this.zzacw.zzju();
        this.zzvo = true;
    }
}
