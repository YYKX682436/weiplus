package dm;

/* loaded from: classes11.dex */
public class f3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f318339p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f318340q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f318341r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f318342s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f318343t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f318344u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318345v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318346w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318347x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318348y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318349z;

    /* renamed from: field_chatroomName */
    public java.lang.String f66486x3745f483;

    /* renamed from: field_createTime */
    public long f66487xac3be4e;

    /* renamed from: field_encryptTalker */
    public java.lang.String f66488x5285fa99;

    /* renamed from: field_isContactDeleted */
    public int f66489x8af1dc48;

    /* renamed from: field_isSend */
    public int f66490xff7bdab7;

    /* renamed from: field_msgContent */
    public java.lang.String f66491xbeb3161d;

    /* renamed from: field_svrId */
    public long f66492x29d4c865;

    /* renamed from: field_talker */
    public java.lang.String f66493x114ef53e;

    /* renamed from: field_type */
    public int f66494x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318350d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318351e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318352f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318353g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318354h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318355i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318356m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318357n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318358o = true;

    static {
        p75.n0 n0Var = new p75.n0("fmessage_msginfo");
        f318339p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318340q = new p75.d("talker", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318341r = new p75.d("type", "int", tableName, "");
        f318342s = new p75.d("createTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318343t = new p75.d("isContactDeleted", "int", tableName, "");
        f318344u = new java.lang.String[0];
        f318345v = 93053368;
        f318346w = -1180128302;
        f318347x = -881080743;
        f318348y = -650394338;
        f318349z = 109832170;
        A = 3575610;
        B = 1369213417;
        C = 723141982;
        D = -399751261;
        E = 108705909;
        F = m124971x3593deb(dm.f3.class);
        G = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124971x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "msgContent";
        e0Var.f398488d.put("msgContent", "TEXT default '' ");
        e0Var.f398487c[1] = "isSend";
        e0Var.f398488d.put("isSend", "INTEGER default '0' ");
        e0Var.f398487c[2] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[3] = "encryptTalker";
        e0Var.f398488d.put("encryptTalker", "TEXT default '' ");
        e0Var.f398487c[4] = "svrId";
        e0Var.f398488d.put("svrId", "LONG default '0' ");
        e0Var.f398487c[5] = "type";
        e0Var.f398488d.put("type", "INTEGER default '0' ");
        e0Var.f398487c[6] = "createTime";
        e0Var.f398488d.put("createTime", "LONG default '0' ");
        e0Var.f398487c[7] = "chatroomName";
        e0Var.f398488d.put("chatroomName", "TEXT default '' ");
        e0Var.f398487c[8] = "isContactDeleted";
        e0Var.f398488d.put("isContactDeleted", "INTEGER default '0' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " msgContent TEXT default '' ,  isSend INTEGER default '0' ,  talker TEXT default '' ,  encryptTalker TEXT default '' ,  svrId LONG default '0' ,  type INTEGER default '0' ,  createTime LONG default '0' ,  chatroomName TEXT default '' ,  isContactDeleted INTEGER default '0' ";
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
            if (f318345v == hashCode) {
                try {
                    this.f66491xbeb3161d = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318346w == hashCode) {
                try {
                    this.f66490xff7bdab7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318347x == hashCode) {
                try {
                    this.f66493x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318348y == hashCode) {
                try {
                    this.f66488x5285fa99 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318349z == hashCode) {
                try {
                    this.f66492x29d4c865 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66494x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66487xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66486x3745f483 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66489x8af1dc48 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFMessageMsgInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66491xbeb3161d == null) {
            this.f66491xbeb3161d = "";
        }
        if (this.f318350d) {
            contentValues.put("msgContent", this.f66491xbeb3161d);
        }
        if (this.f318351e) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.f66490xff7bdab7));
        }
        if (this.f66493x114ef53e == null) {
            this.f66493x114ef53e = "";
        }
        if (this.f318352f) {
            contentValues.put("talker", this.f66493x114ef53e);
        }
        if (this.f66488x5285fa99 == null) {
            this.f66488x5285fa99 = "";
        }
        if (this.f318353g) {
            contentValues.put("encryptTalker", this.f66488x5285fa99);
        }
        if (this.f318354h) {
            contentValues.put("svrId", java.lang.Long.valueOf(this.f66492x29d4c865));
        }
        if (this.f318355i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66494x2262335f));
        }
        if (this.f318356m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66487xac3be4e));
        }
        if (this.f66486x3745f483 == null) {
            this.f66486x3745f483 = "";
        }
        if (this.f318357n) {
            contentValues.put("chatroomName", this.f66486x3745f483);
        }
        if (this.f318358o) {
            contentValues.put("isContactDeleted", java.lang.Integer.valueOf(this.f66489x8af1dc48));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFMessageMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS fmessage_msginfo ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318344u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFMessageMsgInfo", "createTableSql %s", str2);
            k0Var.A("fmessage_msginfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "fmessage_msginfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFMessageMsgInfo", "updateTableSql %s", str3);
            k0Var.A("fmessage_msginfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFMessageMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return F;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return G;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318339p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318339p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgContent", this.f66491xbeb3161d);
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.f66490xff7bdab7));
            n51.f.b(jSONObject, "talker", this.f66493x114ef53e);
            n51.f.b(jSONObject, "encryptTalker", this.f66488x5285fa99);
            n51.f.b(jSONObject, "svrId", java.lang.Long.valueOf(this.f66492x29d4c865));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f66494x2262335f));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.f66487xac3be4e));
            n51.f.b(jSONObject, "chatroomName", this.f66486x3745f483);
            n51.f.b(jSONObject, "isContactDeleted", java.lang.Integer.valueOf(this.f66489x8af1dc48));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgContent")) {
            this.f66491xbeb3161d = contentValues.getAsString("msgContent");
            if (z17) {
                this.f318350d = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.f66490xff7bdab7 = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f318351e = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f66493x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f318352f = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.f66488x5285fa99 = contentValues.getAsString("encryptTalker");
            if (z17) {
                this.f318353g = true;
            }
        }
        if (contentValues.containsKey("svrId")) {
            this.f66492x29d4c865 = contentValues.getAsLong("svrId").longValue();
            if (z17) {
                this.f318354h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66494x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318355i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66487xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318356m = true;
            }
        }
        if (contentValues.containsKey("chatroomName")) {
            this.f66486x3745f483 = contentValues.getAsString("chatroomName");
            if (z17) {
                this.f318357n = true;
            }
        }
        if (contentValues.containsKey("isContactDeleted")) {
            this.f66489x8af1dc48 = contentValues.getAsInteger("isContactDeleted").intValue();
            if (z17) {
                this.f318358o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
