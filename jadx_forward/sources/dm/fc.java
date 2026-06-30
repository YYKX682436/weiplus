package dm;

/* loaded from: classes9.dex */
public class fc extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final l75.e0 H;
    public static final o75.e I;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f318485s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f318486t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318487u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318488v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318489w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318490x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f318491y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f318492z;

    /* renamed from: field_exclusiveUsername */
    public java.lang.String f66554xe4172d8f;

    /* renamed from: field_hbStatus */
    public int f66555x2592af31;

    /* renamed from: field_hbType */
    public int f66556xfcd83239;

    /* renamed from: field_invalidtime */
    public int f66557x32fdc97f;

    /* renamed from: field_mNativeUrl */
    public java.lang.String f66558xf7c5f050;

    /* renamed from: field_msgLocalId */
    public long f66559x9a279b8a;

    /* renamed from: field_msgSvrId */
    public long f66560xd09be28e;

    /* renamed from: field_receiveAmount */
    public long f66561xb3f4ee96;

    /* renamed from: field_receiveStatus */
    public int f66562xd3086e30;

    /* renamed from: field_receiveTime */
    public long f66563xee5f688b;

    /* renamed from: field_sendId */
    public java.lang.String f66564xfd345a8;

    /* renamed from: field_sender */
    public java.lang.String f66565xfd3491a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318493d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318494e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318495f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318496g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318497h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318498i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318499m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318500n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318501o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f318502p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f318503q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f318504r = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletLuckyMoney");
        f318485s = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318486t = new java.lang.String[0];
        f318487u = 1050590187;
        f318488v = -1224408236;
        f318489w = 984267035;
        f318490x = -2103439280;
        f318491y = 1505638581;
        f318492z = 131048844;
        A = -905962955;
        B = 774516116;
        C = -905963837;
        D = -952209084;
        E = -1294411543;
        F = -520067291;
        G = 108705909;
        H = m124987x3593deb(dm.fc.class);
        I = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124987x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f398487c = strArr;
        strArr[0] = "mNativeUrl";
        e0Var.f398488d.put("mNativeUrl", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "mNativeUrl";
        e0Var.f398487c[1] = "hbType";
        e0Var.f398488d.put("hbType", "INTEGER");
        e0Var.f398487c[2] = "receiveAmount";
        e0Var.f398488d.put("receiveAmount", "LONG");
        e0Var.f398487c[3] = "receiveTime";
        e0Var.f398488d.put("receiveTime", "LONG");
        e0Var.f398487c[4] = "receiveStatus";
        e0Var.f398488d.put("receiveStatus", "INTEGER");
        e0Var.f398487c[5] = "hbStatus";
        e0Var.f398488d.put("hbStatus", "INTEGER");
        e0Var.f398487c[6] = "sender";
        e0Var.f398488d.put("sender", "TEXT");
        e0Var.f398487c[7] = "exclusiveUsername";
        e0Var.f398488d.put("exclusiveUsername", "TEXT");
        e0Var.f398487c[8] = "sendId";
        e0Var.f398488d.put("sendId", "TEXT");
        e0Var.f398487c[9] = "invalidtime";
        e0Var.f398488d.put("invalidtime", "INTEGER");
        e0Var.f398487c[10] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG");
        e0Var.f398487c[11] = "msgLocalId";
        e0Var.f398488d.put("msgLocalId", "LONG");
        e0Var.f398487c[12] = "rowid";
        e0Var.f398489e = " mNativeUrl TEXT PRIMARY KEY ,  hbType INTEGER,  receiveAmount LONG,  receiveTime LONG,  receiveStatus INTEGER,  hbStatus INTEGER,  sender TEXT,  exclusiveUsername TEXT,  sendId TEXT,  invalidtime INTEGER,  msgSvrId LONG,  msgLocalId LONG";
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
            if (f318487u == hashCode) {
                try {
                    this.f66558xf7c5f050 = cursor.getString(i17);
                    this.f318493d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318488v == hashCode) {
                try {
                    this.f66556xfcd83239 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318489w == hashCode) {
                try {
                    this.f66561xb3f4ee96 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318490x == hashCode) {
                try {
                    this.f66563xee5f688b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318491y == hashCode) {
                try {
                    this.f66562xd3086e30 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318492z == hashCode) {
                try {
                    this.f66555x2592af31 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66565xfd3491a = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66554xe4172d8f = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66564xfd345a8 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66557x32fdc97f = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f66560xd09be28e = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f66559x9a279b8a = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLuckyMoney", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318493d) {
            contentValues.put("mNativeUrl", this.f66558xf7c5f050);
        }
        if (this.f318494e) {
            contentValues.put("hbType", java.lang.Integer.valueOf(this.f66556xfcd83239));
        }
        if (this.f318495f) {
            contentValues.put("receiveAmount", java.lang.Long.valueOf(this.f66561xb3f4ee96));
        }
        if (this.f318496g) {
            contentValues.put("receiveTime", java.lang.Long.valueOf(this.f66563xee5f688b));
        }
        if (this.f318497h) {
            contentValues.put("receiveStatus", java.lang.Integer.valueOf(this.f66562xd3086e30));
        }
        if (this.f318498i) {
            contentValues.put("hbStatus", java.lang.Integer.valueOf(this.f66555x2592af31));
        }
        if (this.f318499m) {
            contentValues.put("sender", this.f66565xfd3491a);
        }
        if (this.f318500n) {
            contentValues.put("exclusiveUsername", this.f66554xe4172d8f);
        }
        if (this.f318501o) {
            contentValues.put("sendId", this.f66564xfd345a8);
        }
        if (this.f318502p) {
            contentValues.put("invalidtime", java.lang.Integer.valueOf(this.f66557x32fdc97f));
        }
        if (this.f318503q) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f66560xd09be28e));
        }
        if (this.f318504r) {
            contentValues.put("msgLocalId", java.lang.Long.valueOf(this.f66559x9a279b8a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWalletLuckyMoney", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletLuckyMoney ( ");
        l75.e0 e0Var = H;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318486t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletLuckyMoney", "createTableSql %s", str2);
            k0Var.A("WalletLuckyMoney", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WalletLuckyMoney", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletLuckyMoney", "updateTableSql %s", str3);
            k0Var.A("WalletLuckyMoney", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletLuckyMoney", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return H;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return I;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66558xf7c5f050;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318485s;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318485s.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("mNativeUrl")) {
            this.f66558xf7c5f050 = contentValues.getAsString("mNativeUrl");
            if (z17) {
                this.f318493d = true;
            }
        }
        if (contentValues.containsKey("hbType")) {
            this.f66556xfcd83239 = contentValues.getAsInteger("hbType").intValue();
            if (z17) {
                this.f318494e = true;
            }
        }
        if (contentValues.containsKey("receiveAmount")) {
            this.f66561xb3f4ee96 = contentValues.getAsLong("receiveAmount").longValue();
            if (z17) {
                this.f318495f = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.f66563xee5f688b = contentValues.getAsLong("receiveTime").longValue();
            if (z17) {
                this.f318496g = true;
            }
        }
        if (contentValues.containsKey("receiveStatus")) {
            this.f66562xd3086e30 = contentValues.getAsInteger("receiveStatus").intValue();
            if (z17) {
                this.f318497h = true;
            }
        }
        if (contentValues.containsKey("hbStatus")) {
            this.f66555x2592af31 = contentValues.getAsInteger("hbStatus").intValue();
            if (z17) {
                this.f318498i = true;
            }
        }
        if (contentValues.containsKey("sender")) {
            this.f66565xfd3491a = contentValues.getAsString("sender");
            if (z17) {
                this.f318499m = true;
            }
        }
        if (contentValues.containsKey("exclusiveUsername")) {
            this.f66554xe4172d8f = contentValues.getAsString("exclusiveUsername");
            if (z17) {
                this.f318500n = true;
            }
        }
        if (contentValues.containsKey("sendId")) {
            this.f66564xfd345a8 = contentValues.getAsString("sendId");
            if (z17) {
                this.f318501o = true;
            }
        }
        if (contentValues.containsKey("invalidtime")) {
            this.f66557x32fdc97f = contentValues.getAsInteger("invalidtime").intValue();
            if (z17) {
                this.f318502p = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.f66560xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f318503q = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.f66559x9a279b8a = contentValues.getAsLong("msgLocalId").longValue();
            if (z17) {
                this.f318504r = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
