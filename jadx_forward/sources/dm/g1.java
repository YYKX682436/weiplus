package dm;

/* loaded from: classes4.dex */
public class g1 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f318548g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f318549h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f318550i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318551m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318552n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318553o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318554p;

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f318555q;

    /* renamed from: r, reason: collision with root package name */
    public static final o75.e f318556r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318557d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318558e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318559f = true;

    /* renamed from: field_bizUsername */
    public java.lang.String f66580x3a0bff44;

    /* renamed from: field_digest */
    public java.lang.String f66581xf66fcca9;

    /* renamed from: field_updateTime */
    public long f66582xa783a79b;

    static {
        p75.n0 n0Var = new p75.n0("BizFollowedContactDigest");
        f318548g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318549h = new p75.d("bizUsername", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318550i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS BizFansConversation_updateTime_index ON BizFollowedContactDigest(updateTime)"};
        f318551m = -833837303;
        f318552n = -295931082;
        f318553o = -1331913276;
        f318554p = 108705909;
        f318555q = m124995x3593deb(dm.g1.class);
        f318556r = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124995x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "bizUsername";
        e0Var.f398488d.put("bizUsername", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "bizUsername";
        e0Var.f398487c[1] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[2] = "digest";
        e0Var.f398488d.put("digest", "TEXT default '' ");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " bizUsername TEXT default ''  PRIMARY KEY ,  updateTime LONG default '0' ,  digest TEXT default '' ";
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
            if (f318551m == hashCode) {
                try {
                    this.f66580x3a0bff44 = cursor.getString(i17);
                    this.f318557d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFollowedContactDigest", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318552n == hashCode) {
                try {
                    this.f66582xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFollowedContactDigest", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318553o == hashCode) {
                try {
                    this.f66581xf66fcca9 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseBizFollowedContactDigest", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318554p == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66580x3a0bff44 == null) {
            this.f66580x3a0bff44 = "";
        }
        if (this.f318557d) {
            contentValues.put("bizUsername", this.f66580x3a0bff44);
        }
        if (this.f318558e) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66582xa783a79b));
        }
        if (this.f66581xf66fcca9 == null) {
            this.f66581xf66fcca9 = "";
        }
        if (this.f318559f) {
            contentValues.put("digest", this.f66581xf66fcca9);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseBizFollowedContactDigest", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS BizFollowedContactDigest ( ");
        l75.e0 e0Var = f318555q;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318550i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizFollowedContactDigest", "createTableSql %s", str2);
            k0Var.A("BizFollowedContactDigest", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "BizFollowedContactDigest", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizFollowedContactDigest", "updateTableSql %s", str3);
            k0Var.A("BizFollowedContactDigest", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseBizFollowedContactDigest", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318555q;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318556r;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66580x3a0bff44;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318548g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318548g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bizUsername")) {
            this.f66580x3a0bff44 = contentValues.getAsString("bizUsername");
            if (z17) {
                this.f318557d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66582xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f318558e = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.f66581xf66fcca9 = contentValues.getAsString("digest");
            if (z17) {
                this.f318559f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
