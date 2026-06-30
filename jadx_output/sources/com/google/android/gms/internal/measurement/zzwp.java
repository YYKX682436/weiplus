package com.google.android.gms.internal.measurement;

/* loaded from: classes15.dex */
public final class zzwp {
    private static final java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.google.android.gms.internal.measurement.zzwp> zzbmt = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.lang.String[] zzbna = {"key", "value"};
    private final android.net.Uri uri;
    private final android.content.ContentResolver zzbmu;
    private volatile java.util.Map<java.lang.String, java.lang.String> zzbmx;
    private final java.lang.Object zzbmw = new java.lang.Object();
    private final java.lang.Object zzbmy = new java.lang.Object();
    private final java.util.List<com.google.android.gms.internal.measurement.zzwr> zzbmz = new java.util.ArrayList();
    private final android.database.ContentObserver zzbmv = new com.google.android.gms.internal.measurement.zzwq(this, null);

    private zzwp(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.zzbmu = contentResolver;
        this.uri = uri;
    }

    public static com.google.android.gms.internal.measurement.zzwp zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.google.android.gms.internal.measurement.zzwp> concurrentHashMap = zzbmt;
        com.google.android.gms.internal.measurement.zzwp zzwpVar = concurrentHashMap.get(uri);
        if (zzwpVar != null) {
            return zzwpVar;
        }
        com.google.android.gms.internal.measurement.zzwp zzwpVar2 = new com.google.android.gms.internal.measurement.zzwp(contentResolver, uri);
        com.google.android.gms.internal.measurement.zzwp putIfAbsent = concurrentHashMap.putIfAbsent(uri, zzwpVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        zzwpVar2.zzbmu.registerContentObserver(zzwpVar2.uri, false, zzwpVar2.zzbmv);
        return zzwpVar2;
    }

    private final java.util.Map<java.lang.String, java.lang.String> zzrv() {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            android.database.Cursor query = this.zzbmu.query(this.uri, zzbna, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        hashMap.put(query.getString(0), query.getString(1));
                    } catch (java.lang.Throwable th6) {
                        query.close();
                        throw th6;
                    }
                }
                query.close();
            }
            return hashMap;
        } catch (android.database.sqlite.SQLiteException | java.lang.SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzrw() {
        synchronized (this.zzbmy) {
            java.util.Iterator<com.google.android.gms.internal.measurement.zzwr> it = this.zzbmz.iterator();
            while (it.hasNext()) {
                it.next().zzrx();
            }
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> zzrt() {
        java.util.Map<java.lang.String, java.lang.String> zzrv = com.google.android.gms.internal.measurement.zzws.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? zzrv() : this.zzbmx;
        if (zzrv == null) {
            synchronized (this.zzbmw) {
                zzrv = this.zzbmx;
                if (zzrv == null) {
                    zzrv = zzrv();
                    this.zzbmx = zzrv;
                }
            }
        }
        return zzrv != null ? zzrv : java.util.Collections.emptyMap();
    }

    public final void zzru() {
        synchronized (this.zzbmw) {
            this.zzbmx = null;
        }
    }
}
