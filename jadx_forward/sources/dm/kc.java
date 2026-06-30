package dm;

/* loaded from: classes4.dex */
public class kc extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f319662o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f319663p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319664q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319665r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319666s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319667t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319668u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319669v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319670w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319671x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319672y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f319673z;

    /* renamed from: field_appId */
    public java.lang.String f67263x28d45f97;

    /* renamed from: field_appIdKey */
    public java.lang.String f67264x62210b48;

    /* renamed from: field_expireTime */
    public long f67265x876650f1;

    /* renamed from: field_localFile */
    public java.lang.String f67266x52c1c682;

    /* renamed from: field_size */
    public long f67267x22618426;

    /* renamed from: field_timeStamp */
    public long f67268x9c2463f1;

    /* renamed from: field_value */
    public java.lang.String f67269x29f571ec;

    /* renamed from: field_weight */
    public java.lang.String f67270x16a4715d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319674d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319675e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319676f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319677g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319678h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319679i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319680m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319681n = true;

    static {
        p75.n0 n0Var = new p75.n0("WebViewData");
        f319662o = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319663p = new java.lang.String[0];
        f319664q = 93028124;
        f319665r = 1147011491;
        f319666s = 111972721;
        f319667t = -791592328;
        f319668u = -834724724;
        f319669v = 25573622;
        f319670w = 3530753;
        f319671x = -1205625977;
        f319672y = 108705909;
        f319673z = m125184x3593deb(dm.kc.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125184x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "appIdKey";
        e0Var.f398488d.put("appIdKey", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appIdKey";
        e0Var.f398487c[2] = "value";
        e0Var.f398488d.put("value", "TEXT");
        e0Var.f398487c[3] = "weight";
        e0Var.f398488d.put("weight", "TEXT");
        e0Var.f398487c[4] = "expireTime";
        e0Var.f398488d.put("expireTime", "LONG");
        e0Var.f398487c[5] = "timeStamp";
        e0Var.f398488d.put("timeStamp", "LONG");
        e0Var.f398487c[6] = "size";
        e0Var.f398488d.put("size", "LONG");
        e0Var.f398487c[7] = "localFile";
        e0Var.f398488d.put("localFile", "TEXT");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " appId TEXT,  appIdKey TEXT PRIMARY KEY ,  value TEXT,  weight TEXT,  expireTime LONG,  timeStamp LONG,  size LONG,  localFile TEXT";
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
            if (f319664q == hashCode) {
                try {
                    this.f67263x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319665r == hashCode) {
                try {
                    this.f67264x62210b48 = cursor.getString(i17);
                    this.f319675e = true;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319666s == hashCode) {
                try {
                    this.f67269x29f571ec = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319667t == hashCode) {
                try {
                    this.f67270x16a4715d = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319668u == hashCode) {
                try {
                    this.f67265x876650f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319669v == hashCode) {
                try {
                    this.f67268x9c2463f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319670w == hashCode) {
                try {
                    this.f67267x22618426 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319671x == hashCode) {
                try {
                    this.f67266x52c1c682 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewData", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319672y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319674d) {
            contentValues.put("appId", this.f67263x28d45f97);
        }
        if (this.f319675e) {
            contentValues.put("appIdKey", this.f67264x62210b48);
        }
        if (this.f319676f) {
            contentValues.put("value", this.f67269x29f571ec);
        }
        if (this.f319677g) {
            contentValues.put("weight", this.f67270x16a4715d);
        }
        if (this.f319678h) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.f67265x876650f1));
        }
        if (this.f319679i) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.f67268x9c2463f1));
        }
        if (this.f319680m) {
            contentValues.put("size", java.lang.Long.valueOf(this.f67267x22618426));
        }
        if (this.f319681n) {
            contentValues.put("localFile", this.f67266x52c1c682);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWebViewData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebViewData ( ");
        l75.e0 e0Var = f319673z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319663p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebViewData", "createTableSql %s", str2);
            k0Var.A("WebViewData", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WebViewData", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebViewData", "updateTableSql %s", str3);
            k0Var.A("WebViewData", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebViewData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319673z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67264x62210b48;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319662o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319662o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67263x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319674d = true;
            }
        }
        if (contentValues.containsKey("appIdKey")) {
            this.f67264x62210b48 = contentValues.getAsString("appIdKey");
            if (z17) {
                this.f319675e = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f67269x29f571ec = contentValues.getAsString("value");
            if (z17) {
                this.f319676f = true;
            }
        }
        if (contentValues.containsKey("weight")) {
            this.f67270x16a4715d = contentValues.getAsString("weight");
            if (z17) {
                this.f319677g = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.f67265x876650f1 = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f319678h = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.f67268x9c2463f1 = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f319679i = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f67267x22618426 = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f319680m = true;
            }
        }
        if (contentValues.containsKey("localFile")) {
            this.f67266x52c1c682 = contentValues.getAsString("localFile");
            if (z17) {
                this.f319681n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
