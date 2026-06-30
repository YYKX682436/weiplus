package dm;

/* loaded from: classes8.dex */
public class n5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f320212q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f320213r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320214s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320215t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320216u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320217v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320218w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320219x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320220y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320221z;

    /* renamed from: field_digest */
    public java.lang.String f67663xf66fcca9;

    /* renamed from: field_digestFlag */
    public long f67664x6b18c3b5;

    /* renamed from: field_digestPrefix */
    public java.lang.String f67665x195d889b;

    /* renamed from: field_editingMsg */
    public java.lang.String f67666x51f5672e;

    /* renamed from: field_lastMsgID */
    public long f67667x11a0aa61;

    /* renamed from: field_selfUserName */
    public java.lang.String f67668x5568d387;

    /* renamed from: field_sessionId */
    public java.lang.String f67669xbed8694c;

    /* renamed from: field_talker */
    public java.lang.String f67670x114ef53e;

    /* renamed from: field_unReadCount */
    public int f67671xa35b5abb;

    /* renamed from: field_updateTime */
    public long f67672xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320222d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320223e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320224f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320225g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320226h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320227i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320228m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320229n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320230o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320231p = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeConversation");
        f320212q = n0Var;
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
        f320213r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameLifeConversation_sessionId_index ON GameLifeConversation(sessionId)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_talker_index ON GameLifeConversation(talker)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_selfUserName_index ON GameLifeConversation(selfUserName)", "CREATE INDEX IF NOT EXISTS GameLifeConversation_updateTime_index ON GameLifeConversation(updateTime)"};
        f320214s = 607796817;
        f320215t = -881080743;
        f320216u = 1228743778;
        f320217v = 932971136;
        f320218w = -295931082;
        f320219x = -1331913276;
        f320220y = 1996652390;
        f320221z = -1309569200;
        A = 221370742;
        B = -1731317047;
        C = 108705909;
        D = m125337x3593deb(dm.n5.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125337x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398488d.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398487c[1] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[2] = "selfUserName";
        e0Var.f398488d.put("selfUserName", "TEXT default '' ");
        e0Var.f398487c[3] = "unReadCount";
        e0Var.f398488d.put("unReadCount", "INTEGER default '0' ");
        e0Var.f398487c[4] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[5] = "digest";
        e0Var.f398488d.put("digest", "TEXT default '' ");
        e0Var.f398487c[6] = "lastMsgID";
        e0Var.f398488d.put("lastMsgID", "LONG");
        e0Var.f398487c[7] = "digestFlag";
        e0Var.f398488d.put("digestFlag", "LONG default '0' ");
        e0Var.f398487c[8] = "digestPrefix";
        e0Var.f398488d.put("digestPrefix", "TEXT default '' ");
        e0Var.f398487c[9] = "editingMsg";
        e0Var.f398488d.put("editingMsg", "TEXT default '' ");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfUserName TEXT default '' ,  unReadCount INTEGER default '0' ,  updateTime LONG default '0' ,  digest TEXT default '' ,  lastMsgID LONG,  digestFlag LONG default '0' ,  digestPrefix TEXT default '' ,  editingMsg TEXT default '' ";
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
            if (f320214s == hashCode) {
                try {
                    this.f67669xbed8694c = cursor.getString(i17);
                    this.f320222d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320215t == hashCode) {
                try {
                    this.f67670x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320216u == hashCode) {
                try {
                    this.f67668x5568d387 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320217v == hashCode) {
                try {
                    this.f67671xa35b5abb = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320218w == hashCode) {
                try {
                    this.f67672xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320219x == hashCode) {
                try {
                    this.f67663xf66fcca9 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320220y == hashCode) {
                try {
                    this.f67667x11a0aa61 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320221z == hashCode) {
                try {
                    this.f67664x6b18c3b5 = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67665x195d889b = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67666x51f5672e = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeConversation", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f67669xbed8694c == null) {
            this.f67669xbed8694c = "";
        }
        if (this.f320222d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f67669xbed8694c);
        }
        if (this.f67670x114ef53e == null) {
            this.f67670x114ef53e = "";
        }
        if (this.f320223e) {
            contentValues.put("talker", this.f67670x114ef53e);
        }
        if (this.f67668x5568d387 == null) {
            this.f67668x5568d387 = "";
        }
        if (this.f320224f) {
            contentValues.put("selfUserName", this.f67668x5568d387);
        }
        if (this.f320225g) {
            contentValues.put("unReadCount", java.lang.Integer.valueOf(this.f67671xa35b5abb));
        }
        if (this.f320226h) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f67672xa783a79b));
        }
        if (this.f67663xf66fcca9 == null) {
            this.f67663xf66fcca9 = "";
        }
        if (this.f320227i) {
            contentValues.put("digest", this.f67663xf66fcca9);
        }
        if (this.f320228m) {
            contentValues.put("lastMsgID", java.lang.Long.valueOf(this.f67667x11a0aa61));
        }
        if (this.f320229n) {
            contentValues.put("digestFlag", java.lang.Long.valueOf(this.f67664x6b18c3b5));
        }
        if (this.f67665x195d889b == null) {
            this.f67665x195d889b = "";
        }
        if (this.f320230o) {
            contentValues.put("digestPrefix", this.f67665x195d889b);
        }
        if (this.f67666x51f5672e == null) {
            this.f67666x51f5672e = "";
        }
        if (this.f320231p) {
            contentValues.put("editingMsg", this.f67666x51f5672e);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeConversation", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeConversation ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320213r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeConversation", "createTableSql %s", str2);
            k0Var.A("GameLifeConversation", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameLifeConversation", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeConversation", "updateTableSql %s", str3);
            k0Var.A("GameLifeConversation", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeConversation", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f67669xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320212q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320212q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f67669xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f320222d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f67670x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f320223e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.f67668x5568d387 = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f320224f = true;
            }
        }
        if (contentValues.containsKey("unReadCount")) {
            this.f67671xa35b5abb = contentValues.getAsInteger("unReadCount").intValue();
            if (z17) {
                this.f320225g = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f67672xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f320226h = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.f67663xf66fcca9 = contentValues.getAsString("digest");
            if (z17) {
                this.f320227i = true;
            }
        }
        if (contentValues.containsKey("lastMsgID")) {
            this.f67667x11a0aa61 = contentValues.getAsLong("lastMsgID").longValue();
            if (z17) {
                this.f320228m = true;
            }
        }
        if (contentValues.containsKey("digestFlag")) {
            this.f67664x6b18c3b5 = contentValues.getAsLong("digestFlag").longValue();
            if (z17) {
                this.f320229n = true;
            }
        }
        if (contentValues.containsKey("digestPrefix")) {
            this.f67665x195d889b = contentValues.getAsString("digestPrefix");
            if (z17) {
                this.f320230o = true;
            }
        }
        if (contentValues.containsKey("editingMsg")) {
            this.f67666x51f5672e = contentValues.getAsString("editingMsg");
            if (z17) {
                this.f320231p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
