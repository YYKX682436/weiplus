package dm;

/* loaded from: classes4.dex */
public class h9 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f318958h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318959i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318960m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318961n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318962o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318963p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318964q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f318965r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f318966s;

    /* renamed from: field_appId */
    public java.lang.String f66795x28d45f97;

    /* renamed from: field_hit */
    public int f66796x4b6e56ce;

    /* renamed from: field_hitTimeMS */
    public long f66797xff6b4da1;

    /* renamed from: field_type */
    public int f66798x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318967d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318968e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318969f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318970g = true;

    static {
        p75.n0 n0Var = new p75.n0("PkgUsageLRURecord");
        f318958h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318959i = new java.lang.String[0];
        f318960m = 93028124;
        f318961n = 3575610;
        f318962o = 103315;
        f318963p = 1691165350;
        f318964q = 108705909;
        f318965r = m125036x3593deb(dm.h9.class);
        f318966s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125036x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[2] = "hit";
        e0Var.f398488d.put("hit", "INTEGER");
        e0Var.f398487c[3] = "hitTimeMS";
        e0Var.f398488d.put("hitTimeMS", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " appId TEXT,  type INTEGER,  hit INTEGER,  hitTimeMS LONG";
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
            if (f318960m == hashCode) {
                try {
                    this.f66795x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUsageLRURecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318961n == hashCode) {
                try {
                    this.f66798x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUsageLRURecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318962o == hashCode) {
                try {
                    this.f66796x4b6e56ce = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUsageLRURecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318963p == hashCode) {
                try {
                    this.f66797xff6b4da1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePkgUsageLRURecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318964q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318967d) {
            contentValues.put("appId", this.f66795x28d45f97);
        }
        if (this.f318968e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66798x2262335f));
        }
        if (this.f318969f) {
            contentValues.put("hit", java.lang.Integer.valueOf(this.f66796x4b6e56ce));
        }
        if (this.f318970g) {
            contentValues.put("hitTimeMS", java.lang.Long.valueOf(this.f66797xff6b4da1));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePkgUsageLRURecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PkgUsageLRURecord ( ");
        l75.e0 e0Var = f318965r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318959i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePkgUsageLRURecord", "createTableSql %s", str2);
            k0Var.A("PkgUsageLRURecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PkgUsageLRURecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePkgUsageLRURecord", "updateTableSql %s", str3);
            k0Var.A("PkgUsageLRURecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePkgUsageLRURecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318965r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318966s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318958h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318958h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f66795x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f318967d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66798x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318968e = true;
            }
        }
        if (contentValues.containsKey("hit")) {
            this.f66796x4b6e56ce = contentValues.getAsInteger("hit").intValue();
            if (z17) {
                this.f318969f = true;
            }
        }
        if (contentValues.containsKey("hitTimeMS")) {
            this.f66797xff6b4da1 = contentValues.getAsLong("hitTimeMS").longValue();
            if (z17) {
                this.f318970g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
