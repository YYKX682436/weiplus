package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzwn */
/* loaded from: classes13.dex */
public class C2359x394e17 {

    /* renamed from: zzbml */
    private static java.util.HashMap<java.lang.String, java.lang.String> f7157x6f02641;

    /* renamed from: zzbmq */
    private static java.lang.Object f7162x6f02646;

    /* renamed from: zzbmr */
    private static boolean f7163x6f02647;

    /* renamed from: CONTENT_URI */
    private static final android.net.Uri f7152x69356466 = android.net.Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: zzbmh */
    private static final android.net.Uri f7153x6f0263d = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: zzbmi */
    public static final java.util.regex.Pattern f7154x6f0263e = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: zzbmj */
    public static final java.util.regex.Pattern f7155x6f0263f = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: zzbmk */
    private static final java.util.concurrent.atomic.AtomicBoolean f7156x6f02640 = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: zzbmm */
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> f7158x6f02642 = new java.util.HashMap<>();

    /* renamed from: zzbmn */
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> f7159x6f02643 = new java.util.HashMap<>();

    /* renamed from: zzbmo */
    private static final java.util.HashMap<java.lang.String, java.lang.Long> f7160x6f02644 = new java.util.HashMap<>();

    /* renamed from: zzbmp */
    private static final java.util.HashMap<java.lang.String, java.lang.Float> f7161x6f02645 = new java.util.HashMap<>();

    /* renamed from: zzbms */
    private static java.lang.String[] f7164x6f02648 = new java.lang.String[0];

    private static <T> T zza(java.util.HashMap<java.lang.String, T> hashMap, java.lang.String str, T t17) {
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.class) {
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
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.class) {
            zza(contentResolver);
            obj = f7162x6f02646;
        }
        return obj;
    }

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.class) {
            zza(contentResolver);
            java.lang.Object obj = f7162x6f02646;
            if (f7157x6f02641.containsKey(str)) {
                java.lang.String str3 = f7157x6f02641.get(str);
                return str3 != null ? str3 : null;
            }
            for (java.lang.String str4 : f7164x6f02648) {
                if (str.startsWith(str4)) {
                    if (!f7163x6f02647 || f7157x6f02641.isEmpty()) {
                        f7157x6f02641.putAll(zza(contentResolver, f7164x6f02648));
                        f7163x6f02647 = true;
                        if (f7157x6f02641.containsKey(str)) {
                            java.lang.String str5 = f7157x6f02641.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            android.database.Cursor query = contentResolver.query(f7152x69356466, null, null, new java.lang.String[]{str}, null);
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
        android.database.Cursor query = contentResolver.query(f7153x6f0263d, null, null, strArr, null);
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
        if (f7157x6f02641 == null) {
            f7156x6f02640.set(false);
            f7157x6f02641 = new java.util.HashMap<>();
            f7162x6f02646 = new java.lang.Object();
            f7163x6f02647 = false;
            contentResolver.registerContentObserver(f7152x69356466, true, new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2360x394e18(null));
            return;
        }
        if (f7156x6f02640.getAndSet(false)) {
            f7157x6f02641.clear();
            f7158x6f02642.clear();
            f7159x6f02643.clear();
            f7160x6f02644.clear();
            f7161x6f02645.clear();
            f7162x6f02646 = new java.lang.Object();
            f7163x6f02647 = false;
        }
    }

    private static void zza(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.class) {
            if (obj == f7162x6f02646) {
                f7157x6f02641.put(str, str2);
            }
        }
    }

    public static boolean zza(android.content.ContentResolver contentResolver, java.lang.String str, boolean z17) {
        java.lang.Object zzb = zzb(contentResolver);
        java.util.HashMap<java.lang.String, java.lang.Boolean> hashMap = f7158x6f02642;
        java.lang.Boolean bool = (java.lang.Boolean) zza(hashMap, str, java.lang.Boolean.valueOf(z17));
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String zza = zza(contentResolver, str, (java.lang.String) null);
        if (zza != null && !zza.equals("")) {
            if (f7154x6f0263e.matcher(zza).matches()) {
                bool = java.lang.Boolean.TRUE;
                z17 = true;
            } else if (f7155x6f0263f.matcher(zza).matches()) {
                bool = java.lang.Boolean.FALSE;
                z17 = false;
            }
        }
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2359x394e17.class) {
            if (zzb == f7162x6f02646) {
                hashMap.put(str, bool);
                f7157x6f02641.remove(str);
            }
        }
        return z17;
    }
}
