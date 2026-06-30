package dm;

/* loaded from: classes4.dex */
public class t1 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f321532h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f321533i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f321534m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f321535n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f321536o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f321537p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321538q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f321539r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f321540s;

    /* renamed from: field_card_id */
    public java.lang.String f68370x95970a65;

    /* renamed from: field_code */
    public java.lang.String f68371x225a5212;

    /* renamed from: field_code_id */
    public java.lang.String f68372xacb60e68;

    /* renamed from: field_status */
    public int f68373x10a0fed7;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321541d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321542e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321543f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321544g = true;

    static {
        p75.n0 n0Var = new p75.n0("CardQrCodeDataInfo");
        f321532h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321533i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS CardQrCodeDataInfo_card_id_index ON CardQrCodeDataInfo(card_id)"};
        f321534m = 941842605;
        f321535n = 553933994;
        f321536o = 3059181;
        f321537p = -892481550;
        f321538q = 108705909;
        f321539r = m125502x3593deb(dm.t1.class);
        f321540s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125502x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "code_id";
        e0Var.f398488d.put("code_id", "TEXT");
        e0Var.f398487c[1] = "card_id";
        e0Var.f398488d.put("card_id", "TEXT");
        e0Var.f398487c[2] = "code";
        e0Var.f398488d.put("code", "TEXT");
        e0Var.f398487c[3] = "status";
        e0Var.f398488d.put("status", "INTEGER");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " code_id TEXT,  card_id TEXT,  code TEXT,  status INTEGER";
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
            if (f321534m == hashCode) {
                try {
                    this.f68372xacb60e68 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeDataInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321535n == hashCode) {
                try {
                    this.f68370x95970a65 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeDataInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321536o == hashCode) {
                try {
                    this.f68371x225a5212 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeDataInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321537p == hashCode) {
                try {
                    this.f68373x10a0fed7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCardQrCodeDataInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321538q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321541d) {
            contentValues.put("code_id", this.f68372xacb60e68);
        }
        if (this.f321542e) {
            contentValues.put("card_id", this.f68370x95970a65);
        }
        if (this.f321543f) {
            contentValues.put("code", this.f68371x225a5212);
        }
        if (this.f321544g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f68373x10a0fed7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CardQrCodeDataInfo ( ");
        l75.e0 e0Var = f321539r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321533i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTableSql %s", str2);
            k0Var.A("CardQrCodeDataInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CardQrCodeDataInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "updateTableSql %s", str3);
            k0Var.A("CardQrCodeDataInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCardQrCodeDataInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321539r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f321540s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321532h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321532h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("code_id")) {
            this.f68372xacb60e68 = contentValues.getAsString("code_id");
            if (z17) {
                this.f321541d = true;
            }
        }
        if (contentValues.containsKey("card_id")) {
            this.f68370x95970a65 = contentValues.getAsString("card_id");
            if (z17) {
                this.f321542e = true;
            }
        }
        if (contentValues.containsKey("code")) {
            this.f68371x225a5212 = contentValues.getAsString("code");
            if (z17) {
                this.f321543f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.f68373x10a0fed7 = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f321544g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
