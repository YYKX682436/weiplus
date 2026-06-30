package dm;

/* loaded from: classes7.dex */
public class j6 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f319340i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f319341m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319342n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319343o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319344p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319345q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319346r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319347s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f319348t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f319349u;

    /* renamed from: field_appusername */
    public java.lang.String f67114x84a2aa32;

    /* renamed from: field_rankID */
    public java.lang.String f67115xde6292c;

    /* renamed from: field_sort */
    public int f67116x226199c3;

    /* renamed from: field_step */
    public int f67117x2261aaf1;

    /* renamed from: field_username */
    public java.lang.String f67118xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319350d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319351e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319352f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319353g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319354h = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceRankFollowInfo");
        f319340i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319341m = new java.lang.String[0];
        f319342n = 417550839;
        f319343o = -938280377;
        f319344p = -265713450;
        f319345q = 3540684;
        f319346r = 3536286;
        f319347s = 108705909;
        f319348t = m125143x3593deb(dm.j6.class);
        f319349u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125143x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "appusername";
        e0Var.f398488d.put("appusername", "TEXT");
        e0Var.f398487c[1] = "rankID";
        e0Var.f398488d.put("rankID", "TEXT");
        e0Var.f398487c[2] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[3] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0, "INTEGER");
        e0Var.f398487c[4] = "sort";
        e0Var.f398488d.put("sort", "INTEGER default '0' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " appusername TEXT,  rankID TEXT,  username TEXT,  step INTEGER,  sort INTEGER default '0' ";
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
            if (f319342n == hashCode) {
                try {
                    this.f67114x84a2aa32 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319343o == hashCode) {
                try {
                    this.f67115xde6292c = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319344p == hashCode) {
                try {
                    this.f67118xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319345q == hashCode) {
                try {
                    this.f67117x2261aaf1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319346r == hashCode) {
                try {
                    this.f67116x226199c3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319347s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319350d) {
            contentValues.put("appusername", this.f67114x84a2aa32);
        }
        if (this.f319351e) {
            contentValues.put("rankID", this.f67115xde6292c);
        }
        if (this.f319352f) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f67118xdec927b);
        }
        if (this.f319353g) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0, java.lang.Integer.valueOf(this.f67117x2261aaf1));
        }
        if (this.f319354h) {
            contentValues.put("sort", java.lang.Integer.valueOf(this.f67116x226199c3));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceRankFollowInfo ( ");
        l75.e0 e0Var = f319348t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319341m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceRankFollowInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardDeviceRankFollowInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceRankFollowInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceRankFollowInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319348t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319349u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319340i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319340i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appusername")) {
            this.f67114x84a2aa32 = contentValues.getAsString("appusername");
            if (z17) {
                this.f319350d = true;
            }
        }
        if (contentValues.containsKey("rankID")) {
            this.f67115xde6292c = contentValues.getAsString("rankID");
            if (z17) {
                this.f319351e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f67118xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f319352f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0)) {
            this.f67117x2261aaf1 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0).intValue();
            if (z17) {
                this.f319353g = true;
            }
        }
        if (contentValues.containsKey("sort")) {
            this.f67116x226199c3 = contentValues.getAsInteger("sort").intValue();
            if (z17) {
                this.f319354h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
