package dm;

/* loaded from: classes4.dex */
public class l4 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f319761i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f319762m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319763n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319764o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319765p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319766q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319767r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319768s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f319769t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f319770u;

    /* renamed from: field_freeTimeForLive */
    public int f67321x39777277;

    /* renamed from: field_freeTimeForReplay */
    public int f67322xc366d2b2;

    /* renamed from: field_invalid */
    public int f67323xe9629fb2;

    /* renamed from: field_liveId */
    public long f67324x41d5e0c;

    /* renamed from: field_payForLive */
    public int f67325x1b6db3f2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319771d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319772e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319773f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319774g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319775h = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveChargeInfo");
        f319761i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319762m = new java.lang.String[0];
        f319763n = -1102434521;
        f319764o = -370888772;
        f319765p = 226087607;
        f319766q = 1648787341;
        f319767r = 1959784951;
        f319768s = 108705909;
        f319769t = m125195x3593deb(dm.l4.class);
        f319770u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125195x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "liveId";
        e0Var.f398488d.put("liveId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "liveId";
        e0Var.f398487c[1] = "freeTimeForLive";
        e0Var.f398488d.put("freeTimeForLive", "INTEGER");
        e0Var.f398487c[2] = "freeTimeForReplay";
        e0Var.f398488d.put("freeTimeForReplay", "INTEGER");
        e0Var.f398487c[3] = "payForLive";
        e0Var.f398488d.put("payForLive", "INTEGER");
        e0Var.f398487c[4] = "invalid";
        e0Var.f398488d.put("invalid", "INTEGER");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " liveId LONG PRIMARY KEY ,  freeTimeForLive INTEGER,  freeTimeForReplay INTEGER,  payForLive INTEGER,  invalid INTEGER";
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
            if (f319763n == hashCode) {
                try {
                    this.f67324x41d5e0c = cursor.getLong(i17);
                    this.f319771d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveChargeInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319764o == hashCode) {
                try {
                    this.f67321x39777277 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveChargeInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319765p == hashCode) {
                try {
                    this.f67322xc366d2b2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveChargeInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319766q == hashCode) {
                try {
                    this.f67325x1b6db3f2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveChargeInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319767r == hashCode) {
                try {
                    this.f67323xe9629fb2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveChargeInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319768s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319771d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.f67324x41d5e0c));
        }
        if (this.f319772e) {
            contentValues.put("freeTimeForLive", java.lang.Integer.valueOf(this.f67321x39777277));
        }
        if (this.f319773f) {
            contentValues.put("freeTimeForReplay", java.lang.Integer.valueOf(this.f67322xc366d2b2));
        }
        if (this.f319774g) {
            contentValues.put("payForLive", java.lang.Integer.valueOf(this.f67325x1b6db3f2));
        }
        if (this.f319775h) {
            contentValues.put("invalid", java.lang.Integer.valueOf(this.f67323xe9629fb2));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveChargeInfo ( ");
        l75.e0 e0Var = f319769t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319762m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveChargeInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveChargeInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveChargeInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveChargeInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319769t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319770u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67324x41d5e0c);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319761i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319761i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.f67324x41d5e0c = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f319771d = true;
            }
        }
        if (contentValues.containsKey("freeTimeForLive")) {
            this.f67321x39777277 = contentValues.getAsInteger("freeTimeForLive").intValue();
            if (z17) {
                this.f319772e = true;
            }
        }
        if (contentValues.containsKey("freeTimeForReplay")) {
            this.f67322xc366d2b2 = contentValues.getAsInteger("freeTimeForReplay").intValue();
            if (z17) {
                this.f319773f = true;
            }
        }
        if (contentValues.containsKey("payForLive")) {
            this.f67325x1b6db3f2 = contentValues.getAsInteger("payForLive").intValue();
            if (z17) {
                this.f319774g = true;
            }
        }
        if (contentValues.containsKey("invalid")) {
            this.f67323xe9629fb2 = contentValues.getAsInteger("invalid").intValue();
            if (z17) {
                this.f319775h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
