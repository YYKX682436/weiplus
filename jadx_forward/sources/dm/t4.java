package dm;

/* loaded from: classes4.dex */
public class t4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f321615f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f321616g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f321617h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f321618i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321619m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f321620n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f321621o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321622d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321623e = true;

    /* renamed from: field_definition */
    public int f68447x7cb069b8;

    /* renamed from: field_liveId */
    public long f68448x41d5e0c;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveVideoDefinitionInfo");
        f321615f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321616g = new java.lang.String[0];
        f321617h = -1102434521;
        f321618i = -1014418093;
        f321619m = 108705909;
        f321620n = m125508x3593deb(dm.t4.class);
        f321621o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125508x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "liveId";
        e0Var.f398488d.put("liveId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "liveId";
        e0Var.f398487c[1] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db, "INTEGER");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " liveId LONG PRIMARY KEY ,  definition INTEGER";
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
            if (f321617h == hashCode) {
                try {
                    this.f68448x41d5e0c = cursor.getLong(i17);
                    this.f321622d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321618i == hashCode) {
                try {
                    this.f68447x7cb069b8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321619m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321622d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.f68448x41d5e0c));
        }
        if (this.f321623e) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db, java.lang.Integer.valueOf(this.f68447x7cb069b8));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveVideoDefinitionInfo ( ");
        l75.e0 e0Var = f321620n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321616g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveVideoDefinitionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveVideoDefinitionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveVideoDefinitionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveVideoDefinitionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321620n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321621o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68448x41d5e0c);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321615f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321615f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.f68448x41d5e0c = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f321622d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db)) {
            this.f68447x7cb069b8 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db).intValue();
            if (z17) {
                this.f321623e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
