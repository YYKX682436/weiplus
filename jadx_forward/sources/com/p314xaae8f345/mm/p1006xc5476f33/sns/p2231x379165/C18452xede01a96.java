package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2231x379165;

/* renamed from: com.tencent.mm.plugin.sns.waid.WaidProvider */
/* loaded from: classes12.dex */
public class C18452xede01a96 extends android.content.ContentProvider {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f253266i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".ad.waid";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f253267m = {"pkg", "appWaid", "errCode"};

    /* renamed from: e, reason: collision with root package name */
    public long f253269e;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.UriMatcher f253268d = new android.content.UriMatcher(-1);

    /* renamed from: f, reason: collision with root package name */
    public int f253270f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f253271g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f253272h = false;

    public final android.database.MatrixCursor a(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildRetCursor", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(f253267m, 1);
        android.database.MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
        newRow.add("pkg", str);
        newRow.add("appWaid", str2);
        newRow.add("errCode", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildRetCursor", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return matrixCursor;
    }

    public synchronized boolean b(com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "checkWXEnv start, isInitDone=" + me4.c.j() + ", mIsWxEnvCheckEnd=" + this.f253272h);
        if (me4.c.j()) {
            this.f253272h = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return true;
        }
        this.f253272h = false;
        c19767x257d7f.f38864x6ac9171 = 1;
        new me4.e(this).start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "begin wait");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        while (!this.f253272h) {
            synchronized (this.f253271g) {
                try {
                    try {
                        this.f253271g.wait();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "wait exp=" + e17.toString());
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                    throw th6;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "after wait, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", fromOnCreate=" + (java.lang.System.currentTimeMillis() - this.f253269e) + ", waitIdx=" + this.f253270f);
        this.f253270f = this.f253270f + 1;
        if (me4.c.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "checkWXEnv succ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return true;
        }
        this.f253272h = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "checkWXEnv expired");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkWXEnv", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return false;
    }

    public me4.d c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        me4.d dVar = new me4.d();
        try {
            dVar.f407475a = getCallingPackage();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "getCallingPkg exp=" + th6.toString());
        }
        try {
            dVar.f407476b = getContext().getPackageManager().getPackagesForUid(android.os.Binder.getCallingUid());
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "getCallingUid exp=" + th7.toString());
        }
        java.lang.String[] strArr = dVar.f407476b;
        if (strArr == null || strArr.length <= 0) {
            dVar.f407477c = 5;
            dVar.f407478d = dVar.f407475a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return dVar;
        }
        if (android.text.TextUtils.isEmpty(dVar.f407475a)) {
            dVar.f407477c = 1;
            dVar.f407478d = dVar.f407476b[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            return dVar;
        }
        for (java.lang.String str : dVar.f407476b) {
            if (dVar.f407475a.equals(str)) {
                if (dVar.f407476b.length > 1) {
                    dVar.f407477c = 2;
                } else {
                    dVar.f407477c = 3;
                }
                dVar.f407478d = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
                return dVar;
            }
        }
        dVar.f407477c = 4;
        dVar.f407478d = dVar.f407476b[0];
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCallingPkg", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return dVar;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delete", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delete", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insert", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insert", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        this.f253268d.addURI(f253266i, "appWaid", 1);
        this.f253269e = java.lang.System.currentTimeMillis();
        me4.b bVar = new me4.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startInit", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InitTaskMgr", "start");
            java.util.ArrayList arrayList = bVar.f407471a;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f407473c.post((java.lang.Runnable) it.next());
            }
            arrayList.clear();
            bVar.f407472b.quitSafely();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InitTaskMgr", "startInit exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startInit", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "onCreate, this.hash=" + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        android.database.MatrixCursor matrixCursor;
        java.lang.String str3;
        java.lang.String b17;
        java.lang.String str4;
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("query", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            me4.d c17 = c();
            if (strArr2 == null || strArr2.length <= 0) {
                str3 = "";
            } else {
                java.lang.String str5 = strArr2[0];
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str5 == null) {
                    str5 = "";
                }
                str3 = str5.trim();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "handleQuery queryPkg=" + str3 + ", callingPkg=" + c17.f407478d + ", thread.hash=" + java.lang.Thread.currentThread().hashCode());
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            if (b(c19767x257d7f)) {
                if (android.text.TextUtils.isEmpty(c17.f407478d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "handleQuery callingPkg empty");
                    str4 = "";
                    b17 = str4;
                    i17 = 1;
                } else {
                    if (!me4.c.h()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "handleQuery isExptWaidEnable==false");
                        i19 = 2;
                    } else if (this.f253268d.match(uri) != 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "handleQuery uriMatch failed");
                        i19 = 3;
                    } else {
                        java.lang.String str6 = android.text.TextUtils.isEmpty(str3) ? c17.f407478d : str3;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInWhiteList", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInWhiteList", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                        if (c17.f407478d.equals(str6)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppWaidForThirdApp", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                            b17 = me4.c.b(str6);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppWaidForThirdApp", "com.tencent.mm.plugin.sns.waid.WaidHelper");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ad.waid.WaidProvider", "handleQuery, appWaid=" + b17);
                            if (android.text.TextUtils.isEmpty(b17)) {
                                i18 = 5;
                            } else {
                                str4 = str6;
                                i17 = 0;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "handleQuery queryPkg!=callingPkg, queryPkg=" + str6 + ", callingPkg=" + c17.f407478d);
                            i18 = 4;
                            b17 = "";
                        }
                        java.lang.String str7 = str6;
                        i17 = i18;
                        str4 = str7;
                    }
                    i17 = i19;
                    str4 = "";
                    b17 = str4;
                }
                me4.f.d(c17.f407478d, c17.f407477c, str3, i17, c19767x257d7f.f38864x6ac9171, (int) (java.lang.System.currentTimeMillis() - currentTimeMillis));
                me4.f.c(c17, str3);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                matrixCursor = a(str4, b17 == null ? "" : b17, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "checkWXEnv failed");
                matrixCursor = a("", "", -1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ad.waid.WaidProvider", "handleQuery exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleQuery", "com.tencent.mm.plugin.sns.waid.WaidProvider");
            matrixCursor = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("query", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.waid.WaidProvider");
        return 0;
    }
}
