package dm;

/* loaded from: classes4.dex */
public class ha extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f318971i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f318972m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318973n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318974o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318975p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318976q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318977r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318978s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f318979t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f318980u;

    /* renamed from: field_card_id */
    public java.lang.String f66799x95970a65;

    /* renamed from: field_retryCount */
    public int f66800x73c8dbac;

    /* renamed from: field_seq */
    public long f66801x4b6e7f9a;

    /* renamed from: field_state_flag */
    public int f66802xab905abf;

    /* renamed from: field_update_time */
    public long f66803x499140be;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318981d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318982e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318983f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318984g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318985h = true;

    static {
        p75.n0 n0Var = new p75.n0("ShareCardSyncItemInfo");
        f318971i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318972m = new java.lang.String[0];
        f318973n = 553933994;
        f318974o = -227989926;
        f318975p = -573446013;
        f318976q = 113759;
        f318977r = -1163811001;
        f318978s = 108705909;
        f318979t = m125038x3593deb(dm.ha.class);
        f318980u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125038x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "card_id";
        e0Var.f398488d.put("card_id", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "card_id";
        e0Var.f398487c[1] = "state_flag";
        e0Var.f398488d.put("state_flag", "INTEGER");
        e0Var.f398487c[2] = "update_time";
        e0Var.f398488d.put("update_time", "LONG");
        e0Var.f398487c[3] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, "LONG");
        e0Var.f398487c[4] = "retryCount";
        e0Var.f398488d.put("retryCount", "INTEGER");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " card_id TEXT PRIMARY KEY ,  state_flag INTEGER,  update_time LONG,  seq LONG,  retryCount INTEGER";
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
            if (f318973n == hashCode) {
                try {
                    this.f66799x95970a65 = cursor.getString(i17);
                    this.f318981d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShareCardSyncItemInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318974o == hashCode) {
                try {
                    this.f66802xab905abf = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShareCardSyncItemInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318975p == hashCode) {
                try {
                    this.f66803x499140be = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShareCardSyncItemInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318976q == hashCode) {
                try {
                    this.f66801x4b6e7f9a = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShareCardSyncItemInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318977r == hashCode) {
                try {
                    this.f66800x73c8dbac = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseShareCardSyncItemInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318978s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318981d) {
            contentValues.put("card_id", this.f66799x95970a65);
        }
        if (this.f318982e) {
            contentValues.put("state_flag", java.lang.Integer.valueOf(this.f66802xab905abf));
        }
        if (this.f318983f) {
            contentValues.put("update_time", java.lang.Long.valueOf(this.f66803x499140be));
        }
        if (this.f318984g) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, java.lang.Long.valueOf(this.f66801x4b6e7f9a));
        }
        if (this.f318985h) {
            contentValues.put("retryCount", java.lang.Integer.valueOf(this.f66800x73c8dbac));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShareCardSyncItemInfo ( ");
        l75.e0 e0Var = f318979t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318972m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTableSql %s", str2);
            k0Var.A("ShareCardSyncItemInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ShareCardSyncItemInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "updateTableSql %s", str3);
            k0Var.A("ShareCardSyncItemInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseShareCardSyncItemInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318979t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318980u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66799x95970a65;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318971i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318971i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("card_id")) {
            this.f66799x95970a65 = contentValues.getAsString("card_id");
            if (z17) {
                this.f318981d = true;
            }
        }
        if (contentValues.containsKey("state_flag")) {
            this.f66802xab905abf = contentValues.getAsInteger("state_flag").intValue();
            if (z17) {
                this.f318982e = true;
            }
        }
        if (contentValues.containsKey("update_time")) {
            this.f66803x499140be = contentValues.getAsLong("update_time").longValue();
            if (z17) {
                this.f318983f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb)) {
            this.f66801x4b6e7f9a = contentValues.getAsLong(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb).longValue();
            if (z17) {
                this.f318984g = true;
            }
        }
        if (contentValues.containsKey("retryCount")) {
            this.f66800x73c8dbac = contentValues.getAsInteger("retryCount").intValue();
            if (z17) {
                this.f318985h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
