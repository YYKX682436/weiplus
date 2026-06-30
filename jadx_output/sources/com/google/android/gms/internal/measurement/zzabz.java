package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzabz<M extends com.google.android.gms.internal.measurement.zzaby<M>, T> {
    public final int tag;
    private final int type;
    protected final java.lang.Class<T> zzbwx;
    protected final boolean zzbwy;
    private final com.google.android.gms.internal.measurement.zzzq<?, ?> zzbwz;

    private zzabz(int i17, java.lang.Class<T> cls, int i18, boolean z17) {
        this(11, cls, null, 810, false);
    }

    public static <M extends com.google.android.gms.internal.measurement.zzaby<M>, T extends com.google.android.gms.internal.measurement.zzace> com.google.android.gms.internal.measurement.zzabz<M, T> zza(int i17, java.lang.Class<T> cls, long j17) {
        return new com.google.android.gms.internal.measurement.zzabz<>(11, cls, 810, false);
    }

    private final java.lang.Object zzf(com.google.android.gms.internal.measurement.zzabv zzabvVar) {
        java.lang.Class componentType = this.zzbwy ? this.zzbwx.getComponentType() : this.zzbwx;
        try {
            int i17 = this.type;
            if (i17 == 10) {
                com.google.android.gms.internal.measurement.zzace zzaceVar = (com.google.android.gms.internal.measurement.zzace) componentType.newInstance();
                zzabvVar.zza(zzaceVar, this.tag >>> 3);
                return zzaceVar;
            }
            if (i17 == 11) {
                com.google.android.gms.internal.measurement.zzace zzaceVar2 = (com.google.android.gms.internal.measurement.zzace) componentType.newInstance();
                zzabvVar.zza(zzaceVar2);
                return zzaceVar2;
            }
            int i18 = this.type;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
            sb6.append("Unknown type ");
            sb6.append(i18);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalArgumentException("Error reading extension field", e17);
        } catch (java.lang.IllegalAccessException e18) {
            java.lang.String valueOf = java.lang.String.valueOf(componentType);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf.length() + 33);
            sb7.append("Error creating instance of class ");
            sb7.append(valueOf);
            throw new java.lang.IllegalArgumentException(sb7.toString(), e18);
        } catch (java.lang.InstantiationException e19) {
            java.lang.String valueOf2 = java.lang.String.valueOf(componentType);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(valueOf2.length() + 33);
            sb8.append("Error creating instance of class ");
            sb8.append(valueOf2);
            throw new java.lang.IllegalArgumentException(sb8.toString(), e19);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzabz)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzabz zzabzVar = (com.google.android.gms.internal.measurement.zzabz) obj;
        return this.type == zzabzVar.type && this.zzbwx == zzabzVar.zzbwx && this.tag == zzabzVar.tag && this.zzbwy == zzabzVar.zzbwy;
    }

    public final int hashCode() {
        return ((((((this.type + 1147) * 31) + this.zzbwx.hashCode()) * 31) + this.tag) * 31) + (this.zzbwy ? 1 : 0);
    }

    public final T zzi(java.util.List<com.google.android.gms.internal.measurement.zzacg> list) {
        if (list == null) {
            return null;
        }
        if (!this.zzbwy) {
            if (list.isEmpty()) {
                return null;
            }
            return this.zzbwx.cast(zzf(com.google.android.gms.internal.measurement.zzabv.zzi(list.get(list.size() - 1).zzbrc)));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            byte[] bArr = list.get(i17).zzbrc;
            if (bArr.length != 0) {
                arrayList.add(zzf(com.google.android.gms.internal.measurement.zzabv.zzi(bArr)));
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        java.lang.Class<T> cls = this.zzbwx;
        T cast = cls.cast(java.lang.reflect.Array.newInstance(cls.getComponentType(), size));
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.reflect.Array.set(cast, i18, arrayList.get(i18));
        }
        return cast;
    }

    public final int zzv(java.lang.Object obj) {
        int i17 = this.tag >>> 3;
        int i18 = this.type;
        if (i18 == 10) {
            return (com.google.android.gms.internal.measurement.zzabw.zzaq(i17) << 1) + ((com.google.android.gms.internal.measurement.zzace) obj).zzvm();
        }
        if (i18 == 11) {
            return com.google.android.gms.internal.measurement.zzabw.zzb(i17, (com.google.android.gms.internal.measurement.zzace) obj);
        }
        int i19 = this.type;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
        sb6.append("Unknown type ");
        sb6.append(i19);
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    private zzabz(int i17, java.lang.Class<T> cls, com.google.android.gms.internal.measurement.zzzq<?, ?> zzzqVar, int i18, boolean z17) {
        this.type = i17;
        this.zzbwx = cls;
        this.tag = i18;
        this.zzbwy = false;
        this.zzbwz = null;
    }

    public final void zza(java.lang.Object obj, com.google.android.gms.internal.measurement.zzabw zzabwVar) {
        try {
            zzabwVar.zzar(this.tag);
            int i17 = this.type;
            if (i17 == 10) {
                int i18 = this.tag >>> 3;
                ((com.google.android.gms.internal.measurement.zzace) obj).zza(zzabwVar);
                zzabwVar.zzg(i18, 4);
            } else {
                if (i17 == 11) {
                    zzabwVar.zzb((com.google.android.gms.internal.measurement.zzace) obj);
                    return;
                }
                int i19 = this.type;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(24);
                sb6.append("Unknown type ");
                sb6.append(i19);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }
}
