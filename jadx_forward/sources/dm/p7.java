package dm;

/* loaded from: classes8.dex */
public class p7 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f320712n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f320713o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320714p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320715q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320716r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320717s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320718t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320719u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320720v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320721w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f320722x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f320723y;

    /* renamed from: field_available_otb */
    public java.lang.String f67914xe8f41222;

    /* renamed from: field_is_overdue */
    public int f67915xd18846f0;

    /* renamed from: field_is_show_entry */
    public int f67916x4505d460;

    /* renamed from: field_loan_jump_url */
    public java.lang.String f67917xc70051c8;

    /* renamed from: field_red_dot_index */
    public int f67918x1f185da9;

    /* renamed from: field_tips */
    public java.lang.String f67919x2261f75d;

    /* renamed from: field_title */
    public java.lang.String f67920x29dd02d3;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320724d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320725e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320726f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320727g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320728h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320729i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320730m = true;

    static {
        p75.n0 n0Var = new p75.n0("LoanEntryInfo");
        f320712n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320713o = new java.lang.String[0];
        f320714p = 110371416;
        f320715q = 1303780429;
        f320716r = -1513215954;
        f320717s = -876896539;
        f320718t = 3560248;
        f320719u = 409014923;
        f320720v = 1873403047;
        f320721w = 108705909;
        f320722x = m125396x3593deb(dm.p7.class);
        f320723y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125396x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398488d.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "TEXT PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        e0Var.f398487c[1] = "loan_jump_url";
        e0Var.f398488d.put("loan_jump_url", "TEXT");
        e0Var.f398487c[2] = "red_dot_index";
        e0Var.f398488d.put("red_dot_index", "INTEGER");
        e0Var.f398487c[3] = "is_show_entry";
        e0Var.f398488d.put("is_show_entry", "INTEGER");
        e0Var.f398487c[4] = "tips";
        e0Var.f398488d.put("tips", "TEXT");
        e0Var.f398487c[5] = "is_overdue";
        e0Var.f398488d.put("is_overdue", "INTEGER");
        e0Var.f398487c[6] = "available_otb";
        e0Var.f398488d.put("available_otb", "TEXT");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " title TEXT PRIMARY KEY ,  loan_jump_url TEXT,  red_dot_index INTEGER,  is_show_entry INTEGER,  tips TEXT,  is_overdue INTEGER,  available_otb TEXT";
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
            if (f320714p == hashCode) {
                try {
                    this.f67920x29dd02d3 = cursor.getString(i17);
                    this.f320724d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320715q == hashCode) {
                try {
                    this.f67917xc70051c8 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320716r == hashCode) {
                try {
                    this.f67918x1f185da9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320717s == hashCode) {
                try {
                    this.f67916x4505d460 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320718t == hashCode) {
                try {
                    this.f67919x2261f75d = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320719u == hashCode) {
                try {
                    this.f67915xd18846f0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320720v == hashCode) {
                try {
                    this.f67914xe8f41222 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLoanEntryInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320721w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320724d) {
            contentValues.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f67920x29dd02d3);
        }
        if (this.f320725e) {
            contentValues.put("loan_jump_url", this.f67917xc70051c8);
        }
        if (this.f320726f) {
            contentValues.put("red_dot_index", java.lang.Integer.valueOf(this.f67918x1f185da9));
        }
        if (this.f320727g) {
            contentValues.put("is_show_entry", java.lang.Integer.valueOf(this.f67916x4505d460));
        }
        if (this.f320728h) {
            contentValues.put("tips", this.f67919x2261f75d);
        }
        if (this.f320729i) {
            contentValues.put("is_overdue", java.lang.Integer.valueOf(this.f67915xd18846f0));
        }
        if (this.f320730m) {
            contentValues.put("available_otb", this.f67914xe8f41222);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLoanEntryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LoanEntryInfo ( ");
        l75.e0 e0Var = f320722x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320713o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLoanEntryInfo", "createTableSql %s", str2);
            k0Var.A("LoanEntryInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LoanEntryInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLoanEntryInfo", "updateTableSql %s", str3);
            k0Var.A("LoanEntryInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLoanEntryInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320722x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320723y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67920x29dd02d3;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320712n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320712n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
            this.f67920x29dd02d3 = contentValues.getAsString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (z17) {
                this.f320724d = true;
            }
        }
        if (contentValues.containsKey("loan_jump_url")) {
            this.f67917xc70051c8 = contentValues.getAsString("loan_jump_url");
            if (z17) {
                this.f320725e = true;
            }
        }
        if (contentValues.containsKey("red_dot_index")) {
            this.f67918x1f185da9 = contentValues.getAsInteger("red_dot_index").intValue();
            if (z17) {
                this.f320726f = true;
            }
        }
        if (contentValues.containsKey("is_show_entry")) {
            this.f67916x4505d460 = contentValues.getAsInteger("is_show_entry").intValue();
            if (z17) {
                this.f320727g = true;
            }
        }
        if (contentValues.containsKey("tips")) {
            this.f67919x2261f75d = contentValues.getAsString("tips");
            if (z17) {
                this.f320728h = true;
            }
        }
        if (contentValues.containsKey("is_overdue")) {
            this.f67915xd18846f0 = contentValues.getAsInteger("is_overdue").intValue();
            if (z17) {
                this.f320729i = true;
            }
        }
        if (contentValues.containsKey("available_otb")) {
            this.f67914xe8f41222 = contentValues.getAsString("available_otb");
            if (z17) {
                this.f320730m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
