package dm;

/* loaded from: classes7.dex */
public class x8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f322594m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f322595n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322596o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322597p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322598q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322599r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322600s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322601t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322602u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f322603v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f322604w;

    /* renamed from: field_appId */
    public java.lang.String f69143x28d45f97;

    /* renamed from: field_msgState */
    public int f69144xd09abf35;

    /* renamed from: field_msgTypeFlag */
    public int f69145x112a28a2;

    /* renamed from: field_packageName */
    public java.lang.String f69146xa1e9e82c;

    /* renamed from: field_sceneFlag */
    public int f69147x1ab9113;

    /* renamed from: field_status */
    public int f69148x10a0fed7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322605d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322606e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322607f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322608g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322609h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322610i = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenMsgListener");
        f322594m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322595n = new java.lang.String[0];
        f322596o = 93028124;
        f322597p = 908759025;
        f322598q = -892481550;
        f322599r = 1728931352;
        f322600s = -1519726489;
        f322601t = -1294486128;
        f322602u = 108705909;
        f322603v = m125687x3593deb(dm.x8.class);
        f322604w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125687x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, "TEXT");
        e0Var.f398487c[2] = "status";
        e0Var.f398488d.put("status", "INTEGER default '0' ");
        e0Var.f398487c[3] = "sceneFlag";
        e0Var.f398488d.put("sceneFlag", "INTEGER default '0' ");
        e0Var.f398487c[4] = "msgTypeFlag";
        e0Var.f398488d.put("msgTypeFlag", "INTEGER default '0' ");
        e0Var.f398487c[5] = "msgState";
        e0Var.f398488d.put("msgState", "INTEGER default '0' ");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  packageName TEXT,  status INTEGER default '0' ,  sceneFlag INTEGER default '0' ,  msgTypeFlag INTEGER default '0' ,  msgState INTEGER default '0' ";
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
            if (f322596o == hashCode) {
                try {
                    this.f69143x28d45f97 = cursor.getString(i17);
                    this.f322605d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenMsgListener", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322597p == hashCode) {
                try {
                    this.f69146xa1e9e82c = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenMsgListener", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322598q == hashCode) {
                try {
                    this.f69148x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenMsgListener", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322599r == hashCode) {
                try {
                    this.f69147x1ab9113 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenMsgListener", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322600s == hashCode) {
                try {
                    this.f69145x112a28a2 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenMsgListener", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322601t == hashCode) {
                try {
                    this.f69144xd09abf35 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenMsgListener", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322602u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322605d) {
            contentValues.put("appId", this.f69143x28d45f97);
        }
        if (this.f322606e) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, this.f69146xa1e9e82c);
        }
        if (this.f322607f) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f69148x10a0fed7));
        }
        if (this.f322608g) {
            contentValues.put("sceneFlag", java.lang.Integer.valueOf(this.f69147x1ab9113));
        }
        if (this.f322609h) {
            contentValues.put("msgTypeFlag", java.lang.Integer.valueOf(this.f69145x112a28a2));
        }
        if (this.f322610i) {
            contentValues.put("msgState", java.lang.Integer.valueOf(this.f69144xd09abf35));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenMsgListener", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenMsgListener ( ");
        l75.e0 e0Var = f322603v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322595n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenMsgListener", "createTableSql %s", str2);
            k0Var.A("OpenMsgListener", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OpenMsgListener", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenMsgListener", "updateTableSql %s", str3);
            k0Var.A("OpenMsgListener", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenMsgListener", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322603v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322604w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69143x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322594m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322594m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f69143x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f322605d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1)) {
            this.f69146xa1e9e82c = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
            if (z17) {
                this.f322606e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f69148x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f322607f = true;
            }
        }
        if (contentValues.containsKey("sceneFlag")) {
            this.f69147x1ab9113 = contentValues.getAsInteger("sceneFlag").intValue();
            if (z17) {
                this.f322608g = true;
            }
        }
        if (contentValues.containsKey("msgTypeFlag")) {
            this.f69145x112a28a2 = contentValues.getAsInteger("msgTypeFlag").intValue();
            if (z17) {
                this.f322609h = true;
            }
        }
        if (contentValues.containsKey("msgState")) {
            this.f69144xd09abf35 = contentValues.getAsInteger("msgState").intValue();
            if (z17) {
                this.f322610i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
