package dm;

/* loaded from: classes8.dex */
public class q2 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320900h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f320901i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f320902m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f320903n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f320904o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f320905p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320906q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320907r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320908s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320909t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320910u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f320911v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f320912w;

    /* renamed from: field_cachedXml */
    public java.lang.String f68039x79a61690;

    /* renamed from: field_msgSvrId */
    public long f68040xd09be28e;

    /* renamed from: field_talker */
    public java.lang.String f68041x114ef53e;

    /* renamed from: field_updateTime */
    public long f68042xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320913d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320914e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320915f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320916g = true;

    static {
        p75.n0 n0Var = new p75.n0("EcsKfProductCardCache");
        f320900h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320901i = new p75.d("msgSvrId", "long", tableName, "");
        f320902m = new p75.d("cachedXml", "string", tableName, "");
        f320903n = new p75.d(dm.i4.f66874x4c6b1f55, "long", tableName, "");
        f320904o = new p75.d("talker", "string", tableName, "");
        f320905p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS EcsKfProductCardCache_talker_index ON EcsKfProductCardCache(talker)"};
        f320906q = -1294411543;
        f320907r = -553129067;
        f320908s = -295931082;
        f320909t = -881080743;
        f320910u = 108705909;
        f320911v = m125414x3593deb(dm.q2.class);
        f320912w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125414x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgSvrId";
        e0Var.f398487c[1] = "cachedXml";
        e0Var.f398488d.put("cachedXml", "TEXT");
        e0Var.f398487c[2] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[3] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " msgSvrId LONG PRIMARY KEY ,  cachedXml TEXT,  updateTime LONG,  talker TEXT default '' ";
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
            if (f320906q == hashCode) {
                try {
                    this.f68040xd09be28e = cursor.getLong(i17);
                    this.f320913d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsKfProductCardCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320907r == hashCode) {
                try {
                    this.f68039x79a61690 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsKfProductCardCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320908s == hashCode) {
                try {
                    this.f68042xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsKfProductCardCache", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320909t == hashCode) {
                try {
                    this.f68041x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsKfProductCardCache", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320910u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320913d) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f68040xd09be28e));
        }
        if (this.f320914e) {
            contentValues.put("cachedXml", this.f68039x79a61690);
        }
        if (this.f320915f) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68042xa783a79b));
        }
        if (this.f68041x114ef53e == null) {
            this.f68041x114ef53e = "";
        }
        if (this.f320916g) {
            contentValues.put("talker", this.f68041x114ef53e);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEcsKfProductCardCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EcsKfProductCardCache ( ");
        l75.e0 e0Var = f320911v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320905p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsKfProductCardCache", "createTableSql %s", str2);
            k0Var.A("EcsKfProductCardCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EcsKfProductCardCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsKfProductCardCache", "updateTableSql %s", str3);
            k0Var.A("EcsKfProductCardCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsKfProductCardCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320911v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320912w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68040xd09be28e);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320900h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320900h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgSvrId")) {
            this.f68040xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f320913d = true;
            }
        }
        if (contentValues.containsKey("cachedXml")) {
            this.f68039x79a61690 = contentValues.getAsString("cachedXml");
            if (z17) {
                this.f320914e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f68042xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f320915f = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f68041x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f320916g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
