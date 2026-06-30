package dm;

/* loaded from: classes4.dex */
public class tc extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f321732i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f321733m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321734n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321735o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321736p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321737q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321738r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321739s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f321740t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f321741u;

    /* renamed from: field_appId */
    public java.lang.String f68522x28d45f97;

    /* renamed from: field_appType */
    public int f68523x454032b6;

    /* renamed from: field_gameRewardsData */
    public byte[] f68524x3cc05c57;

    /* renamed from: field_permissionBytes */
    public byte[] f68525xed561697;

    /* renamed from: field_versionType */
    public int f68526x94d24c6d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321742d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321743e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321744f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321745g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321746h = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaAppidABTestInfo");
        f321732i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321733m = new java.lang.String[0];
        f321734n = 93028124;
        f321735o = -793934597;
        f321736p = 689108018;
        f321737q = -1648143396;
        f321738r = -315778660;
        f321739s = 108705909;
        f321740t = m125522x3593deb(dm.tc.class);
        f321741u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125522x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "appType";
        e0Var.f398488d.put("appType", "INTEGER");
        e0Var.f398487c[2] = "versionType";
        e0Var.f398488d.put("versionType", "INTEGER");
        e0Var.f398487c[3] = "permissionBytes";
        e0Var.f398488d.put("permissionBytes", "BLOB");
        e0Var.f398487c[4] = "gameRewardsData";
        e0Var.f398488d.put("gameRewardsData", "BLOB");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " appId TEXT,  appType INTEGER,  versionType INTEGER,  permissionBytes BLOB,  gameRewardsData BLOB";
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
            if (f321734n == hashCode) {
                try {
                    this.f68522x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppidABTestInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321735o == hashCode) {
                try {
                    this.f68523x454032b6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppidABTestInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321736p == hashCode) {
                try {
                    this.f68526x94d24c6d = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppidABTestInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321737q == hashCode) {
                try {
                    this.f68525xed561697 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppidABTestInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321738r == hashCode) {
                try {
                    this.f68524x3cc05c57 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaAppidABTestInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321739s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321742d) {
            contentValues.put("appId", this.f68522x28d45f97);
        }
        if (this.f321743e) {
            contentValues.put("appType", java.lang.Integer.valueOf(this.f68523x454032b6));
        }
        if (this.f321744f) {
            contentValues.put("versionType", java.lang.Integer.valueOf(this.f68526x94d24c6d));
        }
        if (this.f321745g) {
            contentValues.put("permissionBytes", this.f68525xed561697);
        }
        if (this.f321746h) {
            contentValues.put("gameRewardsData", this.f68524x3cc05c57);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaAppidABTestInfo ( ");
        l75.e0 e0Var = f321740t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321733m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTableSql %s", str2);
            k0Var.A("WxaAppidABTestInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaAppidABTestInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "updateTableSql %s", str3);
            k0Var.A("WxaAppidABTestInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaAppidABTestInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321740t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321741u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321732i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321732i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f68522x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f321742d = true;
            }
        }
        if (contentValues.containsKey("appType")) {
            this.f68523x454032b6 = contentValues.getAsInteger("appType").intValue();
            if (z17) {
                this.f321743e = true;
            }
        }
        if (contentValues.containsKey("versionType")) {
            this.f68526x94d24c6d = contentValues.getAsInteger("versionType").intValue();
            if (z17) {
                this.f321744f = true;
            }
        }
        if (contentValues.containsKey("permissionBytes")) {
            this.f68525xed561697 = contentValues.getAsByteArray("permissionBytes");
            if (z17) {
                this.f321745g = true;
            }
        }
        if (contentValues.containsKey("gameRewardsData")) {
            this.f68524x3cc05c57 = contentValues.getAsByteArray("gameRewardsData");
            if (z17) {
                this.f321746h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
