package dm;

/* loaded from: classes8.dex */
public class s4 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f321349q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f321350r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321351s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321352t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321353u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321354v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321355w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321356x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321357y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321358z;

    /* renamed from: field_anchorFinderNickname */
    public java.lang.String f68252x236be6ee;

    /* renamed from: field_anchorFinderUsername */
    public java.lang.String f68253xf5ec756;

    /* renamed from: field_anchorWxUsername */
    public java.lang.String f68254x123da011;

    /* renamed from: field_finderNonceId */
    public java.lang.String f68255xb362ffdf;

    /* renamed from: field_finderObjectId */
    public long f68256x6a75a8e5;

    /* renamed from: field_hostRoomId */
    public java.lang.String f68257x7560f783;

    /* renamed from: field_liveId */
    public long f68258x41d5e0c;

    /* renamed from: field_markRead */
    public boolean f68259x2c72afa8;

    /* renamed from: field_sourceType */
    public int f68260x76e81a5a;

    /* renamed from: field_timeStamp */
    public long f68261x9c2463f1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321359d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321360e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321361f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321362g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321363h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321364i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321365m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321366n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321367o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321368p = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveTipsBar");
        f321349q = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321350r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderLiveTipsBar_hostRoomId ON FinderLiveTipsBar(hostRoomId)", "CREATE INDEX IF NOT EXISTS FinderLiveTipsBar_anchorWxUsername ON FinderLiveTipsBar(anchorWxUsername)"};
        f321351s = -1102434521;
        f321352t = -1137065186;
        f321353u = 25573622;
        f321354v = 1870138220;
        f321355w = 678300977;
        f321356x = 1014705353;
        f321357y = -1166463232;
        f321358z = 974703204;
        A = 246392323;
        B = -1111431691;
        C = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "liveId";
        ((java.util.HashMap) e0Var.f398488d).put("liveId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "liveId";
        e0Var.f398487c[1] = "hostRoomId";
        ((java.util.HashMap) e0Var.f398488d).put("hostRoomId", "TEXT default '' ");
        e0Var.f398487c[2] = "timeStamp";
        ((java.util.HashMap) e0Var.f398488d).put("timeStamp", "LONG default '0' ");
        e0Var.f398487c[3] = "anchorWxUsername";
        ((java.util.HashMap) e0Var.f398488d).put("anchorWxUsername", "TEXT default '' ");
        e0Var.f398487c[4] = "anchorFinderUsername";
        ((java.util.HashMap) e0Var.f398488d).put("anchorFinderUsername", "TEXT default '' ");
        e0Var.f398487c[5] = "anchorFinderNickname";
        ((java.util.HashMap) e0Var.f398488d).put("anchorFinderNickname", "TEXT default '' ");
        e0Var.f398487c[6] = "finderObjectId";
        ((java.util.HashMap) e0Var.f398488d).put("finderObjectId", "LONG default '' ");
        e0Var.f398487c[7] = "finderNonceId";
        ((java.util.HashMap) e0Var.f398488d).put("finderNonceId", "TEXT default '' ");
        e0Var.f398487c[8] = "markRead";
        ((java.util.HashMap) e0Var.f398488d).put("markRead", "INTEGER default 'false' ");
        e0Var.f398487c[9] = "sourceType";
        ((java.util.HashMap) e0Var.f398488d).put("sourceType", "INTEGER");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " liveId LONG default '0'  PRIMARY KEY ,  hostRoomId TEXT default '' ,  timeStamp LONG default '0' ,  anchorWxUsername TEXT default '' ,  anchorFinderUsername TEXT default '' ,  anchorFinderNickname TEXT default '' ,  finderObjectId LONG default '' ,  finderNonceId TEXT default '' ,  markRead INTEGER default 'false' ,  sourceType INTEGER";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        D = e0Var;
        E = new o75.e();
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
            boolean z17 = true;
            if (f321351s == hashCode) {
                try {
                    this.f68258x41d5e0c = cursor.getLong(i17);
                    this.f321359d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321352t == hashCode) {
                try {
                    this.f68257x7560f783 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321353u == hashCode) {
                try {
                    this.f68261x9c2463f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321354v == hashCode) {
                try {
                    this.f68254x123da011 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321355w == hashCode) {
                try {
                    this.f68253xf5ec756 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321356x == hashCode) {
                try {
                    this.f68252x236be6ee = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321357y == hashCode) {
                try {
                    this.f68256x6a75a8e5 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321358z == hashCode) {
                try {
                    this.f68255xb362ffdf = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68259x2c72afa8 = z17;
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68260x76e81a5a = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveTipsBar", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321359d) {
            contentValues.put("liveId", java.lang.Long.valueOf(this.f68258x41d5e0c));
        }
        if (this.f68257x7560f783 == null) {
            this.f68257x7560f783 = "";
        }
        if (this.f321360e) {
            contentValues.put("hostRoomId", this.f68257x7560f783);
        }
        if (this.f321361f) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.f68261x9c2463f1));
        }
        if (this.f68254x123da011 == null) {
            this.f68254x123da011 = "";
        }
        if (this.f321362g) {
            contentValues.put("anchorWxUsername", this.f68254x123da011);
        }
        if (this.f68253xf5ec756 == null) {
            this.f68253xf5ec756 = "";
        }
        if (this.f321363h) {
            contentValues.put("anchorFinderUsername", this.f68253xf5ec756);
        }
        if (this.f68252x236be6ee == null) {
            this.f68252x236be6ee = "";
        }
        if (this.f321364i) {
            contentValues.put("anchorFinderNickname", this.f68252x236be6ee);
        }
        if (this.f321365m) {
            contentValues.put("finderObjectId", java.lang.Long.valueOf(this.f68256x6a75a8e5));
        }
        if (this.f68255xb362ffdf == null) {
            this.f68255xb362ffdf = "";
        }
        if (this.f321366n) {
            contentValues.put("finderNonceId", this.f68255xb362ffdf);
        }
        if (this.f321367o) {
            if (this.f68259x2c72afa8) {
                contentValues.put("markRead", (java.lang.Integer) 1);
            } else {
                contentValues.put("markRead", (java.lang.Integer) 0);
            }
        }
        if (this.f321368p) {
            contentValues.put("sourceType", java.lang.Integer.valueOf(this.f68260x76e81a5a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveTipsBar ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321350r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTableSql %s", str2);
            k0Var.A("FinderLiveTipsBar", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveTipsBar", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveTipsBar", "updateTableSql %s", str3);
            k0Var.A("FinderLiveTipsBar", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveTipsBar", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return E;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68258x41d5e0c);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321349q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321349q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.f68258x41d5e0c = contentValues.getAsLong("liveId").longValue();
            if (z17) {
                this.f321359d = true;
            }
        }
        if (contentValues.containsKey("hostRoomId")) {
            this.f68257x7560f783 = contentValues.getAsString("hostRoomId");
            if (z17) {
                this.f321360e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.f68261x9c2463f1 = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f321361f = true;
            }
        }
        if (contentValues.containsKey("anchorWxUsername")) {
            this.f68254x123da011 = contentValues.getAsString("anchorWxUsername");
            if (z17) {
                this.f321362g = true;
            }
        }
        if (contentValues.containsKey("anchorFinderUsername")) {
            this.f68253xf5ec756 = contentValues.getAsString("anchorFinderUsername");
            if (z17) {
                this.f321363h = true;
            }
        }
        if (contentValues.containsKey("anchorFinderNickname")) {
            this.f68252x236be6ee = contentValues.getAsString("anchorFinderNickname");
            if (z17) {
                this.f321364i = true;
            }
        }
        if (contentValues.containsKey("finderObjectId")) {
            this.f68256x6a75a8e5 = contentValues.getAsLong("finderObjectId").longValue();
            if (z17) {
                this.f321365m = true;
            }
        }
        if (contentValues.containsKey("finderNonceId")) {
            this.f68255xb362ffdf = contentValues.getAsString("finderNonceId");
            if (z17) {
                this.f321366n = true;
            }
        }
        if (contentValues.containsKey("markRead")) {
            this.f68259x2c72afa8 = contentValues.getAsInteger("markRead").intValue() != 0;
            if (z17) {
                this.f321367o = true;
            }
        }
        if (contentValues.containsKey("sourceType")) {
            this.f68260x76e81a5a = contentValues.getAsInteger("sourceType").intValue();
            if (z17) {
                this.f321368p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
