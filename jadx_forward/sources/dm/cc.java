package dm;

/* loaded from: classes8.dex */
public class cc extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f317760m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f317761n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317762o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317763p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317764q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317765r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317766s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317767t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317768u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f317769v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f317770w;

    /* renamed from: field_wallet_balance */
    public int f66179x257bda7b;

    /* renamed from: field_wallet_name */
    public java.lang.String f66180x3bf5cb4c;

    /* renamed from: field_wallet_selected */
    public int f66181x43bffadc;

    /* renamed from: field_wallet_tpa_country */
    public java.lang.String f66182x601e0edb;

    /* renamed from: field_wallet_tpa_country_mask */
    public int f66183x619dc1d0;

    /* renamed from: field_wallet_type */
    public int f66184x3bf8dffb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317771d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317772e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317773f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317774g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317775h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317776i = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletKindInfo");
        f317760m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317761n = new java.lang.String[0];
        f317762o = 1483411318;
        f317763p = -801536064;
        f317764q = -801737967;
        f317765r = -198363103;
        f317766s = 1971282070;
        f317767t = -1712330219;
        f317768u = 108705909;
        f317769v = m124859x3593deb(dm.cc.class);
        f317770w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124859x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "wallet_tpa_country";
        e0Var.f398488d.put("wallet_tpa_country", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "wallet_tpa_country";
        e0Var.f398487c[1] = "wallet_type";
        e0Var.f398488d.put("wallet_type", "INTEGER");
        e0Var.f398487c[2] = "wallet_name";
        e0Var.f398488d.put("wallet_name", "TEXT");
        e0Var.f398487c[3] = "wallet_selected";
        e0Var.f398488d.put("wallet_selected", "INTEGER");
        e0Var.f398487c[4] = "wallet_balance";
        e0Var.f398488d.put("wallet_balance", "INTEGER");
        e0Var.f398487c[5] = "wallet_tpa_country_mask";
        e0Var.f398488d.put("wallet_tpa_country_mask", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " wallet_tpa_country TEXT PRIMARY KEY ,  wallet_type INTEGER,  wallet_name TEXT,  wallet_selected INTEGER,  wallet_balance INTEGER,  wallet_tpa_country_mask INTEGER";
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
            if (f317762o == hashCode) {
                try {
                    this.f66182x601e0edb = cursor.getString(i17);
                    this.f317771d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletKindInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317763p == hashCode) {
                try {
                    this.f66184x3bf8dffb = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletKindInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317764q == hashCode) {
                try {
                    this.f66180x3bf5cb4c = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletKindInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317765r == hashCode) {
                try {
                    this.f66181x43bffadc = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletKindInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317766s == hashCode) {
                try {
                    this.f66179x257bda7b = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletKindInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317767t == hashCode) {
                try {
                    this.f66183x619dc1d0 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletKindInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317768u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317771d) {
            contentValues.put("wallet_tpa_country", this.f66182x601e0edb);
        }
        if (this.f317772e) {
            contentValues.put("wallet_type", java.lang.Integer.valueOf(this.f66184x3bf8dffb));
        }
        if (this.f317773f) {
            contentValues.put("wallet_name", this.f66180x3bf5cb4c);
        }
        if (this.f317774g) {
            contentValues.put("wallet_selected", java.lang.Integer.valueOf(this.f66181x43bffadc));
        }
        if (this.f317775h) {
            contentValues.put("wallet_balance", java.lang.Integer.valueOf(this.f66179x257bda7b));
        }
        if (this.f317776i) {
            contentValues.put("wallet_tpa_country_mask", java.lang.Integer.valueOf(this.f66183x619dc1d0));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWalletKindInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletKindInfo ( ");
        l75.e0 e0Var = f317769v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317761n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletKindInfo", "createTableSql %s", str2);
            k0Var.A("WalletKindInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WalletKindInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletKindInfo", "updateTableSql %s", str3);
            k0Var.A("WalletKindInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletKindInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317769v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317770w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66182x601e0edb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317760m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317760m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("wallet_tpa_country")) {
            this.f66182x601e0edb = contentValues.getAsString("wallet_tpa_country");
            if (z17) {
                this.f317771d = true;
            }
        }
        if (contentValues.containsKey("wallet_type")) {
            this.f66184x3bf8dffb = contentValues.getAsInteger("wallet_type").intValue();
            if (z17) {
                this.f317772e = true;
            }
        }
        if (contentValues.containsKey("wallet_name")) {
            this.f66180x3bf5cb4c = contentValues.getAsString("wallet_name");
            if (z17) {
                this.f317773f = true;
            }
        }
        if (contentValues.containsKey("wallet_selected")) {
            this.f66181x43bffadc = contentValues.getAsInteger("wallet_selected").intValue();
            if (z17) {
                this.f317774g = true;
            }
        }
        if (contentValues.containsKey("wallet_balance")) {
            this.f66179x257bda7b = contentValues.getAsInteger("wallet_balance").intValue();
            if (z17) {
                this.f317775h = true;
            }
        }
        if (contentValues.containsKey("wallet_tpa_country_mask")) {
            this.f66183x619dc1d0 = contentValues.getAsInteger("wallet_tpa_country_mask").intValue();
            if (z17) {
                this.f317776i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
