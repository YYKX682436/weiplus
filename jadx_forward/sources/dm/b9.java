package dm;

/* loaded from: classes4.dex */
public class b9 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f317432f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f317433g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f317434h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f317435i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317436m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f317437n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f317438o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317439d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317440e = true;

    /* renamed from: field_key */
    public java.lang.String f65997x4b6e619a;

    /* renamed from: field_value */
    public byte[] f65998x29f571ec;

    static {
        p75.n0 n0Var = new p75.n0("PBCache");
        f317432f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317433g = new java.lang.String[0];
        f317434h = 106079;
        f317435i = 111972721;
        f317436m = 108705909;
        f317437n = m124819x3593deb(dm.b9.class);
        f317438o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124819x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "value";
        e0Var.f398488d.put("value", "BLOB");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  value BLOB";
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
            if (f317434h == hashCode) {
                try {
                    this.f65997x4b6e619a = cursor.getString(i17);
                    this.f317439d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePBCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317435i == hashCode) {
                try {
                    this.f65998x29f571ec = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePBCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317436m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317439d) {
            contentValues.put("key", this.f65997x4b6e619a);
        }
        if (this.f317440e) {
            contentValues.put("value", this.f65998x29f571ec);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePBCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PBCache ( ");
        l75.e0 e0Var = f317437n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317433g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePBCache", "createTableSql %s", str2);
            k0Var.A("PBCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PBCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePBCache", "updateTableSql %s", str3);
            k0Var.A("PBCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePBCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317437n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317438o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65997x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317432f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317432f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f65997x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f317439d = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f65998x29f571ec = contentValues.getAsByteArray("value");
            if (z17) {
                this.f317440e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
