package dm;

/* loaded from: classes4.dex */
public class k4 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f319521i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f319522m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f319523n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319524o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319525p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319526q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319527r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319528s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319529t;

    /* renamed from: u, reason: collision with root package name */
    public static final l75.e0 f319530u;

    /* renamed from: v, reason: collision with root package name */
    public static final o75.e f319531v;

    /* renamed from: field_badgeDismissed */
    public int f67199x51deaa2b;

    /* renamed from: field_notificationShown */
    public int f67200x578ce6e1;

    /* renamed from: field_productId */
    public java.lang.String f67201x5bec8165;

    /* renamed from: field_status */
    public int f67202x10a0fed7;

    /* renamed from: field_submissionId */
    public java.lang.String f67203x5bc050ac;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319532d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319533e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319534f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319535g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319536h = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveAigcGiftStatus");
        f319521i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319522m = new p75.d("productId", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319523n = new java.lang.String[0];
        f319524o = -1051830678;
        f319525p = 1335140743;
        f319526q = -892481550;
        f319527r = -1583356186;
        f319528s = -1579012026;
        f319529t = 108705909;
        f319530u = m125164x3593deb(dm.k4.class);
        f319531v = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125164x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "productId";
        e0Var.f398488d.put("productId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "productId";
        e0Var.f398487c[1] = "submissionId";
        e0Var.f398488d.put("submissionId", "TEXT default '' ");
        e0Var.f398487c[2] = "status";
        e0Var.f398488d.put("status", "INTEGER default '0' ");
        e0Var.f398487c[3] = "notificationShown";
        e0Var.f398488d.put("notificationShown", "INTEGER default '0' ");
        e0Var.f398487c[4] = "badgeDismissed";
        e0Var.f398488d.put("badgeDismissed", "INTEGER default '0' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " productId TEXT PRIMARY KEY ,  submissionId TEXT default '' ,  status INTEGER default '0' ,  notificationShown INTEGER default '0' ,  badgeDismissed INTEGER default '0' ";
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
            if (f319524o == hashCode) {
                try {
                    this.f67201x5bec8165 = cursor.getString(i17);
                    this.f319532d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319525p == hashCode) {
                try {
                    this.f67203x5bc050ac = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319526q == hashCode) {
                try {
                    this.f67202x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319527r == hashCode) {
                try {
                    this.f67200x578ce6e1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319528s == hashCode) {
                try {
                    this.f67199x51deaa2b = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319529t == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319532d) {
            contentValues.put("productId", this.f67201x5bec8165);
        }
        if (this.f67203x5bc050ac == null) {
            this.f67203x5bc050ac = "";
        }
        if (this.f319533e) {
            contentValues.put("submissionId", this.f67203x5bc050ac);
        }
        if (this.f319534f) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f67202x10a0fed7));
        }
        if (this.f319535g) {
            contentValues.put("notificationShown", java.lang.Integer.valueOf(this.f67200x578ce6e1));
        }
        if (this.f319536h) {
            contentValues.put("badgeDismissed", java.lang.Integer.valueOf(this.f67199x51deaa2b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveAigcGiftStatus ( ");
        l75.e0 e0Var = f319530u;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319523n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "createTableSql %s", str2);
            k0Var.A("FinderLiveAigcGiftStatus", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveAigcGiftStatus", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "updateTableSql %s", str3);
            k0Var.A("FinderLiveAigcGiftStatus", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveAigcGiftStatus", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319530u;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319531v;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67201x5bec8165;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319521i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319521i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("productId")) {
            this.f67201x5bec8165 = contentValues.getAsString("productId");
            if (z17) {
                this.f319532d = true;
            }
        }
        if (contentValues.containsKey("submissionId")) {
            this.f67203x5bc050ac = contentValues.getAsString("submissionId");
            if (z17) {
                this.f319533e = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f67202x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f319534f = true;
            }
        }
        if (contentValues.containsKey("notificationShown")) {
            this.f67200x578ce6e1 = contentValues.getAsInteger("notificationShown").intValue();
            if (z17) {
                this.f319535g = true;
            }
        }
        if (contentValues.containsKey("badgeDismissed")) {
            this.f67199x51deaa2b = contentValues.getAsInteger("badgeDismissed").intValue();
            if (z17) {
                this.f319536h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
