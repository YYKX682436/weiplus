package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class o extends l75.n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f157817g = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k.f157777t, "AppBrandKVData"), "DROP TABLE IF EXISTS AppBrandStorageKVData;"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f157818d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f157819e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f157820f;

    public o(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k.f157777t, "AppBrandKVData", null);
        this.f157819e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m(this);
        this.f157820f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n(this);
        this.f157818d = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.util.List G(int i17, java.lang.String str, java.util.List list) {
        return new java.util.ArrayList();
    }

    public final int J0(int i17, java.lang.String str, int i18) {
        int max = java.lang.Math.max(0, W0(i17, str) + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k();
        kVar.f69286x4b6e619a = L0(i17, str, "@@@TOTAL@DATA@SIZE@@@");
        kVar.f69284x225a93cf = max + "";
        super.mo11260x413cb2b4(kVar);
        return max;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public int K(java.lang.String str) {
        int i17 = 0;
        for (int i18 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f(str, this.f157819e, this.f157820f)) {
            i17 += W0(i18, str);
        }
        return i17;
    }

    public final java.lang.String L0(int i17, java.lang.String appId, java.lang.String key) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f157670a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, appId, key, "++");
    }

    public final int P0(java.lang.String str) {
        android.database.Cursor D = this.f157818d.D("AppBrandKVData", new java.lang.String[]{"size"}, "key = ?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            D.close();
            return 0;
        }
        int i17 = D.getInt(0);
        D.close();
        return i17;
    }

    public final int W0(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k();
        kVar.f69286x4b6e619a = L0(i17, str, "@@@TOTAL@DATA@SIZE@@@");
        if (super.get(kVar, new java.lang.String[0])) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(kVar.f69284x225a93cf, 0);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public void k(int i17, java.lang.String str) {
        java.lang.String str2;
        if (i17 == 0) {
            str2 = str + "__";
        } else {
            str2 = i17 + "__" + str + "__";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.h(str, i17, this.f157819e, this.f157820f);
        this.f157818d.mo70514xb06685ab("AppBrandKVData", java.lang.String.format("%s like ? escape ? OR %s=?", "key", "key"), new java.lang.String[]{str2.replace("_", "\\_") + "%", "\\", L0(i17, str, "@@@TOTAL@DATA@SIZE@@@")});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 l(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(str2, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MISSING_PARAMS;
        }
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, str2, "__");
        int P0 = b17 - P0(e17);
        if (W0(i17, str) + P0 >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.g(i17, str)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.QUOTA_REACHED;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k();
        kVar.f69286x4b6e619a = e17;
        kVar.f69284x225a93cf = str3;
        kVar.f69285x886617a9 = str4;
        kVar.f69287x22618426 = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l(this, kVar, str, i17, P0);
        try {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1) lVar.mo152xb9724478();
        } catch (android.database.sqlite.SQLiteException e18) {
            java.lang.String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            if (!message.contains("no such table")) {
                throw e18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandKVStorage", "set storageId[%d] appId[%s] key[%s], get exception[%s] try create table", java.lang.Integer.valueOf(i17), str, str2, e18);
            try {
                l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k.f157777t;
                java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
                java.lang.String mo145255x88e404c32 = mo145255x88e404c3();
                l75.k0 k0Var = this.f157818d;
                for (java.lang.String str5 : l75.n0.m145251xdc9c58c4(e0Var, mo145255x88e404c32, k0Var)) {
                    if (!k0Var.A(mo145255x88e404c3, str5)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandKVStorage", "updateColumnSQLs table failed %s, sql %s", mo145255x88e404c3, str5);
                    }
                }
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1) lVar.mo152xb9724478();
            } catch (android.database.sqlite.SQLiteException e19) {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "set storageId[%d] appId[%s] key[%s], get exception[%s] after retry", java.lang.Integer.valueOf(i17), str, str2, e18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandKVStorage", format);
                throw new android.database.sqlite.SQLiteException(format, e19);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.lang.Object[] o(int i17, java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MISSING_PARAMS};
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k();
        kVar.f69286x4b6e619a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, str2, "__");
        try {
            return super.get(kVar, new java.lang.String[0]) ? new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE, kVar.f69284x225a93cf, kVar.f69285x886617a9} : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f157671b;
        } catch (android.database.sqlite.SQLiteException e17) {
            java.lang.String message = e17.getMessage();
            if (message == null) {
                message = "";
            }
            if (message.contains("no such table")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrandKVStorage", "get storageId[%d] appId[%s] key[%s], no such table, return RET_GET_NO_SUCH_KEY", java.lang.Integer.valueOf(i17), str, str2);
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f157671b;
            }
            if (e17.getClass().getName().endsWith("CursorWindowAllocationException")) {
                return new java.lang.Object[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MEMORY_ISSUE};
            }
            throw e17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 q(int i17, java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MISSING_PARAMS;
        }
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, str2, "__");
        int J0 = J0(i17, str, -P0(e17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.k();
        kVar.f69286x4b6e619a = e17;
        super.mo9951xb06685ab(kVar, new java.lang.String[0]);
        if (J0 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.h(str, i17, this.f157819e, this.f157820f);
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.lang.Object[] t(int i17, java.lang.String str) {
        java.lang.String str2;
        if (i17 == 0) {
            str2 = str + "__";
        } else {
            str2 = i17 + "__" + str + "__";
        }
        android.database.Cursor D = this.f157818d.D("AppBrandKVData", new java.lang.String[]{"key"}, "key like ? escape ?", new java.lang.String[]{str2.replace("_", "\\_") + "%", "\\"}, null, null, null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (D.moveToNext()) {
            arrayList.add(D.getString(0).replace(str2, ""));
        }
        D.close();
        return new java.lang.Object[]{arrayList, java.lang.Integer.valueOf(W0(i17, str)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.g(i17, str))};
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 z(int i17, java.lang.String str, java.util.List list) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.UNKNOWN;
    }
}
