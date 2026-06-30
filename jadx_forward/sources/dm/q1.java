package dm;

/* loaded from: classes4.dex */
public class q1 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f320889g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f320890h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320891i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320892m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320893n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320894o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f320895p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f320896q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320897d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320898e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320899f = true;

    /* renamed from: field_canvasId */
    public long f68036x17759238;

    /* renamed from: field_canvasXml */
    public java.lang.String f68037xd73cee9a;

    /* renamed from: field_createTime */
    public long f68038xac3be4e;

    static {
        p75.n0 n0Var = new p75.n0("CanvasInfo");
        f320889g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320890h = new java.lang.String[0];
        f320891i = -105740141;
        f320892m = 1017037727;
        f320893n = 1369213417;
        f320894o = 108705909;
        f320895p = m125412x3593deb(dm.q1.class);
        f320896q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125412x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "canvasId";
        e0Var.f398488d.put("canvasId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "canvasId";
        e0Var.f398487c[1] = "canvasXml";
        e0Var.f398488d.put("canvasXml", "TEXT");
        e0Var.f398487c[2] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " canvasId LONG PRIMARY KEY ,  canvasXml TEXT,  createTime LONG";
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
            if (f320891i == hashCode) {
                try {
                    this.f68036x17759238 = cursor.getLong(i17);
                    this.f320897d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCanvasInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320892m == hashCode) {
                try {
                    this.f68037xd73cee9a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCanvasInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320893n == hashCode) {
                try {
                    this.f68038xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCanvasInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320894o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320897d) {
            contentValues.put("canvasId", java.lang.Long.valueOf(this.f68036x17759238));
        }
        if (this.f320898e) {
            contentValues.put("canvasXml", this.f68037xd73cee9a);
        }
        if (this.f320899f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f68038xac3be4e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CanvasInfo ( ");
        l75.e0 e0Var = f320895p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320890h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCanvasInfo", "createTableSql %s", str2);
            k0Var.A("CanvasInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CanvasInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCanvasInfo", "updateTableSql %s", str3);
            k0Var.A("CanvasInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCanvasInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320895p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320896q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68036x17759238);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320889g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320889g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("canvasId")) {
            this.f68036x17759238 = contentValues.getAsLong("canvasId").longValue();
            if (z17) {
                this.f320897d = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.f68037xd73cee9a = contentValues.getAsString("canvasXml");
            if (z17) {
                this.f320898e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f68038xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f320899f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
