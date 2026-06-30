package dm;

/* loaded from: classes10.dex */
public class b5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final l75.e0 I;

    /* renamed from: J, reason: collision with root package name */
    public static final o75.e f317383J;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f317384s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f317385t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f317386u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317387v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317388w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317389x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317390y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317391z;

    /* renamed from: field_actionPermission */
    public int f65976xaf64e94a;

    /* renamed from: field_disableSendMsg */
    public int f65977x83e02cb6;

    /* renamed from: field_disableSendmsgNeedFollow */
    public boolean f65978x3679555d;

    /* renamed from: field_followFlag */
    public int f65979x404ea322;

    /* renamed from: field_rejectMsg */
    public int f65980x36454e5d;

    /* renamed from: field_selfUsername */
    public java.lang.String f65981x55775f67;

    /* renamed from: field_senderRoleType */
    public int f65982x13644c0a;

    /* renamed from: field_senderUserName */
    public java.lang.String f65983x1362f030;

    /* renamed from: field_sessionId */
    public java.lang.String f65984xbed8694c;

    /* renamed from: field_talker */
    public java.lang.String f65985x114ef53e;

    /* renamed from: field_type */
    public int f65986x2262335f;

    /* renamed from: field_updateTime */
    public long f65987xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317392d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317393e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317394f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317395g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317396h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317397i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317398m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317399n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317400o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f317401p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f317402q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f317403r = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderSessionInfo");
        f317384s = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317385t = new p75.d("selfUsername", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317386u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderSessionInfo_sessionId_index ON FinderSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_talker_index ON FinderSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_selfUsername_index ON FinderSessionInfo(selfUsername)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_type_index ON FinderSessionInfo(type)", "CREATE INDEX IF NOT EXISTS FinderSessionInfo_senderUserName_index ON FinderSessionInfo(senderUserName)"};
        f317387v = 607796817;
        f317388w = -881080743;
        f317389x = -295931082;
        f317390y = 1229697090;
        f317391z = 3575610;
        A = 211768485;
        B = -1683545246;
        C = -740052271;
        D = 1667659339;
        E = 1667748389;
        F = -2027458883;
        G = 141309368;
        H = 108705909;
        I = m124813x3593deb(dm.b5.class);
        f317383J = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124813x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398488d.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398487c[1] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[2] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[3] = "selfUsername";
        e0Var.f398488d.put("selfUsername", "TEXT default '' ");
        e0Var.f398487c[4] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[5] = "actionPermission";
        e0Var.f398488d.put("actionPermission", "INTEGER");
        e0Var.f398487c[6] = "rejectMsg";
        e0Var.f398488d.put("rejectMsg", "INTEGER");
        e0Var.f398487c[7] = "disableSendMsg";
        e0Var.f398488d.put("disableSendMsg", "INTEGER");
        e0Var.f398487c[8] = "senderUserName";
        e0Var.f398488d.put("senderUserName", "TEXT default '' ");
        e0Var.f398487c[9] = "senderRoleType";
        e0Var.f398488d.put("senderRoleType", "INTEGER default '0' ");
        e0Var.f398487c[10] = "followFlag";
        e0Var.f398488d.put("followFlag", "INTEGER");
        e0Var.f398487c[11] = "disableSendmsgNeedFollow";
        e0Var.f398488d.put("disableSendmsgNeedFollow", "INTEGER");
        e0Var.f398487c[12] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  selfUsername TEXT default '' ,  type INTEGER,  actionPermission INTEGER,  rejectMsg INTEGER,  disableSendMsg INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ,  followFlag INTEGER,  disableSendmsgNeedFollow INTEGER";
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
            boolean z17 = true;
            if (f317387v == hashCode) {
                try {
                    this.f65984xbed8694c = cursor.getString(i17);
                    this.f317392d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317388w == hashCode) {
                try {
                    this.f65985x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317389x == hashCode) {
                try {
                    this.f65987xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317390y == hashCode) {
                try {
                    this.f65981x55775f67 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317391z == hashCode) {
                try {
                    this.f65986x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f65976xaf64e94a = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f65980x36454e5d = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f65977x83e02cb6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f65983x1362f030 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f65982x13644c0a = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f65979x404ea322 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f65978x3679555d = z17;
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderSessionInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f65984xbed8694c == null) {
            this.f65984xbed8694c = "";
        }
        if (this.f317392d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f65984xbed8694c);
        }
        if (this.f65985x114ef53e == null) {
            this.f65985x114ef53e = "";
        }
        if (this.f317393e) {
            contentValues.put("talker", this.f65985x114ef53e);
        }
        if (this.f317394f) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f65987xa783a79b));
        }
        if (this.f65981x55775f67 == null) {
            this.f65981x55775f67 = "";
        }
        if (this.f317395g) {
            contentValues.put("selfUsername", this.f65981x55775f67);
        }
        if (this.f317396h) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f65986x2262335f));
        }
        if (this.f317397i) {
            contentValues.put("actionPermission", java.lang.Integer.valueOf(this.f65976xaf64e94a));
        }
        if (this.f317398m) {
            contentValues.put("rejectMsg", java.lang.Integer.valueOf(this.f65980x36454e5d));
        }
        if (this.f317399n) {
            contentValues.put("disableSendMsg", java.lang.Integer.valueOf(this.f65977x83e02cb6));
        }
        if (this.f65983x1362f030 == null) {
            this.f65983x1362f030 = "";
        }
        if (this.f317400o) {
            contentValues.put("senderUserName", this.f65983x1362f030);
        }
        if (this.f317401p) {
            contentValues.put("senderRoleType", java.lang.Integer.valueOf(this.f65982x13644c0a));
        }
        if (this.f317402q) {
            contentValues.put("followFlag", java.lang.Integer.valueOf(this.f65979x404ea322));
        }
        if (this.f317403r) {
            if (this.f65978x3679555d) {
                contentValues.put("disableSendmsgNeedFollow", (java.lang.Integer) 1);
            } else {
                contentValues.put("disableSendmsgNeedFollow", (java.lang.Integer) 0);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderSessionInfo ( ");
        l75.e0 e0Var = I;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317386u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderSessionInfo", "createTableSql %s", str2);
            k0Var.A("FinderSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderSessionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderSessionInfo", "updateTableSql %s", str3);
            k0Var.A("FinderSessionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return I;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317383J;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f65984xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317384s;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317384s.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f65984xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f317392d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f65985x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f317393e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f65987xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f317394f = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.f65981x55775f67 = contentValues.getAsString("selfUsername");
            if (z17) {
                this.f317395g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f65986x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f317396h = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.f65976xaf64e94a = contentValues.getAsInteger("actionPermission").intValue();
            if (z17) {
                this.f317397i = true;
            }
        }
        if (contentValues.containsKey("rejectMsg")) {
            this.f65980x36454e5d = contentValues.getAsInteger("rejectMsg").intValue();
            if (z17) {
                this.f317398m = true;
            }
        }
        if (contentValues.containsKey("disableSendMsg")) {
            this.f65977x83e02cb6 = contentValues.getAsInteger("disableSendMsg").intValue();
            if (z17) {
                this.f317399n = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.f65983x1362f030 = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f317400o = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.f65982x13644c0a = contentValues.getAsInteger("senderRoleType").intValue();
            if (z17) {
                this.f317401p = true;
            }
        }
        if (contentValues.containsKey("followFlag")) {
            this.f65979x404ea322 = contentValues.getAsInteger("followFlag").intValue();
            if (z17) {
                this.f317402q = true;
            }
        }
        if (contentValues.containsKey("disableSendmsgNeedFollow")) {
            this.f65978x3679555d = contentValues.getAsInteger("disableSendmsgNeedFollow").intValue() != 0;
            if (z17) {
                this.f317403r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
