package dm;

/* loaded from: classes4.dex */
public class r2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f321108g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f321109h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321110i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321111m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321112n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321113o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f321114p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f321115q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321116d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321117e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321118f = true;

    /* renamed from: field_configID */
    public java.lang.String f68140xfb2ecd82;

    /* renamed from: field_data */
    public java.lang.String f68141x225a93cf;

    /* renamed from: field_reportTimeEC */
    public long f68142x313a15a4;

    static {
        p75.n0 n0Var = new p75.n0("EdgeComputingCacheDataModel");
        f321108g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321109h = new java.lang.String[0];
        f321110i = -580140067;
        f321111m = 621700735;
        f321112n = 3076010;
        f321113o = 108705909;
        f321114p = m125441x3593deb(dm.r2.class);
        f321115q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125441x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "configID";
        e0Var.f398488d.put("configID", "TEXT");
        e0Var.f398487c[1] = "reportTimeEC";
        e0Var.f398488d.put("reportTimeEC", "LONG");
        e0Var.f398487c[2] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "TEXT");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " configID TEXT,  reportTimeEC LONG,  data TEXT";
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
            if (f321110i == hashCode) {
                try {
                    this.f68140xfb2ecd82 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321111m == hashCode) {
                try {
                    this.f68142x313a15a4 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321112n == hashCode) {
                try {
                    this.f68141x225a93cf = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321113o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321116d) {
            contentValues.put("configID", this.f68140xfb2ecd82);
        }
        if (this.f321117e) {
            contentValues.put("reportTimeEC", java.lang.Long.valueOf(this.f68142x313a15a4));
        }
        if (this.f321118f) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f68141x225a93cf);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EdgeComputingCacheDataModel ( ");
        l75.e0 e0Var = f321114p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321109h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTableSql %s", str2);
            k0Var.A("EdgeComputingCacheDataModel", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EdgeComputingCacheDataModel", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "updateTableSql %s", str3);
            k0Var.A("EdgeComputingCacheDataModel", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEdgeComputingCacheDataModel", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321114p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321115q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321108g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321108g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("configID")) {
            this.f68140xfb2ecd82 = contentValues.getAsString("configID");
            if (z17) {
                this.f321116d = true;
            }
        }
        if (contentValues.containsKey("reportTimeEC")) {
            this.f68142x313a15a4 = contentValues.getAsLong("reportTimeEC").longValue();
            if (z17) {
                this.f321117e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            this.f68141x225a93cf = contentValues.getAsString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (z17) {
                this.f321118f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
