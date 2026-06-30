package dm;

/* loaded from: classes4.dex */
public class vb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f322179i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f322180m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322181n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322182o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322183p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322184q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322185r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322186s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f322187t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f322188u;

    /* renamed from: field_avatar */
    public java.lang.String f68899xf205f03e;

    /* renamed from: field_avatarStyle */
    public int f68900x82c4b413;

    /* renamed from: field_nickname */
    public java.lang.String f68901x21f9b213;

    /* renamed from: field_userJumpInfoStr */
    public java.lang.String f68902x78c97085;

    /* renamed from: field_username */
    public java.lang.String f68903xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322189d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322190e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322191f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322192g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322193h = true;

    static {
        p75.n0 n0Var = new p75.n0("W1wContact");
        f322179i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322180m = new java.lang.String[0];
        f322181n = -265713450;
        f322182o = -1405959847;
        f322183p = 70690926;
        f322184q = 386227160;
        f322185r = 691449290;
        f322186s = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "avatar";
        ((java.util.HashMap) e0Var.f398488d).put("avatar", "TEXT default '' ");
        e0Var.f398487c[2] = "nickname";
        ((java.util.HashMap) e0Var.f398488d).put("nickname", "TEXT default '' ");
        e0Var.f398487c[3] = "avatarStyle";
        ((java.util.HashMap) e0Var.f398488d).put("avatarStyle", "INTEGER default '0' ");
        e0Var.f398487c[4] = "userJumpInfoStr";
        ((java.util.HashMap) e0Var.f398488d).put("userJumpInfoStr", "TEXT default '' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  avatar TEXT default '' ,  nickname TEXT default '' ,  avatarStyle INTEGER default '0' ,  userJumpInfoStr TEXT default '' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f322187t = e0Var;
        f322188u = new o75.e();
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
            if (f322181n == hashCode) {
                try {
                    this.f68903xdec927b = cursor.getString(i17);
                    this.f322189d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322182o == hashCode) {
                try {
                    this.f68899xf205f03e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322183p == hashCode) {
                try {
                    this.f68901x21f9b213 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322184q == hashCode) {
                try {
                    this.f68900x82c4b413 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322185r == hashCode) {
                try {
                    this.f68902x78c97085 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseW1wContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322186s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f68903xdec927b == null) {
            this.f68903xdec927b = "";
        }
        if (this.f322189d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f68903xdec927b);
        }
        if (this.f68899xf205f03e == null) {
            this.f68899xf205f03e = "";
        }
        if (this.f322190e) {
            contentValues.put("avatar", this.f68899xf205f03e);
        }
        if (this.f68901x21f9b213 == null) {
            this.f68901x21f9b213 = "";
        }
        if (this.f322191f) {
            contentValues.put("nickname", this.f68901x21f9b213);
        }
        if (this.f322192g) {
            contentValues.put("avatarStyle", java.lang.Integer.valueOf(this.f68900x82c4b413));
        }
        if (this.f68902x78c97085 == null) {
            this.f68902x78c97085 = "";
        }
        if (this.f322193h) {
            contentValues.put("userJumpInfoStr", this.f68902x78c97085);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseW1wContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS W1wContact ( ");
        l75.e0 e0Var = f322187t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322180m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wContact", "createTableSql %s", str2);
            k0Var.A("W1wContact", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "W1wContact", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wContact", "updateTableSql %s", str3);
            k0Var.A("W1wContact", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseW1wContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322187t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322188u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68903xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322179i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322179i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f68903xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f322189d = true;
            }
        }
        if (contentValues.containsKey("avatar")) {
            this.f68899xf205f03e = contentValues.getAsString("avatar");
            if (z17) {
                this.f322190e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.f68901x21f9b213 = contentValues.getAsString("nickname");
            if (z17) {
                this.f322191f = true;
            }
        }
        if (contentValues.containsKey("avatarStyle")) {
            this.f68900x82c4b413 = contentValues.getAsInteger("avatarStyle").intValue();
            if (z17) {
                this.f322192g = true;
            }
        }
        if (contentValues.containsKey("userJumpInfoStr")) {
            this.f68902x78c97085 = contentValues.getAsString("userJumpInfoStr");
            if (z17) {
                this.f322193h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
