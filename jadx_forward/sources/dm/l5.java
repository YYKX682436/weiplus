package dm;

/* loaded from: classes7.dex */
public class l5 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f319776n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f319777o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319778p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319779q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319780r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319781s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319782t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319783u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319784v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319785w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f319786x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f319787y;

    /* renamed from: field_appId */
    public java.lang.String f67326x28d45f97;

    /* renamed from: field_description */
    public java.lang.String f67327x4f4dc37;

    /* renamed from: field_msgId */
    public long f67328x297eb4f7;

    /* renamed from: field_source */
    public java.lang.String f67329x10639700;

    /* renamed from: field_title */
    public java.lang.String f67330x29dd02d3;

    /* renamed from: field_type */
    public int f67331x2262335f;

    /* renamed from: field_xml */
    public java.lang.String f67332x4b6e9352;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319788d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319789e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319790f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319791g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319792h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319793i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319794m = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeAppMessage");
        f319776n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319777o = new java.lang.String[0];
        f319778p = 104191100;
        f319779q = 118807;
        f319780r = 93028124;
        f319781s = 110371416;
        f319782t = -1724546052;
        f319783u = -896505829;
        f319784v = 3575610;
        f319785w = 108705909;
        f319786x = m125197x3593deb(dm.l5.class);
        f319787y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125197x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
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
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " msgId LONG default '0'  PRIMARY KEY ,  xml TEXT,  appId TEXT,  title TEXT,  description TEXT,  source TEXT,  type INTEGER";
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
            if (f319778p == hashCode) {
                try {
                    this.f67328x297eb4f7 = cursor.getLong(i17);
                    this.f319788d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319779q == hashCode) {
                try {
                    this.f67332x4b6e9352 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319780r == hashCode) {
                try {
                    this.f67326x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319781s == hashCode) {
                try {
                    this.f67330x29dd02d3 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319782t == hashCode) {
                try {
                    this.f67327x4f4dc37 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319783u == hashCode) {
                try {
                    this.f67329x10639700 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319784v == hashCode) {
                try {
                    this.f67331x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeAppMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319785w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319788d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f67328x297eb4f7));
        }
        if (this.f319789e) {
            contentValues.put("xml", this.f67332x4b6e9352);
        }
        if (this.f319790f) {
            contentValues.put("appId", this.f67326x28d45f97);
        }
        if (this.f319791g) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67330x29dd02d3);
        }
        if (this.f319792h) {
            contentValues.put("description", this.f67327x4f4dc37);
        }
        if (this.f319793i) {
            contentValues.put(ya.b.f77502x92235c1b, this.f67329x10639700);
        }
        if (this.f319794m) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67331x2262335f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeAppMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeAppMessage ( ");
        l75.e0 e0Var = f319786x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319777o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeAppMessage", "createTableSql %s", str2);
            k0Var.A("GameLifeAppMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameLifeAppMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeAppMessage", "updateTableSql %s", str3);
            k0Var.A("GameLifeAppMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeAppMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319786x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319787y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67328x297eb4f7);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319776n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319776n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f67328x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f319788d = true;
            }
        }
        if (contentValues.containsKey("xml")) {
            this.f67332x4b6e9352 = contentValues.getAsString("xml");
            if (z17) {
                this.f319789e = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f67326x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f319790f = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67330x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f319791g = true;
            }
        }
        if (contentValues.containsKey("description")) {
            this.f67327x4f4dc37 = contentValues.getAsString("description");
            if (z17) {
                this.f319792h = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77502x92235c1b)) {
            this.f67329x10639700 = contentValues.getAsString(ya.b.f77502x92235c1b);
            if (z17) {
                this.f319793i = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67331x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f319794m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
