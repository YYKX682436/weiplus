package dm;

/* loaded from: classes4.dex */
public class wc extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f322455g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f322456h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f322457i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322458m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322459n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322460o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f322461p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f322462q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322463d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322464e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322465f = true;

    /* renamed from: field_appId */
    public java.lang.String f69054x28d45f97;

    /* renamed from: field_permissionDemo */
    public boolean f69055x5a3d3237;

    /* renamed from: field_versiontime */
    public long f69056x94e09be0;

    static {
        p75.n0 n0Var = new p75.n0("WxaCheckDemoInfo");
        f322455g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322456h = new java.lang.String[0];
        f322457i = 93028124;
        f322458m = -1438599086;
        f322459n = 690045861;
        f322460o = 108705909;
        f322461p = m125671x3593deb(dm.wc.class);
        f322462q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125671x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = "permissionDemo";
        e0Var.f398488d.put("permissionDemo", "INTEGER default 'false' ");
        e0Var.f398487c[2] = "versiontime";
        e0Var.f398488d.put("versiontime", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  permissionDemo INTEGER default 'false' ,  versiontime LONG";
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
            if (f322457i == hashCode) {
                try {
                    this.f69054x28d45f97 = cursor.getString(i17);
                    this.f322463d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaCheckDemoInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322458m == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69055x5a3d3237 = z17;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaCheckDemoInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322459n == hashCode) {
                try {
                    this.f69056x94e09be0 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaCheckDemoInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322460o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322463d) {
            contentValues.put("appId", this.f69054x28d45f97);
        }
        if (this.f322464e) {
            if (this.f69055x5a3d3237) {
                contentValues.put("permissionDemo", (java.lang.Integer) 1);
            } else {
                contentValues.put("permissionDemo", (java.lang.Integer) 0);
            }
        }
        if (this.f322465f) {
            contentValues.put("versiontime", java.lang.Long.valueOf(this.f69056x94e09be0));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaCheckDemoInfo ( ");
        l75.e0 e0Var = f322461p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322456h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTableSql %s", str2);
            k0Var.A("WxaCheckDemoInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaCheckDemoInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "updateTableSql %s", str3);
            k0Var.A("WxaCheckDemoInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaCheckDemoInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322461p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322462q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69054x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322455g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322455g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f69054x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f322463d = true;
            }
        }
        if (contentValues.containsKey("permissionDemo")) {
            this.f69055x5a3d3237 = contentValues.getAsInteger("permissionDemo").intValue() != 0;
            if (z17) {
                this.f322464e = true;
            }
        }
        if (contentValues.containsKey("versiontime")) {
            this.f69056x94e09be0 = contentValues.getAsLong("versiontime").longValue();
            if (z17) {
                this.f322465f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
