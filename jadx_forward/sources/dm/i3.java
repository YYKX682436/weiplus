package dm;

/* loaded from: classes12.dex */
public class i3 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f319087g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f319088h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f319089i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f319090m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f319091n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f319092o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319093p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319094q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319095r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319096s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f319097t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f319098u;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319099d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319100e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319101f = false;

    /* renamed from: field_flag */
    private long f66856x225ba391;

    /* renamed from: field_query */
    private java.lang.String f66857x29b7f943;

    /* renamed from: field_updateTime */
    private long f66858xa783a79b;

    static {
        p75.n0 n0Var = new p75.n0("FTS5NativeQueryClickRecallInfo");
        f319087g = n0Var;
        java.lang.String str = n0Var.f434209a;
        f319088h = new p75.d("rowid", "long", str, "");
        f319089i = new p75.d("query", "string", str, "");
        f319090m = new p75.d(dm.i4.f66874x4c6b1f55, "long", str, "");
        f319091n = new p75.d("flag", "long", str, "");
        f319092o = new java.lang.String[0];
        f319093p = 107944136;
        f319094q = -295931082;
        f319095r = 3145580;
        f319096s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "query";
        ((java.util.HashMap) e0Var.f398488d).put("query", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "query";
        e0Var.f398487c[1] = dm.i4.f66874x4c6b1f55;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[2] = "flag";
        ((java.util.HashMap) e0Var.f398488d).put("flag", "LONG default '0' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " query TEXT default ''  PRIMARY KEY ,  updateTime LONG default '0' ,  flag LONG default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f319097t = e0Var;
        f319098u = new o75.e();
    }

    /* renamed from: createTable */
    public static void m125052xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FTS5NativeQueryClickRecallInfo ( ");
        l75.e0 e0Var = f319097t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319092o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTableSql %s", str2);
            k0Var.A("FTS5NativeQueryClickRecallInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FTS5NativeQueryClickRecallInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "updateTableSql %s", str3);
            k0Var.A("FTS5NativeQueryClickRecallInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
            if (f319093p == hashCode) {
                try {
                    this.f66857x29b7f943 = cursor.getString(i17);
                    this.f319099d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319094q == hashCode) {
                try {
                    this.f66858xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319095r == hashCode) {
                try {
                    this.f66856x225ba391 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319096s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66857x29b7f943 == null) {
            this.f66857x29b7f943 = "";
        }
        if (this.f319099d) {
            contentValues.put("query", this.f66857x29b7f943);
        }
        if (this.f319100e) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66858xa783a79b));
        }
        if (this.f319101f) {
            contentValues.put("flag", java.lang.Long.valueOf(this.f66856x225ba391));
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
        m125052xe1f0e832(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319097t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319098u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66857x29b7f943;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319087g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319087g.f434209a;
    }

    /* renamed from: replaceToDB */
    public long m125053x19a4110d(l75.k0 k0Var, boolean z17) {
        m75.d dVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(this.f66857x29b7f943), "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
            cVar.f425123d = this;
            dVar = new m75.d(this, cVar, f319098u, "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
        } else {
            dVar = new m75.d(this, null, null, "MicroMsg.SDK.BaseFTS5NativeQueryClickRecallInfo");
        }
        return dVar.a(k0Var);
    }

    public long t0() {
        return this.f66856x225ba391;
    }

    public java.lang.String u0() {
        return this.f66857x29b7f943;
    }

    public long v0() {
        return this.f66858xa783a79b;
    }

    public void w0(long j17) {
        this.f66856x225ba391 = j17;
        this.f319101f = true;
    }

    public void y0(java.lang.String str) {
        this.f66857x29b7f943 = str;
        this.f319099d = true;
    }

    public void z0(long j17) {
        this.f66858xa783a79b = j17;
        this.f319100e = true;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("query")) {
            this.f66857x29b7f943 = contentValues.getAsString("query");
            if (z17) {
                this.f319099d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66858xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f319100e = true;
            }
        }
        if (contentValues.containsKey("flag")) {
            this.f66856x225ba391 = contentValues.getAsLong("flag").longValue();
            if (z17) {
                this.f319101f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
