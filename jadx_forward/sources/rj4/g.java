package rj4;

/* loaded from: classes10.dex */
public class g extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f477863q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f477864r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f477865s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f477866t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f477867u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f477868v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f477869w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f477870x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f477871y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f477872z;

    /* renamed from: field_actionPermission */
    public int f76625xaf64e94a;

    /* renamed from: field_disableSendMsg */
    public int f76626x83e02cb6;

    /* renamed from: field_rejectMsg */
    public int f76627x36454e5d;

    /* renamed from: field_selfUsername */
    public java.lang.String f76628x55775f67;

    /* renamed from: field_senderRoleType */
    public int f76629x13644c0a;

    /* renamed from: field_senderUserName */
    public java.lang.String f76630x1362f030;

    /* renamed from: field_sessionId */
    public java.lang.String f76631xbed8694c;

    /* renamed from: field_talker */
    public java.lang.String f76632x114ef53e;

    /* renamed from: field_type */
    public int f76633x2262335f;

    /* renamed from: field_updateTime */
    public long f76634xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477873d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f477874e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f477875f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f477876g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f477877h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f477878i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f477879m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f477880n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f477881o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f477882p = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusSessionInfo");
        f477863q = n0Var;
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
        f477864r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_sessionId_index ON TextStatusSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_talker_index ON TextStatusSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_selfUsername_index ON TextStatusSessionInfo(selfUsername)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_type_index ON TextStatusSessionInfo(type)", "CREATE INDEX IF NOT EXISTS TextStatusSessionInfo_senderUserName_index ON TextStatusSessionInfo(senderUserName)"};
        f477865s = 607796817;
        f477866t = -881080743;
        f477867u = -295931082;
        f477868v = 1229697090;
        f477869w = 3575610;
        f477870x = 211768485;
        f477871y = -1683545246;
        f477872z = -740052271;
        A = 1667659339;
        B = 1667748389;
        C = 108705909;
        D = m162523x3593deb(rj4.g.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m162523x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
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
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  updateTime LONG default '0' ,  selfUsername TEXT default '' ,  type INTEGER,  actionPermission INTEGER,  rejectMsg INTEGER,  disableSendMsg INTEGER,  senderUserName TEXT default '' ,  senderRoleType INTEGER default '0' ";
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
            if (f477865s == hashCode) {
                try {
                    this.f76631xbed8694c = cursor.getString(i17);
                    this.f477873d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477866t == hashCode) {
                try {
                    this.f76632x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477867u == hashCode) {
                try {
                    this.f76634xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477868v == hashCode) {
                try {
                    this.f76628x55775f67 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477869w == hashCode) {
                try {
                    this.f76633x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477870x == hashCode) {
                try {
                    this.f76625xaf64e94a = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477871y == hashCode) {
                try {
                    this.f76627x36454e5d = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477872z == hashCode) {
                try {
                    this.f76626x83e02cb6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f76630x1362f030 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f76629x13644c0a = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusSessionInfo", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f76631xbed8694c == null) {
            this.f76631xbed8694c = "";
        }
        if (this.f477873d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f76631xbed8694c);
        }
        if (this.f76632x114ef53e == null) {
            this.f76632x114ef53e = "";
        }
        if (this.f477874e) {
            contentValues.put("talker", this.f76632x114ef53e);
        }
        if (this.f477875f) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f76634xa783a79b));
        }
        if (this.f76628x55775f67 == null) {
            this.f76628x55775f67 = "";
        }
        if (this.f477876g) {
            contentValues.put("selfUsername", this.f76628x55775f67);
        }
        if (this.f477877h) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f76633x2262335f));
        }
        if (this.f477878i) {
            contentValues.put("actionPermission", java.lang.Integer.valueOf(this.f76625xaf64e94a));
        }
        if (this.f477879m) {
            contentValues.put("rejectMsg", java.lang.Integer.valueOf(this.f76627x36454e5d));
        }
        if (this.f477880n) {
            contentValues.put("disableSendMsg", java.lang.Integer.valueOf(this.f76626x83e02cb6));
        }
        if (this.f76630x1362f030 == null) {
            this.f76630x1362f030 = "";
        }
        if (this.f477881o) {
            contentValues.put("senderUserName", this.f76630x1362f030);
        }
        if (this.f477882p) {
            contentValues.put("senderRoleType", java.lang.Integer.valueOf(this.f76629x13644c0a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusSessionInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f477864r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTableSql %s", str2);
            k0Var.A("TextStatusSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TextStatusSessionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusSessionInfo", "updateTableSql %s", str3);
            k0Var.A("TextStatusSessionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f76631xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f477863q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f477863q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f76631xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f477873d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f76632x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f477874e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f76634xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f477875f = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.f76628x55775f67 = contentValues.getAsString("selfUsername");
            if (z17) {
                this.f477876g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f76633x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f477877h = true;
            }
        }
        if (contentValues.containsKey("actionPermission")) {
            this.f76625xaf64e94a = contentValues.getAsInteger("actionPermission").intValue();
            if (z17) {
                this.f477878i = true;
            }
        }
        if (contentValues.containsKey("rejectMsg")) {
            this.f76627x36454e5d = contentValues.getAsInteger("rejectMsg").intValue();
            if (z17) {
                this.f477879m = true;
            }
        }
        if (contentValues.containsKey("disableSendMsg")) {
            this.f76626x83e02cb6 = contentValues.getAsInteger("disableSendMsg").intValue();
            if (z17) {
                this.f477880n = true;
            }
        }
        if (contentValues.containsKey("senderUserName")) {
            this.f76630x1362f030 = contentValues.getAsString("senderUserName");
            if (z17) {
                this.f477881o = true;
            }
        }
        if (contentValues.containsKey("senderRoleType")) {
            this.f76629x13644c0a = contentValues.getAsInteger("senderRoleType").intValue();
            if (z17) {
                this.f477882p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
