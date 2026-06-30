package dm;

/* loaded from: classes4.dex */
public class dd extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f318001o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f318002p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318003q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318004r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318005s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318006t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318007u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318008v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318009w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318010x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318011y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f318012z;

    /* renamed from: field_btnState */
    public int f66299x9ac5f93a;

    /* renamed from: field_content */
    public java.lang.String f66300xad49e234;

    /* renamed from: field_contentColor */
    public java.lang.String f66301x3c339d8f;

    /* renamed from: field_msgState */
    public int f66302xd09abf35;

    /* renamed from: field_msgType */
    public int f66303xc4aab016;

    /* renamed from: field_shareKeyHash */
    public int f66304xc29dba53;

    /* renamed from: field_updatePeroid */
    public int f66305xce2ee4db;

    /* renamed from: field_weAppSourceUserName */
    public java.lang.String f66306xf47bcabf;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318013d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318014e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318015f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318016g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318017h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318018i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318019m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318020n = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaUpdateableMsg");
        f318001o = n0Var;
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
        f318002p = new java.lang.String[0];
        f318003q = -1234040018;
        f318004r = 2097344405;
        f318005s = -1294486128;
        f318006t = 951530617;
        f318007u = 805826154;
        f318008v = -1039977034;
        f318009w = 1343750747;
        f318010x = 97443204;
        f318011y = 108705909;
        f318012z = m124886x3593deb(dm.dd.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124886x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "shareKeyHash";
        e0Var.f398488d.put("shareKeyHash", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "shareKeyHash";
        e0Var.f398487c[1] = "btnState";
        e0Var.f398488d.put("btnState", "INTEGER");
        e0Var.f398487c[2] = "msgState";
        e0Var.f398488d.put("msgState", "INTEGER");
        e0Var.f398487c[3] = "content";
        e0Var.f398488d.put("content", "TEXT");
        e0Var.f398487c[4] = "contentColor";
        e0Var.f398488d.put("contentColor", "TEXT");
        e0Var.f398487c[5] = "updatePeroid";
        e0Var.f398488d.put("updatePeroid", "INTEGER");
        e0Var.f398487c[6] = "msgType";
        e0Var.f398488d.put("msgType", "INTEGER");
        e0Var.f398487c[7] = "weAppSourceUserName";
        e0Var.f398488d.put("weAppSourceUserName", "TEXT");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " shareKeyHash INTEGER PRIMARY KEY ,  btnState INTEGER,  msgState INTEGER,  content TEXT,  contentColor TEXT,  updatePeroid INTEGER,  msgType INTEGER,  weAppSourceUserName TEXT";
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
            if (f318003q == hashCode) {
                try {
                    this.f66304xc29dba53 = cursor.getInt(i17);
                    this.f318013d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318004r == hashCode) {
                try {
                    this.f66299x9ac5f93a = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318005s == hashCode) {
                try {
                    this.f66302xd09abf35 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318006t == hashCode) {
                try {
                    this.f66300xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318007u == hashCode) {
                try {
                    this.f66301x3c339d8f = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318008v == hashCode) {
                try {
                    this.f66305xce2ee4db = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318009w == hashCode) {
                try {
                    this.f66303xc4aab016 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318010x == hashCode) {
                try {
                    this.f66306xf47bcabf = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaUpdateableMsg", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318011y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318013d) {
            contentValues.put("shareKeyHash", java.lang.Integer.valueOf(this.f66304xc29dba53));
        }
        if (this.f318014e) {
            contentValues.put("btnState", java.lang.Integer.valueOf(this.f66299x9ac5f93a));
        }
        if (this.f318015f) {
            contentValues.put("msgState", java.lang.Integer.valueOf(this.f66302xd09abf35));
        }
        if (this.f318016g) {
            contentValues.put("content", this.f66300xad49e234);
        }
        if (this.f318017h) {
            contentValues.put("contentColor", this.f66301x3c339d8f);
        }
        if (this.f318018i) {
            contentValues.put("updatePeroid", java.lang.Integer.valueOf(this.f66305xce2ee4db));
        }
        if (this.f318019m) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.f66303xc4aab016));
        }
        if (this.f318020n) {
            contentValues.put("weAppSourceUserName", this.f66306xf47bcabf);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaUpdateableMsg ( ");
        l75.e0 e0Var = f318012z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318002p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTableSql %s", str2);
            k0Var.A("WxaUpdateableMsg", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaUpdateableMsg", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaUpdateableMsg", "updateTableSql %s", str3);
            k0Var.A("WxaUpdateableMsg", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaUpdateableMsg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318012z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f66304xc29dba53);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318001o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318001o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("shareKeyHash")) {
            this.f66304xc29dba53 = contentValues.getAsInteger("shareKeyHash").intValue();
            if (z17) {
                this.f318013d = true;
            }
        }
        if (contentValues.containsKey("btnState")) {
            this.f66299x9ac5f93a = contentValues.getAsInteger("btnState").intValue();
            if (z17) {
                this.f318014e = true;
            }
        }
        if (contentValues.containsKey("msgState")) {
            this.f66302xd09abf35 = contentValues.getAsInteger("msgState").intValue();
            if (z17) {
                this.f318015f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f66300xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f318016g = true;
            }
        }
        if (contentValues.containsKey("contentColor")) {
            this.f66301x3c339d8f = contentValues.getAsString("contentColor");
            if (z17) {
                this.f318017h = true;
            }
        }
        if (contentValues.containsKey("updatePeroid")) {
            this.f66305xce2ee4db = contentValues.getAsInteger("updatePeroid").intValue();
            if (z17) {
                this.f318018i = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.f66303xc4aab016 = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f318019m = true;
            }
        }
        if (contentValues.containsKey("weAppSourceUserName")) {
            this.f66306xf47bcabf = contentValues.getAsString("weAppSourceUserName");
            if (z17) {
                this.f318020n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
