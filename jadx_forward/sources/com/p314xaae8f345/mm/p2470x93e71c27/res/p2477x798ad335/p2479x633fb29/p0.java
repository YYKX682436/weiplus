package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes12.dex */
public class p0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f271229e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0.U1, "ResDownloaderRecordTable")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f271230f = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + kk.k.g(java.lang.String.format(java.util.Locale.ENGLISH, "mm%d", Integer.MIN_VALUE).getBytes()) + "/";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f271231g;

    /* renamed from: d, reason: collision with root package name */
    public final d95.b0 f271232d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f271231g = hashMap;
        hashMap.put(-1009758133, new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o0());
        java.util.Iterator it = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.a().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o) it.next()).getClass();
        }
    }

    public p0(d95.b0 b0Var) {
        super(b0Var, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0.U1, "ResDownloaderRecordTable", null);
        new java.util.HashMap();
        this.f271232d = b0Var;
        java.util.Iterator it = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m0.a().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.o) it.next()).getClass();
        }
    }

    public final java.util.List D0(java.lang.String str) {
        try {
            android.database.Cursor E = this.f271232d.E("ResDownloaderRecordTable", null, java.lang.String.format(java.util.Locale.ENGLISH, "%s like ?", "urlKey"), new java.lang.String[]{str}, null, null, null);
            if (E != null) {
                try {
                    if (!E.isClosed() && E.moveToFirst()) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        do {
                            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0();
                            n0Var.mo9015xbf5d97fd(E);
                            linkedList.add(n0Var);
                        } while (E.moveToNext());
                        E.close();
                        return linkedList;
                    }
                } finally {
                }
            }
            java.util.List emptyList = java.util.Collections.emptyList();
            if (E != null) {
                E.close();
            }
            return emptyList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderStorage", "queryForKeyLike with clause(%s), get exception:%s", str, e17);
            return java.util.Collections.emptyList();
        }
    }

    public final boolean J0(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f68798x13f2e555)) {
            return false;
        }
        n0Var.f68799x1922b3a5 = n0Var.f68798x13f2e555.hashCode();
        try {
            return super.mo9952xce0038c9(n0Var, "urlKey_hashcode");
        } catch (android.database.sqlite.SQLiteException | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = n0Var.f68798x13f2e555;
            d95.b0 b0Var = this.f271232d;
            objArr[1] = java.lang.Boolean.valueOf(b0Var == null || !b0Var.mo123783xb9a70294());
            objArr[2] = java.lang.Boolean.valueOf(new java.io.File(f271230f + "EnResDown.db").exists());
            objArr[3] = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderStorage", "update with urlKey[%s], db.isClose[%b], dbFile.exists[%b], e=%s", objArr);
            return false;
        }
    }

    public final boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderStorage", "delete with null or nil urlKey, return false");
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0();
        n0Var.f68799x1922b3a5 = str.hashCode();
        return super.mo9951xb06685ab(n0Var, "urlKey_hashcode");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var.f68798x13f2e555)) {
            return false;
        }
        n0Var.f68799x1922b3a5 = n0Var.f68798x13f2e555.hashCode();
        try {
            return super.mo880xb970c2b9(n0Var);
        } catch (android.database.sqlite.SQLiteException | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = n0Var.f68798x13f2e555;
            d95.b0 b0Var = this.f271232d;
            objArr[1] = java.lang.Boolean.valueOf(b0Var == null || !b0Var.mo123783xb9a70294());
            objArr[2] = java.lang.Boolean.valueOf(new java.io.File(f271230f + "EnResDown.db").exists());
            objArr[3] = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderStorage", "insert with urlKey[%s], db.isClose[%b], dbFile.exists[%b], e=%s", objArr);
            return false;
        }
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderStorage", "query with null or nil urlKey, return null");
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 n0Var = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0();
        n0Var.f68799x1922b3a5 = str.hashCode();
        try {
            if (super.get(n0Var, "urlKey_hashcode")) {
                return n0Var;
            }
            return null;
        } catch (android.database.sqlite.SQLiteException | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            d95.b0 b0Var = this.f271232d;
            objArr[1] = java.lang.Boolean.valueOf(b0Var == null || !b0Var.mo123783xb9a70294());
            objArr[2] = java.lang.Boolean.valueOf(new java.io.File(f271230f + "EnResDown.db").exists());
            objArr[3] = e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResDownloaderStorage", "query with urlKey[%s], db.isClose[%s], dbFile.exists[%b], e=%s", objArr);
            return null;
        }
    }
}
