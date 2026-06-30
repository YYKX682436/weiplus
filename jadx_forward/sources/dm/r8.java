package dm;

/* loaded from: classes4.dex */
public class r8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f321206m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f321207n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321208o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321209p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321210q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321211r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321212s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321213t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321214u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f321215v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f321216w;

    /* renamed from: field_acctTypeId */
    public java.lang.String f68186x5a0dd04d;

    /* renamed from: field_appRec */
    public r45.x8 f68187xf1b7b594;

    /* renamed from: field_appid */
    public java.lang.String f68188x28d46377;

    /* renamed from: field_language */
    public java.lang.String f68189xbd959cfd;

    /* renamed from: field_subType */
    public int f68190x5334f55;

    /* renamed from: field_updateTime */
    public long f68191xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321217d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321218e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321219f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321220g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321221h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321222i = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMAppIdInfo");
        f321206m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321207n = new java.lang.String[0];
        f321208o = 93029116;
        f321209p = -1613589672;
        f321210q = -1411086673;
        f321211r = -295931082;
        f321212s = -1595499544;
        f321213t = -1868521062;
        f321214u = 108705909;
        f321215v = m125452x3593deb(dm.r8.class);
        f321216w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125452x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "appid";
        e0Var.f398488d.put("appid", "TEXT");
        e0Var.f398487c[1] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "TEXT");
        e0Var.f398487c[2] = "appRec";
        e0Var.f398488d.put("appRec", "BLOB");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[4] = "acctTypeId";
        e0Var.f398488d.put("acctTypeId", "TEXT");
        e0Var.f398487c[5] = "subType";
        e0Var.f398488d.put("subType", "INTEGER default '0' ");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " appid TEXT,  language TEXT,  appRec BLOB,  updateTime LONG default '0' ,  acctTypeId TEXT,  subType INTEGER default '0' ";
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
            if (f321208o == hashCode) {
                try {
                    this.f68188x28d46377 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAppIdInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321209p == hashCode) {
                try {
                    this.f68189xbd959cfd = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAppIdInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321210q == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68187xf1b7b594 = (r45.x8) new r45.x8().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAppIdInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321211r == hashCode) {
                try {
                    this.f68191xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAppIdInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321212s == hashCode) {
                try {
                    this.f68186x5a0dd04d = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAppIdInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321213t == hashCode) {
                try {
                    this.f68190x5334f55 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAppIdInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321214u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321217d) {
            contentValues.put("appid", this.f68188x28d46377);
        }
        if (this.f321218e) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f68189xbd959cfd);
        }
        if (this.f321219f) {
            r45.x8 x8Var = this.f68187xf1b7b594;
            if (x8Var != null) {
                try {
                    contentValues.put("appRec", x8Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", e17.getMessage());
                }
            } else {
                contentValues.put("appRec", (byte[]) null);
            }
        }
        if (this.f321220g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68191xa783a79b));
        }
        if (this.f321221h) {
            contentValues.put("acctTypeId", this.f68186x5a0dd04d);
        }
        if (this.f321222i) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.f68190x5334f55));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMAppIdInfo ( ");
        l75.e0 e0Var = f321215v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321207n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTableSql %s", str2);
            k0Var.A("OpenIMAppIdInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OpenIMAppIdInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "updateTableSql %s", str3);
            k0Var.A("OpenIMAppIdInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMAppIdInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321215v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321216w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321206m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321206m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "appid", this.f68188x28d46377);
            n51.f.b(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f68189xbd959cfd);
            n51.f.b(jSONObject, "appRec", this.f68187xf1b7b594);
            n51.f.b(jSONObject, dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68191xa783a79b));
            n51.f.b(jSONObject, "acctTypeId", this.f68186x5a0dd04d);
            n51.f.b(jSONObject, "subType", java.lang.Integer.valueOf(this.f68190x5334f55));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appid")) {
            this.f68188x28d46377 = contentValues.getAsString("appid");
            if (z17) {
                this.f321217d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68)) {
            this.f68189xbd959cfd = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
            if (z17) {
                this.f321218e = true;
            }
        }
        if (contentValues.containsKey("appRec")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("appRec");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68187xf1b7b594 = (r45.x8) new r45.x8().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f321219f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMAppIdInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f68191xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f321220g = true;
            }
        }
        if (contentValues.containsKey("acctTypeId")) {
            this.f68186x5a0dd04d = contentValues.getAsString("acctTypeId");
            if (z17) {
                this.f321221h = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.f68190x5334f55 = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f321222i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
