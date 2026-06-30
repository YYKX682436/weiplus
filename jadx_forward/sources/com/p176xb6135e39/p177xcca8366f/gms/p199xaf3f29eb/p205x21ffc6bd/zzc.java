package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb = false;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 zzd;

    public zzc(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687 abstractC1900x418ca687, java.lang.Object obj) {
        this.zzd = abstractC1900x418ca687;
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
