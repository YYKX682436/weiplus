package dm;

/* loaded from: classes8.dex */
public class p5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f320673s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f320674t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320675u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320676v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320677w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320678x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320679y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320680z;

    /* renamed from: field_appId */
    public java.lang.String f67895x28d45f97;

    /* renamed from: field_appName */
    public java.lang.String f67896x453d1e07;

    /* renamed from: field_coverPath */
    public java.lang.String f67897x109ca377;

    /* renamed from: field_createTime */
    public long f67898xac3be4e;

    /* renamed from: field_desc */
    public java.lang.String f67899x225aa2b6;

    /* renamed from: field_durationSec */
    public long f67900x4f407658;

    /* renamed from: field_extJsonData */
    public java.lang.String f67901x6985322e;

    /* renamed from: field_fileId */
    public java.lang.String f67902xf9dbbe9c;

    /* renamed from: field_filePath */
    public java.lang.String f67903xf1e9b966;

    /* renamed from: field_orgFilePath */
    public java.lang.String f67904x4326f700;

    /* renamed from: field_title */
    public java.lang.String f67905x29dd02d3;

    /* renamed from: field_userId */
    public java.lang.String f67906x13fe5d2b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320681d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320682e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320683f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320684g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320685h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320686i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320687m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320688n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320689o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320690p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320691q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320692r = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLocalVideoInfo");
        f320673s = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320674t = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameLocalVideoInfo_UserId ON GameLocalVideoInfo(userId)", "CREATE INDEX IF NOT EXISTS GameLocalVideoInfo_AppId ON GameLocalVideoInfo(appId)"};
        f320675u = -1274507337;
        f320676v = -836030906;
        f320677w = 93028124;
        f320678x = -794136500;
        f320679y = -735662143;
        f320680z = -681075003;
        A = 1979611260;
        B = -37365261;
        C = 1369213417;
        D = -478077411;
        E = 110371416;
        F = 3079825;
        G = 108705909;
        H = m125392x3593deb(dm.p5.class);
        I = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125392x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f398487c = strArr;
        strArr[0] = "fileId";
        e0Var.f398488d.put("fileId", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "fileId";
        e0Var.f398487c[1] = "userId";
        e0Var.f398488d.put("userId", "TEXT default '' ");
        e0Var.f398487c[2] = "appId";
        e0Var.f398488d.put("appId", "TEXT default '' ");
        e0Var.f398487c[3] = "appName";
        e0Var.f398488d.put("appName", "TEXT default '' ");
        e0Var.f398487c[4] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "TEXT default '' ");
        e0Var.f398487c[5] = "orgFilePath";
        e0Var.f398488d.put("orgFilePath", "TEXT default '' ");
        e0Var.f398487c[6] = "coverPath";
        e0Var.f398488d.put("coverPath", "TEXT default '' ");
        e0Var.f398487c[7] = "extJsonData";
        e0Var.f398488d.put("extJsonData", "TEXT default '' ");
        e0Var.f398487c[8] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[9] = "durationSec";
        e0Var.f398488d.put("durationSec", "LONG");
        e0Var.f398487c[10] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT default '' ");
        e0Var.f398487c[11] = "desc";
        e0Var.f398488d.put("desc", "TEXT default '' ");
        e0Var.f398487c[12] = "rowid";
        e0Var.f398489e = " fileId TEXT default ''  PRIMARY KEY ,  userId TEXT default '' ,  appId TEXT default '' ,  appName TEXT default '' ,  filePath TEXT default '' ,  orgFilePath TEXT default '' ,  coverPath TEXT default '' ,  extJsonData TEXT default '' ,  createTime LONG,  durationSec LONG,  title TEXT default '' ,  desc TEXT default '' ";
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
            if (f320675u == hashCode) {
                try {
                    this.f67902xf9dbbe9c = cursor.getString(i17);
                    this.f320681d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320676v == hashCode) {
                try {
                    this.f67906x13fe5d2b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320677w == hashCode) {
                try {
                    this.f67895x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320678x == hashCode) {
                try {
                    this.f67896x453d1e07 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320679y == hashCode) {
                try {
                    this.f67903xf1e9b966 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320680z == hashCode) {
                try {
                    this.f67904x4326f700 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67897x109ca377 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67901x6985322e = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67898xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67900x4f407658 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67905x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67899x225aa2b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLocalVideoInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f67902xf9dbbe9c == null) {
            this.f67902xf9dbbe9c = "";
        }
        if (this.f320681d) {
            contentValues.put("fileId", this.f67902xf9dbbe9c);
        }
        if (this.f67906x13fe5d2b == null) {
            this.f67906x13fe5d2b = "";
        }
        if (this.f320682e) {
            contentValues.put("userId", this.f67906x13fe5d2b);
        }
        if (this.f67895x28d45f97 == null) {
            this.f67895x28d45f97 = "";
        }
        if (this.f320683f) {
            contentValues.put("appId", this.f67895x28d45f97);
        }
        if (this.f67896x453d1e07 == null) {
            this.f67896x453d1e07 = "";
        }
        if (this.f320684g) {
            contentValues.put("appName", this.f67896x453d1e07);
        }
        if (this.f67903xf1e9b966 == null) {
            this.f67903xf1e9b966 = "";
        }
        if (this.f320685h) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f67903xf1e9b966);
        }
        if (this.f67904x4326f700 == null) {
            this.f67904x4326f700 = "";
        }
        if (this.f320686i) {
            contentValues.put("orgFilePath", this.f67904x4326f700);
        }
        if (this.f67897x109ca377 == null) {
            this.f67897x109ca377 = "";
        }
        if (this.f320687m) {
            contentValues.put("coverPath", this.f67897x109ca377);
        }
        if (this.f67901x6985322e == null) {
            this.f67901x6985322e = "";
        }
        if (this.f320688n) {
            contentValues.put("extJsonData", this.f67901x6985322e);
        }
        if (this.f320689o) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67898xac3be4e));
        }
        if (this.f320690p) {
            contentValues.put("durationSec", java.lang.Long.valueOf(this.f67900x4f407658));
        }
        if (this.f67905x29dd02d3 == null) {
            this.f67905x29dd02d3 = "";
        }
        if (this.f320691q) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67905x29dd02d3);
        }
        if (this.f67899x225aa2b6 == null) {
            this.f67899x225aa2b6 = "";
        }
        if (this.f320692r) {
            contentValues.put("desc", this.f67899x225aa2b6);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLocalVideoInfo ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320674t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTableSql %s", str2);
            k0Var.A("GameLocalVideoInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameLocalVideoInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLocalVideoInfo", "updateTableSql %s", str3);
            k0Var.A("GameLocalVideoInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLocalVideoInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return H;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return I;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67902xf9dbbe9c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320673s;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320673s.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("fileId")) {
            this.f67902xf9dbbe9c = contentValues.getAsString("fileId");
            if (z17) {
                this.f320681d = true;
            }
        }
        if (contentValues.containsKey("userId")) {
            this.f67906x13fe5d2b = contentValues.getAsString("userId");
            if (z17) {
                this.f320682e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67895x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320683f = true;
            }
        }
        if (contentValues.containsKey("appName")) {
            this.f67896x453d1e07 = contentValues.getAsString("appName");
            if (z17) {
                this.f320684g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
            this.f67903xf1e9b966 = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
            if (z17) {
                this.f320685h = true;
            }
        }
        if (contentValues.containsKey("orgFilePath")) {
            this.f67904x4326f700 = contentValues.getAsString("orgFilePath");
            if (z17) {
                this.f320686i = true;
            }
        }
        if (contentValues.containsKey("coverPath")) {
            this.f67897x109ca377 = contentValues.getAsString("coverPath");
            if (z17) {
                this.f320687m = true;
            }
        }
        if (contentValues.containsKey("extJsonData")) {
            this.f67901x6985322e = contentValues.getAsString("extJsonData");
            if (z17) {
                this.f320688n = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67898xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f320689o = true;
            }
        }
        if (contentValues.containsKey("durationSec")) {
            this.f67900x4f407658 = contentValues.getAsLong("durationSec").longValue();
            if (z17) {
                this.f320690p = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67905x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f320691q = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.f67899x225aa2b6 = contentValues.getAsString("desc");
            if (z17) {
                this.f320692r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
