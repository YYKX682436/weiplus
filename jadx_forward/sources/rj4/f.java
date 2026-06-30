package rj4;

/* loaded from: classes8.dex */
public class f extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f477843p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f477844q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f477845r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f477846s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f477847t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f477848u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f477849v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f477850w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f477851x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f477852y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f477853z;

    /* renamed from: field_CreateTime */
    public int f76616x81959a6e;

    /* renamed from: field_DeleteInMsgList */
    public int f76617x68e4d00a;

    /* renamed from: field_Description */
    public java.lang.String f76618x685e8417;

    /* renamed from: field_Read */
    public int f76619x225271db;

    /* renamed from: field_ShowType */
    public int f76620xd6b859c;

    /* renamed from: field_TextStatusId */
    public java.lang.String f76621x5493d43f;

    /* renamed from: field_TopicInfo */
    public byte[] f76622x2931c158;

    /* renamed from: field_UserName */
    public java.lang.String f76623x11b86abb;

    /* renamed from: field_thumbUrl */
    public java.lang.String f76624x7b284d5e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477854d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f477855e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f477856f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f477857g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f477858h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f477859i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f477860m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f477861n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f477862o = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusReference");
        f477843p = n0Var;
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
        f477844q = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusReference_TextStatusId_index ON TextStatusReference(TextStatusId)"};
        f477845r = 1214784794;
        f477846s = -202022634;
        f477847t = -932289015;
        f477848u = 1566917561;
        f477849v = 2543030;
        f477850w = -1902930339;
        f477851x = 424807759;
        f477852y = -274170889;
        f477853z = -56677412;
        A = 108705909;
        B = m162521x3593deb(rj4.f.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m162521x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "TextStatusId";
        e0Var.f398488d.put("TextStatusId", "TEXT");
        e0Var.f398487c[1] = "UserName";
        e0Var.f398488d.put("UserName", "TEXT");
        e0Var.f398487c[2] = "CreateTime";
        e0Var.f398488d.put("CreateTime", "INTEGER");
        e0Var.f398487c[3] = "thumbUrl";
        e0Var.f398488d.put("thumbUrl", "TEXT");
        e0Var.f398487c[4] = "Read";
        e0Var.f398488d.put("Read", "INTEGER");
        e0Var.f398487c[5] = "TopicInfo";
        e0Var.f398488d.put("TopicInfo", "BLOB");
        e0Var.f398487c[6] = "DeleteInMsgList";
        e0Var.f398488d.put("DeleteInMsgList", "INTEGER");
        e0Var.f398487c[7] = "ShowType";
        e0Var.f398488d.put("ShowType", "INTEGER");
        e0Var.f398487c[8] = "Description";
        e0Var.f398488d.put("Description", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " TextStatusId TEXT,  UserName TEXT,  CreateTime INTEGER,  thumbUrl TEXT,  Read INTEGER,  TopicInfo BLOB,  DeleteInMsgList INTEGER,  ShowType INTEGER,  Description TEXT";
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
            if (f477845r == hashCode) {
                try {
                    this.f76621x5493d43f = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477846s == hashCode) {
                try {
                    this.f76623x11b86abb = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477847t == hashCode) {
                try {
                    this.f76616x81959a6e = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477848u == hashCode) {
                try {
                    this.f76624x7b284d5e = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477849v == hashCode) {
                try {
                    this.f76619x225271db = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477850w == hashCode) {
                try {
                    this.f76622x2931c158 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477851x == hashCode) {
                try {
                    this.f76617x68e4d00a = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477852y == hashCode) {
                try {
                    this.f76620xd6b859c = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f477853z == hashCode) {
                try {
                    this.f76618x685e8417 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTextStatusReference", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f477854d) {
            contentValues.put("TextStatusId", this.f76621x5493d43f);
        }
        if (this.f477855e) {
            contentValues.put("UserName", this.f76623x11b86abb);
        }
        if (this.f477856f) {
            contentValues.put("CreateTime", java.lang.Integer.valueOf(this.f76616x81959a6e));
        }
        if (this.f477857g) {
            contentValues.put("thumbUrl", this.f76624x7b284d5e);
        }
        if (this.f477858h) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.f76619x225271db));
        }
        if (this.f477859i) {
            contentValues.put("TopicInfo", this.f76622x2931c158);
        }
        if (this.f477860m) {
            contentValues.put("DeleteInMsgList", java.lang.Integer.valueOf(this.f76617x68e4d00a));
        }
        if (this.f477861n) {
            contentValues.put("ShowType", java.lang.Integer.valueOf(this.f76620xd6b859c));
        }
        if (this.f477862o) {
            contentValues.put("Description", this.f76618x685e8417);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTextStatusReference", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusReference ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f477844q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusReference", "createTableSql %s", str2);
            k0Var.A("TextStatusReference", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TextStatusReference", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusReference", "updateTableSql %s", str3);
            k0Var.A("TextStatusReference", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTextStatusReference", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f477843p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f477843p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("TextStatusId")) {
            this.f76621x5493d43f = contentValues.getAsString("TextStatusId");
            if (z17) {
                this.f477854d = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.f76623x11b86abb = contentValues.getAsString("UserName");
            if (z17) {
                this.f477855e = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.f76616x81959a6e = contentValues.getAsInteger("CreateTime").intValue();
            if (z17) {
                this.f477856f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.f76624x7b284d5e = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f477857g = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.f76619x225271db = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f477858h = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.f76622x2931c158 = contentValues.getAsByteArray("TopicInfo");
            if (z17) {
                this.f477859i = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.f76617x68e4d00a = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z17) {
                this.f477860m = true;
            }
        }
        if (contentValues.containsKey("ShowType")) {
            this.f76620xd6b859c = contentValues.getAsInteger("ShowType").intValue();
            if (z17) {
                this.f477861n = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.f76618x685e8417 = contentValues.getAsString("Description");
            if (z17) {
                this.f477862o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
