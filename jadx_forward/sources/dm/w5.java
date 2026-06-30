package dm;

/* loaded from: classes7.dex */
public class w5 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f322340n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f322341o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322342p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322343q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322344r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322345s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322346t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322347u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322348v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322349w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f322350x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f322351y;

    /* renamed from: field_avatarURL */
    public java.lang.String f68996x81118851;

    /* renamed from: field_compositionKey */
    public java.lang.String f68997xb2033e3a;

    /* renamed from: field_nickName */
    public java.lang.String f68998x21eb2633;

    /* renamed from: field_role */
    public int f68999x2261249b;

    /* renamed from: field_roomName */
    public java.lang.String f69000x136b93ab;

    /* renamed from: field_updateTime */
    public long f69001xa783a79b;

    /* renamed from: field_userName */
    public java.lang.String f69002xdde069b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322352d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322353e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322354f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322355g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322356h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322357i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322358m = true;

    static {
        p75.n0 n0Var = new p75.n0("GameSimpleUserInfo");
        f322340n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322341o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_UserName ON GameSimpleUserInfo(userName)", "CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_RoomName ON GameSimpleUserInfo(roomName)", "CREATE INDEX IF NOT EXISTS GameSimpleUserInfo_NickName ON GameSimpleUserInfo(nickName)"};
        f322342p = 33997909;
        f322343q = -266666762;
        f322344r = -173503994;
        f322345s = 69737614;
        f322346t = -428647082;
        f322347u = 3506294;
        f322348v = -295931082;
        f322349w = 108705909;
        f322350x = m125657x3593deb(dm.w5.class);
        f322351y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125657x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "compositionKey";
        e0Var.f398488d.put("compositionKey", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "compositionKey";
        e0Var.f398487c[1] = "userName";
        e0Var.f398488d.put("userName", "TEXT default '' ");
        e0Var.f398487c[2] = "roomName";
        e0Var.f398488d.put("roomName", "TEXT default '' ");
        e0Var.f398487c[3] = "nickName";
        e0Var.f398488d.put("nickName", "TEXT default '' ");
        e0Var.f398487c[4] = "avatarURL";
        e0Var.f398488d.put("avatarURL", "TEXT default '' ");
        e0Var.f398487c[5] = "role";
        e0Var.f398488d.put("role", "INTEGER default '0' ");
        e0Var.f398487c[6] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " compositionKey TEXT default ''  PRIMARY KEY ,  userName TEXT default '' ,  roomName TEXT default '' ,  nickName TEXT default '' ,  avatarURL TEXT default '' ,  role INTEGER default '0' ,  updateTime LONG";
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
            if (f322342p == hashCode) {
                try {
                    this.f68997xb2033e3a = cursor.getString(i17);
                    this.f322352d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322343q == hashCode) {
                try {
                    this.f69002xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322344r == hashCode) {
                try {
                    this.f69000x136b93ab = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322345s == hashCode) {
                try {
                    this.f68998x21eb2633 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322346t == hashCode) {
                try {
                    this.f68996x81118851 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322347u == hashCode) {
                try {
                    this.f68999x2261249b = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322348v == hashCode) {
                try {
                    this.f69001xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameSimpleUserInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322349w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f68997xb2033e3a == null) {
            this.f68997xb2033e3a = "";
        }
        if (this.f322352d) {
            contentValues.put("compositionKey", this.f68997xb2033e3a);
        }
        if (this.f69002xdde069b == null) {
            this.f69002xdde069b = "";
        }
        if (this.f322353e) {
            contentValues.put("userName", this.f69002xdde069b);
        }
        if (this.f69000x136b93ab == null) {
            this.f69000x136b93ab = "";
        }
        if (this.f322354f) {
            contentValues.put("roomName", this.f69000x136b93ab);
        }
        if (this.f68998x21eb2633 == null) {
            this.f68998x21eb2633 = "";
        }
        if (this.f322355g) {
            contentValues.put("nickName", this.f68998x21eb2633);
        }
        if (this.f68996x81118851 == null) {
            this.f68996x81118851 = "";
        }
        if (this.f322356h) {
            contentValues.put("avatarURL", this.f68996x81118851);
        }
        if (this.f322357i) {
            contentValues.put("role", java.lang.Integer.valueOf(this.f68999x2261249b));
        }
        if (this.f322358m) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69001xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameSimpleUserInfo ( ");
        l75.e0 e0Var = f322350x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322341o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTableSql %s", str2);
            k0Var.A("GameSimpleUserInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameSimpleUserInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameSimpleUserInfo", "updateTableSql %s", str3);
            k0Var.A("GameSimpleUserInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameSimpleUserInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322350x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322351y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68997xb2033e3a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322340n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322340n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("compositionKey")) {
            this.f68997xb2033e3a = contentValues.getAsString("compositionKey");
            if (z17) {
                this.f322352d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.f69002xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f322353e = true;
            }
        }
        if (contentValues.containsKey("roomName")) {
            this.f69000x136b93ab = contentValues.getAsString("roomName");
            if (z17) {
                this.f322354f = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.f68998x21eb2633 = contentValues.getAsString("nickName");
            if (z17) {
                this.f322355g = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.f68996x81118851 = contentValues.getAsString("avatarURL");
            if (z17) {
                this.f322356h = true;
            }
        }
        if (contentValues.containsKey("role")) {
            this.f68999x2261249b = contentValues.getAsInteger("role").intValue();
            if (z17) {
                this.f322357i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69001xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322358m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
