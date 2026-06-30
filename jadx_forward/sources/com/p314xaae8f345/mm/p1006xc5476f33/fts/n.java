package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes8.dex */
public class n implements t13.g {

    /* renamed from: k, reason: collision with root package name */
    public static int f219299k = 32;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f219300a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f219301b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f219302c = true;

    /* renamed from: d, reason: collision with root package name */
    public int f219303d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219304e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] f219305f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[2];

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f219306g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f219307h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219308i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f219309j;

    public n() {
        this.f219306g = null;
        this.f219307h = null;
        this.f219308i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSImageLoader", "create SearchImageLoader");
        if (fp.h.c(19)) {
            f219299k = 64;
        } else {
            f219299k = 32;
        }
        this.f219300a = new java.util.concurrent.ConcurrentHashMap();
        this.f219301b = new java.util.Vector();
        this.f219306g = new java.util.concurrent.ConcurrentHashMap();
        this.f219307h = new java.util.concurrent.ConcurrentHashMap();
        this.f219309j = java.util.Collections.synchronizedSet(new java.util.HashSet());
        for (int i17 = 0; i17 < 2; i17++) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3[] n3VarArr = this.f219305f;
            if (n3VarArr[i17] == null) {
                n3VarArr[i17] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("SearchImageLoader_loadImage_handler");
            }
        }
        this.f219308i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("SearchImageLoader_saveImage_handler");
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.fts.n nVar, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f219300a;
        if (concurrentHashMap.size() > f219299k) {
            nVar.f((java.lang.String) nVar.f219301b.lastElement());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.j(nVar);
        jVar.f218953a = str2;
        jVar.f218954b = bitmap;
        concurrentHashMap.put(str, jVar);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(jVar.f218953a);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        nVar.f219308i.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.fts.m(nVar, jVar), 200L);
    }

    public void b() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f219300a;
        concurrentHashMap.size();
        h();
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            f((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        this.f219301b.clear();
        this.f219309j.clear();
    }

    public void c() {
        b();
        for (int i17 = 0; i17 < 2; i17++) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f219305f[i17];
            if (n3Var != null) {
                n3Var.mo50299x35224f();
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f219306g;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            try {
                ((java.io.ByteArrayOutputStream) it.next()).close();
            } catch (java.io.IOException unused) {
            }
        }
        concurrentHashMap.clear();
        this.f219307h.clear();
        this.f219308i.mo50299x35224f();
    }

    public java.lang.String d(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        if (str2 == null) {
            str2 = "null";
        }
        sb6.append(str2);
        sb6.append(z17);
        sb6.append(i17);
        sb6.append("_");
        sb6.append(i18);
        return "fts_search_" + kk.k.g(sb6.toString().getBytes());
    }

    public final android.graphics.Bitmap e(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.j) this.f219300a.get(str);
        if (jVar != null && (bitmap = jVar.f218954b) != null && !bitmap.isRecycled()) {
            java.util.Vector vector = this.f219301b;
            vector.remove(str);
            vector.add(0, str);
        }
        if (jVar == null) {
            return null;
        }
        return jVar.f218954b;
    }

    public final void f(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f219300a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.j) concurrentHashMap.get(str);
        this.f219301b.remove(str);
        concurrentHashMap.remove(str);
        if (jVar == null || (bitmap = jVar.f218954b) == null) {
            return;
        }
        if (!bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSImageLoader", "bitmap recycle %s", jVar.f218954b);
            jVar.f218954b.recycle();
        }
        jVar.f218954b = null;
    }

    public void g() {
        this.f219302c = false;
        h();
    }

    public void h() {
        for (int i17 = 0; i17 < 2; i17++) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f219305f[i17];
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(null);
            }
        }
    }
}
