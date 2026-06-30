package dm;

/* loaded from: classes4.dex */
public class g5 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f318604g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f318605h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318606i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318607m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318608n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318609o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f318610p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f318611q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318612d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318613e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318614f = true;

    /* renamed from: field_encryptUsername */
    public java.lang.String f66597xdd77ad16;

    /* renamed from: field_modifyTime */
    public long f66598x15b870c;

    /* renamed from: field_username */
    public java.lang.String f66599xdec927b;

    static {
        p75.n0 n0Var = new p75.n0("FriendUser");
        f318604g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318605h = new java.lang.String[0];
        f318606i = -1914377637;
        f318607m = -265713450;
        f318608n = 1211388583;
        f318609o = 108705909;
        f318610p = m125000x3593deb(dm.g5.class);
        f318611q = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125000x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "encryptUsername";
        e0Var.f398488d.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "encryptUsername";
        e0Var.f398487c[1] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT default '' ");
        e0Var.f398487c[2] = "modifyTime";
        e0Var.f398488d.put("modifyTime", "LONG default '0' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " encryptUsername TEXT default ''  PRIMARY KEY ,  username TEXT default '' ,  modifyTime LONG default '0' ";
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
            if (f318606i == hashCode) {
                try {
                    this.f66597xdd77ad16 = cursor.getString(i17);
                    this.f318612d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFriendUser", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318607m == hashCode) {
                try {
                    this.f66599xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFriendUser", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318608n == hashCode) {
                try {
                    this.f66598x15b870c = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFriendUser", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318609o == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66597xdd77ad16 == null) {
            this.f66597xdd77ad16 = "";
        }
        if (this.f318612d) {
            contentValues.put("encryptUsername", this.f66597xdd77ad16);
        }
        if (this.f66599xdec927b == null) {
            this.f66599xdec927b = "";
        }
        if (this.f318613e) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66599xdec927b);
        }
        if (this.f318614f) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.f66598x15b870c));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFriendUser", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FriendUser ( ");
        l75.e0 e0Var = f318610p;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318605h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFriendUser", "createTableSql %s", str2);
            k0Var.A("FriendUser", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FriendUser", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFriendUser", "updateTableSql %s", str3);
            k0Var.A("FriendUser", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFriendUser", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318610p;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318611q;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66597xdd77ad16;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318604g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318604g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "encryptUsername", this.f66597xdd77ad16);
            n51.f.b(jSONObject, dm.i4.f66875xa013b0d5, this.f66599xdec927b);
            n51.f.b(jSONObject, "modifyTime", java.lang.Long.valueOf(this.f66598x15b870c));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("encryptUsername")) {
            this.f66597xdd77ad16 = contentValues.getAsString("encryptUsername");
            if (z17) {
                this.f318612d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66599xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f318613e = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.f66598x15b870c = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f318614f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
