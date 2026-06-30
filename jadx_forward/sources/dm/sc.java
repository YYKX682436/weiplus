package dm;

/* loaded from: classes4.dex */
public class sc extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f321483n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f321484o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321485p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321486q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321487r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321488s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321489t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321490u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321491v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321492w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f321493x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f321494y;

    /* renamed from: field_accessTime */
    public long f68353x75155eb6;

    /* renamed from: field_appId */
    public java.lang.String f68354x28d45f97;

    /* renamed from: field_appVersionId */
    public java.lang.String f68355x1e3e7a17;

    /* renamed from: field_cacheFilePath */
    public java.lang.String f68356xc98d56de;

    /* renamed from: field_commLibVersionId */
    public java.lang.String f68357x8fc538df;

    /* renamed from: field_pageURL */
    public java.lang.String f68358x44ad561b;

    /* renamed from: field_updateTime */
    public long f68359xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321495d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321496e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321497f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321498g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321499h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321500i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321501m = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaAppWebRenderingCacheAccessStatsTable");
        f321483n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321484o = new java.lang.String[0];
        f321485p = 93028124;
        f321486q = -318790598;
        f321487r = 303221490;
        f321488s = -803559328;
        f321489t = -295931082;
        f321490u = -1142019503;
        f321491v = 1346576739;
        f321492w = 108705909;
        f321493x = m125496x3593deb(dm.sc.class);
        f321494y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125496x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "commLibVersionId";
        e0Var.f398488d.put("commLibVersionId", "TEXT");
        e0Var.f398487c[2] = "appVersionId";
        e0Var.f398488d.put("appVersionId", "TEXT");
        e0Var.f398487c[3] = "pageURL";
        e0Var.f398488d.put("pageURL", "TEXT");
        e0Var.f398487c[4] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[5] = "accessTime";
        e0Var.f398488d.put("accessTime", "LONG");
        e0Var.f398487c[6] = "cacheFilePath";
        e0Var.f398488d.put("cacheFilePath", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " appId TEXT,  commLibVersionId TEXT,  appVersionId TEXT,  pageURL TEXT,  updateTime LONG,  accessTime LONG,  cacheFilePath TEXT";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            if (f321485p == hashCode) {
                try {
                    this.f68354x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321486q == hashCode) {
                try {
                    this.f68357x8fc538df = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321487r == hashCode) {
                try {
                    this.f68355x1e3e7a17 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321488s == hashCode) {
                try {
                    this.f68358x44ad561b = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321489t == hashCode) {
                try {
                    this.f68359xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321490u == hashCode) {
                try {
                    this.f68353x75155eb6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321491v == hashCode) {
                try {
                    this.f68356xc98d56de = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321492w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321495d) {
            contentValues.put("appId", this.f68354x28d45f97);
        }
        if (this.f321496e) {
            contentValues.put("commLibVersionId", this.f68357x8fc538df);
        }
        if (this.f321497f) {
            contentValues.put("appVersionId", this.f68355x1e3e7a17);
        }
        if (this.f321498g) {
            contentValues.put("pageURL", this.f68358x44ad561b);
        }
        if (this.f321499h) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68359xa783a79b));
        }
        if (this.f321500i) {
            contentValues.put("accessTime", java.lang.Long.valueOf(this.f68353x75155eb6));
        }
        if (this.f321501m) {
            contentValues.put("cacheFilePath", this.f68356xc98d56de);
        }
        long j17 = this.f72763xa3c65b86;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    /* renamed from: createMyTable */
    public void mo9764xdf360ce6(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaAppWebRenderingCacheAccessStatsTable ( ");
        l75.e0 e0Var = f321493x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321484o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTableSql %s", str2);
            k0Var.A("WxaAppWebRenderingCacheAccessStatsTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaAppWebRenderingCacheAccessStatsTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "updateTableSql %s", str3);
            k0Var.A("WxaAppWebRenderingCacheAccessStatsTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAppWebRenderingCacheAccessStatsTable", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321493x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321494y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321483n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321483n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f68354x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f321495d = true;
            }
        }
        if (contentValues.containsKey("commLibVersionId")) {
            this.f68357x8fc538df = contentValues.getAsString("commLibVersionId");
            if (z17) {
                this.f321496e = true;
            }
        }
        if (contentValues.containsKey("appVersionId")) {
            this.f68355x1e3e7a17 = contentValues.getAsString("appVersionId");
            if (z17) {
                this.f321497f = true;
            }
        }
        if (contentValues.containsKey("pageURL")) {
            this.f68358x44ad561b = contentValues.getAsString("pageURL");
            if (z17) {
                this.f321498g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f68359xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f321499h = true;
            }
        }
        if (contentValues.containsKey("accessTime")) {
            this.f68353x75155eb6 = contentValues.getAsLong("accessTime").longValue();
            if (z17) {
                this.f321500i = true;
            }
        }
        if (contentValues.containsKey("cacheFilePath")) {
            this.f68356xc98d56de = contentValues.getAsString("cacheFilePath");
            if (z17) {
                this.f321501m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
