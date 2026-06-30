package rj4;

/* loaded from: classes9.dex */
public class d extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f477801J;
    public static final l75.e0 K;
    public static final o75.e L;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f477802t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f477803u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f477804v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f477805w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f477806x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f477807y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f477808z;

    /* renamed from: field_Read */
    public int f76588x225271db;

    /* renamed from: field_canChatting */
    public int f76589x9f01e671;

    /* renamed from: field_card_key */
    public long f76590x1d4a4a55;

    /* renamed from: field_createTime */
    public int f76591xac3be4e;

    /* renamed from: field_encUsername */
    public java.lang.String f76592x6c03540b;

    /* renamed from: field_hash_username */
    public java.lang.String f76593x5ef57e62;

    /* renamed from: field_modify_count */
    public int f76594x2b07e86f;

    /* renamed from: field_newMsgId */
    public long f76595x6edd4861;

    /* renamed from: field_plain */
    public java.lang.String f76596x29a5ba45;

    /* renamed from: field_session_id */
    public java.lang.String f76597x1c3513c9;

    /* renamed from: field_source_id */
    public java.lang.String f76598x35627aba;

    /* renamed from: field_status_id */
    public java.lang.String f76599x1f396f83;

    /* renamed from: field_tag */
    public java.lang.String f76600x4b6e82d5;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477809d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f477810e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f477811f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f477812g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f477813h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f477814i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f477815m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f477816n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f477817o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f477818p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f477819q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f477820r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f477821s = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusGreetingItem");
        f477802t = n0Var;
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
        f477803u = new p75.d("createTime", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f477804v = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusGreetingItem_sessionId_index ON TextStatusGreetingItem(session_id)"};
        f477805w = 1360674492;
        f477806x = 1661853540;
        f477807y = -441759513;
        f477808z = 4455376;
        A = 114586;
        B = -1698410561;
        C = 859999798;
        D = 106748362;
        E = 1369213417;
        F = 2543030;
        G = -2070199160;
        H = 517749066;
        I = -7913296;
        f477801J = 108705909;
        K = m162517x3593deb(rj4.d.class);
        L = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m162517x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "newMsgId";
        e0Var.f398488d.put("newMsgId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "newMsgId";
        e0Var.f398487c[1] = "session_id";
        e0Var.f398488d.put("session_id", "TEXT default '' ");
        e0Var.f398487c[2] = "hash_username";
        e0Var.f398488d.put("hash_username", "TEXT default '' ");
        e0Var.f398487c[3] = "encUsername";
        e0Var.f398488d.put("encUsername", "TEXT default '' ");
        e0Var.f398487c[4] = "tag";
        e0Var.f398488d.put("tag", "TEXT default '' ");
        e0Var.f398487c[5] = "source_id";
        e0Var.f398488d.put("source_id", "TEXT default '' ");
        e0Var.f398487c[6] = "canChatting";
        e0Var.f398488d.put("canChatting", "INTEGER default '0' ");
        e0Var.f398487c[7] = "plain";
        e0Var.f398488d.put("plain", "TEXT default '' ");
        e0Var.f398487c[8] = "createTime";
        e0Var.f398488d.put("createTime", "INTEGER");
        e0Var.f398487c[9] = "Read";
        e0Var.f398488d.put("Read", "INTEGER default '0' ");
        e0Var.f398487c[10] = "status_id";
        e0Var.f398488d.put("status_id", "TEXT default '' ");
        e0Var.f398487c[11] = "modify_count";
        e0Var.f398488d.put("modify_count", "INTEGER default '0' ");
        e0Var.f398487c[12] = "card_key";
        e0Var.f398488d.put("card_key", "LONG default '0' ");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " newMsgId LONG default '0'  PRIMARY KEY ,  session_id TEXT default '' ,  hash_username TEXT default '' ,  encUsername TEXT default '' ,  tag TEXT default '' ,  source_id TEXT default '' ,  canChatting INTEGER default '0' ,  plain TEXT default '' ,  createTime INTEGER,  Read INTEGER default '0' ,  status_id TEXT default '' ,  modify_count INTEGER default '0' ,  card_key LONG default '0' ";
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
            if (f477805w == hashCode) {
                try {
                    this.f76595x6edd4861 = cursor.getLong(i17);
                    this.f477809d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477806x == hashCode) {
                try {
                    this.f76597x1c3513c9 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477807y == hashCode) {
                try {
                    this.f76593x5ef57e62 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477808z == hashCode) {
                try {
                    this.f76592x6c03540b = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f76600x4b6e82d5 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f76598x35627aba = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f76589x9f01e671 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f76596x29a5ba45 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f76591xac3be4e = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f76588x225271db = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f76599x1f396f83 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f76594x2b07e86f = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f76590x1d4a4a55 = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusGreetingItem", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477801J == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f477809d) {
            contentValues.put("newMsgId", java.lang.Long.valueOf(this.f76595x6edd4861));
        }
        if (this.f76597x1c3513c9 == null) {
            this.f76597x1c3513c9 = "";
        }
        if (this.f477810e) {
            contentValues.put("session_id", this.f76597x1c3513c9);
        }
        if (this.f76593x5ef57e62 == null) {
            this.f76593x5ef57e62 = "";
        }
        if (this.f477811f) {
            contentValues.put("hash_username", this.f76593x5ef57e62);
        }
        if (this.f76592x6c03540b == null) {
            this.f76592x6c03540b = "";
        }
        if (this.f477812g) {
            contentValues.put("encUsername", this.f76592x6c03540b);
        }
        if (this.f76600x4b6e82d5 == null) {
            this.f76600x4b6e82d5 = "";
        }
        if (this.f477813h) {
            contentValues.put("tag", this.f76600x4b6e82d5);
        }
        if (this.f76598x35627aba == null) {
            this.f76598x35627aba = "";
        }
        if (this.f477814i) {
            contentValues.put("source_id", this.f76598x35627aba);
        }
        if (this.f477815m) {
            contentValues.put("canChatting", java.lang.Integer.valueOf(this.f76589x9f01e671));
        }
        if (this.f76596x29a5ba45 == null) {
            this.f76596x29a5ba45 = "";
        }
        if (this.f477816n) {
            contentValues.put("plain", this.f76596x29a5ba45);
        }
        if (this.f477817o) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.f76591xac3be4e));
        }
        if (this.f477818p) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.f76588x225271db));
        }
        if (this.f76599x1f396f83 == null) {
            this.f76599x1f396f83 = "";
        }
        if (this.f477819q) {
            contentValues.put("status_id", this.f76599x1f396f83);
        }
        if (this.f477820r) {
            contentValues.put("modify_count", java.lang.Integer.valueOf(this.f76594x2b07e86f));
        }
        if (this.f477821s) {
            contentValues.put("card_key", java.lang.Long.valueOf(this.f76590x1d4a4a55));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusGreetingItem ( ");
        l75.e0 e0Var = K;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f477804v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTableSql %s", str2);
            k0Var.A("TextStatusGreetingItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TextStatusGreetingItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusGreetingItem", "updateTableSql %s", str3);
            k0Var.A("TextStatusGreetingItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusGreetingItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return L;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f76595x6edd4861);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f477802t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f477802t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("newMsgId")) {
            this.f76595x6edd4861 = contentValues.getAsLong("newMsgId").longValue();
            if (z17) {
                this.f477809d = true;
            }
        }
        if (contentValues.containsKey("session_id")) {
            this.f76597x1c3513c9 = contentValues.getAsString("session_id");
            if (z17) {
                this.f477810e = true;
            }
        }
        if (contentValues.containsKey("hash_username")) {
            this.f76593x5ef57e62 = contentValues.getAsString("hash_username");
            if (z17) {
                this.f477811f = true;
            }
        }
        if (contentValues.containsKey("encUsername")) {
            this.f76592x6c03540b = contentValues.getAsString("encUsername");
            if (z17) {
                this.f477812g = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.f76600x4b6e82d5 = contentValues.getAsString("tag");
            if (z17) {
                this.f477813h = true;
            }
        }
        if (contentValues.containsKey("source_id")) {
            this.f76598x35627aba = contentValues.getAsString("source_id");
            if (z17) {
                this.f477814i = true;
            }
        }
        if (contentValues.containsKey("canChatting")) {
            this.f76589x9f01e671 = contentValues.getAsInteger("canChatting").intValue();
            if (z17) {
                this.f477815m = true;
            }
        }
        if (contentValues.containsKey("plain")) {
            this.f76596x29a5ba45 = contentValues.getAsString("plain");
            if (z17) {
                this.f477816n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f76591xac3be4e = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f477817o = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.f76588x225271db = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f477818p = true;
            }
        }
        if (contentValues.containsKey("status_id")) {
            this.f76599x1f396f83 = contentValues.getAsString("status_id");
            if (z17) {
                this.f477819q = true;
            }
        }
        if (contentValues.containsKey("modify_count")) {
            this.f76594x2b07e86f = contentValues.getAsInteger("modify_count").intValue();
            if (z17) {
                this.f477820r = true;
            }
        }
        if (contentValues.containsKey("card_key")) {
            this.f76590x1d4a4a55 = contentValues.getAsLong("card_key").longValue();
            if (z17) {
                this.f477821s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
