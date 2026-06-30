package dm;

/* loaded from: classes4.dex */
public class hb extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f318986f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f318987g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f318988h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318989i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318990m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f318991n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f318992o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318993d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318994e = true;

    /* renamed from: field_tableHash */
    public int f66804x241204f7;

    /* renamed from: field_tableSQLMD5 */
    public java.lang.String f66805x79766299;

    static {
        p75.n0 n0Var = new p75.n0("TablesVersion");
        f318986f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318987g = new java.lang.String[0];
        f318988h = -1988896260;
        f318989i = 230099550;
        f318990m = 108705909;
        f318991n = m125040x3593deb(dm.hb.class);
        f318992o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125040x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "tableHash";
        e0Var.f398488d.put("tableHash", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "tableHash";
        e0Var.f398487c[1] = "tableSQLMD5";
        e0Var.f398488d.put("tableSQLMD5", "TEXT");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " tableHash INTEGER PRIMARY KEY ,  tableSQLMD5 TEXT";
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
            if (f318988h == hashCode) {
                try {
                    this.f66804x241204f7 = cursor.getInt(i17);
                    this.f318993d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTablesVersion", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318989i == hashCode) {
                try {
                    this.f66805x79766299 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTablesVersion", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318990m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318993d) {
            contentValues.put("tableHash", java.lang.Integer.valueOf(this.f66804x241204f7));
        }
        if (this.f318994e) {
            contentValues.put("tableSQLMD5", this.f66805x79766299);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTablesVersion", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TablesVersion ( ");
        l75.e0 e0Var = f318991n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318987g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTablesVersion", "createTableSql %s", str2);
            k0Var.A("TablesVersion", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TablesVersion", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTablesVersion", "updateTableSql %s", str3);
            k0Var.A("TablesVersion", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTablesVersion", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318991n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318992o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f66804x241204f7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318986f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318986f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tableHash")) {
            this.f66804x241204f7 = contentValues.getAsInteger("tableHash").intValue();
            if (z17) {
                this.f318993d = true;
            }
        }
        if (contentValues.containsKey("tableSQLMD5")) {
            this.f66805x79766299 = contentValues.getAsString("tableSQLMD5");
            if (z17) {
                this.f318994e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
