package dm;

/* loaded from: classes4.dex */
public class w8 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f322380n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f322381o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322382p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322383q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322384r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322385s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322386t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322387u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322388v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322389w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f322390x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f322391y;

    /* renamed from: field_appid */
    public java.lang.String f69018x28d46377;

    /* renamed from: field_language */
    public java.lang.String f69019xbd959cfd;

    /* renamed from: field_pinyin */
    public java.lang.String f69020xaed6c8e;

    /* renamed from: field_quanpin */
    public java.lang.String f69021x9b64705f;

    /* renamed from: field_updateTime */
    public long f69022xa783a79b;

    /* renamed from: field_wording */
    public java.lang.String f69023xcf77aa53;

    /* renamed from: field_wordingId */
    public java.lang.String f69024xd0366ace;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322392d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322393e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322394f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322395g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322396h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322397i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322398m = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMWordingInfo");
        f322380n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322381o = new java.lang.String[0];
        f322382p = 93029116;
        f322383q = 899170259;
        f322384r = -1613589672;
        f322385s = 1524956312;
        f322386t = -988136023;
        f322387u = 651281060;
        f322388v = -295931082;
        f322389w = 108705909;
        f322390x = m125661x3593deb(dm.w8.class);
        f322391y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125661x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "appid";
        e0Var.f398488d.put("appid", "TEXT");
        e0Var.f398487c[1] = "wordingId";
        e0Var.f398488d.put("wordingId", "TEXT");
        e0Var.f398487c[2] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "TEXT");
        e0Var.f398487c[3] = "wording";
        e0Var.f398488d.put("wording", "TEXT");
        e0Var.f398487c[4] = "pinyin";
        e0Var.f398488d.put("pinyin", "TEXT");
        e0Var.f398487c[5] = "quanpin";
        e0Var.f398488d.put("quanpin", "TEXT");
        e0Var.f398487c[6] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " appid TEXT,  wordingId TEXT,  language TEXT,  wording TEXT,  pinyin TEXT,  quanpin TEXT,  updateTime LONG default '0' ";
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
            if (f322382p == hashCode) {
                try {
                    this.f69018x28d46377 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322383q == hashCode) {
                try {
                    this.f69024xd0366ace = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322384r == hashCode) {
                try {
                    this.f69019xbd959cfd = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322385s == hashCode) {
                try {
                    this.f69023xcf77aa53 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322386t == hashCode) {
                try {
                    this.f69020xaed6c8e = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322387u == hashCode) {
                try {
                    this.f69021x9b64705f = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322388v == hashCode) {
                try {
                    this.f69022xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMWordingInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322389w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322392d) {
            contentValues.put("appid", this.f69018x28d46377);
        }
        if (this.f322393e) {
            contentValues.put("wordingId", this.f69024xd0366ace);
        }
        if (this.f322394f) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f69019xbd959cfd);
        }
        if (this.f322395g) {
            contentValues.put("wording", this.f69023xcf77aa53);
        }
        if (this.f322396h) {
            contentValues.put("pinyin", this.f69020xaed6c8e);
        }
        if (this.f322397i) {
            contentValues.put("quanpin", this.f69021x9b64705f);
        }
        if (this.f322398m) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69022xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMWordingInfo ( ");
        l75.e0 e0Var = f322390x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322381o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTableSql %s", str2);
            k0Var.A("OpenIMWordingInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OpenIMWordingInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMWordingInfo", "updateTableSql %s", str3);
            k0Var.A("OpenIMWordingInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMWordingInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322390x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322391y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322380n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322380n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "appid", this.f69018x28d46377);
            n51.f.b(jSONObject, "wordingId", this.f69024xd0366ace);
            n51.f.b(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f69019xbd959cfd);
            n51.f.b(jSONObject, "wording", this.f69023xcf77aa53);
            n51.f.b(jSONObject, "pinyin", this.f69020xaed6c8e);
            n51.f.b(jSONObject, "quanpin", this.f69021x9b64705f);
            n51.f.b(jSONObject, dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69022xa783a79b));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appid")) {
            this.f69018x28d46377 = contentValues.getAsString("appid");
            if (z17) {
                this.f322392d = true;
            }
        }
        if (contentValues.containsKey("wordingId")) {
            this.f69024xd0366ace = contentValues.getAsString("wordingId");
            if (z17) {
                this.f322393e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68)) {
            this.f69019xbd959cfd = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
            if (z17) {
                this.f322394f = true;
            }
        }
        if (contentValues.containsKey("wording")) {
            this.f69023xcf77aa53 = contentValues.getAsString("wording");
            if (z17) {
                this.f322395g = true;
            }
        }
        if (contentValues.containsKey("pinyin")) {
            this.f69020xaed6c8e = contentValues.getAsString("pinyin");
            if (z17) {
                this.f322396h = true;
            }
        }
        if (contentValues.containsKey("quanpin")) {
            this.f69021x9b64705f = contentValues.getAsString("quanpin");
            if (z17) {
                this.f322397i = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69022xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322398m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
