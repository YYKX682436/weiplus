package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb = false;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, java.lang.Object obj) {
        this.zzd = baseGmsClient;
        this.zza = obj;
    }

    public abstract void zza(java.lang.Object obj);

    public abstract void zzc();

    public final void zze() {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                toString();
            }
        }
        if (obj != null) {
            zza(obj);
        }
        synchronized (this) {
            this.zzb = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzg() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        zzf();
        arrayList = this.zzd.zzt;
        synchronized (arrayList) {
            arrayList2 = this.zzd.zzt;
            arrayList2.remove(this);
        }
    }
}
