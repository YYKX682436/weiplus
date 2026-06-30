package dm;

/* loaded from: classes4.dex */
public class m2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319955g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f319956h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f319957i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319958m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319959n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319960o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f319961p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f319962q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319963d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319964e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319965f = true;

    /* renamed from: field_appId */
    public java.lang.String f67416x28d45f97;

    /* renamed from: field_modifyTime */
    public long f67417x15b870c;

    /* renamed from: field_status */
    public int f67418x10a0fed7;

    static {
        p75.n0 n0Var = new p75.n0("DownloadTaskItem");
        f319955g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319956h = new java.lang.String[0];
        f319957i = 93028124;
        f319958m = -892481550;
        f319959n = 1211388583;
        f319960o = 108705909;
        f319961p = m125216x3593deb(dm.m2.class);
        f319962q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125216x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[2] = "modifyTime";
        e0Var.f398488d.put("modifyTime", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  status INTEGER,  modifyTime LONG";
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
            if (f319957i == hashCode) {
                try {
                    this.f67416x28d45f97 = cursor.getString(i17);
                    this.f319963d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDownloadTaskItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319958m == hashCode) {
                try {
                    this.f67418x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDownloadTaskItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319959n == hashCode) {
                try {
                    this.f67417x15b870c = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDownloadTaskItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319960o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319963d) {
            contentValues.put("appId", this.f67416x28d45f97);
        }
        if (this.f319964e) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f67418x10a0fed7));
        }
        if (this.f319965f) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.f67417x15b870c));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseDownloadTaskItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DownloadTaskItem ( ");
        l75.e0 e0Var = f319961p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319956h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDownloadTaskItem", "createTableSql %s", str2);
            k0Var.A("DownloadTaskItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "DownloadTaskItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDownloadTaskItem", "updateTableSql %s", str3);
            k0Var.A("DownloadTaskItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDownloadTaskItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319961p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319962q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67416x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319955g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319955g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67416x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319963d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f67418x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f319964e = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.f67417x15b870c = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f319965f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
