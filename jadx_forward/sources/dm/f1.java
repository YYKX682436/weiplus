package dm;

/* loaded from: classes8.dex */
public class f1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f318311m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f318312n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318313o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318314p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318315q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318316r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318317s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318318t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318319u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f318320v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f318321w;

    /* renamed from: field_isGreetSession */
    public int f66477xb4776b7c;

    /* renamed from: field_senderUserName */
    public java.lang.String f66478x1362f030;

    /* renamed from: field_sessionId */
    public java.lang.String f66479xbed8694c;

    /* renamed from: field_talker */
    public java.lang.String f66480x114ef53e;

    /* renamed from: field_type */
    public int f66481x2262335f;

    /* renamed from: field_updateTime */
    public long f66482xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318322d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318323e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318324f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318325g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318326h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318327i = true;

    static {
        p75.n0 n0Var = new p75.n0("BizFansSessionInfo");
        f318311m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318312n = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS BizFansSessionInfo_sessionId_index ON BizFansSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS BizFansSessionInfo_talker_index ON BizFansSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS BizFansSessionInfo_type_index ON BizFansSessionInfo(type)", "CREATE INDEX IF NOT EXISTS BizFansSessionInfo_senderUserName_index ON BizFansSessionInfo(senderUserName)"};
        f318313o = 607796817;
        f318314p = -881080743;
        f318315q = -295931082;
        f318316r = 3575610;
        f318317s = 1667659339;
        f318318t = 75166103;
        f318319u = 108705909;
        f318320v = m124967x3593deb(dm.f1.class);
        f318321w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124967x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398488d.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398487c[1] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[2] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[3] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[4] = "senderUserName";
        e0Var.f398488d.put("senderUserName", "TEXT default '' ");
        e0Var.f398487c[5] = "isGreetSession";
        e0Var.f398488d.put("isGreetSession", "INTEGER default '0' ");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  type INTEGER,  senderUserName TEXT default '' ,  isGreetSession INTEGER default '0' ";
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
            if (f318313o == hashCode) {
                try {
                    this.f66479xbed8694c = cursor.getString(i17);
                    this.f318322d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFansSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318314p == hashCode) {
                try {
                    this.f66480x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFansSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318315q == hashCode) {
                try {
                    this.f66482xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFansSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318316r == hashCode) {
                try {
                    this.f66481x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFansSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318317s == hashCode) {
                try {
                    this.f66478x1362f030 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFansSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318318t == hashCode) {
                try {
                    this.f66477xb4776b7c = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFansSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318319u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66479xbed8694c == null) {
            this.f66479xbed8694c = "";
        }
        if (this.f318322d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f66479xbed8694c);
        }
        if (this.f66480x114ef53e == null) {
            this.f66480x114ef53e = "";
        }
        if (this.f318323e) {
            contentValues.put("talker", this.f66480x114ef53e);
        }
        if (this.f318324f) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66482xa783a79b));
        }
        if (this.f318325g) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66481x2262335f));
        }
        if (this.f66478x1362f030 == null) {
            this.f66478x1362f030 = "";
        }
        if (this.f318326h) {
            contentValues.put("senderUserName", this.f66478x1362f030);
        }
        if (this.f318327i) {
            contentValues.put("isGreetSession", java.lang.Integer.valueOf(this.f66477xb4776b7c));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizFansSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizFansSessionInfo ( ");
        l75.e0 e0Var = f318320v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318312n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizFansSessionInfo", "createTableSql %s", str2);
            k0Var.A("BizFansSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizFansSessionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizFansSessionInfo", "updateTableSql %s", str3);
            k0Var.A("BizFansSessionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizFansSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318320v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318321w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66479xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318311m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318311m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f66479xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f318322d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f66480x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f318323e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66482xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f318324f = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66481x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318325g = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.f66478x1362f030 = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f318326h = true;
            }
        }
        if (contentValues.containsKey("isGreetSession")) {
            this.f66477xb4776b7c = contentValues.getAsInteger("isGreetSession").intValue();
            if (z17) {
                this.f318327i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
