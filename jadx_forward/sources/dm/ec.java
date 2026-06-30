package dm;

/* loaded from: classes14.dex */
public class ec extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f318245J;
    public static final l75.e0 K;
    public static final o75.e L;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f318246p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f318247q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f318248r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f318249s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f318250t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f318251u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f318252v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f318253w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f318254x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f318255y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f318256z;

    /* renamed from: field_msgDate */
    private int f66450xc4a3108a;

    /* renamed from: field_msgLocalId */
    private long f66451x9a279b8a;

    /* renamed from: field_msgTime */
    private long f66452xc4aa73a9;

    /* renamed from: field_talker */
    private java.lang.String f66453x114ef53e;

    /* renamed from: field_tradeAmount */
    private long f66454xc1eceb17;

    /* renamed from: field_tradeDirection */
    private int f66455xf1860060;

    /* renamed from: field_tradeType */
    private int f66456xc77ecdb9;

    /* renamed from: field_tradeUser */
    private java.lang.String f66457xc77f2a4a;

    /* renamed from: field_transferId */
    private java.lang.String f66458x5231a6cb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318257d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318258e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318259f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318260g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318261h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318262i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318263m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f318264n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f318265o = false;

    static {
        p75.n0 n0Var = new p75.n0("WalletLedgerRecord");
        f318246p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318247q = new p75.d("transferId", "string", tableName, "");
        p75.d dVar = new p75.d("talker", "string", tableName, "");
        f318248r = dVar;
        p75.d dVar2 = new p75.d("msgTime", "long", tableName, "");
        f318249s = dVar2;
        p75.d dVar3 = new p75.d("msgDate", "int", tableName, "");
        f318250t = dVar3;
        f318251u = new p75.d("msgLocalId", "long", tableName, "");
        f318252v = new p75.d("tradeUser", "string", tableName, "");
        p75.d dVar4 = new p75.d("tradeType", "int", tableName, "");
        f318253w = dVar4;
        f318254x = new p75.d("tradeAmount", "long", tableName, "");
        f318255y = new p75.d("tradeDirection", "int", tableName, "");
        p75.v f17 = n0Var.f("talkerTimeIndex");
        f17.b(dVar, dVar2);
        p75.w a17 = f17.a();
        p75.v f18 = n0Var.f("talkerDateIndex");
        f18.b(dVar, dVar3);
        p75.w a18 = f18.a();
        p75.v f19 = n0Var.f("talkerTypeTimeIndex");
        f19.b(dVar, dVar4, dVar2);
        f318256z = new java.lang.String[]{a17.f434169a, a18.f434169a, f19.a().f434169a};
        A = -1727368602;
        B = -881080743;
        C = 1343735278;
        D = 1343251151;
        E = -520067291;
        F = 752942927;
        G = 752919230;
        H = 1445827292;
        I = 1099531899;
        f318245J = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "transferId";
        ((java.util.HashMap) e0Var.f398488d).put("transferId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "transferId";
        e0Var.f398487c[1] = "talker";
        ((java.util.HashMap) e0Var.f398488d).put("talker", "TEXT");
        e0Var.f398487c[2] = "msgTime";
        ((java.util.HashMap) e0Var.f398488d).put("msgTime", "LONG default '-1' ");
        e0Var.f398487c[3] = "msgDate";
        ((java.util.HashMap) e0Var.f398488d).put("msgDate", "INTEGER default '-1' ");
        e0Var.f398487c[4] = "msgLocalId";
        ((java.util.HashMap) e0Var.f398488d).put("msgLocalId", "LONG default '-1' ");
        e0Var.f398487c[5] = "tradeUser";
        ((java.util.HashMap) e0Var.f398488d).put("tradeUser", "TEXT");
        e0Var.f398487c[6] = "tradeType";
        ((java.util.HashMap) e0Var.f398488d).put("tradeType", "INTEGER default '-1' ");
        e0Var.f398487c[7] = "tradeAmount";
        ((java.util.HashMap) e0Var.f398488d).put("tradeAmount", "LONG default '-1' ");
        e0Var.f398487c[8] = "tradeDirection";
        ((java.util.HashMap) e0Var.f398488d).put("tradeDirection", "INTEGER default '-1' ");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " transferId TEXT PRIMARY KEY ,  talker TEXT,  msgTime LONG default '-1' ,  msgDate INTEGER default '-1' ,  msgLocalId LONG default '-1' ,  tradeUser TEXT,  tradeType INTEGER default '-1' ,  tradeAmount LONG default '-1' ,  tradeDirection INTEGER default '-1' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        K = e0Var;
        L = new o75.e();
    }

    public static final p75.l0 G0(java.lang.String str) {
        p75.i0 i17 = f318246p.i();
        i17.f434190d = f318247q.j(str);
        i17.f434189c = "MicroMsg.SDK.BaseWalletLedgerRecord";
        return i17.a();
    }

    public int A0() {
        return this.f66456xc77ecdb9;
    }

    public java.lang.String D0() {
        return this.f66457xc77f2a4a;
    }

    public java.lang.String F0() {
        return this.f66458x5231a6cb;
    }

    public void I0(int i17) {
        this.f66450xc4a3108a = i17;
        this.f318260g = true;
    }

    public void J0(long j17) {
        this.f66451x9a279b8a = j17;
        this.f318261h = true;
    }

    public void L0(long j17) {
        this.f66452xc4aa73a9 = j17;
        this.f318259f = true;
    }

    public void P0(java.lang.String str) {
        this.f66453x114ef53e = str;
        this.f318258e = true;
    }

    public void Q0(long j17) {
        this.f66454xc1eceb17 = j17;
        this.f318264n = true;
    }

    public void R0(int i17) {
        this.f66455xf1860060 = i17;
        this.f318265o = true;
    }

    public void T0(int i17) {
        this.f66456xc77ecdb9 = i17;
        this.f318263m = true;
    }

    public void U0(java.lang.String str) {
        this.f66457xc77f2a4a = str;
        this.f318262i = true;
    }

    public void W0(java.lang.String str) {
        this.f66458x5231a6cb = str;
        this.f318257d = true;
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
            if (A == hashCode) {
                try {
                    this.f66458x5231a6cb = cursor.getString(i17);
                    this.f318257d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66453x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66452xc4aa73a9 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66450xc4a3108a = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f66451x9a279b8a = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f66457xc77f2a4a = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f66456xc77ecdb9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f66454xc1eceb17 = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f66455xf1860060 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWalletLedgerRecord", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318245J == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318257d) {
            contentValues.put("transferId", this.f66458x5231a6cb);
        }
        if (this.f318258e) {
            contentValues.put("talker", this.f66453x114ef53e);
        }
        if (this.f318259f) {
            contentValues.put("msgTime", java.lang.Long.valueOf(this.f66452xc4aa73a9));
        }
        if (this.f318260g) {
            contentValues.put("msgDate", java.lang.Integer.valueOf(this.f66450xc4a3108a));
        }
        if (this.f318261h) {
            contentValues.put("msgLocalId", java.lang.Long.valueOf(this.f66451x9a279b8a));
        }
        if (this.f318262i) {
            contentValues.put("tradeUser", this.f66457xc77f2a4a);
        }
        if (this.f318263m) {
            contentValues.put("tradeType", java.lang.Integer.valueOf(this.f66456xc77ecdb9));
        }
        if (this.f318264n) {
            contentValues.put("tradeAmount", java.lang.Long.valueOf(this.f66454xc1eceb17));
        }
        if (this.f318265o) {
            contentValues.put("tradeDirection", java.lang.Integer.valueOf(this.f66455xf1860060));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWalletLedgerRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletLedgerRecord ( ");
        l75.e0 e0Var = K;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318256z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletLedgerRecord", "createTableSql %s", str2);
            k0Var.A("WalletLedgerRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WalletLedgerRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletLedgerRecord", "updateTableSql %s", str3);
            k0Var.A("WalletLedgerRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWalletLedgerRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return L;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66458x5231a6cb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318246p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318246p.f434209a;
    }

    /* renamed from: insertToDB */
    public long m124959x39969692(l75.k0 k0Var, boolean z17) {
        m75.c cVar;
        if (z17) {
            o75.c cVar2 = new o75.c(o75.b.f425115c, java.lang.String.valueOf(this.f66458x5231a6cb), "MicroMsg.SDK.BaseWalletLedgerRecord");
            cVar2.f425123d = this;
            cVar = new m75.c(this, true, cVar2, L, "MicroMsg.SDK.BaseWalletLedgerRecord");
        } else {
            cVar = new m75.c(this, true, null, null, "MicroMsg.SDK.BaseWalletLedgerRecord");
        }
        return cVar.a(k0Var);
    }

    public int t0() {
        return this.f66450xc4a3108a;
    }

    public long u0() {
        return this.f66451x9a279b8a;
    }

    /* renamed from: updateToDB */
    public int m124960xee5c84a2(l75.k0 k0Var, boolean z17) {
        m75.e eVar;
        if (z17) {
            o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(this.f66458x5231a6cb), "MicroMsg.SDK.BaseWalletLedgerRecord");
            cVar.f425123d = this;
            eVar = new m75.e(this, cVar, L, "MicroMsg.SDK.BaseWalletLedgerRecord");
        } else {
            eVar = new m75.e(this, null, null, "MicroMsg.SDK.BaseWalletLedgerRecord");
        }
        return eVar.a(k0Var);
    }

    public long v0() {
        return this.f66452xc4aa73a9;
    }

    public java.lang.String w0() {
        return this.f66453x114ef53e;
    }

    public long y0() {
        return this.f66454xc1eceb17;
    }

    public int z0() {
        return this.f66455xf1860060;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("transferId")) {
            this.f66458x5231a6cb = contentValues.getAsString("transferId");
            if (z17) {
                this.f318257d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f66453x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f318258e = true;
            }
        }
        if (contentValues.containsKey("msgTime")) {
            this.f66452xc4aa73a9 = contentValues.getAsLong("msgTime").longValue();
            if (z17) {
                this.f318259f = true;
            }
        }
        if (contentValues.containsKey("msgDate")) {
            this.f66450xc4a3108a = contentValues.getAsInteger("msgDate").intValue();
            if (z17) {
                this.f318260g = true;
            }
        }
        if (contentValues.containsKey("msgLocalId")) {
            this.f66451x9a279b8a = contentValues.getAsLong("msgLocalId").longValue();
            if (z17) {
                this.f318261h = true;
            }
        }
        if (contentValues.containsKey("tradeUser")) {
            this.f66457xc77f2a4a = contentValues.getAsString("tradeUser");
            if (z17) {
                this.f318262i = true;
            }
        }
        if (contentValues.containsKey("tradeType")) {
            this.f66456xc77ecdb9 = contentValues.getAsInteger("tradeType").intValue();
            if (z17) {
                this.f318263m = true;
            }
        }
        if (contentValues.containsKey("tradeAmount")) {
            this.f66454xc1eceb17 = contentValues.getAsLong("tradeAmount").longValue();
            if (z17) {
                this.f318264n = true;
            }
        }
        if (contentValues.containsKey("tradeDirection")) {
            this.f66455xf1860060 = contentValues.getAsInteger("tradeDirection").intValue();
            if (z17) {
                this.f318265o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
