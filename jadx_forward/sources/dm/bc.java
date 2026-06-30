package dm;

/* loaded from: classes4.dex */
public class bc extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f317478m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f317479n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317480o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317481p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317482q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317483r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317484s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317485t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317486u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f317487v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f317488w;

    /* renamed from: field_banner_list */
    public java.lang.String f66013xfa13de0c;

    /* renamed from: field_function_list */
    public java.lang.String f66014xf3aed220;

    /* renamed from: field_isShowSetting */
    public int f66015xb2c0b684;

    /* renamed from: field_new_list */
    public java.lang.String f66016x6fd7cd82;

    /* renamed from: field_type_name_list */
    public java.lang.String f66017xd12590f2;

    /* renamed from: field_wallet_region */
    public int f66018x1cb94b75;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317489d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317490e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317491f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317492g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317493h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317494i = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletFunciontList");
        f317478m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317479n = new java.lang.String[0];
        f317480o = -1553000966;
        f317481p = 2053414053;
        f317482q = 1377092573;
        f317483r = -1907063343;
        f317484s = 556341005;
        f317485t = 964067593;
        f317486u = 108705909;
        f317487v = m124825x3593deb(dm.bc.class);
        f317488w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124825x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "wallet_region";
        e0Var.f398488d.put("wallet_region", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "wallet_region";
        e0Var.f398487c[1] = "function_list";
        e0Var.f398488d.put("function_list", "TEXT");
        e0Var.f398487c[2] = "new_list";
        e0Var.f398488d.put("new_list", "TEXT");
        e0Var.f398487c[3] = "banner_list";
        e0Var.f398488d.put("banner_list", "TEXT");
        e0Var.f398487c[4] = "type_name_list";
        e0Var.f398488d.put("type_name_list", "TEXT");
        e0Var.f398487c[5] = "isShowSetting";
        e0Var.f398488d.put("isShowSetting", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " wallet_region INTEGER PRIMARY KEY ,  function_list TEXT,  new_list TEXT,  banner_list TEXT,  type_name_list TEXT,  isShowSetting INTEGER";
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
            if (f317480o == hashCode) {
                try {
                    this.f66018x1cb94b75 = cursor.getInt(i17);
                    this.f317489d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletFunciontList", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317481p == hashCode) {
                try {
                    this.f66014xf3aed220 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletFunciontList", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317482q == hashCode) {
                try {
                    this.f66016x6fd7cd82 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletFunciontList", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317483r == hashCode) {
                try {
                    this.f66013xfa13de0c = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletFunciontList", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317484s == hashCode) {
                try {
                    this.f66017xd12590f2 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletFunciontList", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317485t == hashCode) {
                try {
                    this.f66015xb2c0b684 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletFunciontList", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317486u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317489d) {
            contentValues.put("wallet_region", java.lang.Integer.valueOf(this.f66018x1cb94b75));
        }
        if (this.f317490e) {
            contentValues.put("function_list", this.f66014xf3aed220);
        }
        if (this.f317491f) {
            contentValues.put("new_list", this.f66016x6fd7cd82);
        }
        if (this.f317492g) {
            contentValues.put("banner_list", this.f66013xfa13de0c);
        }
        if (this.f317493h) {
            contentValues.put("type_name_list", this.f66017xd12590f2);
        }
        if (this.f317494i) {
            contentValues.put("isShowSetting", java.lang.Integer.valueOf(this.f66015xb2c0b684));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWalletFunciontList", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletFunciontList ( ");
        l75.e0 e0Var = f317487v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317479n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletFunciontList", "createTableSql %s", str2);
            k0Var.A("WalletFunciontList", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WalletFunciontList", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletFunciontList", "updateTableSql %s", str3);
            k0Var.A("WalletFunciontList", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletFunciontList", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317487v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317488w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f66018x1cb94b75);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317478m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317478m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wallet_region")) {
            this.f66018x1cb94b75 = contentValues.getAsInteger("wallet_region").intValue();
            if (z17) {
                this.f317489d = true;
            }
        }
        if (contentValues.containsKey("function_list")) {
            this.f66014xf3aed220 = contentValues.getAsString("function_list");
            if (z17) {
                this.f317490e = true;
            }
        }
        if (contentValues.containsKey("new_list")) {
            this.f66016x6fd7cd82 = contentValues.getAsString("new_list");
            if (z17) {
                this.f317491f = true;
            }
        }
        if (contentValues.containsKey("banner_list")) {
            this.f66013xfa13de0c = contentValues.getAsString("banner_list");
            if (z17) {
                this.f317492g = true;
            }
        }
        if (contentValues.containsKey("type_name_list")) {
            this.f66017xd12590f2 = contentValues.getAsString("type_name_list");
            if (z17) {
                this.f317493h = true;
            }
        }
        if (contentValues.containsKey("isShowSetting")) {
            this.f66015xb2c0b684 = contentValues.getAsInteger("isShowSetting").intValue();
            if (z17) {
                this.f317494i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
