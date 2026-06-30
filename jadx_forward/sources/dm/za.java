package dm;

/* loaded from: classes4.dex */
public class za extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f323071g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f323072h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f323073i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f323074m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f323075n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f323076o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f323077p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f323078q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f323079d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f323080e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323081f = true;

    /* renamed from: field_groupId */
    public long f69422x861009b5;

    /* renamed from: field_groupStrcut */
    public byte[] f69423x99016a0b;

    /* renamed from: field_groupTime */
    public int f69424x423990e7;

    static {
        p75.n0 n0Var = new p75.n0("SnsWsFoldGroupDetail");
        f323071g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f323072h = new java.lang.String[0];
        f323073i = 293428218;
        f323074m = -1482988052;
        f323075n = 759304656;
        f323076o = 108705909;
        f323077p = m125779x3593deb(dm.za.class);
        f323078q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125779x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "groupId";
        e0Var.f398488d.put("groupId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "groupId";
        e0Var.f398487c[1] = "groupTime";
        e0Var.f398488d.put("groupTime", "INTEGER");
        e0Var.f398487c[2] = "groupStrcut";
        e0Var.f398488d.put("groupStrcut", "BLOB");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " groupId LONG PRIMARY KEY ,  groupTime INTEGER,  groupStrcut BLOB";
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
            if (f323073i == hashCode) {
                try {
                    this.f69422x861009b5 = cursor.getLong(i17);
                    this.f323079d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323074m == hashCode) {
                try {
                    this.f69424x423990e7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323075n == hashCode) {
                try {
                    this.f69423x99016a0b = cursor.getBlob(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f323076o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f323079d) {
            contentValues.put("groupId", java.lang.Long.valueOf(this.f69422x861009b5));
        }
        if (this.f323080e) {
            contentValues.put("groupTime", java.lang.Integer.valueOf(this.f69424x423990e7));
        }
        if (this.f323081f) {
            contentValues.put("groupStrcut", this.f69423x99016a0b);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsWsFoldGroupDetail ( ");
        l75.e0 e0Var = f323077p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f323072h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTableSql %s", str2);
            k0Var.A("SnsWsFoldGroupDetail", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsWsFoldGroupDetail", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "updateTableSql %s", str3);
            k0Var.A("SnsWsFoldGroupDetail", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroupDetail", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f323077p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f323078q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f69422x861009b5);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f323071g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f323071g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("groupId")) {
            this.f69422x861009b5 = contentValues.getAsLong("groupId").longValue();
            if (z17) {
                this.f323079d = true;
            }
        }
        if (contentValues.containsKey("groupTime")) {
            this.f69424x423990e7 = contentValues.getAsInteger("groupTime").intValue();
            if (z17) {
                this.f323080e = true;
            }
        }
        if (contentValues.containsKey("groupStrcut")) {
            this.f69423x99016a0b = contentValues.getAsByteArray("groupStrcut");
            if (z17) {
                this.f323081f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
