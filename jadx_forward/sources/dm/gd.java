package dm;

/* loaded from: classes4.dex */
public class gd extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f318776p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f318777q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318778r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318779s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318780t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318781u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318782v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318783w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318784x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318785y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318786z;

    /* renamed from: field_AppId */
    public java.lang.String f66704x27116f77;

    /* renamed from: field_AppName */
    public java.lang.String f66705xa875b5e7;

    /* renamed from: field_BriefIntro */
    public java.lang.String f66706xe7075a97;

    /* renamed from: field_IconUrl */
    public java.lang.String f66707x3978d7d1;

    /* renamed from: field_RecordId */
    public java.lang.String f66708xf1fa1311;

    /* renamed from: field_UserName */
    public java.lang.String f66709x11b86abb;

    /* renamed from: field_createTime */
    public long f66710xac3be4e;

    /* renamed from: field_debugType */
    public int f66711x8ecd6328;

    /* renamed from: field_isSync */
    public boolean f66712xff7c25ca;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318787d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318788e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318789f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318790g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318791h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318792i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318793m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318794n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318795o = true;

    static {
        p75.n0 n0Var = new p75.n0("WxagGameInfo");
        f318776p = n0Var;
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
        f318777q = new java.lang.String[0];
        f318778r = -734590612;
        f318779s = 63475452;
        f318780t = 870516780;
        f318781u = -202022634;
        f318782v = -991548906;
        f318783w = 769664562;
        f318784x = -1180109083;
        f318785y = -198232019;
        f318786z = 1369213417;
        A = 108705909;
        B = m125016x3593deb(dm.gd.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125016x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "RecordId";
        e0Var.f398488d.put("RecordId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "RecordId";
        e0Var.f398487c[1] = "AppId";
        e0Var.f398488d.put("AppId", "TEXT");
        e0Var.f398487c[2] = "AppName";
        e0Var.f398488d.put("AppName", "TEXT");
        e0Var.f398487c[3] = "UserName";
        e0Var.f398488d.put("UserName", "TEXT");
        e0Var.f398487c[4] = "IconUrl";
        e0Var.f398488d.put("IconUrl", "TEXT");
        e0Var.f398487c[5] = "BriefIntro";
        e0Var.f398488d.put("BriefIntro", "TEXT");
        e0Var.f398487c[6] = "isSync";
        e0Var.f398488d.put("isSync", "INTEGER default 'false' ");
        e0Var.f398487c[7] = "debugType";
        e0Var.f398488d.put("debugType", "INTEGER");
        e0Var.f398487c[8] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " RecordId TEXT PRIMARY KEY ,  AppId TEXT,  AppName TEXT,  UserName TEXT,  IconUrl TEXT,  BriefIntro TEXT,  isSync INTEGER default 'false' ,  debugType INTEGER,  createTime LONG";
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
            if (f318778r == hashCode) {
                try {
                    this.f66708xf1fa1311 = cursor.getString(i17);
                    this.f318787d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318779s == hashCode) {
                try {
                    this.f66704x27116f77 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318780t == hashCode) {
                try {
                    this.f66705xa875b5e7 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318781u == hashCode) {
                try {
                    this.f66709x11b86abb = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318782v == hashCode) {
                try {
                    this.f66707x3978d7d1 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318783w == hashCode) {
                try {
                    this.f66706xe7075a97 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318784x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f66712xff7c25ca = z17;
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318785y == hashCode) {
                try {
                    this.f66711x8ecd6328 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318786z == hashCode) {
                try {
                    this.f66710xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxagGameInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318787d) {
            contentValues.put("RecordId", this.f66708xf1fa1311);
        }
        if (this.f318788e) {
            contentValues.put("AppId", this.f66704x27116f77);
        }
        if (this.f318789f) {
            contentValues.put("AppName", this.f66705xa875b5e7);
        }
        if (this.f318790g) {
            contentValues.put("UserName", this.f66709x11b86abb);
        }
        if (this.f318791h) {
            contentValues.put("IconUrl", this.f66707x3978d7d1);
        }
        if (this.f318792i) {
            contentValues.put("BriefIntro", this.f66706xe7075a97);
        }
        if (this.f318793m) {
            if (this.f66712xff7c25ca) {
                contentValues.put("isSync", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSync", (java.lang.Integer) 0);
            }
        }
        if (this.f318794n) {
            contentValues.put("debugType", java.lang.Integer.valueOf(this.f66711x8ecd6328));
        }
        if (this.f318795o) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66710xac3be4e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxagGameInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxagGameInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318777q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxagGameInfo", "createTableSql %s", str2);
            k0Var.A("WxagGameInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxagGameInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxagGameInfo", "updateTableSql %s", str3);
            k0Var.A("WxagGameInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxagGameInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66708xf1fa1311;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318776p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318776p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("RecordId")) {
            this.f66708xf1fa1311 = contentValues.getAsString("RecordId");
            if (z17) {
                this.f318787d = true;
            }
        }
        if (contentValues.containsKey("AppId")) {
            this.f66704x27116f77 = contentValues.getAsString("AppId");
            if (z17) {
                this.f318788e = true;
            }
        }
        if (contentValues.containsKey("AppName")) {
            this.f66705xa875b5e7 = contentValues.getAsString("AppName");
            if (z17) {
                this.f318789f = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.f66709x11b86abb = contentValues.getAsString("UserName");
            if (z17) {
                this.f318790g = true;
            }
        }
        if (contentValues.containsKey("IconUrl")) {
            this.f66707x3978d7d1 = contentValues.getAsString("IconUrl");
            if (z17) {
                this.f318791h = true;
            }
        }
        if (contentValues.containsKey("BriefIntro")) {
            this.f66706xe7075a97 = contentValues.getAsString("BriefIntro");
            if (z17) {
                this.f318792i = true;
            }
        }
        if (contentValues.containsKey("isSync")) {
            this.f66712xff7c25ca = contentValues.getAsInteger("isSync").intValue() != 0;
            if (z17) {
                this.f318793m = true;
            }
        }
        if (contentValues.containsKey("debugType")) {
            this.f66711x8ecd6328 = contentValues.getAsInteger("debugType").intValue();
            if (z17) {
                this.f318794n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66710xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318795o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
