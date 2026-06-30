package dm;

/* loaded from: classes7.dex */
public class h6 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f318910i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f318911m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318912n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318913o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318914p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318915q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318916r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318917s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f318918t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f318919u;

    /* renamed from: field_appusername */
    public java.lang.String f66780x84a2aa32;

    /* renamed from: field_liketips */
    public java.lang.String f66781x5f8c68f4;

    /* renamed from: field_rankID */
    public java.lang.String f66782xde6292c;

    /* renamed from: field_timestamp */
    public int f66783x9de75411;

    /* renamed from: field_username */
    public java.lang.String f66784xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318920d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318921e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318922f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318923g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318924h = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceLikeUser");
        f318910i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318911m = new java.lang.String[0];
        f318912n = -938280377;
        f318913o = 417550839;
        f318914p = -265713450;
        f318915q = 55126294;
        f318916r = 1103716175;
        f318917s = 108705909;
        f318918t = m125029x3593deb(dm.h6.class);
        f318919u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125029x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "rankID";
        e0Var.f398488d.put("rankID", "TEXT");
        e0Var.f398487c[1] = "appusername";
        e0Var.f398488d.put("appusername", "TEXT");
        e0Var.f398487c[2] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[3] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "INTEGER default '0' ");
        e0Var.f398487c[4] = "liketips";
        e0Var.f398488d.put("liketips", "TEXT default '' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " rankID TEXT,  appusername TEXT,  username TEXT,  timestamp INTEGER default '0' ,  liketips TEXT default '' ";
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
            if (f318912n == hashCode) {
                try {
                    this.f66782xde6292c = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceLikeUser", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318913o == hashCode) {
                try {
                    this.f66780x84a2aa32 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceLikeUser", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318914p == hashCode) {
                try {
                    this.f66784xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceLikeUser", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318915q == hashCode) {
                try {
                    this.f66783x9de75411 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceLikeUser", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318916r == hashCode) {
                try {
                    this.f66781x5f8c68f4 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceLikeUser", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318917s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318920d) {
            contentValues.put("rankID", this.f66782xde6292c);
        }
        if (this.f318921e) {
            contentValues.put("appusername", this.f66780x84a2aa32);
        }
        if (this.f318922f) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66784xdec927b);
        }
        if (this.f318923g) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Integer.valueOf(this.f66783x9de75411));
        }
        if (this.f66781x5f8c68f4 == null) {
            this.f66781x5f8c68f4 = "";
        }
        if (this.f318924h) {
            contentValues.put("liketips", this.f66781x5f8c68f4);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceLikeUser ( ");
        l75.e0 e0Var = f318918t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318911m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTableSql %s", str2);
            k0Var.A("HardDeviceLikeUser", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardDeviceLikeUser", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceLikeUser", "updateTableSql %s", str3);
            k0Var.A("HardDeviceLikeUser", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceLikeUser", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318918t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318919u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318910i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318910i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("rankID")) {
            this.f66782xde6292c = contentValues.getAsString("rankID");
            if (z17) {
                this.f318920d = true;
            }
        }
        if (contentValues.containsKey("appusername")) {
            this.f66780x84a2aa32 = contentValues.getAsString("appusername");
            if (z17) {
                this.f318921e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66784xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f318922f = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f66783x9de75411 = contentValues.getAsInteger(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).intValue();
            if (z17) {
                this.f318923g = true;
            }
        }
        if (contentValues.containsKey("liketips")) {
            this.f66781x5f8c68f4 = contentValues.getAsString("liketips");
            if (z17) {
                this.f318924h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
