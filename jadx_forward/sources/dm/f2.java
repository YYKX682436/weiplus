package dm;

/* loaded from: classes4.dex */
public class f2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f318328g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f318329h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318330i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318331m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318332n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318333o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f318334p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f318335q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318336d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318337e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318338f = true;

    /* renamed from: field_cmdbuf */
    public byte[] f66483xf4f1e9de;

    /* renamed from: field_fieldUpdateCtrlInfoList */
    public r45.hs0 f66484x94ac5fb5;

    /* renamed from: field_username */
    public java.lang.String f66485xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("ContactCmdBuf");
        f318328g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318329h = new java.lang.String[0];
        f318330i = -265713450;
        f318331m = -1356940551;
        f318332n = -855734278;
        f318333o = 108705909;
        f318334p = m124969x3593deb(dm.f2.class);
        f318335q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124969x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66875xa013b0d5;
        e0Var.f398487c[1] = "cmdbuf";
        e0Var.f398488d.put("cmdbuf", "BLOB default '' ");
        e0Var.f398487c[2] = "fieldUpdateCtrlInfoList";
        e0Var.f398488d.put("fieldUpdateCtrlInfoList", "BLOB");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " username TEXT default ''  PRIMARY KEY ,  cmdbuf BLOB default '' ,  fieldUpdateCtrlInfoList BLOB";
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
            if (f318330i == hashCode) {
                try {
                    this.f66485xdec927b = cursor.getString(i17);
                    this.f318336d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactCmdBuf", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318331m == hashCode) {
                try {
                    this.f66483xf4f1e9de = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactCmdBuf", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318332n == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f66484x94ac5fb5 = (r45.hs0) new r45.hs0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseContactCmdBuf", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318333o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66485xdec927b == null) {
            this.f66485xdec927b = "";
        }
        if (this.f318336d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66485xdec927b);
        }
        if (this.f318337e) {
            contentValues.put("cmdbuf", this.f66483xf4f1e9de);
        }
        if (this.f318338f) {
            r45.hs0 hs0Var = this.f66484x94ac5fb5;
            if (hs0Var != null) {
                try {
                    contentValues.put("fieldUpdateCtrlInfoList", hs0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseContactCmdBuf", e17.getMessage());
                }
            } else {
                contentValues.put("fieldUpdateCtrlInfoList", (byte[]) null);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseContactCmdBuf", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ContactCmdBuf ( ");
        l75.e0 e0Var = f318334p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318329h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactCmdBuf", "createTableSql %s", str2);
            k0Var.A("ContactCmdBuf", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ContactCmdBuf", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactCmdBuf", "updateTableSql %s", str3);
            k0Var.A("ContactCmdBuf", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseContactCmdBuf", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318334p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318335q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66485xdec927b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318328g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318328g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.f66875xa013b0d5, this.f66485xdec927b);
            n51.f.b(jSONObject, "cmdbuf", this.f66483xf4f1e9de);
            n51.f.b(jSONObject, "fieldUpdateCtrlInfoList", this.f66484x94ac5fb5);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66485xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f318336d = true;
            }
        }
        if (contentValues.containsKey("cmdbuf")) {
            this.f66483xf4f1e9de = contentValues.getAsByteArray("cmdbuf");
            if (z17) {
                this.f318337e = true;
            }
        }
        if (contentValues.containsKey("fieldUpdateCtrlInfoList")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("fieldUpdateCtrlInfoList");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f66484x94ac5fb5 = (r45.hs0) new r45.hs0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f318338f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseContactCmdBuf", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
