package dm;

/* loaded from: classes8.dex */
public class i1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f319037m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f319038n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319039o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319040p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319041q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319042r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319043s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319044t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319045u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f319046v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f319047w;

    /* renamed from: field_brandUsername */
    public java.lang.String f66820x7583f6f8;

    /* renamed from: field_headImgUrl */
    public java.lang.String f66821xff000111;

    /* renamed from: field_kfType */
    public int f66822x22f1a1a;

    /* renamed from: field_nickname */
    public java.lang.String f66823x21f9b213;

    /* renamed from: field_openId */
    public java.lang.String f66824x996f3ea;

    /* renamed from: field_updateTime */
    public long f66825xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319048d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319049e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319050f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319051g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319052h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319053i = true;

    static {
        p75.n0 n0Var = new p75.n0("BizKF");
        f319037m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319038n = new java.lang.String[0];
        f319039o = -1010580219;
        f319040p = -63323779;
        f319041q = 1171836076;
        f319042r = 70690926;
        f319043s = -1134826699;
        f319044t = -295931082;
        f319045u = 108705909;
        f319046v = m125048x3593deb(dm.i1.class);
        f319047w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125048x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "openId";
        e0Var.f398488d.put("openId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "openId";
        e0Var.f398487c[1] = "brandUsername";
        e0Var.f398488d.put("brandUsername", "TEXT default '' ");
        e0Var.f398487c[2] = "headImgUrl";
        e0Var.f398488d.put("headImgUrl", "TEXT");
        e0Var.f398487c[3] = "nickname";
        e0Var.f398488d.put("nickname", "TEXT");
        e0Var.f398487c[4] = "kfType";
        e0Var.f398488d.put("kfType", "INTEGER");
        e0Var.f398487c[5] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " openId TEXT PRIMARY KEY ,  brandUsername TEXT default '' ,  headImgUrl TEXT,  nickname TEXT,  kfType INTEGER,  updateTime LONG";
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
            if (f319039o == hashCode) {
                try {
                    this.f66824x996f3ea = cursor.getString(i17);
                    this.f319048d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizKF", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319040p == hashCode) {
                try {
                    this.f66820x7583f6f8 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizKF", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319041q == hashCode) {
                try {
                    this.f66821xff000111 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizKF", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319042r == hashCode) {
                try {
                    this.f66823x21f9b213 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizKF", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319043s == hashCode) {
                try {
                    this.f66822x22f1a1a = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizKF", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319044t == hashCode) {
                try {
                    this.f66825xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizKF", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319045u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319048d) {
            contentValues.put("openId", this.f66824x996f3ea);
        }
        if (this.f66820x7583f6f8 == null) {
            this.f66820x7583f6f8 = "";
        }
        if (this.f319049e) {
            contentValues.put("brandUsername", this.f66820x7583f6f8);
        }
        if (this.f319050f) {
            contentValues.put("headImgUrl", this.f66821xff000111);
        }
        if (this.f319051g) {
            contentValues.put("nickname", this.f66823x21f9b213);
        }
        if (this.f319052h) {
            contentValues.put("kfType", java.lang.Integer.valueOf(this.f66822x22f1a1a));
        }
        if (this.f319053i) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66825xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizKF", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizKF ( ");
        l75.e0 e0Var = f319046v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319038n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizKF", "createTableSql %s", str2);
            k0Var.A("BizKF", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizKF", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizKF", "updateTableSql %s", str3);
            k0Var.A("BizKF", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizKF", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319046v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319047w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66824x996f3ea;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319037m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319037m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("openId")) {
            this.f66824x996f3ea = contentValues.getAsString("openId");
            if (z17) {
                this.f319048d = true;
            }
        }
        if (contentValues.containsKey("brandUsername")) {
            this.f66820x7583f6f8 = contentValues.getAsString("brandUsername");
            if (z17) {
                this.f319049e = true;
            }
        }
        if (contentValues.containsKey("headImgUrl")) {
            this.f66821xff000111 = contentValues.getAsString("headImgUrl");
            if (z17) {
                this.f319050f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.f66823x21f9b213 = contentValues.getAsString("nickname");
            if (z17) {
                this.f319051g = true;
            }
        }
        if (contentValues.containsKey("kfType")) {
            this.f66822x22f1a1a = contentValues.getAsInteger("kfType").intValue();
            if (z17) {
                this.f319052h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66825xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f319053i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
