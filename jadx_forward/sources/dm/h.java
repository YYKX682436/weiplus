package dm;

/* loaded from: classes4.dex */
public class h extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f318796p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f318797q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318798r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318799s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318800t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318801u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318802v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318803w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318804x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318805y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318806z;

    /* renamed from: field_createdTime */
    public long f66713x4e8bea10;

    /* renamed from: field_dynamicCanvas */
    public java.lang.String f66714x7aef8bf2;

    /* renamed from: field_dynamicInfo */
    public java.lang.String f66715x5c4f59c8;

    /* renamed from: field_extra */
    public java.lang.String f66716x2910748b;

    /* renamed from: field_extra1 */
    public java.lang.String f66717xf8fe1d06;

    /* renamed from: field_extra2 */
    public java.lang.String f66718xf8fe1d07;

    /* renamed from: field_key */
    public java.lang.String f66719x4b6e619a;

    /* renamed from: field_onetimeCanvas */
    public java.lang.String f66720x39742e6;

    /* renamed from: field_pageId */
    public java.lang.String f66721xa7932ef;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318807d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318808e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318809f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318810g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318811h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318812i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318813m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318814n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318815o = true;

    static {
        p75.n0 n0Var = new p75.n0("AdDynamicCanvasInfo");
        f318796p = n0Var;
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
        f318797q = new java.lang.String[0];
        f318798r = 106079;
        f318799s = -995752950;
        f318800t = -489909803;
        f318801u = -258997875;
        f318802v = 27612791;
        f318803w = -1974661781;
        f318804x = 96965648;
        f318805y = -1289032159;
        f318806z = -1289032158;
        A = 108705909;
        B = m125018x3593deb(dm.h.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125018x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "pageId";
        e0Var.f398488d.put("pageId", "TEXT");
        e0Var.f398487c[2] = "createdTime";
        e0Var.f398488d.put("createdTime", "LONG");
        e0Var.f398487c[3] = "dynamicInfo";
        e0Var.f398488d.put("dynamicInfo", "TEXT");
        e0Var.f398487c[4] = "dynamicCanvas";
        e0Var.f398488d.put("dynamicCanvas", "TEXT");
        e0Var.f398487c[5] = "onetimeCanvas";
        e0Var.f398488d.put("onetimeCanvas", "TEXT");
        e0Var.f398487c[6] = "extra";
        e0Var.f398488d.put("extra", "TEXT");
        e0Var.f398487c[7] = "extra1";
        e0Var.f398488d.put("extra1", "TEXT");
        e0Var.f398487c[8] = "extra2";
        e0Var.f398488d.put("extra2", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  pageId TEXT,  createdTime LONG,  dynamicInfo TEXT,  dynamicCanvas TEXT,  onetimeCanvas TEXT,  extra TEXT,  extra1 TEXT,  extra2 TEXT";
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
            if (f318798r == hashCode) {
                try {
                    this.f66719x4b6e619a = cursor.getString(i17);
                    this.f318807d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318799s == hashCode) {
                try {
                    this.f66721xa7932ef = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318800t == hashCode) {
                try {
                    this.f66713x4e8bea10 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318801u == hashCode) {
                try {
                    this.f66715x5c4f59c8 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318802v == hashCode) {
                try {
                    this.f66714x7aef8bf2 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318803w == hashCode) {
                try {
                    this.f66720x39742e6 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318804x == hashCode) {
                try {
                    this.f66716x2910748b = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318805y == hashCode) {
                try {
                    this.f66717xf8fe1d06 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318806z == hashCode) {
                try {
                    this.f66718xf8fe1d07 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAdDynamicCanvasInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f318807d) {
            contentValues.put("key", this.f66719x4b6e619a);
        }
        if (this.f318808e) {
            contentValues.put("pageId", this.f66721xa7932ef);
        }
        if (this.f318809f) {
            contentValues.put("createdTime", java.lang.Long.valueOf(this.f66713x4e8bea10));
        }
        if (this.f318810g) {
            contentValues.put("dynamicInfo", this.f66715x5c4f59c8);
        }
        if (this.f318811h) {
            contentValues.put("dynamicCanvas", this.f66714x7aef8bf2);
        }
        if (this.f318812i) {
            contentValues.put("onetimeCanvas", this.f66720x39742e6);
        }
        if (this.f318813m) {
            contentValues.put("extra", this.f66716x2910748b);
        }
        if (this.f318814n) {
            contentValues.put("extra1", this.f66717xf8fe1d06);
        }
        if (this.f318815o) {
            contentValues.put("extra2", this.f66718xf8fe1d07);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdDynamicCanvasInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318797q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "createTableSql %s", str2);
            k0Var.A("AdDynamicCanvasInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AdDynamicCanvasInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "updateTableSql %s", str3);
            k0Var.A("AdDynamicCanvasInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAdDynamicCanvasInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f66719x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318796p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318796p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f66719x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f318807d = true;
            }
        }
        if (contentValues.containsKey("pageId")) {
            this.f66721xa7932ef = contentValues.getAsString("pageId");
            if (z17) {
                this.f318808e = true;
            }
        }
        if (contentValues.containsKey("createdTime")) {
            this.f66713x4e8bea10 = contentValues.getAsLong("createdTime").longValue();
            if (z17) {
                this.f318809f = true;
            }
        }
        if (contentValues.containsKey("dynamicInfo")) {
            this.f66715x5c4f59c8 = contentValues.getAsString("dynamicInfo");
            if (z17) {
                this.f318810g = true;
            }
        }
        if (contentValues.containsKey("dynamicCanvas")) {
            this.f66714x7aef8bf2 = contentValues.getAsString("dynamicCanvas");
            if (z17) {
                this.f318811h = true;
            }
        }
        if (contentValues.containsKey("onetimeCanvas")) {
            this.f66720x39742e6 = contentValues.getAsString("onetimeCanvas");
            if (z17) {
                this.f318812i = true;
            }
        }
        if (contentValues.containsKey("extra")) {
            this.f66716x2910748b = contentValues.getAsString("extra");
            if (z17) {
                this.f318813m = true;
            }
        }
        if (contentValues.containsKey("extra1")) {
            this.f66717xf8fe1d06 = contentValues.getAsString("extra1");
            if (z17) {
                this.f318814n = true;
            }
        }
        if (contentValues.containsKey("extra2")) {
            this.f66718xf8fe1d07 = contentValues.getAsString("extra2");
            if (z17) {
                this.f318815o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
