package dm;

/* loaded from: classes4.dex */
public class i extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f319004o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f319005p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319006q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319007r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319008s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319009t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319010u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319011v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319012w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319013x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319014y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f319015z;

    /* renamed from: field_aid */
    public java.lang.String f66808x4b6e3c77;

    /* renamed from: field_ext */
    public java.lang.String f66809x4b6e4d5c;

    /* renamed from: field_isAsync */
    public int f66810xef085d2d;

    /* renamed from: field_isSelected */
    public int f66811xd0e4ce4a;

    /* renamed from: field_sessionKey */
    public java.lang.String f66812x1c34c84e;

    /* renamed from: field_snsid */
    public java.lang.String f66813x29d12d0e;

    /* renamed from: field_storeTime */
    public long f66814xff779249;

    /* renamed from: field_traceid */
    public java.lang.String f66815x34f36edb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319016d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319017e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319018f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319019g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319020h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319021i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319022m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319023n = true;

    static {
        p75.n0 n0Var = new p75.n0("AdPullRecordsInfo");
        f319004o = n0Var;
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
        f319005p = new java.lang.String[0];
        f319006q = -1067400928;
        f319007r = 96572;
        f319008s = 109595795;
        f319009t = 1691969358;
        f319010u = 2054532978;
        f319011v = 398301669;
        f319012w = 1661834217;
        f319013x = 100897;
        f319014y = 108705909;
        f319015z = m125044x3593deb(dm.i.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125044x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "traceid";
        e0Var.f398488d.put("traceid", "TEXT");
        e0Var.f398487c[1] = "aid";
        e0Var.f398488d.put("aid", "TEXT");
        e0Var.f398487c[2] = "snsid";
        e0Var.f398488d.put("snsid", "TEXT");
        e0Var.f398487c[3] = "storeTime";
        e0Var.f398488d.put("storeTime", "LONG");
        e0Var.f398487c[4] = "isAsync";
        e0Var.f398488d.put("isAsync", "INTEGER default '0' ");
        e0Var.f398487c[5] = "isSelected";
        e0Var.f398488d.put("isSelected", "INTEGER default '1' ");
        e0Var.f398487c[6] = "sessionKey";
        e0Var.f398488d.put("sessionKey", "TEXT");
        e0Var.f398487c[7] = "ext";
        e0Var.f398488d.put("ext", "TEXT");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " traceid TEXT,  aid TEXT,  snsid TEXT,  storeTime LONG,  isAsync INTEGER default '0' ,  isSelected INTEGER default '1' ,  sessionKey TEXT,  ext TEXT";
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
            if (f319006q == hashCode) {
                try {
                    this.f66815x34f36edb = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319007r == hashCode) {
                try {
                    this.f66808x4b6e3c77 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319008s == hashCode) {
                try {
                    this.f66813x29d12d0e = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319009t == hashCode) {
                try {
                    this.f66814xff779249 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319010u == hashCode) {
                try {
                    this.f66810xef085d2d = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319011v == hashCode) {
                try {
                    this.f66811xd0e4ce4a = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319012w == hashCode) {
                try {
                    this.f66812x1c34c84e = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319013x == hashCode) {
                try {
                    this.f66809x4b6e4d5c = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdPullRecordsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319014y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319016d) {
            contentValues.put("traceid", this.f66815x34f36edb);
        }
        if (this.f319017e) {
            contentValues.put("aid", this.f66808x4b6e3c77);
        }
        if (this.f319018f) {
            contentValues.put("snsid", this.f66813x29d12d0e);
        }
        if (this.f319019g) {
            contentValues.put("storeTime", java.lang.Long.valueOf(this.f66814xff779249));
        }
        if (this.f319020h) {
            contentValues.put("isAsync", java.lang.Integer.valueOf(this.f66810xef085d2d));
        }
        if (this.f319021i) {
            contentValues.put("isSelected", java.lang.Integer.valueOf(this.f66811xd0e4ce4a));
        }
        if (this.f319022m) {
            contentValues.put("sessionKey", this.f66812x1c34c84e);
        }
        if (this.f319023n) {
            contentValues.put("ext", this.f66809x4b6e4d5c);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdPullRecordsInfo ( ");
        l75.e0 e0Var = f319015z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319005p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTableSql %s", str2);
            k0Var.A("AdPullRecordsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AdPullRecordsInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdPullRecordsInfo", "updateTableSql %s", str3);
            k0Var.A("AdPullRecordsInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdPullRecordsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319015z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319004o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319004o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("traceid")) {
            this.f66815x34f36edb = contentValues.getAsString("traceid");
            if (z17) {
                this.f319016d = true;
            }
        }
        if (contentValues.containsKey("aid")) {
            this.f66808x4b6e3c77 = contentValues.getAsString("aid");
            if (z17) {
                this.f319017e = true;
            }
        }
        if (contentValues.containsKey("snsid")) {
            this.f66813x29d12d0e = contentValues.getAsString("snsid");
            if (z17) {
                this.f319018f = true;
            }
        }
        if (contentValues.containsKey("storeTime")) {
            this.f66814xff779249 = contentValues.getAsLong("storeTime").longValue();
            if (z17) {
                this.f319019g = true;
            }
        }
        if (contentValues.containsKey("isAsync")) {
            this.f66810xef085d2d = contentValues.getAsInteger("isAsync").intValue();
            if (z17) {
                this.f319020h = true;
            }
        }
        if (contentValues.containsKey("isSelected")) {
            this.f66811xd0e4ce4a = contentValues.getAsInteger("isSelected").intValue();
            if (z17) {
                this.f319021i = true;
            }
        }
        if (contentValues.containsKey("sessionKey")) {
            this.f66812x1c34c84e = contentValues.getAsString("sessionKey");
            if (z17) {
                this.f319022m = true;
            }
        }
        if (contentValues.containsKey("ext")) {
            this.f66809x4b6e4d5c = contentValues.getAsString("ext");
            if (z17) {
                this.f319023n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
