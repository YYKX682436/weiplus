package dm;

/* loaded from: classes4.dex */
public class uc extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f321946h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f321947i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321948m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321949n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321950o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321951p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321952q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f321953r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f321954s;

    /* renamed from: field_appVersion */
    public int f68626x119cf7dc;

    /* renamed from: field_launchFallbackDirectlyMinVersion */
    public int f68627x2ba56136;

    /* renamed from: field_reportId */
    public int f68628x44eeb14;

    /* renamed from: field_username */
    public java.lang.String f68629xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321955d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321956e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321957f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321958g = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaAttrVersionServerNotifyRecord");
        f321946h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321947i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS WxaAttrVersionServerNotifyRecordAppVersionIndex ON WxaAttrVersionServerNotifyRecord(appVersion)"};
        f321948m = -265713450;
        f321949n = 1484112759;
        f321950o = -427040401;
        f321951p = -2129938799;
        f321952q = 108705909;
        f321953r = m125547x3593deb(dm.uc.class);
        f321954s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125547x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "appVersion";
        e0Var.f398488d.put("appVersion", "INTEGER");
        e0Var.f398487c[2] = "reportId";
        e0Var.f398488d.put("reportId", "INTEGER");
        e0Var.f398487c[3] = "launchFallbackDirectlyMinVersion";
        e0Var.f398488d.put("launchFallbackDirectlyMinVersion", "INTEGER default '-1' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " username TEXT PRIMARY KEY ,  appVersion INTEGER,  reportId INTEGER,  launchFallbackDirectlyMinVersion INTEGER default '-1' ";
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
            if (f321948m == hashCode) {
                try {
                    this.f68629xdec927b = cursor.getString(i17);
                    this.f321955d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321949n == hashCode) {
                try {
                    this.f68626x119cf7dc = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321950o == hashCode) {
                try {
                    this.f68628x44eeb14 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321951p == hashCode) {
                try {
                    this.f68627x2ba56136 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321952q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321955d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f68629xdec927b);
        }
        if (this.f321956e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.f68626x119cf7dc));
        }
        if (this.f321957f) {
            contentValues.put("reportId", java.lang.Integer.valueOf(this.f68628x44eeb14));
        }
        if (this.f321958g) {
            contentValues.put("launchFallbackDirectlyMinVersion", java.lang.Integer.valueOf(this.f68627x2ba56136));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaAttrVersionServerNotifyRecord ( ");
        l75.e0 e0Var = f321953r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321947i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTableSql %s", str2);
            k0Var.A("WxaAttrVersionServerNotifyRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaAttrVersionServerNotifyRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "updateTableSql %s", str3);
            k0Var.A("WxaAttrVersionServerNotifyRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAttrVersionServerNotifyRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321953r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321954s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68629xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321946h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321946h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f68629xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f321955d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.f68626x119cf7dc = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f321956e = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.f68628x44eeb14 = contentValues.getAsInteger("reportId").intValue();
            if (z17) {
                this.f321957f = true;
            }
        }
        if (contentValues.containsKey("launchFallbackDirectlyMinVersion")) {
            this.f68627x2ba56136 = contentValues.getAsInteger("launchFallbackDirectlyMinVersion").intValue();
            if (z17) {
                this.f321958g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
