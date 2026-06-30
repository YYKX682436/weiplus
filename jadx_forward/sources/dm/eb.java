package dm;

/* loaded from: classes4.dex */
public class eb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f318230i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f318231m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318232n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318233o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318234p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318235q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318236r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318237s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f318238t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f318239u;

    /* renamed from: field_extbuf */
    public byte[] f66445xf8fde397;

    /* renamed from: field_newStoryList */
    public java.lang.String f66446x84409498;

    /* renamed from: field_nextSyncTime */
    public long f66447x3a4e1740;

    /* renamed from: field_roomname */
    public java.lang.String f66448x137a1f8b;

    /* renamed from: field_userStoryFlag */
    public int f66449x544767f1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318240d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318241e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318242f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318243g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318244h = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryRoomInfo");
        f318230i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318231m = new java.lang.String[0];
        f318232n = -172550682;
        f318233o = -620940682;
        f318234p = 2014635379;
        f318235q = -1289046862;
        f318236r = 774006811;
        f318237s = 108705909;
        f318238t = m124957x3593deb(dm.eb.class);
        f318239u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124957x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "roomname";
        e0Var.f398488d.put("roomname", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "roomname";
        e0Var.f398487c[1] = "userStoryFlag";
        e0Var.f398488d.put("userStoryFlag", "INTEGER");
        e0Var.f398487c[2] = "newStoryList";
        e0Var.f398488d.put("newStoryList", "TEXT");
        e0Var.f398487c[3] = "extbuf";
        e0Var.f398488d.put("extbuf", "BLOB");
        e0Var.f398487c[4] = "nextSyncTime";
        e0Var.f398488d.put("nextSyncTime", "LONG");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " roomname TEXT default ''  PRIMARY KEY ,  userStoryFlag INTEGER,  newStoryList TEXT,  extbuf BLOB,  nextSyncTime LONG";
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
            if (f318232n == hashCode) {
                try {
                    this.f66448x137a1f8b = cursor.getString(i17);
                    this.f318240d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryRoomInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318233o == hashCode) {
                try {
                    this.f66449x544767f1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryRoomInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318234p == hashCode) {
                try {
                    this.f66446x84409498 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryRoomInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318235q == hashCode) {
                try {
                    this.f66445xf8fde397 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryRoomInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318236r == hashCode) {
                try {
                    this.f66447x3a4e1740 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryRoomInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318237s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66448x137a1f8b == null) {
            this.f66448x137a1f8b = "";
        }
        if (this.f318240d) {
            contentValues.put("roomname", this.f66448x137a1f8b);
        }
        if (this.f318241e) {
            contentValues.put("userStoryFlag", java.lang.Integer.valueOf(this.f66449x544767f1));
        }
        if (this.f318242f) {
            contentValues.put("newStoryList", this.f66446x84409498);
        }
        if (this.f318243g) {
            contentValues.put("extbuf", this.f66445xf8fde397);
        }
        if (this.f318244h) {
            contentValues.put("nextSyncTime", java.lang.Long.valueOf(this.f66447x3a4e1740));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseStoryRoomInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryRoomInfo ( ");
        l75.e0 e0Var = f318238t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318231m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryRoomInfo", "createTableSql %s", str2);
            k0Var.A("StoryRoomInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "StoryRoomInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryRoomInfo", "updateTableSql %s", str3);
            k0Var.A("StoryRoomInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryRoomInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318238t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318239u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66448x137a1f8b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318230i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318230i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("roomname")) {
            this.f66448x137a1f8b = contentValues.getAsString("roomname");
            if (z17) {
                this.f318240d = true;
            }
        }
        if (contentValues.containsKey("userStoryFlag")) {
            this.f66449x544767f1 = contentValues.getAsInteger("userStoryFlag").intValue();
            if (z17) {
                this.f318241e = true;
            }
        }
        if (contentValues.containsKey("newStoryList")) {
            this.f66446x84409498 = contentValues.getAsString("newStoryList");
            if (z17) {
                this.f318242f = true;
            }
        }
        if (contentValues.containsKey("extbuf")) {
            this.f66445xf8fde397 = contentValues.getAsByteArray("extbuf");
            if (z17) {
                this.f318243g = true;
            }
        }
        if (contentValues.containsKey("nextSyncTime")) {
            this.f66447x3a4e1740 = contentValues.getAsLong("nextSyncTime").longValue();
            if (z17) {
                this.f318244h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
