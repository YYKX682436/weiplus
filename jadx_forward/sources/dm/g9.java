package dm;

/* loaded from: classes4.dex */
public class g9 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f318707h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318708i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318709m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318710n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318711o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318712p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318713q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f318714r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f318715s;

    /* renamed from: field_key */
    public java.lang.String f66667x4b6e619a;

    /* renamed from: field_scene */
    public int f66668x29cbf907;

    /* renamed from: field_updateTime */
    public long f66669xa783a79b;

    /* renamed from: field_version */
    public int f66670x8987ca93;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318716d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318717e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318718f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318719g = true;

    static {
        p75.n0 n0Var = new p75.n0("PkgUpdateStats");
        f318707h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318708i = new java.lang.String[0];
        f318709m = 106079;
        f318710n = 351608024;
        f318711o = 109254796;
        f318712p = -295931082;
        f318713q = 108705909;
        f318714r = m125008x3593deb(dm.g9.class);
        f318715s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125008x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT");
        e0Var.f398487c[1] = "version";
        e0Var.f398488d.put("version", "INTEGER");
        e0Var.f398487c[2] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " key TEXT,  version INTEGER,  scene INTEGER,  updateTime LONG";
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
            if (f318709m == hashCode) {
                try {
                    this.f66667x4b6e619a = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUpdateStats", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318710n == hashCode) {
                try {
                    this.f66670x8987ca93 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUpdateStats", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318711o == hashCode) {
                try {
                    this.f66668x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUpdateStats", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318712p == hashCode) {
                try {
                    this.f66669xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUpdateStats", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318713q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318716d) {
            contentValues.put("key", this.f66667x4b6e619a);
        }
        if (this.f318717e) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f66670x8987ca93));
        }
        if (this.f318718f) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f66668x29cbf907));
        }
        if (this.f318719g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66669xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePkgUpdateStats", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PkgUpdateStats ( ");
        l75.e0 e0Var = f318714r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318708i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePkgUpdateStats", "createTableSql %s", str2);
            k0Var.A("PkgUpdateStats", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PkgUpdateStats", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePkgUpdateStats", "updateTableSql %s", str3);
            k0Var.A("PkgUpdateStats", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePkgUpdateStats", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318714r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318715s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318707h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318707h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f66667x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f318716d = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f66670x8987ca93 = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f318717e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f66668x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f318718f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66669xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f318719g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
