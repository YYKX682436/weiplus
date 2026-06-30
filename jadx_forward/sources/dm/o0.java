package dm;

/* loaded from: classes9.dex */
public class o0 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f320375p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f320376q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f320377r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320378s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320379t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320380u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320381v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320382w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320383x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320384y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320385z;

    /* renamed from: field_appId */
    public java.lang.String f67763x28d45f97;

    /* renamed from: field_description */
    public java.lang.String f67764x4f4dc37;

    /* renamed from: field_msgId */
    public long f67765x297eb4f7;

    /* renamed from: field_msgSvrId */
    public long f67766xd09be28e;

    /* renamed from: field_msgTalker */
    public java.lang.String f67767x436b2035;

    /* renamed from: field_source */
    public java.lang.String f67768x10639700;

    /* renamed from: field_title */
    public java.lang.String f67769x29dd02d3;

    /* renamed from: field_type */
    public int f67770x2262335f;

    /* renamed from: field_xml */
    public java.lang.String f67771x4b6e9352;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320386d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320387e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320388f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320389g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320390h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320391i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320392m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320393n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320394o = true;

    static {
        p75.n0 n0Var = new p75.n0("AppMessage");
        f320375p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320376q = new p75.d("msgId", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320377r = new java.lang.String[0];
        f320378s = 104191100;
        f320379t = 118807;
        f320380u = 93028124;
        f320381v = 110371416;
        f320382w = -1724546052;
        f320383x = -896505829;
        f320384y = 3575610;
        f320385z = -1294411543;
        A = -1462962886;
        B = 108705909;
        C = m125354x3593deb(dm.o0.class);
        D = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125354x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        e0Var.f398488d.put("msgId", "LONG default '0'  PRIMARY KEY ");
        e0Var.f398486b = "msgId";
        e0Var.f398487c[1] = "xml";
        e0Var.f398488d.put("xml", "TEXT");
        e0Var.f398487c[2] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[3] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT");
        e0Var.f398487c[4] = "description";
        e0Var.f398488d.put("description", "TEXT");
        e0Var.f398487c[5] = ya.b.f77502x92235c1b;
        e0Var.f398488d.put(ya.b.f77502x92235c1b, "TEXT");
        e0Var.f398487c[6] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[7] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG");
        e0Var.f398487c[8] = "msgTalker";
        e0Var.f398488d.put("msgTalker", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " msgId LONG default '0'  PRIMARY KEY ,  xml TEXT,  appId TEXT,  title TEXT,  description TEXT,  source TEXT,  type INTEGER,  msgSvrId LONG,  msgTalker TEXT";
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
            if (f320378s == hashCode) {
                try {
                    this.f67765x297eb4f7 = cursor.getLong(i17);
                    this.f320386d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320379t == hashCode) {
                try {
                    this.f67771x4b6e9352 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320380u == hashCode) {
                try {
                    this.f67763x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320381v == hashCode) {
                try {
                    this.f67769x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320382w == hashCode) {
                try {
                    this.f67764x4f4dc37 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320383x == hashCode) {
                try {
                    this.f67768x10639700 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320384y == hashCode) {
                try {
                    this.f67770x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320385z == hashCode) {
                try {
                    this.f67766xd09be28e = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67767x436b2035 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320386d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f67765x297eb4f7));
        }
        if (this.f320387e) {
            contentValues.put("xml", this.f67771x4b6e9352);
        }
        if (this.f320388f) {
            contentValues.put("appId", this.f67763x28d45f97);
        }
        if (this.f320389g) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67769x29dd02d3);
        }
        if (this.f320390h) {
            contentValues.put("description", this.f67764x4f4dc37);
        }
        if (this.f320391i) {
            contentValues.put(ya.b.f77502x92235c1b, this.f67768x10639700);
        }
        if (this.f320392m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67770x2262335f));
        }
        if (this.f320393n) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f67766xd09be28e));
        }
        if (this.f320394o) {
            contentValues.put("msgTalker", this.f67767x436b2035);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppMessage ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320377r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppMessage", "createTableSql %s", str2);
            k0Var.A("AppMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppMessage", "updateTableSql %s", str3);
            k0Var.A("AppMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67765x297eb4f7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320375p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320375p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f67765x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f320386d = true;
            }
        }
        if (contentValues.containsKey("xml")) {
            this.f67771x4b6e9352 = contentValues.getAsString("xml");
            if (z17) {
                this.f320387e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67763x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320388f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67769x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f320389g = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.f67764x4f4dc37 = contentValues.getAsString("description");
            if (z17) {
                this.f320390h = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77502x92235c1b)) {
            this.f67768x10639700 = contentValues.getAsString(ya.b.f77502x92235c1b);
            if (z17) {
                this.f320391i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67770x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f320392m = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.f67766xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f320393n = true;
            }
        }
        if (contentValues.containsKey("msgTalker")) {
            this.f67767x436b2035 = contentValues.getAsString("msgTalker");
            if (z17) {
                this.f320394o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
