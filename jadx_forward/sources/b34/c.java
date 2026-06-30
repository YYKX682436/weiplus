package b34;

/* loaded from: classes8.dex */
public class c extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f99250i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f99251m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f99252n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f99253o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f99254p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f99255q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f99256r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f99257s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f99258t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f99259u;

    /* renamed from: field_createtime */
    public long f4174xad24a2e;

    /* renamed from: field_deeplink */
    public java.lang.String f4175x4344608b;

    /* renamed from: field_iconurl */
    public java.lang.String f4176xd640b811;

    /* renamed from: field_title */
    public java.lang.String f4177x29dd02d3;

    /* renamed from: field_username */
    public java.lang.String f4178xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99260d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99261e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99262f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99263g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f99264h = true;

    static {
        p75.n0 n0Var = new p75.n0("ShakeTvHistory");
        f99250i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f99251m = new java.lang.String[0];
        f99252n = -265713450;
        f99253o = 629233382;
        f99254p = 110371416;
        f99255q = 1638795862;
        f99256r = 1370166729;
        f99257s = 108705909;
        f99258t = m9772x3593deb(b34.c.class);
        f99259u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m9772x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "deeplink";
        e0Var.f398488d.put("deeplink", "TEXT default '' ");
        e0Var.f398487c[2] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT default '' ");
        e0Var.f398487c[3] = "iconurl";
        e0Var.f398488d.put("iconurl", "TEXT default '' ");
        e0Var.f398487c[4] = "createtime";
        e0Var.f398488d.put("createtime", "LONG default '' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  deeplink TEXT default '' ,  title TEXT default '' ,  iconurl TEXT default '' ,  createtime LONG default '' ";
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
            if (f99252n == hashCode) {
                try {
                    this.f4178xdec927b = cursor.getString(i17);
                    this.f99260d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeTvHistory", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99253o == hashCode) {
                try {
                    this.f4175x4344608b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeTvHistory", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99254p == hashCode) {
                try {
                    this.f4177x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeTvHistory", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99255q == hashCode) {
                try {
                    this.f4176xd640b811 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeTvHistory", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99256r == hashCode) {
                try {
                    this.f4174xad24a2e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShakeTvHistory", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f99257s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f4178xdec927b == null) {
            this.f4178xdec927b = "";
        }
        if (this.f99260d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f4178xdec927b);
        }
        if (this.f4175x4344608b == null) {
            this.f4175x4344608b = "";
        }
        if (this.f99261e) {
            contentValues.put("deeplink", this.f4175x4344608b);
        }
        if (this.f4177x29dd02d3 == null) {
            this.f4177x29dd02d3 = "";
        }
        if (this.f99262f) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f4177x29dd02d3);
        }
        if (this.f4176xd640b811 == null) {
            this.f4176xd640b811 = "";
        }
        if (this.f99263g) {
            contentValues.put("iconurl", this.f4176xd640b811);
        }
        if (this.f99264h) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f4174xad24a2e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseShakeTvHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeTvHistory ( ");
        l75.e0 e0Var = f99258t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f99251m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeTvHistory", "createTableSql %s", str2);
            k0Var.A("ShakeTvHistory", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ShakeTvHistory", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeTvHistory", "updateTableSql %s", str3);
            k0Var.A("ShakeTvHistory", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShakeTvHistory", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f99258t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f99259u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f4178xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f99250i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f99250i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f4178xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f99260d = true;
            }
        }
        if (contentValues.containsKey("deeplink")) {
            this.f4175x4344608b = contentValues.getAsString("deeplink");
            if (z17) {
                this.f99261e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f4177x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f99262f = true;
            }
        }
        if (contentValues.containsKey("iconurl")) {
            this.f4176xd640b811 = contentValues.getAsString("iconurl");
            if (z17) {
                this.f99263g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.f4174xad24a2e = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f99264h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
