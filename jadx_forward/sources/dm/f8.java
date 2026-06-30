package dm;

/* loaded from: classes13.dex */
public class f8 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f318411q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f318412r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318413s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318414t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318415u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318416v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318417w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318418x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318419y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318420z;

    /* renamed from: field_createTime */
    public long f66521xac3be4e;

    /* renamed from: field_groupId */
    public java.lang.String f66522x861009b5;

    /* renamed from: field_ilinkRoomId */
    public long f66523xadd3a154;

    /* renamed from: field_inviteUserName */
    public java.lang.String f66524x922cf104;

    /* renamed from: field_memberCount */
    public int f66525xbcb1bed0;

    /* renamed from: field_roomId */
    public int f66526xeabee3b;

    /* renamed from: field_roomKey */
    public long f66527xc6d1e13f;

    /* renamed from: field_routeId */
    public int f66528xc729faff;

    /* renamed from: field_state */
    public int f66529x29d3a50c;

    /* renamed from: field_wxGroupId */
    public java.lang.String f66530xacb0c0d4;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318421d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318422e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318423f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318424g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318425h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318426i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318427m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318428n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318429o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f318430p = true;

    static {
        p75.n0 n0Var = new p75.n0("MultiTalkInfo");
        f318411q = n0Var;
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
        f318412r = new java.lang.String[0];
        f318413s = 303207897;
        f318414t = 293428218;
        f318415u = -925319338;
        f318416v = 1379873668;
        f318417w = 1385647428;
        f318418x = -500140257;
        f318419y = 1358063253;
        f318420z = 1369213417;
        A = 109757585;
        B = 1108625689;
        C = 108705909;
        D = m124979x3593deb(dm.f8.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124979x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "wxGroupId";
        e0Var.f398488d.put("wxGroupId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "wxGroupId";
        e0Var.f398487c[1] = "groupId";
        e0Var.f398488d.put("groupId", "TEXT");
        e0Var.f398487c[2] = "roomId";
        e0Var.f398488d.put("roomId", "INTEGER");
        e0Var.f398487c[3] = "roomKey";
        e0Var.f398488d.put("roomKey", "LONG");
        e0Var.f398487c[4] = "routeId";
        e0Var.f398488d.put("routeId", "INTEGER");
        e0Var.f398487c[5] = "inviteUserName";
        e0Var.f398488d.put("inviteUserName", "TEXT");
        e0Var.f398487c[6] = "memberCount";
        e0Var.f398488d.put("memberCount", "INTEGER");
        e0Var.f398487c[7] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[8] = "state";
        e0Var.f398488d.put("state", "INTEGER default '0' ");
        e0Var.f398487c[9] = "ilinkRoomId";
        e0Var.f398488d.put("ilinkRoomId", "LONG");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " wxGroupId TEXT PRIMARY KEY ,  groupId TEXT,  roomId INTEGER,  roomKey LONG,  routeId INTEGER,  inviteUserName TEXT,  memberCount INTEGER,  createTime LONG,  state INTEGER default '0' ,  ilinkRoomId LONG";
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
            if (f318413s == hashCode) {
                try {
                    this.f66530xacb0c0d4 = cursor.getString(i17);
                    this.f318421d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318414t == hashCode) {
                try {
                    this.f66522x861009b5 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318415u == hashCode) {
                try {
                    this.f66526xeabee3b = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318416v == hashCode) {
                try {
                    this.f66527xc6d1e13f = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318417w == hashCode) {
                try {
                    this.f66528xc729faff = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318418x == hashCode) {
                try {
                    this.f66524x922cf104 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318419y == hashCode) {
                try {
                    this.f66525xbcb1bed0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318420z == hashCode) {
                try {
                    this.f66521xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66529x29d3a50c = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66523xadd3a154 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTalkInfo", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f318421d) {
            contentValues.put("wxGroupId", this.f66530xacb0c0d4);
        }
        if (this.f318422e) {
            contentValues.put("groupId", this.f66522x861009b5);
        }
        if (this.f318423f) {
            contentValues.put("roomId", java.lang.Integer.valueOf(this.f66526xeabee3b));
        }
        if (this.f318424g) {
            contentValues.put("roomKey", java.lang.Long.valueOf(this.f66527xc6d1e13f));
        }
        if (this.f318425h) {
            contentValues.put("routeId", java.lang.Integer.valueOf(this.f66528xc729faff));
        }
        if (this.f318426i) {
            contentValues.put("inviteUserName", this.f66524x922cf104);
        }
        if (this.f318427m) {
            contentValues.put("memberCount", java.lang.Integer.valueOf(this.f66525xbcb1bed0));
        }
        if (this.f318428n) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66521xac3be4e));
        }
        if (this.f318429o) {
            contentValues.put("state", java.lang.Integer.valueOf(this.f66529x29d3a50c));
        }
        if (this.f318430p) {
            contentValues.put("ilinkRoomId", java.lang.Long.valueOf(this.f66523xadd3a154));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMultiTalkInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MultiTalkInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318412r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTalkInfo", "createTableSql %s", str2);
            k0Var.A("MultiTalkInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MultiTalkInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTalkInfo", "updateTableSql %s", str3);
            k0Var.A("MultiTalkInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTalkInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f66530xacb0c0d4;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318411q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318411q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wxGroupId")) {
            this.f66530xacb0c0d4 = contentValues.getAsString("wxGroupId");
            if (z17) {
                this.f318421d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.f66522x861009b5 = contentValues.getAsString("groupId");
            if (z17) {
                this.f318422e = true;
            }
        }
        if (contentValues.containsKey("roomId")) {
            this.f66526xeabee3b = contentValues.getAsInteger("roomId").intValue();
            if (z17) {
                this.f318423f = true;
            }
        }
        if (contentValues.containsKey("roomKey")) {
            this.f66527xc6d1e13f = contentValues.getAsLong("roomKey").longValue();
            if (z17) {
                this.f318424g = true;
            }
        }
        if (contentValues.containsKey("routeId")) {
            this.f66528xc729faff = contentValues.getAsInteger("routeId").intValue();
            if (z17) {
                this.f318425h = true;
            }
        }
        if (contentValues.containsKey("inviteUserName")) {
            this.f66524x922cf104 = contentValues.getAsString("inviteUserName");
            if (z17) {
                this.f318426i = true;
            }
        }
        if (contentValues.containsKey("memberCount")) {
            this.f66525xbcb1bed0 = contentValues.getAsInteger("memberCount").intValue();
            if (z17) {
                this.f318427m = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66521xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318428n = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.f66529x29d3a50c = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f318429o = true;
            }
        }
        if (contentValues.containsKey("ilinkRoomId")) {
            this.f66523xadd3a154 = contentValues.getAsLong("ilinkRoomId").longValue();
            if (z17) {
                this.f318430p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
