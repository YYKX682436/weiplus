package dm;

/* loaded from: classes4.dex */
public class q8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320966h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320967i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320968m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320969n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320970o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320971p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320972q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f320973r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f320974s;

    /* renamed from: field_accTypeRec */
    public r45.j1 f68054xfbe59f9a;

    /* renamed from: field_acctTypeId */
    public java.lang.String f68055x5a0dd04d;

    /* renamed from: field_language */
    public java.lang.String f68056xbd959cfd;

    /* renamed from: field_updateTime */
    public long f68057xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320975d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320976e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320977f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320978g = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenIMAccTypeInfo");
        f320966h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320967i = new java.lang.String[0];
        f320968m = -1595499544;
        f320969n = -1613589672;
        f320970o = 1119775541;
        f320971p = -295931082;
        f320972q = 108705909;
        f320973r = m125425x3593deb(dm.q8.class);
        f320974s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125425x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "acctTypeId";
        e0Var.f398488d.put("acctTypeId", "TEXT");
        e0Var.f398487c[1] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, "TEXT");
        e0Var.f398487c[2] = "accTypeRec";
        e0Var.f398488d.put("accTypeRec", "BLOB");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " acctTypeId TEXT,  language TEXT,  accTypeRec BLOB,  updateTime LONG default '0' ";
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
            if (f320968m == hashCode) {
                try {
                    this.f68055x5a0dd04d = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320969n == hashCode) {
                try {
                    this.f68056xbd959cfd = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320970o == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68054xfbe59f9a = (r45.j1) new r45.j1().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320971p == hashCode) {
                try {
                    this.f68057xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenIMAccTypeInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320972q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320975d) {
            contentValues.put("acctTypeId", this.f68055x5a0dd04d);
        }
        if (this.f320976e) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f68056xbd959cfd);
        }
        if (this.f320977f) {
            r45.j1 j1Var = this.f68054xfbe59f9a;
            if (j1Var != null) {
                try {
                    contentValues.put("accTypeRec", j1Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", e17.getMessage());
                }
            } else {
                contentValues.put("accTypeRec", (byte[]) null);
            }
        }
        if (this.f320978g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68057xa783a79b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenIMAccTypeInfo ( ");
        l75.e0 e0Var = f320973r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320967i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTableSql %s", str2);
            k0Var.A("OpenIMAccTypeInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OpenIMAccTypeInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "updateTableSql %s", str3);
            k0Var.A("OpenIMAccTypeInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenIMAccTypeInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320973r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320974s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320966h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320966h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "acctTypeId", this.f68055x5a0dd04d);
            n51.f.b(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f68056xbd959cfd);
            n51.f.b(jSONObject, "accTypeRec", this.f68054xfbe59f9a);
            n51.f.b(jSONObject, dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f68057xa783a79b));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("acctTypeId")) {
            this.f68055x5a0dd04d = contentValues.getAsString("acctTypeId");
            if (z17) {
                this.f320975d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68)) {
            this.f68056xbd959cfd = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68);
            if (z17) {
                this.f320976e = true;
            }
        }
        if (contentValues.containsKey("accTypeRec")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("accTypeRec");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68054xfbe59f9a = (r45.j1) new r45.j1().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f320977f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenIMAccTypeInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f68057xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f320978g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
