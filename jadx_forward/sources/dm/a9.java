package dm;

/* loaded from: classes4.dex */
public class a9 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f317209n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f317210o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317211p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317212q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317213r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317214s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317215t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317216u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317217v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317218w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f317219x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f317220y;

    /* renamed from: field_appVersion */
    public int f65904x119cf7dc;

    /* renamed from: field_appid */
    public java.lang.String f65905x28d46377;

    /* renamed from: field_iconUrl */
    public java.lang.String f65906xd6403ff1;

    /* renamed from: field_nickname */
    public java.lang.String f65907x21f9b213;

    /* renamed from: field_token */
    public java.lang.String f65908x29df9a74;

    /* renamed from: field_username */
    public java.lang.String f65909xdec927b;

    /* renamed from: field_versionType */
    public int f65910x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317221d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317222e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317223f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317224g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317225h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317226i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317227m = true;

    static {
        p75.n0 n0Var = new p75.n0("OuterWidgetAppInfo");
        f317209n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317210o = new java.lang.String[0];
        f317211p = 110541305;
        f317212q = -265713450;
        f317213r = 689108018;
        f317214s = 1484112759;
        f317215t = 93029116;
        f317216u = 70690926;
        f317217v = 1638765110;
        f317218w = 108705909;
        f317219x = m124793x3593deb(dm.a9.class);
        f317220y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124793x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "token";
        e0Var.f398488d.put("token", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "token";
        e0Var.f398487c[1] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[2] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[3] = "appVersion";
        e0Var.f398488d.put("appVersion", "INTEGER");
        e0Var.f398487c[4] = "appid";
        e0Var.f398488d.put("appid", "TEXT");
        e0Var.f398487c[5] = "nickname";
        e0Var.f398488d.put("nickname", "TEXT");
        e0Var.f398487c[6] = "iconUrl";
        e0Var.f398488d.put("iconUrl", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " token TEXT PRIMARY KEY ,  username TEXT,  versionType INTEGER,  appVersion INTEGER,  appid TEXT,  nickname TEXT,  iconUrl TEXT";
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
            if (f317211p == hashCode) {
                try {
                    this.f65908x29df9a74 = cursor.getString(i17);
                    this.f317221d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317212q == hashCode) {
                try {
                    this.f65909xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317213r == hashCode) {
                try {
                    this.f65910x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317214s == hashCode) {
                try {
                    this.f65904x119cf7dc = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317215t == hashCode) {
                try {
                    this.f65905x28d46377 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317216u == hashCode) {
                try {
                    this.f65907x21f9b213 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317217v == hashCode) {
                try {
                    this.f65906xd6403ff1 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOuterWidgetAppInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317218w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317221d) {
            contentValues.put("token", this.f65908x29df9a74);
        }
        if (this.f317222e) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f65909xdec927b);
        }
        if (this.f317223f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f65910x94d24c6d));
        }
        if (this.f317224g) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.f65904x119cf7dc));
        }
        if (this.f317225h) {
            contentValues.put("appid", this.f65905x28d46377);
        }
        if (this.f317226i) {
            contentValues.put("nickname", this.f65907x21f9b213);
        }
        if (this.f317227m) {
            contentValues.put("iconUrl", this.f65906xd6403ff1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OuterWidgetAppInfo ( ");
        l75.e0 e0Var = f317219x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317210o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTableSql %s", str2);
            k0Var.A("OuterWidgetAppInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OuterWidgetAppInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "updateTableSql %s", str3);
            k0Var.A("OuterWidgetAppInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOuterWidgetAppInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317219x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317220y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65908x29df9a74;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317209n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317209n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("token")) {
            this.f65908x29df9a74 = contentValues.getAsString("token");
            if (z17) {
                this.f317221d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f65909xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f317222e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f65910x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f317223f = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.f65904x119cf7dc = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f317224g = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.f65905x28d46377 = contentValues.getAsString("appid");
            if (z17) {
                this.f317225h = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.f65907x21f9b213 = contentValues.getAsString("nickname");
            if (z17) {
                this.f317226i = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.f65906xd6403ff1 = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f317227m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
