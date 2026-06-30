package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class p2 implements l75.k0 {

    /* renamed from: b, reason: collision with root package name */
    public static java.util.concurrent.ConcurrentHashMap f247632b;

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f247633a;

    public p2(l75.k0 k0Var) {
        this.f247633a = k0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_sql_trace_switch, "0", true), 0) > 0) {
            f247632b = new java.util.concurrent.ConcurrentHashMap();
        }
    }

    @Override // l75.k0
    public boolean A(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f247632b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str2.hashCode());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            concurrentHashMap.put(valueOf, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o2(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        boolean A = this.f247633a.A(str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return A;
    }

    @Override // l75.k0
    public android.database.Cursor B(java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f247632b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str.hashCode());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            concurrentHashMap.put(valueOf, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o2(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        android.database.Cursor B = this.f247633a.B(str, strArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return B;
    }

    @Override // l75.k0
    public android.database.Cursor D(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor D = this.f247633a.D(str, strArr, str2, strArr2, str3, str4, str5, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return D;
    }

    @Override // l75.k0
    public android.database.Cursor E(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor E = this.f247633a.E(str, strArr, str2, strArr2, str3, str4, str5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return E;
    }

    @Override // l75.k0
    public long F(java.lang.Long l17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beginTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long F = this.f247633a.F(l17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beginTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return F;
    }

    @Override // l75.k0
    public boolean G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean G = this.f247633a.G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return G;
    }

    @Override // l75.k0
    public boolean H(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f247632b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str2.hashCode());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            concurrentHashMap.put(valueOf, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o2(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        boolean H = this.f247633a.H(str, str2, objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("execSQL", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return H;
    }

    @Override // l75.k0
    public boolean J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isClose", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean J2 = this.f247633a.J();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isClose", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return J2;
    }

    @Override // l75.k0
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isWcDb2", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean a17 = this.f247633a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isWcDb2", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return a17;
    }

    @Override // l75.k0
    /* renamed from: close */
    public void mo70513x5a5ddf8() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("close", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        this.f247633a.mo70513x5a5ddf8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("close", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
    }

    @Override // l75.k0
    public android.database.Cursor d(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor d17 = this.f247633a.d(z17, str, strArr, str2, strArr2, str3, str4, str5, str6, c26987xeef691ab);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("query", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return d17;
    }

    @Override // l75.k0
    /* renamed from: delete */
    public int mo70514xb06685ab(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delete", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        int mo70514xb06685ab = this.f247633a.mo70514xb06685ab(str, str2, strArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delete", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return mo70514xb06685ab;
    }

    @Override // l75.k0
    public android.database.Cursor f(java.lang.String str, java.lang.String[] strArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f247632b;
        if (concurrentHashMap != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(str.hashCode());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            concurrentHashMap.put(valueOf, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o2(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true), android.os.Looper.getMainLooper() == android.os.Looper.myLooper()));
        }
        android.database.Cursor f17 = this.f247633a.f(str, strArr, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rawQuery", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return f17;
    }

    @Override // l75.k0
    /* renamed from: getPath */
    public java.lang.String mo70515xfb83cc9b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPath", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        java.lang.String mo70515xfb83cc9b = this.f247633a.mo70515xfb83cc9b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPath", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return mo70515xfb83cc9b;
    }

    @Override // l75.k0
    public long l(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insert", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long l17 = this.f247633a.l(str, str2, contentValues);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insert", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return l17;
    }

    @Override // l75.k0
    public long m(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long m17 = this.f247633a.m(str, str2, contentValues);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return m17;
    }

    @Override // l75.k0
    public int p(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        int p17 = this.f247633a.p(str, contentValues, str2, strArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return p17;
    }

    @Override // l75.k0
    public long q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageSize", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long q17 = this.f247633a.q();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageSize", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return q17;
    }

    @Override // l75.k0
    public android.database.Cursor s(java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("rawQueryWithCancel", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        android.database.Cursor s17 = this.f247633a.s(str, strArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("rawQueryWithCancel", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return s17;
    }

    @Override // l75.k0
    public boolean u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("vacuum", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        boolean u17 = this.f247633a.u();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("vacuum", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return u17;
    }

    @Override // l75.k0
    public long v(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertOrThrow", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        long v17 = this.f247633a.v(str, str2, contentValues);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertOrThrow", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return v17;
    }

    @Override // l75.k0
    public int w(java.lang.Long l17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        int w17 = this.f247633a.w(l17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endTransaction", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        return w17;
    }
}
