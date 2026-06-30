package dm;

/* loaded from: classes8.dex */
public class r7 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f321186o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f321187p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321188q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321189r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321190s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321191t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321192u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321193v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321194w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321195x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321196y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f321197z;

    /* renamed from: field_appid */
    public java.lang.String f68178x28d46377;

    /* renamed from: field_expire_duration */
    public int f68179x61c4976f;

    /* renamed from: field_hasLiteConf */
    public boolean f68180x6822e1e7;

    /* renamed from: field_path */
    public java.lang.String f68181x2260084a;

    /* renamed from: field_refresh_duration */
    public int f68182x7654871d;

    /* renamed from: field_updateTime */
    public long f68183xa783a79b;

    /* renamed from: field_url */
    public java.lang.String f68184x4b6e88aa;

    /* renamed from: field_wepkg_id */
    public java.lang.String f68185xb772261;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321198d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321199e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321200f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321201g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321202h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321203i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321204m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321205n = true;

    static {
        p75.n0 n0Var = new p75.n0("LocalLiteAppConf");
        f321186o = n0Var;
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
        f321187p = new java.lang.String[0];
        f321188q = 116079;
        f321189r = 93029116;
        f321190s = 3433509;
        f321191t = 305255604;
        f321192u = -745606536;
        f321193v = -306964292;
        f321194w = -295931082;
        f321195x = -60585556;
        f321196y = 108705909;
        f321197z = m125450x3593deb(dm.r7.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125450x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "url";
        e0Var.f398488d.put("url", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "url";
        e0Var.f398487c[1] = "appid";
        e0Var.f398488d.put("appid", "TEXT");
        e0Var.f398487c[2] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        e0Var.f398488d.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT");
        e0Var.f398487c[3] = "expire_duration";
        e0Var.f398488d.put("expire_duration", "INTEGER");
        e0Var.f398487c[4] = "refresh_duration";
        e0Var.f398488d.put("refresh_duration", "INTEGER");
        e0Var.f398487c[5] = "wepkg_id";
        e0Var.f398488d.put("wepkg_id", "TEXT");
        e0Var.f398487c[6] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[7] = "hasLiteConf";
        e0Var.f398488d.put("hasLiteConf", "INTEGER default 'false' ");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " url TEXT PRIMARY KEY ,  appid TEXT,  path TEXT,  expire_duration INTEGER,  refresh_duration INTEGER,  wepkg_id TEXT,  updateTime LONG,  hasLiteConf INTEGER default 'false' ";
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
            boolean z17 = true;
            if (f321188q == hashCode) {
                try {
                    this.f68184x4b6e88aa = cursor.getString(i17);
                    this.f321198d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321189r == hashCode) {
                try {
                    this.f68178x28d46377 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321190s == hashCode) {
                try {
                    this.f68181x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321191t == hashCode) {
                try {
                    this.f68179x61c4976f = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321192u == hashCode) {
                try {
                    this.f68182x7654871d = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321193v == hashCode) {
                try {
                    this.f68185xb772261 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321194w == hashCode) {
                try {
                    this.f68183xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321195x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68180x6822e1e7 = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalLiteAppConf", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321196y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321198d) {
            contentValues.put("url", this.f68184x4b6e88aa);
        }
        if (this.f321199e) {
            contentValues.put("appid", this.f68178x28d46377);
        }
        if (this.f321200f) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f68181x2260084a);
        }
        if (this.f321201g) {
            contentValues.put("expire_duration", java.lang.Integer.valueOf(this.f68179x61c4976f));
        }
        if (this.f321202h) {
            contentValues.put("refresh_duration", java.lang.Integer.valueOf(this.f68182x7654871d));
        }
        if (this.f321203i) {
            contentValues.put("wepkg_id", this.f68185xb772261);
        }
        if (this.f321204m) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68183xa783a79b));
        }
        if (this.f321205n) {
            if (this.f68180x6822e1e7) {
                contentValues.put("hasLiteConf", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasLiteConf", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLocalLiteAppConf", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LocalLiteAppConf ( ");
        l75.e0 e0Var = f321197z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321187p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLocalLiteAppConf", "createTableSql %s", str2);
            k0Var.A("LocalLiteAppConf", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LocalLiteAppConf", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLocalLiteAppConf", "updateTableSql %s", str3);
            k0Var.A("LocalLiteAppConf", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLocalLiteAppConf", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321197z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68184x4b6e88aa;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321186o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321186o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("url")) {
            this.f68184x4b6e88aa = contentValues.getAsString("url");
            if (z17) {
                this.f321198d = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.f68178x28d46377 = contentValues.getAsString("appid");
            if (z17) {
                this.f321199e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f68181x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f321200f = true;
            }
        }
        if (contentValues.containsKey("expire_duration")) {
            this.f68179x61c4976f = contentValues.getAsInteger("expire_duration").intValue();
            if (z17) {
                this.f321201g = true;
            }
        }
        if (contentValues.containsKey("refresh_duration")) {
            this.f68182x7654871d = contentValues.getAsInteger("refresh_duration").intValue();
            if (z17) {
                this.f321202h = true;
            }
        }
        if (contentValues.containsKey("wepkg_id")) {
            this.f68185xb772261 = contentValues.getAsString("wepkg_id");
            if (z17) {
                this.f321203i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f68183xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f321204m = true;
            }
        }
        if (contentValues.containsKey("hasLiteConf")) {
            this.f68180x6822e1e7 = contentValues.getAsInteger("hasLiteConf").intValue() != 0;
            if (z17) {
                this.f321205n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
