package dm;

/* loaded from: classes4.dex */
public class lc extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f319878m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f319879n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319880o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319881p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319882q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319883r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319884s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319885t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319886u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f319887v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f319888w;

    /* renamed from: field_imgUrl */
    public java.lang.String f67360xff302991;

    /* renamed from: field_link */
    public java.lang.String f67361x225e541f;

    /* renamed from: field_recordId */
    public java.lang.String f67362xee1faef1;

    /* renamed from: field_source */
    public java.lang.String f67363x10639700;

    /* renamed from: field_timeStamp */
    public long f67364x9c2463f1;

    /* renamed from: field_title */
    public java.lang.String f67365x29dd02d3;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319889d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319890e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319891f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319892g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319893h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319894i = true;

    static {
        p75.n0 n0Var = new p75.n0("WebViewHistory");
        f319878m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319879n = new java.lang.String[0];
        f319880o = -799234740;
        f319881p = 3321850;
        f319882q = 110371416;
        f319883r = -896505829;
        f319884s = -1185088852;
        f319885t = 25573622;
        f319886u = 108705909;
        f319887v = m125210x3593deb(dm.lc.class);
        f319888w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125210x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "recordId";
        e0Var.f398488d.put("recordId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "recordId";
        e0Var.f398487c[1] = "link";
        e0Var.f398488d.put("link", "TEXT");
        e0Var.f398487c[2] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[3] = ya.b.f77502x92235c1b;
        e0Var.f398488d.put(ya.b.f77502x92235c1b, "TEXT");
        e0Var.f398487c[4] = "imgUrl";
        e0Var.f398488d.put("imgUrl", "TEXT");
        e0Var.f398487c[5] = "timeStamp";
        e0Var.f398488d.put("timeStamp", "LONG");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " recordId TEXT PRIMARY KEY ,  link TEXT,  title TEXT,  source TEXT,  imgUrl TEXT,  timeStamp LONG";
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
            if (f319880o == hashCode) {
                try {
                    this.f67362xee1faef1 = cursor.getString(i17);
                    this.f319889d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewHistory", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319881p == hashCode) {
                try {
                    this.f67361x225e541f = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewHistory", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319882q == hashCode) {
                try {
                    this.f67365x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewHistory", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319883r == hashCode) {
                try {
                    this.f67363x10639700 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewHistory", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319884s == hashCode) {
                try {
                    this.f67360xff302991 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewHistory", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319885t == hashCode) {
                try {
                    this.f67364x9c2463f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWebViewHistory", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319886u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319889d) {
            contentValues.put("recordId", this.f67362xee1faef1);
        }
        if (this.f319890e) {
            contentValues.put("link", this.f67361x225e541f);
        }
        if (this.f319891f) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67365x29dd02d3);
        }
        if (this.f319892g) {
            contentValues.put(ya.b.f77502x92235c1b, this.f67363x10639700);
        }
        if (this.f319893h) {
            contentValues.put("imgUrl", this.f67360xff302991);
        }
        if (this.f319894i) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.f67364x9c2463f1));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWebViewHistory", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WebViewHistory ( ");
        l75.e0 e0Var = f319887v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319879n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebViewHistory", "createTableSql %s", str2);
            k0Var.A("WebViewHistory", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WebViewHistory", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebViewHistory", "updateTableSql %s", str3);
            k0Var.A("WebViewHistory", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWebViewHistory", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319887v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319888w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67362xee1faef1;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319878m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319878m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("recordId")) {
            this.f67362xee1faef1 = contentValues.getAsString("recordId");
            if (z17) {
                this.f319889d = true;
            }
        }
        if (contentValues.containsKey("link")) {
            this.f67361x225e541f = contentValues.getAsString("link");
            if (z17) {
                this.f319890e = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67365x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f319891f = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77502x92235c1b)) {
            this.f67363x10639700 = contentValues.getAsString(ya.b.f77502x92235c1b);
            if (z17) {
                this.f319892g = true;
            }
        }
        if (contentValues.containsKey("imgUrl")) {
            this.f67360xff302991 = contentValues.getAsString("imgUrl");
            if (z17) {
                this.f319893h = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.f67364x9c2463f1 = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f319894i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
