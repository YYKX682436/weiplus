package dm;

/* loaded from: classes4.dex */
public class a8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f317196h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317197i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317198m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317199n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317200o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317201p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317202q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f317203r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f317204s;

    /* renamed from: field_bizName */
    public java.lang.String f65900x6ebe57f9;

    /* renamed from: field_frameSetHeight */
    public int f65901x1c542321;

    /* renamed from: field_frameSetName */
    public java.lang.String f65902xf11f4305;

    /* renamed from: field_frameSetRootPath */
    public java.lang.String f65903x828b13a1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317205d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317206e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317207f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317208g = true;

    static {
        p75.n0 n0Var = new p75.n0("MagicSclFrameSetInfo");
        f317196h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317197i = new java.lang.String[0];
        f317198m = -97801666;
        f317199n = -453798944;
        f317200o = 1817684284;
        f317201p = -540705028;
        f317202q = 108705909;
        f317203r = m124791x3593deb(dm.a8.class);
        f317204s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124791x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "bizName";
        e0Var.f398488d.put("bizName", "TEXT");
        e0Var.f398487c[1] = "frameSetName";
        e0Var.f398488d.put("frameSetName", "TEXT");
        e0Var.f398487c[2] = "frameSetHeight";
        e0Var.f398488d.put("frameSetHeight", "INTEGER");
        e0Var.f398487c[3] = "frameSetRootPath";
        e0Var.f398488d.put("frameSetRootPath", "TEXT");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " bizName TEXT,  frameSetName TEXT,  frameSetHeight INTEGER,  frameSetRootPath TEXT";
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
            if (f317198m == hashCode) {
                try {
                    this.f65900x6ebe57f9 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317199n == hashCode) {
                try {
                    this.f65902xf11f4305 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317200o == hashCode) {
                try {
                    this.f65901x1c542321 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317201p == hashCode) {
                try {
                    this.f65903x828b13a1 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMagicSclFrameSetInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317202q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317205d) {
            contentValues.put("bizName", this.f65900x6ebe57f9);
        }
        if (this.f317206e) {
            contentValues.put("frameSetName", this.f65902xf11f4305);
        }
        if (this.f317207f) {
            contentValues.put("frameSetHeight", java.lang.Integer.valueOf(this.f65901x1c542321));
        }
        if (this.f317208g) {
            contentValues.put("frameSetRootPath", this.f65903x828b13a1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MagicSclFrameSetInfo ( ");
        l75.e0 e0Var = f317203r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317197i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "createTableSql %s", str2);
            k0Var.A("MagicSclFrameSetInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MagicSclFrameSetInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "updateTableSql %s", str3);
            k0Var.A("MagicSclFrameSetInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMagicSclFrameSetInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317203r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317204s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317196h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317196h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizName")) {
            this.f65900x6ebe57f9 = contentValues.getAsString("bizName");
            if (z17) {
                this.f317205d = true;
            }
        }
        if (contentValues.containsKey("frameSetName")) {
            this.f65902xf11f4305 = contentValues.getAsString("frameSetName");
            if (z17) {
                this.f317206e = true;
            }
        }
        if (contentValues.containsKey("frameSetHeight")) {
            this.f65901x1c542321 = contentValues.getAsInteger("frameSetHeight").intValue();
            if (z17) {
                this.f317207f = true;
            }
        }
        if (contentValues.containsKey("frameSetRootPath")) {
            this.f65903x828b13a1 = contentValues.getAsString("frameSetRootPath");
            if (z17) {
                this.f317208g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
