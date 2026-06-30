package dm;

/* loaded from: classes9.dex */
public class da extends l75.f0 {
    public static final l75.e0 A;
    public static final o75.e B;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f317956n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f317957o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f317958p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f317959q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f317960r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317961s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317962t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317963u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317964v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317965w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317966x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317967y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317968z;

    /* renamed from: field_clusterNote */
    public java.lang.String f66274x27b20147;

    /* renamed from: field_foldCount */
    public int f66275xb82ed889;

    /* renamed from: field_groupId */
    public long f66276x861009b5;

    /* renamed from: field_msgId */
    public long f66277x297eb4f7;

    /* renamed from: field_showStatus */
    public int f66278xe7ccd9b4;

    /* renamed from: field_title */
    public java.lang.String f66279x29dd02d3;

    /* renamed from: field_weappMsgId */
    public java.lang.String f66280xae82c0e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317969d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317970e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317971f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317972g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317973h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317974i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317975m = true;

    static {
        p75.n0 n0Var = new p75.n0("ServiceNotifyAggregationMsg");
        f317956n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317957o = new p75.d("msgId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317958p = new p75.d("groupId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317959q = new p75.d("showStatus", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317960r = new java.lang.String[0];
        f317961s = 104191100;
        f317962t = 496020878;
        f317963u = 293428218;
        f317964v = 110371416;
        f317965w = 782607695;
        f317966x = 1371600809;
        f317967y = -1141724916;
        f317968z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        ((java.util.HashMap) e0Var.f398488d).put("msgId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "msgId";
        e0Var.f398487c[1] = "foldCount";
        ((java.util.HashMap) e0Var.f398488d).put("foldCount", "INTEGER");
        e0Var.f398487c[2] = "groupId";
        ((java.util.HashMap) e0Var.f398488d).put("groupId", "LONG");
        e0Var.f398487c[3] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        ((java.util.HashMap) e0Var.f398488d).put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[4] = "showStatus";
        ((java.util.HashMap) e0Var.f398488d).put("showStatus", "INTEGER");
        e0Var.f398487c[5] = "weappMsgId";
        ((java.util.HashMap) e0Var.f398488d).put("weappMsgId", "TEXT");
        e0Var.f398487c[6] = "clusterNote";
        ((java.util.HashMap) e0Var.f398488d).put("clusterNote", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " msgId LONG PRIMARY KEY ,  foldCount INTEGER,  groupId LONG,  title TEXT,  showStatus INTEGER,  weappMsgId TEXT,  clusterNote TEXT";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        A = e0Var;
        B = new o75.e();
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
            if (f317961s == hashCode) {
                try {
                    this.f66277x297eb4f7 = cursor.getLong(i17);
                    this.f317969d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317962t == hashCode) {
                try {
                    this.f66275xb82ed889 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317963u == hashCode) {
                try {
                    this.f66276x861009b5 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317964v == hashCode) {
                try {
                    this.f66279x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317965w == hashCode) {
                try {
                    this.f66278xe7ccd9b4 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317966x == hashCode) {
                try {
                    this.f66280xae82c0e = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317967y == hashCode) {
                try {
                    this.f66274x27b20147 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317968z == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317969d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f66277x297eb4f7));
        }
        if (this.f317970e) {
            contentValues.put("foldCount", java.lang.Integer.valueOf(this.f66275xb82ed889));
        }
        if (this.f317971f) {
            contentValues.put("groupId", java.lang.Long.valueOf(this.f66276x861009b5));
        }
        if (this.f317972g) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f66279x29dd02d3);
        }
        if (this.f317973h) {
            contentValues.put("showStatus", java.lang.Integer.valueOf(this.f66278xe7ccd9b4));
        }
        if (this.f317974i) {
            contentValues.put("weappMsgId", this.f66280xae82c0e);
        }
        if (this.f317975m) {
            contentValues.put("clusterNote", this.f66274x27b20147);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ServiceNotifyAggregationMsg ( ");
        l75.e0 e0Var = A;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317960r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "createTableSql %s", str2);
            k0Var.A("ServiceNotifyAggregationMsg", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ServiceNotifyAggregationMsg", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "updateTableSql %s", str3);
            k0Var.A("ServiceNotifyAggregationMsg", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseServiceNotifyAggregationMsg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return B;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66277x297eb4f7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317956n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317956n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f66277x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f317969d = true;
            }
        }
        if (contentValues.containsKey("foldCount")) {
            this.f66275xb82ed889 = contentValues.getAsInteger("foldCount").intValue();
            if (z17) {
                this.f317970e = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.f66276x861009b5 = contentValues.getAsLong("groupId").longValue();
            if (z17) {
                this.f317971f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f66279x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f317972g = true;
            }
        }
        if (contentValues.containsKey("showStatus")) {
            this.f66278xe7ccd9b4 = contentValues.getAsInteger("showStatus").intValue();
            if (z17) {
                this.f317973h = true;
            }
        }
        if (contentValues.containsKey("weappMsgId")) {
            this.f66280xae82c0e = contentValues.getAsString("weappMsgId");
            if (z17) {
                this.f317974i = true;
            }
        }
        if (contentValues.containsKey("clusterNote")) {
            this.f66274x27b20147 = contentValues.getAsString("clusterNote");
            if (z17) {
                this.f317975m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
