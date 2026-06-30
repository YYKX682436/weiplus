package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzwp */
/* loaded from: classes15.dex */
public final class C2361x394e19 {

    /* renamed from: zzbmt */
    private static final java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19> f7165x6f02649 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: zzbna */
    private static final java.lang.String[] f7166x6f02655 = {"key", "value"};
    private final android.net.Uri uri;

    /* renamed from: zzbmu */
    private final android.content.ContentResolver f7167x6f0264a;

    /* renamed from: zzbmx */
    private volatile java.util.Map<java.lang.String, java.lang.String> f7170x6f0264d;

    /* renamed from: zzbmw */
    private final java.lang.Object f7169x6f0264c = new java.lang.Object();

    /* renamed from: zzbmy */
    private final java.lang.Object f7171x6f0264e = new java.lang.Object();

    /* renamed from: zzbmz */
    private final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2363x394e1b> f7172x6f0264f = new java.util.ArrayList();

    /* renamed from: zzbmv */
    private final android.database.ContentObserver f7168x6f0264b = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2362x394e1a(this, null);

    private C2361x394e19(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.f7167x6f0264a = contentResolver;
        this.uri = uri;
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19 zza(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        java.util.concurrent.ConcurrentHashMap<android.net.Uri, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19> concurrentHashMap = f7165x6f02649;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19 c2361x394e19 = concurrentHashMap.get(uri);
        if (c2361x394e19 != null) {
            return c2361x394e19;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19 c2361x394e192 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19(contentResolver, uri);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2361x394e19 putIfAbsent = concurrentHashMap.putIfAbsent(uri, c2361x394e192);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        c2361x394e192.f7167x6f0264a.registerContentObserver(c2361x394e192.uri, false, c2361x394e192.f7168x6f0264b);
        return c2361x394e192;
    }

    /* renamed from: zzrv */
    private final java.util.Map<java.lang.String, java.lang.String> m19345x394d84() {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            android.database.Cursor query = this.f7167x6f0264a.query(this.uri, f7166x6f02655, null, null, null);
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
    /* renamed from: zzrw */
    public final void m19346x394d85() {
        synchronized (this.f7171x6f0264e) {
            java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2363x394e1b> it = this.f7172x6f0264f.iterator();
            while (it.hasNext()) {
                it.next().m19349x394d86();
            }
        }
    }

    /* renamed from: zzrt */
    public final java.util.Map<java.lang.String, java.lang.String> m19347x394d82() {
        java.util.Map<java.lang.String, java.lang.String> m19345x394d84 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c.zzd("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m19345x394d84() : this.f7170x6f0264d;
        if (m19345x394d84 == null) {
            synchronized (this.f7169x6f0264c) {
                m19345x394d84 = this.f7170x6f0264d;
                if (m19345x394d84 == null) {
                    m19345x394d84 = m19345x394d84();
                    this.f7170x6f0264d = m19345x394d84;
                }
            }
        }
        return m19345x394d84 != null ? m19345x394d84 : java.util.Collections.emptyMap();
    }

    /* renamed from: zzru */
    public final void m19348x394d83() {
        synchronized (this.f7169x6f0264c) {
            this.f7170x6f0264d = null;
        }
    }
}
