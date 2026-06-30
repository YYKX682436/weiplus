package dm;

/* loaded from: classes4.dex */
public class cd extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f317777h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317778i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317779m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317780n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317781o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317782p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317783q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f317784r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f317785s;

    /* renamed from: field_appid */
    public java.lang.String f66185x28d46377;

    /* renamed from: field_token */
    public java.lang.String f66186x29df9a74;

    /* renamed from: field_uin */
    public int f66187x4b6e8795;

    /* renamed from: field_username */
    public java.lang.String f66188xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317786d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317787e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317788f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317789g = true;

    static {
        p75.n0 n0Var = new p75.n0("WxaTokenInfo");
        f317777h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317778i = new java.lang.String[0];
        f317779m = 110541305;
        f317780n = -265713450;
        f317781o = 115802;
        f317782p = 93029116;
        f317783q = 108705909;
        f317784r = m124861x3593deb(dm.cd.class);
        f317785s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124861x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "token";
        e0Var.f398488d.put("token", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "token";
        e0Var.f398487c[1] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[2] = "uin";
        e0Var.f398488d.put("uin", "INTEGER");
        e0Var.f398487c[3] = "appid";
        e0Var.f398488d.put("appid", "TEXT");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " token TEXT PRIMARY KEY ,  username TEXT,  uin INTEGER,  appid TEXT";
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
            if (f317779m == hashCode) {
                try {
                    this.f66186x29df9a74 = cursor.getString(i17);
                    this.f317786d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaTokenInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317780n == hashCode) {
                try {
                    this.f66188xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaTokenInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317781o == hashCode) {
                try {
                    this.f66187x4b6e8795 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaTokenInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317782p == hashCode) {
                try {
                    this.f66185x28d46377 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxaTokenInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317783q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317786d) {
            contentValues.put("token", this.f66186x29df9a74);
        }
        if (this.f317787e) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66188xdec927b);
        }
        if (this.f317788f) {
            contentValues.put("uin", java.lang.Integer.valueOf(this.f66187x4b6e8795));
        }
        if (this.f317789g) {
            contentValues.put("appid", this.f66185x28d46377);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxaTokenInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaTokenInfo ( ");
        l75.e0 e0Var = f317784r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317778i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaTokenInfo", "createTableSql %s", str2);
            k0Var.A("WxaTokenInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxaTokenInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaTokenInfo", "updateTableSql %s", str3);
            k0Var.A("WxaTokenInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxaTokenInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317784r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317785s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66186x29df9a74;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317777h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317777h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("token")) {
            this.f66186x29df9a74 = contentValues.getAsString("token");
            if (z17) {
                this.f317786d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66188xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f317787e = true;
            }
        }
        if (contentValues.containsKey("uin")) {
            this.f66187x4b6e8795 = contentValues.getAsInteger("uin").intValue();
            if (z17) {
                this.f317788f = true;
            }
        }
        if (contentValues.containsKey("appid")) {
            this.f66185x28d46377 = contentValues.getAsString("appid");
            if (z17) {
                this.f317789g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
