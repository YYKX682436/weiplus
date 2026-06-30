package dm;

/* loaded from: classes4.dex */
public class g3 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318580n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f318581o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f318582p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f318583q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f318584r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f318585s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318586t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318587u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318588v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318589w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318590x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318591y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318592z;

    /* renamed from: field_auxIndex */
    private java.lang.String f66590x784be213;

    /* renamed from: field_docId */
    private int f66591x28fe00ee;

    /* renamed from: field_entityId */
    private long f66592xa0778a03;

    /* renamed from: field_status */
    private int f66593x10a0fed7;

    /* renamed from: field_subType */
    private int f66594x5334f55;

    /* renamed from: field_timestamp */
    private long f66595x9de75411;

    /* renamed from: field_type */
    private int f66596x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318593d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318594e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318595f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318596g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318597h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318598i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318599m = false;

    static {
        p75.n0 n0Var = new p75.n0("FTS5MetaContact");
        f318580n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318581o = new p75.d("type", "int", tableName, "");
        f318582p = new p75.d("subtype", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318583q = new p75.d("aux_index", "string", tableName, "");
        f318584r = new p75.d(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318585s = new java.lang.String[0];
        f318586t = 95757395;
        f318587u = 3575610;
        f318588v = -1867567750;
        f318589w = -740565257;
        f318590x = 467329943;
        f318591y = 55126294;
        f318592z = -892481550;
        A = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "docid";
        ((java.util.HashMap) e0Var.f398488d).put("docid", "INTEGER default '0'  PRIMARY KEY ");
        e0Var.f398486b = "docid";
        e0Var.f398487c[1] = "type";
        ((java.util.HashMap) e0Var.f398488d).put("type", "INTEGER default '0' ");
        e0Var.f398487c[2] = "subtype";
        ((java.util.HashMap) e0Var.f398488d).put("subtype", "INTEGER default '0' ");
        e0Var.f398487c[3] = "entity_id";
        ((java.util.HashMap) e0Var.f398488d).put("entity_id", "LONG default '0' ");
        e0Var.f398487c[4] = "aux_index";
        ((java.util.HashMap) e0Var.f398488d).put("aux_index", "TEXT default '' ");
        e0Var.f398487c[5] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        ((java.util.HashMap) e0Var.f398488d).put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG default '0' ");
        e0Var.f398487c[6] = "status";
        ((java.util.HashMap) e0Var.f398488d).put("status", "INTEGER default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " docid INTEGER default '0'  PRIMARY KEY ,  type INTEGER default '0' ,  subtype INTEGER default '0' ,  entity_id LONG default '0' ,  aux_index TEXT default '' ,  timestamp LONG default '0' ,  status INTEGER default '0' ";
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
            if (f318586t == hashCode) {
                try {
                    this.f66591x28fe00ee = cursor.getInt(i17);
                    this.f318593d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318587u == hashCode) {
                try {
                    this.f66596x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318588v == hashCode) {
                try {
                    this.f66594x5334f55 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318589w == hashCode) {
                try {
                    this.f66592xa0778a03 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318590x == hashCode) {
                try {
                    this.f66590x784be213 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318591y == hashCode) {
                try {
                    this.f66595x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318592z == hashCode) {
                try {
                    this.f66593x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFTS5MetaContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f318593d) {
            contentValues.put("docid", java.lang.Integer.valueOf(this.f66591x28fe00ee));
        }
        if (this.f318594e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66596x2262335f));
        }
        if (this.f318595f) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.f66594x5334f55));
        }
        if (this.f318596g) {
            contentValues.put("entity_id", java.lang.Long.valueOf(this.f66592xa0778a03));
        }
        if (this.f66590x784be213 == null) {
            this.f66590x784be213 = "";
        }
        if (this.f318597h) {
            contentValues.put("aux_index", this.f66590x784be213);
        }
        if (this.f318598i) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f66595x9de75411));
        }
        if (this.f318599m) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f66593x10a0fed7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFTS5MetaContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FTS5MetaContact ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318585s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5MetaContact", "createTableSql %s", str2);
            k0Var.A("FTS5MetaContact", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FTS5MetaContact", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5MetaContact", "updateTableSql %s", str3);
            k0Var.A("FTS5MetaContact", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFTS5MetaContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.f66591x28fe00ee);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318580n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318580n.f434209a;
    }

    public java.lang.String t0() {
        return this.f66590x784be213;
    }

    public long u0() {
        return this.f66595x9de75411;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("docid")) {
            this.f66591x28fe00ee = contentValues.getAsInteger("docid").intValue();
            if (z17) {
                this.f318593d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66596x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318594e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.f66594x5334f55 = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f318595f = true;
            }
        }
        if (contentValues.containsKey("entity_id")) {
            this.f66592xa0778a03 = contentValues.getAsLong("entity_id").longValue();
            if (z17) {
                this.f318596g = true;
            }
        }
        if (contentValues.containsKey("aux_index")) {
            this.f66590x784be213 = contentValues.getAsString("aux_index");
            if (z17) {
                this.f318597h = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f66595x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f318598i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f66593x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f318599m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
