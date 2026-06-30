package dm;

/* loaded from: classes13.dex */
public class qa extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f321000p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f321001q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321002r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321003s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321004t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321005u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321006v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321007w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321008x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321009y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321010z;

    /* renamed from: field_action */
    public int f68075xf102ad1b;

    /* renamed from: field_city */
    public java.lang.String f68076x225a3d90;

    /* renamed from: field_dayOfWeek */
    public int f68077x6f12d422;

    /* renamed from: field_hourOfDay */
    public int f68078xd557edbc;

    /* renamed from: field_owner */
    public java.lang.String f68079x299cd32e;

    /* renamed from: field_snsid */
    public java.lang.String f68080x29d12d0e;

    /* renamed from: field_timestamp */
    public long f68081x9de75411;

    /* renamed from: field_type */
    public int f68082x2262335f;

    /* renamed from: field_weishang */
    public int f68083xfff66e8f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321011d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321012e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321013f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321014g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321015h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321016i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321017m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321018n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321019o = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsFeature");
        f321000p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321001q = new java.lang.String[0];
        f321002r = 109595795;
        f321003s = 106164915;
        f321004t = -1422950858;
        f321005u = -730552025;
        f321006v = 985252545;
        f321007w = 3575610;
        f321008x = 3053931;
        f321009y = -499948310;
        f321010z = 55126294;
        A = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "snsid";
        ((java.util.HashMap) e0Var.f398488d).put("snsid", "TEXT");
        e0Var.f398487c[1] = "owner";
        ((java.util.HashMap) e0Var.f398488d).put("owner", "TEXT");
        e0Var.f398487c[2] = "action";
        ((java.util.HashMap) e0Var.f398488d).put("action", "INTEGER");
        e0Var.f398487c[3] = "dayOfWeek";
        ((java.util.HashMap) e0Var.f398488d).put("dayOfWeek", "INTEGER");
        e0Var.f398487c[4] = "hourOfDay";
        ((java.util.HashMap) e0Var.f398488d).put("hourOfDay", "INTEGER");
        e0Var.f398487c[5] = "type";
        ((java.util.HashMap) e0Var.f398488d).put("type", "INTEGER");
        e0Var.f398487c[6] = "city";
        ((java.util.HashMap) e0Var.f398488d).put("city", "TEXT");
        e0Var.f398487c[7] = "weishang";
        ((java.util.HashMap) e0Var.f398488d).put("weishang", "INTEGER");
        e0Var.f398487c[8] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        ((java.util.HashMap) e0Var.f398488d).put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " snsid TEXT,  owner TEXT,  action INTEGER,  dayOfWeek INTEGER,  hourOfDay INTEGER,  type INTEGER,  city TEXT,  weishang INTEGER,  timestamp LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        B = e0Var;
        C = new o75.e();
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
            if (f321002r == hashCode) {
                try {
                    this.f68080x29d12d0e = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321003s == hashCode) {
                try {
                    this.f68079x299cd32e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321004t == hashCode) {
                try {
                    this.f68075xf102ad1b = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321005u == hashCode) {
                try {
                    this.f68077x6f12d422 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321006v == hashCode) {
                try {
                    this.f68078xd557edbc = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321007w == hashCode) {
                try {
                    this.f68082x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321008x == hashCode) {
                try {
                    this.f68076x225a3d90 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321009y == hashCode) {
                try {
                    this.f68083xfff66e8f = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321010z == hashCode) {
                try {
                    this.f68081x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsFeature", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321011d) {
            contentValues.put("snsid", this.f68080x29d12d0e);
        }
        if (this.f321012e) {
            contentValues.put("owner", this.f68079x299cd32e);
        }
        if (this.f321013f) {
            contentValues.put("action", java.lang.Integer.valueOf(this.f68075xf102ad1b));
        }
        if (this.f321014g) {
            contentValues.put("dayOfWeek", java.lang.Integer.valueOf(this.f68077x6f12d422));
        }
        if (this.f321015h) {
            contentValues.put("hourOfDay", java.lang.Integer.valueOf(this.f68078xd557edbc));
        }
        if (this.f321016i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f68082x2262335f));
        }
        if (this.f321017m) {
            contentValues.put("city", this.f68076x225a3d90);
        }
        if (this.f321018n) {
            contentValues.put("weishang", java.lang.Integer.valueOf(this.f68083xfff66e8f));
        }
        if (this.f321019o) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f68081x9de75411));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsFeature", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsFeature ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321001q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsFeature", "createTableSql %s", str2);
            k0Var.A("SnsFeature", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsFeature", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsFeature", "updateTableSql %s", str3);
            k0Var.A("SnsFeature", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsFeature", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321000p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321000p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("snsid")) {
            this.f68080x29d12d0e = contentValues.getAsString("snsid");
            if (z17) {
                this.f321011d = true;
            }
        }
        if (contentValues.containsKey("owner")) {
            this.f68079x299cd32e = contentValues.getAsString("owner");
            if (z17) {
                this.f321012e = true;
            }
        }
        if (contentValues.containsKey("action")) {
            this.f68075xf102ad1b = contentValues.getAsInteger("action").intValue();
            if (z17) {
                this.f321013f = true;
            }
        }
        if (contentValues.containsKey("dayOfWeek")) {
            this.f68077x6f12d422 = contentValues.getAsInteger("dayOfWeek").intValue();
            if (z17) {
                this.f321014g = true;
            }
        }
        if (contentValues.containsKey("hourOfDay")) {
            this.f68078xd557edbc = contentValues.getAsInteger("hourOfDay").intValue();
            if (z17) {
                this.f321015h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f68082x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f321016i = true;
            }
        }
        if (contentValues.containsKey("city")) {
            this.f68076x225a3d90 = contentValues.getAsString("city");
            if (z17) {
                this.f321017m = true;
            }
        }
        if (contentValues.containsKey("weishang")) {
            this.f68083xfff66e8f = contentValues.getAsInteger("weishang").intValue();
            if (z17) {
                this.f321018n = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f68081x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f321019o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
