package com.google.android.gms.wearable.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzer<T> {
    private final java.util.Map<T, com.google.android.gms.wearable.internal.zzhk<T>> zzeb = new java.util.HashMap();

    public final void zza(android.os.IBinder iBinder) {
        com.google.android.gms.wearable.internal.zzep zzeqVar;
        synchronized (this.zzeb) {
            if (iBinder == null) {
                zzeqVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                zzeqVar = queryLocalInterface instanceof com.google.android.gms.wearable.internal.zzep ? (com.google.android.gms.wearable.internal.zzep) queryLocalInterface : new com.google.android.gms.wearable.internal.zzeq(iBinder);
            }
            com.google.android.gms.wearable.internal.zzgz zzgzVar = new com.google.android.gms.wearable.internal.zzgz();
            for (java.util.Map.Entry<T, com.google.android.gms.wearable.internal.zzhk<T>> entry : this.zzeb.entrySet()) {
                com.google.android.gms.wearable.internal.zzhk<T> value = entry.getValue();
                try {
                    zzeqVar.zza(zzgzVar, new com.google.android.gms.wearable.internal.zzd(value));
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(entry.getKey()).length() + 27 + java.lang.String.valueOf(value).length());
                    }
                } catch (android.os.RemoteException unused) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(entry.getKey()).length() + 32 + java.lang.String.valueOf(value).length());
                }
            }
        }
    }

    public final void zza(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, T t17) {
        synchronized (this.zzeb) {
            com.google.android.gms.wearable.internal.zzhk<T> remove = this.zzeb.remove(t17);
            if (remove == null) {
                if (android.util.Log.isLoggable("WearableClient", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 25);
                }
                resultHolder.setResult(new com.google.android.gms.common.api.Status(4002));
            } else {
                remove.clear();
                if (android.util.Log.isLoggable("WearableClient", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 24);
                }
                ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzet(this.zzeb, t17, resultHolder), new com.google.android.gms.wearable.internal.zzfw(remove));
            }
        }
    }

    public final void zza(com.google.android.gms.wearable.internal.zzhg zzhgVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, T t17, com.google.android.gms.wearable.internal.zzhk<T> zzhkVar) {
        synchronized (this.zzeb) {
            if (this.zzeb.get(t17) != null) {
                if (android.util.Log.isLoggable("WearableClient", 2)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 20);
                }
                resultHolder.setResult(new com.google.android.gms.common.api.Status(4001));
                return;
            }
            if (android.util.Log.isLoggable("WearableClient", 2)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 14);
            }
            this.zzeb.put(t17, zzhkVar);
            try {
                ((com.google.android.gms.wearable.internal.zzep) zzhgVar.getService()).zza(new com.google.android.gms.wearable.internal.zzes(this.zzeb, t17, resultHolder), new com.google.android.gms.wearable.internal.zzd(zzhkVar));
            } catch (android.os.RemoteException e17) {
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(t17).length() + 39);
                }
                this.zzeb.remove(t17);
                throw e17;
            }
        }
    }
}
