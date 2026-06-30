package dm;

/* loaded from: classes8.dex */
public class ac extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f317269p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f317270q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317271r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317272s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317273t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317274u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317275v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317276w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317277x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317278y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317279z;

    /* renamed from: field_bulletin_content */
    public java.lang.String f65938x24411286;

    /* renamed from: field_bulletin_scene */
    public java.lang.String f65939xc71715d9;

    /* renamed from: field_bulletin_url */
    public java.lang.String f65940x541eb1fc;

    /* renamed from: field_is_show_notice */
    public int f65941x6b1e48aa;

    /* renamed from: field_jump_url */
    public java.lang.String f65942xe902b83;

    /* renamed from: field_left_icon */
    public java.lang.String f65943x26d6cac;

    /* renamed from: field_notice_id */
    public java.lang.String f65944xbca76dd;

    /* renamed from: field_type */
    public int f65945x2262335f;

    /* renamed from: field_wording */
    public java.lang.String f65946xcf77aa53;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317280d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317281e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317282f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317283g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317284h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317285i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317286m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317287n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317288o = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletBulletin");
        f317269p = n0Var;
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
        f317270q = new java.lang.String[0];
        f317271r = 387619828;
        f317272s = -2122613279;
        f317273t = 1207108311;
        f317274u = -1155412283;
        f317275v = 1524956312;
        f317276w = 1741636017;
        f317277x = -254991906;
        f317278y = 1898728418;
        f317279z = 3575610;
        A = 108705909;
        B = m124798x3593deb(dm.ac.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124798x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "bulletin_scene";
        e0Var.f398488d.put("bulletin_scene", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "bulletin_scene";
        e0Var.f398487c[1] = "bulletin_content";
        e0Var.f398488d.put("bulletin_content", "TEXT");
        e0Var.f398487c[2] = "bulletin_url";
        e0Var.f398488d.put("bulletin_url", "TEXT");
        e0Var.f398487c[3] = "is_show_notice";
        e0Var.f398488d.put("is_show_notice", "INTEGER");
        e0Var.f398487c[4] = "wording";
        e0Var.f398488d.put("wording", "TEXT");
        e0Var.f398487c[5] = "left_icon";
        e0Var.f398488d.put("left_icon", "TEXT");
        e0Var.f398487c[6] = "jump_url";
        e0Var.f398488d.put("jump_url", "TEXT");
        e0Var.f398487c[7] = "notice_id";
        e0Var.f398488d.put("notice_id", "TEXT");
        e0Var.f398487c[8] = "type";
        e0Var.f398488d.put("type", "INTEGER default '1' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " bulletin_scene TEXT PRIMARY KEY ,  bulletin_content TEXT,  bulletin_url TEXT,  is_show_notice INTEGER,  wording TEXT,  left_icon TEXT,  jump_url TEXT,  notice_id TEXT,  type INTEGER default '1' ";
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
            if (f317271r == hashCode) {
                try {
                    this.f65939xc71715d9 = cursor.getString(i17);
                    this.f317280d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317272s == hashCode) {
                try {
                    this.f65938x24411286 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317273t == hashCode) {
                try {
                    this.f65940x541eb1fc = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317274u == hashCode) {
                try {
                    this.f65941x6b1e48aa = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317275v == hashCode) {
                try {
                    this.f65946xcf77aa53 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317276w == hashCode) {
                try {
                    this.f65943x26d6cac = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317277x == hashCode) {
                try {
                    this.f65942xe902b83 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317278y == hashCode) {
                try {
                    this.f65944xbca76dd = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317279z == hashCode) {
                try {
                    this.f65945x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletBulletin", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f317280d) {
            contentValues.put("bulletin_scene", this.f65939xc71715d9);
        }
        if (this.f317281e) {
            contentValues.put("bulletin_content", this.f65938x24411286);
        }
        if (this.f317282f) {
            contentValues.put("bulletin_url", this.f65940x541eb1fc);
        }
        if (this.f317283g) {
            contentValues.put("is_show_notice", java.lang.Integer.valueOf(this.f65941x6b1e48aa));
        }
        if (this.f317284h) {
            contentValues.put("wording", this.f65946xcf77aa53);
        }
        if (this.f317285i) {
            contentValues.put("left_icon", this.f65943x26d6cac);
        }
        if (this.f317286m) {
            contentValues.put("jump_url", this.f65942xe902b83);
        }
        if (this.f317287n) {
            contentValues.put("notice_id", this.f65944xbca76dd);
        }
        if (this.f317288o) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f65945x2262335f));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWalletBulletin", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletBulletin ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317270q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletBulletin", "createTableSql %s", str2);
            k0Var.A("WalletBulletin", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WalletBulletin", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletBulletin", "updateTableSql %s", str3);
            k0Var.A("WalletBulletin", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletBulletin", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f65939xc71715d9;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317269p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317269p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bulletin_scene")) {
            this.f65939xc71715d9 = contentValues.getAsString("bulletin_scene");
            if (z17) {
                this.f317280d = true;
            }
        }
        if (contentValues.containsKey("bulletin_content")) {
            this.f65938x24411286 = contentValues.getAsString("bulletin_content");
            if (z17) {
                this.f317281e = true;
            }
        }
        if (contentValues.containsKey("bulletin_url")) {
            this.f65940x541eb1fc = contentValues.getAsString("bulletin_url");
            if (z17) {
                this.f317282f = true;
            }
        }
        if (contentValues.containsKey("is_show_notice")) {
            this.f65941x6b1e48aa = contentValues.getAsInteger("is_show_notice").intValue();
            if (z17) {
                this.f317283g = true;
            }
        }
        if (contentValues.containsKey("wording")) {
            this.f65946xcf77aa53 = contentValues.getAsString("wording");
            if (z17) {
                this.f317284h = true;
            }
        }
        if (contentValues.containsKey("left_icon")) {
            this.f65943x26d6cac = contentValues.getAsString("left_icon");
            if (z17) {
                this.f317285i = true;
            }
        }
        if (contentValues.containsKey("jump_url")) {
            this.f65942xe902b83 = contentValues.getAsString("jump_url");
            if (z17) {
                this.f317286m = true;
            }
        }
        if (contentValues.containsKey("notice_id")) {
            this.f65944xbca76dd = contentValues.getAsString("notice_id");
            if (z17) {
                this.f317287n = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f65945x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f317288o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
