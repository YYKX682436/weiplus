package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public class zzzy {
    private static final com.google.android.gms.internal.measurement.zzzi zzbsw = com.google.android.gms.internal.measurement.zzzi.zzte();
    private com.google.android.gms.internal.measurement.zzyw zzbsx;
    private volatile com.google.android.gms.internal.measurement.zzaal zzbsy;
    private volatile com.google.android.gms.internal.measurement.zzyw zzbsz;

    private final com.google.android.gms.internal.measurement.zzaal zzb(com.google.android.gms.internal.measurement.zzaal zzaalVar) {
        if (this.zzbsy == null) {
            synchronized (this) {
                if (this.zzbsy == null) {
                    try {
                        this.zzbsy = zzaalVar;
                        this.zzbsz = com.google.android.gms.internal.measurement.zzyw.zzbqx;
                    } catch (com.google.android.gms.internal.measurement.zzzt unused) {
                        this.zzbsy = zzaalVar;
                        this.zzbsz = com.google.android.gms.internal.measurement.zzyw.zzbqx;
                    }
                }
            }
        }
        return this.zzbsy;
    }

    private final com.google.android.gms.internal.measurement.zzyw zztp() {
        if (this.zzbsz != null) {
            return this.zzbsz;
        }
        synchronized (this) {
            if (this.zzbsz != null) {
                return this.zzbsz;
            }
            this.zzbsz = this.zzbsy == null ? com.google.android.gms.internal.measurement.zzyw.zzbqx : this.zzbsy.zztp();
            return this.zzbsz;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzzy)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzzy zzzyVar = (com.google.android.gms.internal.measurement.zzzy) obj;
        com.google.android.gms.internal.measurement.zzaal zzaalVar = this.zzbsy;
        com.google.android.gms.internal.measurement.zzaal zzaalVar2 = zzzyVar.zzbsy;
        return (zzaalVar == null && zzaalVar2 == null) ? zztp().equals(zzzyVar.zztp()) : (zzaalVar == null || zzaalVar2 == null) ? zzaalVar != null ? zzaalVar.equals(zzzyVar.zzb(zzaalVar.zztz())) : zzb(zzaalVar2.zztz()).equals(zzaalVar2) : zzaalVar.equals(zzaalVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final com.google.android.gms.internal.measurement.zzaal zzc(com.google.android.gms.internal.measurement.zzaal zzaalVar) {
        com.google.android.gms.internal.measurement.zzaal zzaalVar2 = this.zzbsy;
        this.zzbsx = null;
        this.zzbsz = null;
        this.zzbsy = zzaalVar;
        return zzaalVar2;
    }
}
