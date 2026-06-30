package dm;

/* loaded from: classes4.dex */
public class c2 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f317560n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f317561o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317562p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317563q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317564r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317565s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317566t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317567u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317568v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317569w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f317570x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f317571y;

    /* renamed from: field_createTime */
    public long f66051xac3be4e;

    /* renamed from: field_deleteTime */
    public long f66052x2254b37d;

    /* renamed from: field_flags */
    public long f66053x2918cf02;

    /* renamed from: field_id */
    public java.lang.String f66054xc8a07680;

    /* renamed from: field_modifyTime */
    public long f66055x15b870c;

    /* renamed from: field_saveTime */
    public long f66056xa2398b8f;

    /* renamed from: field_size */
    public long f66057x22618426;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317572d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317573e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317574f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317575g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317576h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317577i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317578m = true;

    static {
        p75.n0 n0Var = new p75.n0("CleanDeleteItem");
        f317560n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317561o = new java.lang.String[0];
        f317562p = 1369213417;
        f317563q = 1211388583;
        f317564r = 1764589336;
        f317565s = 3355;
        f317566t = -2072608278;
        f317567u = 3530753;
        f317568v = 97513095;
        f317569w = 108705909;
        f317570x = m124835x3593deb(dm.c2.class);
        f317571y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124835x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "createTime";
        e0Var.f398488d.put("createTime", "LONG default '0' ");
        e0Var.f398487c[1] = "modifyTime";
        e0Var.f398488d.put("modifyTime", "LONG default '0' ");
        e0Var.f398487c[2] = "deleteTime";
        e0Var.f398488d.put("deleteTime", "LONG default '0' ");
        e0Var.f398487c[3] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "TEXT default '' ");
        e0Var.f398487c[4] = "saveTime";
        e0Var.f398488d.put("saveTime", "LONG default '0' ");
        e0Var.f398487c[5] = "size";
        e0Var.f398488d.put("size", "LONG default '0' ");
        e0Var.f398487c[6] = "flags";
        e0Var.f398488d.put("flags", "LONG default '0' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " createTime LONG default '0' ,  modifyTime LONG default '0' ,  deleteTime LONG default '0' ,  id TEXT default '' ,  saveTime LONG default '0' ,  size LONG default '0' ,  flags LONG default '0' ";
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
            if (f317562p == hashCode) {
                try {
                    this.f66051xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317563q == hashCode) {
                try {
                    this.f66055x15b870c = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317564r == hashCode) {
                try {
                    this.f66052x2254b37d = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317565s == hashCode) {
                try {
                    this.f66054xc8a07680 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317566t == hashCode) {
                try {
                    this.f66056xa2398b8f = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317567u == hashCode) {
                try {
                    this.f66057x22618426 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317568v == hashCode) {
                try {
                    this.f66053x2918cf02 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCleanDeleteItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317569w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317572d) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66051xac3be4e));
        }
        if (this.f317573e) {
            contentValues.put("modifyTime", java.lang.Long.valueOf(this.f66055x15b870c));
        }
        if (this.f317574f) {
            contentValues.put("deleteTime", java.lang.Long.valueOf(this.f66052x2254b37d));
        }
        if (this.f66054xc8a07680 == null) {
            this.f66054xc8a07680 = "";
        }
        if (this.f317575g) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f66054xc8a07680);
        }
        if (this.f317576h) {
            contentValues.put("saveTime", java.lang.Long.valueOf(this.f66056xa2398b8f));
        }
        if (this.f317577i) {
            contentValues.put("size", java.lang.Long.valueOf(this.f66057x22618426));
        }
        if (this.f317578m) {
            contentValues.put("flags", java.lang.Long.valueOf(this.f66053x2918cf02));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCleanDeleteItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CleanDeleteItem ( ");
        l75.e0 e0Var = f317570x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317561o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCleanDeleteItem", "createTableSql %s", str2);
            k0Var.A("CleanDeleteItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CleanDeleteItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCleanDeleteItem", "updateTableSql %s", str3);
            k0Var.A("CleanDeleteItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCleanDeleteItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317570x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317571y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317560n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317560n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("createTime")) {
            this.f66051xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f317572d = true;
            }
        }
        if (contentValues.containsKey("modifyTime")) {
            this.f66055x15b870c = contentValues.getAsLong("modifyTime").longValue();
            if (z17) {
                this.f317573e = true;
            }
        }
        if (contentValues.containsKey("deleteTime")) {
            this.f66052x2254b37d = contentValues.getAsLong("deleteTime").longValue();
            if (z17) {
                this.f317574f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f66054xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f317575g = true;
            }
        }
        if (contentValues.containsKey("saveTime")) {
            this.f66056xa2398b8f = contentValues.getAsLong("saveTime").longValue();
            if (z17) {
                this.f317576h = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f66057x22618426 = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f317577i = true;
            }
        }
        if (contentValues.containsKey("flags")) {
            this.f66053x2918cf02 = contentValues.getAsLong("flags").longValue();
            if (z17) {
                this.f317578m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
