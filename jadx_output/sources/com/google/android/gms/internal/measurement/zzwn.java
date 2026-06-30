package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public class zzwn {
    private static java.util.HashMap<java.lang.String, java.lang.String> zzbml;
    private static java.lang.Object zzbmq;
    private static boolean zzbmr;
    private static final android.net.Uri CONTENT_URI = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    private static final android.net.Uri zzbmh = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzbmi = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzbmj = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzbmk = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> zzbmm = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> zzbmn = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> zzbmo = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.String, java.lang.Float> zzbmp = new java.util.HashMap<>();
    private static java.lang.String[] zzbms = new java.lang.String[0];

    private static <T> T zza(java.util.HashMap<java.lang.String, T> hashMap, java.lang.String str, T t17) {
        synchronized (com.google.android.gms.internal.measurement.zzwn.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            T t18 = hashMap.get(str);
            if (t18 != null) {
                t17 = t18;
            }
            return t17;
        }
    }

    private static java.lang.Object zzb(android.content.ContentResolver contentResolver) {
        java.lang.Object obj;
        synchronized (com.google.android.gms.internal.measurement.zzwn.class) {
            zza(contentResolver);
            obj = zzbmq;
        }
        return obj;
    }

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.measurement.zzwn.class) {
            zza(contentResolver);
            java.lang.Object obj = zzbmq;
            if (zzbml.containsKey(str)) {
                java.lang.String str3 = zzbml.get(str);
                return str3 != null ? str3 : null;
            }
            for (java.lang.String str4 : zzbms) {
                if (str.startsWith(str4)) {
                    if (!zzbmr || zzbml.isEmpty()) {
                        zzbml.putAll(zza(contentResolver, zzbms));
                        zzbmr = true;
                        if (zzbml.containsKey(str)) {
                            java.lang.String str5 = zzbml.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            android.database.Cursor query = contentResolver.query(CONTENT_URI, null, null, new java.lang.String[]{str}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        java.lang.String string = query.getString(1);
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        zza(obj, str, string);
                        java.lang.String str6 = string != null ? string : null;
                        query.close();
                        return str6;
                    }
                } finally {
                    if (query != null) {
                        query.close();
                    }
                }
            }
            zza(obj, str, (java.lang.String) null);
            return null;
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> zza(android.content.ContentResolver contentResolver, java.lang.String... strArr) {
        android.database.Cursor query = contentResolver.query(zzbmh, null, null, strArr, null);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void zza(android.content.ContentResolver contentResolver) {
        if (zzbml == null) {
            zzbmk.set(false);
            zzbml = new java.util.HashMap<>();
            zzbmq = new java.lang.Object();
            zzbmr = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new com.google.android.gms.internal.measurement.zzwo(null));
            return;
        }
        if (zzbmk.getAndSet(false)) {
            zzbml.clear();
            zzbmm.clear();
            zzbmn.clear();
            zzbmo.clear();
            zzbmp.clear();
            zzbmq = new java.lang.Object();
            zzbmr = false;
        }
    }

    private static void zza(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.measurement.zzwn.class) {
            if (obj == zzbmq) {
                zzbml.put(str, str2);
            }
        }
    }

    public static boolean zza(android.content.ContentResolver contentResolver, java.lang.String str, boolean z17) {
        java.lang.Object zzb = zzb(contentResolver);
        java.util.HashMap<java.lang.String, java.lang.Boolean> hashMap = zzbmm;
        java.lang.Boolean bool = (java.lang.Boolean) zza(hashMap, str, java.lang.Boolean.valueOf(z17));
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String zza = zza(contentResolver, str, (java.lang.String) null);
        if (zza != null && !zza.equals("")) {
            if (zzbmi.matcher(zza).matches()) {
                bool = java.lang.Boolean.TRUE;
                z17 = true;
            } else if (zzbmj.matcher(zza).matches()) {
                bool = java.lang.Boolean.FALSE;
                z17 = false;
            }
        }
        synchronized (com.google.android.gms.internal.measurement.zzwn.class) {
            if (zzb == zzbmq) {
                hashMap.put(str, bool);
                zzbml.remove(str);
            }
        }
        return z17;
    }
}
