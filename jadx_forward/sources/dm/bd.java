package dm;

/* loaded from: classes4.dex */
public class bd extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f317495f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f317496g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f317497h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f317498i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317499m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f317500n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f317501o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317502d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317503e = true;

    /* renamed from: field_appId */
    public java.lang.String f66019x28d45f97;

    /* renamed from: field_securityKeySalt */
    public java.lang.String f66020x8584c6b0;

    static {
        p75.n0 n0Var = new p75.n0("WxaSecurityStorageInfo");
        f317495f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317496g = new java.lang.String[0];
        f317497h = 93028124;
        f317498i = 905053173;
        f317499m = 108705909;
        f317500n = m124827x3593deb(dm.bd.class);
        f317501o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124827x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "securityKeySalt";
        e0Var.f398488d.put("securityKeySalt", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " appId TEXT,  securityKeySalt TEXT";
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
            if (f317497h == hashCode) {
                try {
                    this.f66019x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaSecurityStorageInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317498i == hashCode) {
                try {
                    this.f66020x8584c6b0 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaSecurityStorageInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317499m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317502d) {
            contentValues.put("appId", this.f66019x28d45f97);
        }
        if (this.f317503e) {
            contentValues.put("securityKeySalt", this.f66020x8584c6b0);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaSecurityStorageInfo ( ");
        l75.e0 e0Var = f317500n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317496g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTableSql %s", str2);
            k0Var.A("WxaSecurityStorageInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaSecurityStorageInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "updateTableSql %s", str3);
            k0Var.A("WxaSecurityStorageInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaSecurityStorageInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317500n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317501o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317495f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317495f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f66019x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f317502d = true;
            }
        }
        if (contentValues.containsKey("securityKeySalt")) {
            this.f66020x8584c6b0 = contentValues.getAsString("securityKeySalt");
            if (z17) {
                this.f317503e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
