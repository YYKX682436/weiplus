package dm;

/* loaded from: classes12.dex */
public class n2 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320154n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f320155o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f320156p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f320157q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f320158r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f320159s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320160t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320161u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320162v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320163w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320164x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320165y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320166z;

    /* renamed from: field_bizType */
    private long f67630x6ec16ca8;

    /* renamed from: field_extData */
    private byte[] f67631x26b0a326;

    /* renamed from: field_id */
    private java.lang.String f67632xc8a07680;

    /* renamed from: field_md5 */
    private java.lang.String f67633x4b6e68b9;

    /* renamed from: field_path */
    private java.lang.String f67634x2260084a;

    /* renamed from: field_size */
    private long f67635x22618426;

    /* renamed from: field_updateTime */
    private long f67636xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320167d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320168e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320169f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320170g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320171h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320172i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320173m = false;

    static {
        p75.n0 n0Var = new p75.n0("DupCheckInfo");
        f320154n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320155o = new p75.d(dm.i4.f66865x76d1ec5a, "string", tableName, "");
        f320156p = new p75.d("md5", "string", tableName, "");
        f320157q = new p75.d("size", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320158r = new p75.d(dm.i4.f66874x4c6b1f55, "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320159s = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS md5Index ON DupCheckInfo(md5)"};
        f320160t = 3355;
        f320161u = 107902;
        f320162v = 3530753;
        f320163w = 3433509;
        f320164x = -97599763;
        f320165y = -295931082;
        f320166z = -1306659477;
        A = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = "md5";
        ((java.util.HashMap) e0Var.f398488d).put("md5", "TEXT");
        e0Var.f398487c[2] = "size";
        ((java.util.HashMap) e0Var.f398488d).put("size", "LONG default '0' ");
        e0Var.f398487c[3] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        ((java.util.HashMap) e0Var.f398488d).put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT default '' ");
        e0Var.f398487c[4] = "bizType";
        ((java.util.HashMap) e0Var.f398488d).put("bizType", "LONG default '0' ");
        e0Var.f398487c[5] = dm.i4.f66874x4c6b1f55;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[6] = "extData";
        ((java.util.HashMap) e0Var.f398488d).put("extData", "BLOB");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  md5 TEXT,  size LONG default '0' ,  path TEXT default '' ,  bizType LONG default '0' ,  updateTime LONG default '0' ,  extData BLOB";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        B = e0Var;
        C = new o75.e();
    }

    public static p75.l0 A0(java.lang.String str, long j17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = f320156p.j(str).c(f320157q.i(java.lang.Long.valueOf(j17)));
        p75.i0 g17 = f320154n.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return g17.a();
    }

    public static final m75.b t0(dm.n2 n2Var, boolean z17) {
        if (!z17) {
            return new m75.b(n2Var, null, null, "MicroMsg.SDK.BaseDupCheckInfo");
        }
        n2Var.getClass();
        o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(n2Var.f67632xc8a07680), "MicroMsg.SDK.BaseDupCheckInfo");
        cVar.f425123d = n2Var;
        return new m75.b(n2Var, cVar, C, "MicroMsg.SDK.BaseDupCheckInfo");
    }

    public static final p75.l0 z0(java.lang.String str) {
        p75.i0 i17 = f320154n.i();
        i17.f434190d = f320155o.j(str);
        i17.f434189c = "MicroMsg.SDK.BaseDupCheckInfo";
        return i17.a();
    }

    public void D0(long j17) {
        this.f67630x6ec16ca8 = j17;
        this.f320171h = true;
    }

    public void F0(byte[] bArr) {
        this.f67631x26b0a326 = bArr;
        this.f320173m = true;
    }

    public void G0(java.lang.String str) {
        this.f67632xc8a07680 = str;
        this.f320167d = true;
    }

    public void I0(java.lang.String str) {
        this.f67633x4b6e68b9 = str;
        this.f320168e = true;
    }

    public void J0(java.lang.String str) {
        this.f67634x2260084a = str;
        this.f320170g = true;
    }

    public void L0(long j17) {
        this.f67635x22618426 = j17;
        this.f320169f = true;
    }

    public void P0(long j17) {
        this.f67636xa783a79b = j17;
        this.f320172i = true;
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
            if (f320160t == hashCode) {
                try {
                    this.f67632xc8a07680 = cursor.getString(i17);
                    this.f320167d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320161u == hashCode) {
                try {
                    this.f67633x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320162v == hashCode) {
                try {
                    this.f67635x22618426 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320163w == hashCode) {
                try {
                    this.f67634x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320164x == hashCode) {
                try {
                    this.f67630x6ec16ca8 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320165y == hashCode) {
                try {
                    this.f67636xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320166z == hashCode) {
                try {
                    this.f67631x26b0a326 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseDupCheckInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f320167d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f67632xc8a07680);
        }
        if (this.f320168e) {
            contentValues.put("md5", this.f67633x4b6e68b9);
        }
        if (this.f320169f) {
            contentValues.put("size", java.lang.Long.valueOf(this.f67635x22618426));
        }
        if (this.f67634x2260084a == null) {
            this.f67634x2260084a = "";
        }
        if (this.f320170g) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f67634x2260084a);
        }
        if (this.f320171h) {
            contentValues.put("bizType", java.lang.Long.valueOf(this.f67630x6ec16ca8));
        }
        if (this.f320172i) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f67636xa783a79b));
        }
        if (this.f320173m) {
            contentValues.put("extData", this.f67631x26b0a326);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseDupCheckInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS DupCheckInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320159s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDupCheckInfo", "createTableSql %s", str2);
            k0Var.A("DupCheckInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "DupCheckInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDupCheckInfo", "updateTableSql %s", str3);
            k0Var.A("DupCheckInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseDupCheckInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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

    /* renamed from: getPath */
    public java.lang.String m125330xfb83cc9b() {
        return this.f67634x2260084a;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67632xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320154n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320154n.f434209a;
    }

    /* renamed from: replaceToDB */
    public long m125331x19a4110d(l75.k0 k0Var, boolean z17) {
        m75.d dVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(this.f67632xc8a07680), "MicroMsg.SDK.BaseDupCheckInfo");
            cVar.f425123d = this;
            dVar = new m75.d(this, cVar, C, "MicroMsg.SDK.BaseDupCheckInfo");
        } else {
            dVar = new m75.d(this, null, null, "MicroMsg.SDK.BaseDupCheckInfo");
        }
        return dVar.a(k0Var);
    }

    public long u0() {
        return this.f67630x6ec16ca8;
    }

    public byte[] v0() {
        return this.f67631x26b0a326;
    }

    public java.lang.String w0() {
        return this.f67632xc8a07680;
    }

    public long y0() {
        return this.f67635x22618426;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67632xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f320167d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f67633x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f320168e = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f67635x22618426 = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f320169f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f67634x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f320170g = true;
            }
        }
        if (contentValues.containsKey("bizType")) {
            this.f67630x6ec16ca8 = contentValues.getAsLong("bizType").longValue();
            if (z17) {
                this.f320171h = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f67636xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f320172i = true;
            }
        }
        if (contentValues.containsKey("extData")) {
            this.f67631x26b0a326 = contentValues.getAsByteArray("extData");
            if (z17) {
                this.f320173m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
