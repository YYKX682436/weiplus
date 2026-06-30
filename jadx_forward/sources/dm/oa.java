package dm;

/* loaded from: classes4.dex */
public class oa extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320542h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320543i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320544m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320545n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320546o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320547p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320548q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f320549r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f320550s;

    /* renamed from: field_draft */
    public byte[] f67847x28ff5a1c;

    /* renamed from: field_extFlag */
    public int f67848x26b1b2e8;

    /* renamed from: field_key */
    public java.lang.String f67849x4b6e619a;

    /* renamed from: field_timestamp */
    public long f67850x9de75411;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320551d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320552e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320553f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320554g = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsDraft");
        f320542h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320543i = new java.lang.String[0];
        f320544m = 106079;
        f320545n = 55126294;
        f320546o = -1306589907;
        f320547p = 95844769;
        f320548q = 108705909;
        f320549r = m125373x3593deb(dm.oa.class);
        f320550s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125373x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG default '0' ");
        e0Var.f398487c[2] = "extFlag";
        e0Var.f398488d.put("extFlag", "INTEGER default '0' ");
        e0Var.f398487c[3] = "draft";
        e0Var.f398488d.put("draft", "BLOB");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " key TEXT default ''  PRIMARY KEY ,  timestamp LONG default '0' ,  extFlag INTEGER default '0' ,  draft BLOB";
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
            if (f320544m == hashCode) {
                try {
                    this.f67849x4b6e619a = cursor.getString(i17);
                    this.f320551d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsDraft", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320545n == hashCode) {
                try {
                    this.f67850x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsDraft", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320546o == hashCode) {
                try {
                    this.f67848x26b1b2e8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsDraft", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320547p == hashCode) {
                try {
                    this.f67847x28ff5a1c = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSnsDraft", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320548q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f67849x4b6e619a == null) {
            this.f67849x4b6e619a = "";
        }
        if (this.f320551d) {
            contentValues.put("key", this.f67849x4b6e619a);
        }
        if (this.f320552e) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f67850x9de75411));
        }
        if (this.f320553f) {
            contentValues.put("extFlag", java.lang.Integer.valueOf(this.f67848x26b1b2e8));
        }
        if (this.f320554g) {
            contentValues.put("draft", this.f67847x28ff5a1c);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSnsDraft", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsDraft ( ");
        l75.e0 e0Var = f320549r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320543i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsDraft", "createTableSql %s", str2);
            k0Var.A("SnsDraft", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SnsDraft", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsDraft", "updateTableSql %s", str3);
            k0Var.A("SnsDraft", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSnsDraft", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320549r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320550s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67849x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320542h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320542h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f67849x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f320551d = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f67850x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f320552e = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.f67848x26b1b2e8 = contentValues.getAsInteger("extFlag").intValue();
            if (z17) {
                this.f320553f = true;
            }
        }
        if (contentValues.containsKey("draft")) {
            this.f67847x28ff5a1c = contentValues.getAsByteArray("draft");
            if (z17) {
                this.f320554g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
