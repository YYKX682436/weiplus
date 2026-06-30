package dm;

/* loaded from: classes4.dex */
public class pb extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320793h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320794i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320795m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320796n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320797o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320798p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320799q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f320800r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f320801s;

    /* renamed from: field_canvasExt */
    public java.lang.String f67958xd73ca8a4;

    /* renamed from: field_canvasId */
    public java.lang.String f67959x17759238;

    /* renamed from: field_canvasXml */
    public java.lang.String f67960xd73cee9a;

    /* renamed from: field_createTime */
    public long f67961xac3be4e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320802d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320803e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320804f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320805g = true;

    static {
        p75.n0 n0Var = new p75.n0("UxCanvasInfo");
        f320793h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320794i = new java.lang.String[0];
        f320795m = -105740141;
        f320796n = 1017037727;
        f320797o = 1369213417;
        f320798p = 1017019817;
        f320799q = 108705909;
        f320800r = m125404x3593deb(dm.pb.class);
        f320801s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125404x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "canvasId";
        e0Var.f398488d.put("canvasId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "canvasId";
        e0Var.f398487c[1] = "canvasXml";
        e0Var.f398488d.put("canvasXml", "TEXT");
        e0Var.f398487c[2] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[3] = "canvasExt";
        e0Var.f398488d.put("canvasExt", "TEXT");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " canvasId TEXT PRIMARY KEY ,  canvasXml TEXT,  createTime LONG,  canvasExt TEXT";
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
            if (f320795m == hashCode) {
                try {
                    this.f67959x17759238 = cursor.getString(i17);
                    this.f320802d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUxCanvasInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320796n == hashCode) {
                try {
                    this.f67960xd73cee9a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUxCanvasInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320797o == hashCode) {
                try {
                    this.f67961xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUxCanvasInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320798p == hashCode) {
                try {
                    this.f67958xd73ca8a4 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUxCanvasInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320799q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320802d) {
            contentValues.put("canvasId", this.f67959x17759238);
        }
        if (this.f320803e) {
            contentValues.put("canvasXml", this.f67960xd73cee9a);
        }
        if (this.f320804f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67961xac3be4e));
        }
        if (this.f320805g) {
            contentValues.put("canvasExt", this.f67958xd73ca8a4);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseUxCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS UxCanvasInfo ( ");
        l75.e0 e0Var = f320800r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320794i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseUxCanvasInfo", "createTableSql %s", str2);
            k0Var.A("UxCanvasInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "UxCanvasInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseUxCanvasInfo", "updateTableSql %s", str3);
            k0Var.A("UxCanvasInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseUxCanvasInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320800r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320801s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67959x17759238;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320793h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320793h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("canvasId")) {
            this.f67959x17759238 = contentValues.getAsString("canvasId");
            if (z17) {
                this.f320802d = true;
            }
        }
        if (contentValues.containsKey("canvasXml")) {
            this.f67960xd73cee9a = contentValues.getAsString("canvasXml");
            if (z17) {
                this.f320803e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67961xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f320804f = true;
            }
        }
        if (contentValues.containsKey("canvasExt")) {
            this.f67958xd73ca8a4 = contentValues.getAsString("canvasExt");
            if (z17) {
                this.f320805g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
