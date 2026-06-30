package dm;

/* loaded from: classes9.dex */
public class gc extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f318756p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f318757q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318758r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318759s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318760t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318761u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318762v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318763w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318764x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318765y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318766z;

    /* renamed from: field_is_show */
    public int f66695xf0aedead;

    /* renamed from: field_jump_type */
    public int f66696xc374eba6;

    /* renamed from: field_logo_url */
    public java.lang.String f66697x96a1f680;

    /* renamed from: field_pref_desc */
    public java.lang.String f66698x4d221e28;

    /* renamed from: field_pref_key */
    public java.lang.String f66699xd0f0afe8;

    /* renamed from: field_pref_title */
    public java.lang.String f66700x5804f5a1;

    /* renamed from: field_pref_url */
    public java.lang.String f66701xd0f0d6f8;

    /* renamed from: field_tinyapp_path */
    public java.lang.String f66702xebf8d1a8;

    /* renamed from: field_tinyapp_username */
    public java.lang.String f66703x61257cd9;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318767d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318768e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318769f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318770g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318771h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318772i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318773m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318774n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318775o = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletPrefInfo");
        f318756p = n0Var;
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
        f318757q = new java.lang.String[0];
        f318758r = -1288853949;
        f318759s = -1629634244;
        f318760t = -1288843949;
        f318761u = 2082222322;
        f318762v = -1299975379;
        f318763w = 2027875547;
        f318764x = 685162667;
        f318765y = -1101010892;
        f318766z = -540204413;
        A = 108705909;
        B = m125014x3593deb(dm.gc.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125014x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "pref_key";
        e0Var.f398488d.put("pref_key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "pref_key";
        e0Var.f398487c[1] = "pref_title";
        e0Var.f398488d.put("pref_title", "TEXT");
        e0Var.f398487c[2] = "pref_url";
        e0Var.f398488d.put("pref_url", "TEXT");
        e0Var.f398487c[3] = "is_show";
        e0Var.f398488d.put("is_show", "INTEGER default '1' ");
        e0Var.f398487c[4] = "pref_desc";
        e0Var.f398488d.put("pref_desc", "TEXT");
        e0Var.f398487c[5] = "logo_url";
        e0Var.f398488d.put("logo_url", "TEXT");
        e0Var.f398487c[6] = "jump_type";
        e0Var.f398488d.put("jump_type", "INTEGER");
        e0Var.f398487c[7] = "tinyapp_username";
        e0Var.f398488d.put("tinyapp_username", "TEXT");
        e0Var.f398487c[8] = "tinyapp_path";
        e0Var.f398488d.put("tinyapp_path", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " pref_key TEXT PRIMARY KEY ,  pref_title TEXT,  pref_url TEXT,  is_show INTEGER default '1' ,  pref_desc TEXT,  logo_url TEXT,  jump_type INTEGER,  tinyapp_username TEXT,  tinyapp_path TEXT";
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
            if (f318758r == hashCode) {
                try {
                    this.f66699xd0f0afe8 = cursor.getString(i17);
                    this.f318767d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318759s == hashCode) {
                try {
                    this.f66700x5804f5a1 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318760t == hashCode) {
                try {
                    this.f66701xd0f0d6f8 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318761u == hashCode) {
                try {
                    this.f66695xf0aedead = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318762v == hashCode) {
                try {
                    this.f66698x4d221e28 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318763w == hashCode) {
                try {
                    this.f66697x96a1f680 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318764x == hashCode) {
                try {
                    this.f66696xc374eba6 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318765y == hashCode) {
                try {
                    this.f66703x61257cd9 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318766z == hashCode) {
                try {
                    this.f66702xebf8d1a8 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletPrefInfo", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f318767d) {
            contentValues.put("pref_key", this.f66699xd0f0afe8);
        }
        if (this.f318768e) {
            contentValues.put("pref_title", this.f66700x5804f5a1);
        }
        if (this.f318769f) {
            contentValues.put("pref_url", this.f66701xd0f0d6f8);
        }
        if (this.f318770g) {
            contentValues.put("is_show", java.lang.Integer.valueOf(this.f66695xf0aedead));
        }
        if (this.f318771h) {
            contentValues.put("pref_desc", this.f66698x4d221e28);
        }
        if (this.f318772i) {
            contentValues.put("logo_url", this.f66697x96a1f680);
        }
        if (this.f318773m) {
            contentValues.put("jump_type", java.lang.Integer.valueOf(this.f66696xc374eba6));
        }
        if (this.f318774n) {
            contentValues.put("tinyapp_username", this.f66703x61257cd9);
        }
        if (this.f318775o) {
            contentValues.put("tinyapp_path", this.f66702xebf8d1a8);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWalletPrefInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletPrefInfo ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318757q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletPrefInfo", "createTableSql %s", str2);
            k0Var.A("WalletPrefInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WalletPrefInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletPrefInfo", "updateTableSql %s", str3);
            k0Var.A("WalletPrefInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletPrefInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f66699xd0f0afe8;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318756p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318756p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("pref_key")) {
            this.f66699xd0f0afe8 = contentValues.getAsString("pref_key");
            if (z17) {
                this.f318767d = true;
            }
        }
        if (contentValues.containsKey("pref_title")) {
            this.f66700x5804f5a1 = contentValues.getAsString("pref_title");
            if (z17) {
                this.f318768e = true;
            }
        }
        if (contentValues.containsKey("pref_url")) {
            this.f66701xd0f0d6f8 = contentValues.getAsString("pref_url");
            if (z17) {
                this.f318769f = true;
            }
        }
        if (contentValues.containsKey("is_show")) {
            this.f66695xf0aedead = contentValues.getAsInteger("is_show").intValue();
            if (z17) {
                this.f318770g = true;
            }
        }
        if (contentValues.containsKey("pref_desc")) {
            this.f66698x4d221e28 = contentValues.getAsString("pref_desc");
            if (z17) {
                this.f318771h = true;
            }
        }
        if (contentValues.containsKey("logo_url")) {
            this.f66697x96a1f680 = contentValues.getAsString("logo_url");
            if (z17) {
                this.f318772i = true;
            }
        }
        if (contentValues.containsKey("jump_type")) {
            this.f66696xc374eba6 = contentValues.getAsInteger("jump_type").intValue();
            if (z17) {
                this.f318773m = true;
            }
        }
        if (contentValues.containsKey("tinyapp_username")) {
            this.f66703x61257cd9 = contentValues.getAsString("tinyapp_username");
            if (z17) {
                this.f318774n = true;
            }
        }
        if (contentValues.containsKey("tinyapp_path")) {
            this.f66702xebf8d1a8 = contentValues.getAsString("tinyapp_path");
            if (z17) {
                this.f318775o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
