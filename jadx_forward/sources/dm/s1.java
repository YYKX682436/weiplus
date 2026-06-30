package dm;

/* loaded from: classes4.dex */
public class s1 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f321302n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f321303o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321304p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321305q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321306r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321307s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321308t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321309u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321310v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321311w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f321312x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f321313y;

    /* renamed from: field_card_id */
    public java.lang.String f68236x95970a65;

    /* renamed from: field_expire_time_interval */
    public int f68237xa7f540fc;

    /* renamed from: field_fetch_time */
    public long f68238xcb645d97;

    /* renamed from: field_lower_bound */
    public int f68239x45f51afb;

    /* renamed from: field_need_insert_show_timestamp */
    public boolean f68240xd5964816;

    /* renamed from: field_show_expire_interval */
    public int f68241x9c21bcc8;

    /* renamed from: field_show_timestamp_encrypt_key */
    public java.lang.String f68242xdde7b67f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321314d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321315e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321316f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321317g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321318h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321319i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321320m = true;

    static {
        p75.n0 n0Var = new p75.n0("CardQrCodeConfi");
        f321302n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321303o = new java.lang.String[0];
        f321304p = 553933994;
        f321305q = -634010944;
        f321306r = -162366031;
        f321307s = -22811622;
        f321308t = -1056667945;
        f321309u = -1255079261;
        f321310v = 305998130;
        f321311w = 108705909;
        f321312x = m125464x3593deb(dm.s1.class);
        f321313y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125464x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "card_id";
        e0Var.f398488d.put("card_id", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "card_id";
        e0Var.f398487c[1] = "lower_bound";
        e0Var.f398488d.put("lower_bound", "INTEGER");
        e0Var.f398487c[2] = "need_insert_show_timestamp";
        e0Var.f398488d.put("need_insert_show_timestamp", "INTEGER default 'false' ");
        e0Var.f398487c[3] = "show_timestamp_encrypt_key";
        e0Var.f398488d.put("show_timestamp_encrypt_key", "TEXT");
        e0Var.f398487c[4] = "expire_time_interval";
        e0Var.f398488d.put("expire_time_interval", "INTEGER");
        e0Var.f398487c[5] = "show_expire_interval";
        e0Var.f398488d.put("show_expire_interval", "INTEGER");
        e0Var.f398487c[6] = "fetch_time";
        e0Var.f398488d.put("fetch_time", "LONG");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " card_id TEXT PRIMARY KEY ,  lower_bound INTEGER,  need_insert_show_timestamp INTEGER default 'false' ,  show_timestamp_encrypt_key TEXT,  expire_time_interval INTEGER,  show_expire_interval INTEGER,  fetch_time LONG";
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
            boolean z17 = true;
            if (f321304p == hashCode) {
                try {
                    this.f68236x95970a65 = cursor.getString(i17);
                    this.f321314d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321305q == hashCode) {
                try {
                    this.f68239x45f51afb = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321306r == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68240xd5964816 = z17;
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321307s == hashCode) {
                try {
                    this.f68242xdde7b67f = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321308t == hashCode) {
                try {
                    this.f68237xa7f540fc = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321309u == hashCode) {
                try {
                    this.f68241x9c21bcc8 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321310v == hashCode) {
                try {
                    this.f68238xcb645d97 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeConfi", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321311w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321314d) {
            contentValues.put("card_id", this.f68236x95970a65);
        }
        if (this.f321315e) {
            contentValues.put("lower_bound", java.lang.Integer.valueOf(this.f68239x45f51afb));
        }
        if (this.f321316f) {
            if (this.f68240xd5964816) {
                contentValues.put("need_insert_show_timestamp", (java.lang.Integer) 1);
            } else {
                contentValues.put("need_insert_show_timestamp", (java.lang.Integer) 0);
            }
        }
        if (this.f321317g) {
            contentValues.put("show_timestamp_encrypt_key", this.f68242xdde7b67f);
        }
        if (this.f321318h) {
            contentValues.put("expire_time_interval", java.lang.Integer.valueOf(this.f68237xa7f540fc));
        }
        if (this.f321319i) {
            contentValues.put("show_expire_interval", java.lang.Integer.valueOf(this.f68241x9c21bcc8));
        }
        if (this.f321320m) {
            contentValues.put("fetch_time", java.lang.Long.valueOf(this.f68238xcb645d97));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCardQrCodeConfi", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CardQrCodeConfi ( ");
        l75.e0 e0Var = f321312x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321303o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCardQrCodeConfi", "createTableSql %s", str2);
            k0Var.A("CardQrCodeConfi", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CardQrCodeConfi", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCardQrCodeConfi", "updateTableSql %s", str3);
            k0Var.A("CardQrCodeConfi", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCardQrCodeConfi", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321312x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321313y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68236x95970a65;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321302n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321302n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("card_id")) {
            this.f68236x95970a65 = contentValues.getAsString("card_id");
            if (z17) {
                this.f321314d = true;
            }
        }
        if (contentValues.containsKey("lower_bound")) {
            this.f68239x45f51afb = contentValues.getAsInteger("lower_bound").intValue();
            if (z17) {
                this.f321315e = true;
            }
        }
        if (contentValues.containsKey("need_insert_show_timestamp")) {
            this.f68240xd5964816 = contentValues.getAsInteger("need_insert_show_timestamp").intValue() != 0;
            if (z17) {
                this.f321316f = true;
            }
        }
        if (contentValues.containsKey("show_timestamp_encrypt_key")) {
            this.f68242xdde7b67f = contentValues.getAsString("show_timestamp_encrypt_key");
            if (z17) {
                this.f321317g = true;
            }
        }
        if (contentValues.containsKey("expire_time_interval")) {
            this.f68237xa7f540fc = contentValues.getAsInteger("expire_time_interval").intValue();
            if (z17) {
                this.f321318h = true;
            }
        }
        if (contentValues.containsKey("show_expire_interval")) {
            this.f68241x9c21bcc8 = contentValues.getAsInteger("show_expire_interval").intValue();
            if (z17) {
                this.f321319i = true;
            }
        }
        if (contentValues.containsKey("fetch_time")) {
            this.f68238xcb645d97 = contentValues.getAsLong("fetch_time").longValue();
            if (z17) {
                this.f321320m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
