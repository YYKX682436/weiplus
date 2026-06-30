package dm;

/* loaded from: classes4.dex */
public class y3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f322709m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f322710n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322711o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322712p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322713q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322714r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322715s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322716t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322717u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f322718v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f322719w;

    /* renamed from: field_createTime */
    public long f69185xac3be4e;

    /* renamed from: field_localId */
    public java.lang.String f69186x88be67a1;

    /* renamed from: field_pendingReason */
    public int f69187x8fc77036;

    /* renamed from: field_subType */
    public java.lang.String f69188x5334f55;

    /* renamed from: field_type */
    public int f69189x2262335f;

    /* renamed from: field_valuesJSON */
    public java.lang.String f69190x33f8556f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322720d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322721e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322722f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322723g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322724h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322725i = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderConsumeNewXmlData");
        f322709m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322710n = new java.lang.String[0];
        f322711o = 338409958;
        f322712p = -1868521062;
        f322713q = 2060525834;
        f322714r = 377305787;
        f322715s = 1369213417;
        f322716t = 3575610;
        f322717u = 108705909;
        f322718v = m125704x3593deb(dm.y3.class);
        f322719w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125704x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "TEXT");
        e0Var.f398487c[1] = "subType";
        e0Var.f398488d.put("subType", "TEXT default '' ");
        e0Var.f398487c[2] = "valuesJSON";
        e0Var.f398488d.put("valuesJSON", "TEXT default '[object Object]' ");
        e0Var.f398487c[3] = "pendingReason";
        e0Var.f398488d.put("pendingReason", "INTEGER");
        e0Var.f398487c[4] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[5] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " localId TEXT,  subType TEXT default '' ,  valuesJSON TEXT default '[object Object]' ,  pendingReason INTEGER,  createTime LONG,  type INTEGER";
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
            if (f322711o == hashCode) {
                try {
                    this.f69186x88be67a1 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322712p == hashCode) {
                try {
                    this.f69188x5334f55 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322713q == hashCode) {
                try {
                    this.f69190x33f8556f = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322714r == hashCode) {
                try {
                    this.f69187x8fc77036 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322715s == hashCode) {
                try {
                    this.f69185xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322716t == hashCode) {
                try {
                    this.f69189x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322717u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322720d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, this.f69186x88be67a1);
        }
        if (this.f69188x5334f55 == null) {
            this.f69188x5334f55 = "";
        }
        if (this.f322721e) {
            contentValues.put("subType", this.f69188x5334f55);
        }
        if (this.f69190x33f8556f == null) {
            this.f69190x33f8556f = "[object Object]";
        }
        if (this.f322722f) {
            contentValues.put("valuesJSON", this.f69190x33f8556f);
        }
        if (this.f322723g) {
            contentValues.put("pendingReason", java.lang.Integer.valueOf(this.f69187x8fc77036));
        }
        if (this.f322724h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f69185xac3be4e));
        }
        if (this.f322725i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f69189x2262335f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderConsumeNewXmlData ( ");
        l75.e0 e0Var = f322718v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322710n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTableSql %s", str2);
            k0Var.A("FinderConsumeNewXmlData", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderConsumeNewXmlData", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "updateTableSql %s", str3);
            k0Var.A("FinderConsumeNewXmlData", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322718v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322719w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322709m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322709m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f69186x88be67a1 = contentValues.getAsString(dm.i4.f66867x2a5c95c7);
            if (z17) {
                this.f322720d = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.f69188x5334f55 = contentValues.getAsString("subType");
            if (z17) {
                this.f322721e = true;
            }
        }
        if (contentValues.containsKey("valuesJSON")) {
            this.f69190x33f8556f = contentValues.getAsString("valuesJSON");
            if (z17) {
                this.f322722f = true;
            }
        }
        if (contentValues.containsKey("pendingReason")) {
            this.f69187x8fc77036 = contentValues.getAsInteger("pendingReason").intValue();
            if (z17) {
                this.f322723g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f69185xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f322724h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f69189x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f322725i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
