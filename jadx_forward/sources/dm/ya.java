package dm;

/* loaded from: classes4.dex */
public class ya extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f322788h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f322789i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f322790m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322791n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322792o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322793p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322794q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f322795r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f322796s;

    /* renamed from: field_bottom */
    public long f69211xf360c910;

    /* renamed from: field_size */
    public int f69212x22618426;

    /* renamed from: field_state */
    public int f69213x29d3a50c;

    /* renamed from: field_top */
    public long f69214x4b6e8490;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322797d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322798e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322799f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322800g = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsWsFoldGroup");
        f322788h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322789i = new java.lang.String[0];
        f322790m = 115029;
        f322791n = -1383228885;
        f322792o = 3530753;
        f322793p = 109757585;
        f322794q = 108705909;
        f322795r = m125716x3593deb(dm.ya.class);
        f322796s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125716x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "top";
        e0Var.f398488d.put("top", "LONG");
        e0Var.f398487c[1] = "bottom";
        e0Var.f398488d.put("bottom", "LONG PRIMARY KEY ");
        e0Var.f398486b = "bottom";
        e0Var.f398487c[2] = "size";
        e0Var.f398488d.put("size", "INTEGER");
        e0Var.f398487c[3] = "state";
        e0Var.f398488d.put("state", "INTEGER");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " top LONG,  bottom LONG PRIMARY KEY ,  size INTEGER,  state INTEGER";
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
            if (f322790m == hashCode) {
                try {
                    this.f69214x4b6e8490 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroup", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322791n == hashCode) {
                try {
                    this.f69211xf360c910 = cursor.getLong(i17);
                    this.f322798e = true;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroup", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322792o == hashCode) {
                try {
                    this.f69212x22618426 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroup", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322793p == hashCode) {
                try {
                    this.f69213x29d3a50c = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsWsFoldGroup", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322794q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322797d) {
            contentValues.put("top", java.lang.Long.valueOf(this.f69214x4b6e8490));
        }
        if (this.f322798e) {
            contentValues.put("bottom", java.lang.Long.valueOf(this.f69211xf360c910));
        }
        if (this.f322799f) {
            contentValues.put("size", java.lang.Integer.valueOf(this.f69212x22618426));
        }
        if (this.f322800g) {
            contentValues.put("state", java.lang.Integer.valueOf(this.f69213x29d3a50c));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsWsFoldGroup ( ");
        l75.e0 e0Var = f322795r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322789i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTableSql %s", str2);
            k0Var.A("SnsWsFoldGroup", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsWsFoldGroup", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroup", "updateTableSql %s", str3);
            k0Var.A("SnsWsFoldGroup", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsWsFoldGroup", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322795r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322796s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f69211xf360c910);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322788h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322788h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("top")) {
            this.f69214x4b6e8490 = contentValues.getAsLong("top").longValue();
            if (z17) {
                this.f322797d = true;
            }
        }
        if (contentValues.containsKey("bottom")) {
            this.f69211xf360c910 = contentValues.getAsLong("bottom").longValue();
            if (z17) {
                this.f322798e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f69212x22618426 = contentValues.getAsInteger("size").intValue();
            if (z17) {
                this.f322799f = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.f69213x29d3a50c = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f322800g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
