package dm;

/* loaded from: classes9.dex */
public class a1 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f317077q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f317078r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317079s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317080t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317081u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317082v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317083w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317084x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317085y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317086z;

    /* renamed from: field_UserVersion */
    public int f65833xd21ffea8;

    /* renamed from: field_addMemberUrl */
    public java.lang.String f65834x53f3fff9;

    /* renamed from: field_bitFlag */
    public int f65835x6e664fd4;

    /* renamed from: field_brandUserName */
    public java.lang.String f65836x75756b18;

    /* renamed from: field_headImageUrl */
    public java.lang.String f65837x35be6339;

    /* renamed from: field_needToUpdate */
    public boolean f65838x18bd0ff;

    /* renamed from: field_profileUrl */
    public java.lang.String f65839x776e2b6b;

    /* renamed from: field_userId */
    public java.lang.String f65840x13fe5d2b;

    /* renamed from: field_userName */
    public java.lang.String f65841xdde069b;

    /* renamed from: field_userNamePY */
    public java.lang.String f65842xe76d5e4;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317087d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317088e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317089f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317090g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317091h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317092i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317093m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317094n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317095o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f317096p = true;

    static {
        p75.n0 n0Var = new p75.n0("BizChatUserInfo");
        f317077q = n0Var;
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
        f317078r = new java.lang.String[0];
        f317079s = -836030906;
        f317080t = -266666762;
        f317081u = 1431282047;
        f317082v = -64277091;
        f317083w = 1717610093;
        f317084x = -178249254;
        f317085y = 697480212;
        f317086z = -1102645498;
        A = -103570919;
        B = 1204310228;
        C = 108705909;
        D = m124779x3593deb(dm.a1.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124779x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = "userId";
        e0Var.f398488d.put("userId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "userId";
        e0Var.f398487c[1] = "userName";
        e0Var.f398488d.put("userName", "TEXT default '' ");
        e0Var.f398487c[2] = "userNamePY";
        e0Var.f398488d.put("userNamePY", "TEXT default '' ");
        e0Var.f398487c[3] = "brandUserName";
        e0Var.f398488d.put("brandUserName", "TEXT default '' ");
        e0Var.f398487c[4] = "UserVersion";
        e0Var.f398488d.put("UserVersion", "INTEGER default '-1' ");
        e0Var.f398487c[5] = "needToUpdate";
        e0Var.f398488d.put("needToUpdate", "INTEGER default 'true' ");
        e0Var.f398487c[6] = "headImageUrl";
        e0Var.f398488d.put("headImageUrl", "TEXT");
        e0Var.f398487c[7] = "profileUrl";
        e0Var.f398488d.put("profileUrl", "TEXT");
        e0Var.f398487c[8] = "bitFlag";
        e0Var.f398488d.put("bitFlag", "INTEGER default '0' ");
        e0Var.f398487c[9] = "addMemberUrl";
        e0Var.f398488d.put("addMemberUrl", "TEXT");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " userId TEXT PRIMARY KEY ,  userName TEXT default '' ,  userNamePY TEXT default '' ,  brandUserName TEXT default '' ,  UserVersion INTEGER default '-1' ,  needToUpdate INTEGER default 'true' ,  headImageUrl TEXT,  profileUrl TEXT,  bitFlag INTEGER default '0' ,  addMemberUrl TEXT";
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
            if (f317079s == hashCode) {
                try {
                    this.f65840x13fe5d2b = cursor.getString(i17);
                    this.f317087d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317080t == hashCode) {
                try {
                    this.f65841xdde069b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317081u == hashCode) {
                try {
                    this.f65842xe76d5e4 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317082v == hashCode) {
                try {
                    this.f65836x75756b18 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317083w == hashCode) {
                try {
                    this.f65833xd21ffea8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317084x == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f65838x18bd0ff = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317085y == hashCode) {
                try {
                    this.f65837x35be6339 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317086z == hashCode) {
                try {
                    this.f65839x776e2b6b = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f65835x6e664fd4 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f65834x53f3fff9 = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizChatUserInfo", th15, "convertFrom %s", columnNames[i17]);
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
        if (this.f317087d) {
            contentValues.put("userId", this.f65840x13fe5d2b);
        }
        if (this.f65841xdde069b == null) {
            this.f65841xdde069b = "";
        }
        if (this.f317088e) {
            contentValues.put("userName", this.f65841xdde069b);
        }
        if (this.f65842xe76d5e4 == null) {
            this.f65842xe76d5e4 = "";
        }
        if (this.f317089f) {
            contentValues.put("userNamePY", this.f65842xe76d5e4);
        }
        if (this.f65836x75756b18 == null) {
            this.f65836x75756b18 = "";
        }
        if (this.f317090g) {
            contentValues.put("brandUserName", this.f65836x75756b18);
        }
        if (this.f317091h) {
            contentValues.put("UserVersion", java.lang.Integer.valueOf(this.f65833xd21ffea8));
        }
        if (this.f317092i) {
            if (this.f65838x18bd0ff) {
                contentValues.put("needToUpdate", (java.lang.Integer) 1);
            } else {
                contentValues.put("needToUpdate", (java.lang.Integer) 0);
            }
        }
        if (this.f317093m) {
            contentValues.put("headImageUrl", this.f65837x35be6339);
        }
        if (this.f317094n) {
            contentValues.put("profileUrl", this.f65839x776e2b6b);
        }
        if (this.f317095o) {
            contentValues.put("bitFlag", java.lang.Integer.valueOf(this.f65835x6e664fd4));
        }
        if (this.f317096p) {
            contentValues.put("addMemberUrl", this.f65834x53f3fff9);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizChatUserInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizChatUserInfo ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317078r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizChatUserInfo", "createTableSql %s", str2);
            k0Var.A("BizChatUserInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizChatUserInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizChatUserInfo", "updateTableSql %s", str3);
            k0Var.A("BizChatUserInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizChatUserInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f65840x13fe5d2b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317077q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317077q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userId")) {
            this.f65840x13fe5d2b = contentValues.getAsString("userId");
            if (z17) {
                this.f317087d = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.f65841xdde069b = contentValues.getAsString("userName");
            if (z17) {
                this.f317088e = true;
            }
        }
        if (contentValues.containsKey("userNamePY")) {
            this.f65842xe76d5e4 = contentValues.getAsString("userNamePY");
            if (z17) {
                this.f317089f = true;
            }
        }
        if (contentValues.containsKey("brandUserName")) {
            this.f65836x75756b18 = contentValues.getAsString("brandUserName");
            if (z17) {
                this.f317090g = true;
            }
        }
        if (contentValues.containsKey("UserVersion")) {
            this.f65833xd21ffea8 = contentValues.getAsInteger("UserVersion").intValue();
            if (z17) {
                this.f317091h = true;
            }
        }
        if (contentValues.containsKey("needToUpdate")) {
            this.f65838x18bd0ff = contentValues.getAsInteger("needToUpdate").intValue() != 0;
            if (z17) {
                this.f317092i = true;
            }
        }
        if (contentValues.containsKey("headImageUrl")) {
            this.f65837x35be6339 = contentValues.getAsString("headImageUrl");
            if (z17) {
                this.f317093m = true;
            }
        }
        if (contentValues.containsKey("profileUrl")) {
            this.f65839x776e2b6b = contentValues.getAsString("profileUrl");
            if (z17) {
                this.f317094n = true;
            }
        }
        if (contentValues.containsKey("bitFlag")) {
            this.f65835x6e664fd4 = contentValues.getAsInteger("bitFlag").intValue();
            if (z17) {
                this.f317095o = true;
            }
        }
        if (contentValues.containsKey("addMemberUrl")) {
            this.f65834x53f3fff9 = contentValues.getAsString("addMemberUrl");
            if (z17) {
                this.f317096p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
