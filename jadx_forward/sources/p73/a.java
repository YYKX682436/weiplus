package p73;

/* loaded from: classes8.dex */
public class a extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f434034h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f434035i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f434036m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f434037n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f434038o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f434039p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f434040q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f434041r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f434042s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f434043t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f434044u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f434045v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f434046w;

    /* renamed from: field_CommHashUserName */
    public java.lang.String f76392xdcacde15;

    /* renamed from: field_HardCodeHashUserName */
    public java.lang.String f76393xda587801;

    /* renamed from: field_HashUserName */
    public java.lang.String f76394x8d8a3769;

    /* renamed from: field_UserName */
    public java.lang.String f76395x11b86abb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f434047d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f434048e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f434049f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f434050g = true;

    static {
        p75.n0 n0Var = new p75.n0("HashUserNameMap");
        f434034h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f434035i = new p75.d("UserName", "string", tableName, "");
        f434036m = new p75.d("HashUserName", "string", tableName, "");
        f434037n = new p75.d("CommHashUserName", "string", tableName, "");
        f434038o = new p75.d("HardCodeHashUserName", "string", tableName, "");
        f434039p = new java.lang.String[0];
        f434040q = -202022634;
        f434041r = -2124511164;
        f434042s = 971458928;
        f434043t = -211304996;
        f434044u = 108705909;
        f434045v = m157935x3593deb(p73.a.class);
        f434046w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m157935x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "UserName";
        e0Var.f398488d.put("UserName", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "UserName";
        e0Var.f398487c[1] = "HashUserName";
        e0Var.f398488d.put("HashUserName", "TEXT");
        e0Var.f398487c[2] = "CommHashUserName";
        e0Var.f398488d.put("CommHashUserName", "TEXT");
        e0Var.f398487c[3] = "HardCodeHashUserName";
        e0Var.f398488d.put("HardCodeHashUserName", "TEXT");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " UserName TEXT PRIMARY KEY ,  HashUserName TEXT,  CommHashUserName TEXT,  HardCodeHashUserName TEXT";
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
            if (f434040q == hashCode) {
                try {
                    this.f76395x11b86abb = cursor.getString(i17);
                    this.f434047d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHashUserNameMap", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f434041r == hashCode) {
                try {
                    this.f76394x8d8a3769 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHashUserNameMap", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f434042s == hashCode) {
                try {
                    this.f76392xdcacde15 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHashUserNameMap", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f434043t == hashCode) {
                try {
                    this.f76393xda587801 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHashUserNameMap", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f434044u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f434047d) {
            contentValues.put("UserName", this.f76395x11b86abb);
        }
        if (this.f434048e) {
            contentValues.put("HashUserName", this.f76394x8d8a3769);
        }
        if (this.f434049f) {
            contentValues.put("CommHashUserName", this.f76392xdcacde15);
        }
        if (this.f434050g) {
            contentValues.put("HardCodeHashUserName", this.f76393xda587801);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHashUserNameMap", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HashUserNameMap ( ");
        l75.e0 e0Var = f434045v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f434039p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHashUserNameMap", "createTableSql %s", str2);
            k0Var.A("HashUserNameMap", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HashUserNameMap", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHashUserNameMap", "updateTableSql %s", str3);
            k0Var.A("HashUserNameMap", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHashUserNameMap", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f434045v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f434046w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f76395x11b86abb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f434034h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f434034h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("UserName")) {
            this.f76395x11b86abb = contentValues.getAsString("UserName");
            if (z17) {
                this.f434047d = true;
            }
        }
        if (contentValues.containsKey("HashUserName")) {
            this.f76394x8d8a3769 = contentValues.getAsString("HashUserName");
            if (z17) {
                this.f434048e = true;
            }
        }
        if (contentValues.containsKey("CommHashUserName")) {
            this.f76392xdcacde15 = contentValues.getAsString("CommHashUserName");
            if (z17) {
                this.f434049f = true;
            }
        }
        if (contentValues.containsKey("HardCodeHashUserName")) {
            this.f76393xda587801 = contentValues.getAsString("HardCodeHashUserName");
            if (z17) {
                this.f434050g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
