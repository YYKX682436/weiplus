package dm;

/* loaded from: classes4.dex */
public class i0 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f319024h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f319025i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319026m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319027n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319028o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319029p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319030q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f319031r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f319032s;

    /* renamed from: field_recordId */
    public int f66816xee1faef1;

    /* renamed from: field_updateTime */
    public long f66817xa783a79b;

    /* renamed from: field_username */
    public java.lang.String f66818xdec927b;

    /* renamed from: field_versionType */
    public int f66819x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319033d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319034e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319035f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319036g = true;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandTaskRecentApp");
        f319024h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319025i = new java.lang.String[0];
        f319026m = -799234740;
        f319027n = -265713450;
        f319028o = 689108018;
        f319029p = -295931082;
        f319030q = 108705909;
        f319031r = m125046x3593deb(dm.i0.class);
        f319032s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125046x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "recordId";
        e0Var.f398488d.put("recordId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "recordId";
        e0Var.f398487c[1] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[2] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " recordId INTEGER PRIMARY KEY ,  username TEXT,  versionType INTEGER,  updateTime LONG";
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
            if (f319026m == hashCode) {
                try {
                    this.f66816xee1faef1 = cursor.getInt(i17);
                    this.f319033d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319027n == hashCode) {
                try {
                    this.f66818xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319028o == hashCode) {
                try {
                    this.f66819x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319029p == hashCode) {
                try {
                    this.f66817xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandTaskRecentApp", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319030q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319033d) {
            contentValues.put("recordId", java.lang.Integer.valueOf(this.f66816xee1faef1));
        }
        if (this.f319034e) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66818xdec927b);
        }
        if (this.f319035f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f66819x94d24c6d));
        }
        if (this.f319036g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66817xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandTaskRecentApp ( ");
        l75.e0 e0Var = f319031r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319025i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "createTableSql %s", str2);
            k0Var.A("AppBrandTaskRecentApp", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandTaskRecentApp", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "updateTableSql %s", str3);
            k0Var.A("AppBrandTaskRecentApp", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandTaskRecentApp", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319031r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319032s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f66816xee1faef1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319024h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319024h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.f66816xee1faef1 = contentValues.getAsInteger("recordId").intValue();
            if (z17) {
                this.f319033d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66818xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f319034e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f66819x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f319035f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66817xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f319036g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
