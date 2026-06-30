package dm;

/* loaded from: classes9.dex */
public class u9 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f321915p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f321916q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321917r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321918s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321919t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321920u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321921v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321922w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321923x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321924y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321925z;

    /* renamed from: field_hasClicked */
    public boolean f68614x65958892;

    /* renamed from: field_invalidtime */
    public long f68615x32fdc97f;

    /* renamed from: field_isSend */
    public boolean f68616xff7bdab7;

    /* renamed from: field_locaMsgId */
    public long f68617x512156d6;

    /* renamed from: field_receiveStatus */
    public int f68618xd3086e30;

    /* renamed from: field_receiveTime */
    public long f68619xee5f688b;

    /* renamed from: field_receiverName */
    public java.lang.String f68620xdf27f83f;

    /* renamed from: field_talker */
    public java.lang.String f68621x114ef53e;

    /* renamed from: field_transferId */
    public java.lang.String f68622x5231a6cb;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321926d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321927e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321928f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321929g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321930h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321931i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321932m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321933n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321934o = true;

    static {
        p75.n0 n0Var = new p75.n0("RemittanceRecord");
        f321915p = n0Var;
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
        f321916q = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS remittance_record_status_index ON RemittanceRecord(receiveStatus)", "CREATE INDEX IF NOT EXISTS remittance_record_talker_index ON RemittanceRecord(talker)"};
        f321917r = -1727368602;
        f321918s = -1232917541;
        f321919t = 1505638581;
        f321920u = -1180128302;
        f321921v = -881080743;
        f321922w = -952209084;
        f321923x = -755218150;
        f321924y = -1402055635;
        f321925z = -2103439280;
        A = 108705909;
        B = m125543x3593deb(dm.u9.class);
        C = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125543x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "transferId";
        e0Var.f398488d.put("transferId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "transferId";
        e0Var.f398487c[1] = "locaMsgId";
        e0Var.f398488d.put("locaMsgId", "LONG");
        e0Var.f398487c[2] = "receiveStatus";
        e0Var.f398488d.put("receiveStatus", "INTEGER default '-1' ");
        e0Var.f398487c[3] = "isSend";
        e0Var.f398488d.put("isSend", "INTEGER");
        e0Var.f398487c[4] = "talker";
        e0Var.f398488d.put("talker", "TEXT");
        e0Var.f398487c[5] = "invalidtime";
        e0Var.f398488d.put("invalidtime", "LONG");
        e0Var.f398487c[6] = "receiverName";
        e0Var.f398488d.put("receiverName", "TEXT");
        e0Var.f398487c[7] = "hasClicked";
        e0Var.f398488d.put("hasClicked", "INTEGER");
        e0Var.f398487c[8] = "receiveTime";
        e0Var.f398488d.put("receiveTime", "LONG");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " transferId TEXT PRIMARY KEY ,  locaMsgId LONG,  receiveStatus INTEGER default '-1' ,  isSend INTEGER,  talker TEXT,  invalidtime LONG,  receiverName TEXT,  hasClicked INTEGER,  receiveTime LONG";
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
            if (f321917r == hashCode) {
                try {
                    this.f68622x5231a6cb = cursor.getString(i17);
                    this.f321926d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321918s == hashCode) {
                try {
                    this.f68617x512156d6 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321919t == hashCode) {
                try {
                    this.f68618xd3086e30 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321920u == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68616xff7bdab7 = z17;
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321921v == hashCode) {
                try {
                    this.f68621x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321922w == hashCode) {
                try {
                    this.f68615x32fdc97f = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321923x == hashCode) {
                try {
                    this.f68620xdf27f83f = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321924y == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f68614x65958892 = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321925z == hashCode) {
                try {
                    this.f68619xee5f688b = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseRemittanceRecord", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f321926d) {
            contentValues.put("transferId", this.f68622x5231a6cb);
        }
        if (this.f321927e) {
            contentValues.put("locaMsgId", java.lang.Long.valueOf(this.f68617x512156d6));
        }
        if (this.f321928f) {
            contentValues.put("receiveStatus", java.lang.Integer.valueOf(this.f68618xd3086e30));
        }
        if (this.f321929g) {
            if (this.f68616xff7bdab7) {
                contentValues.put("isSend", (java.lang.Integer) 1);
            } else {
                contentValues.put("isSend", (java.lang.Integer) 0);
            }
        }
        if (this.f321930h) {
            contentValues.put("talker", this.f68621x114ef53e);
        }
        if (this.f321931i) {
            contentValues.put("invalidtime", java.lang.Long.valueOf(this.f68615x32fdc97f));
        }
        if (this.f321932m) {
            contentValues.put("receiverName", this.f68620xdf27f83f);
        }
        if (this.f321933n) {
            if (this.f68614x65958892) {
                contentValues.put("hasClicked", (java.lang.Integer) 1);
            } else {
                contentValues.put("hasClicked", (java.lang.Integer) 0);
            }
        }
        if (this.f321934o) {
            contentValues.put("receiveTime", java.lang.Long.valueOf(this.f68619xee5f688b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseRemittanceRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS RemittanceRecord ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321916q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRemittanceRecord", "createTableSql %s", str2);
            k0Var.A("RemittanceRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "RemittanceRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRemittanceRecord", "updateTableSql %s", str3);
            k0Var.A("RemittanceRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseRemittanceRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return this.f68622x5231a6cb;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321915p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321915p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("transferId")) {
            this.f68622x5231a6cb = contentValues.getAsString("transferId");
            if (z17) {
                this.f321926d = true;
            }
        }
        if (contentValues.containsKey("locaMsgId")) {
            this.f68617x512156d6 = contentValues.getAsLong("locaMsgId").longValue();
            if (z17) {
                this.f321927e = true;
            }
        }
        if (contentValues.containsKey("receiveStatus")) {
            this.f68618xd3086e30 = contentValues.getAsInteger("receiveStatus").intValue();
            if (z17) {
                this.f321928f = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.f68616xff7bdab7 = contentValues.getAsInteger("isSend").intValue() != 0;
            if (z17) {
                this.f321929g = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f68621x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f321930h = true;
            }
        }
        if (contentValues.containsKey("invalidtime")) {
            this.f68615x32fdc97f = contentValues.getAsLong("invalidtime").longValue();
            if (z17) {
                this.f321931i = true;
            }
        }
        if (contentValues.containsKey("receiverName")) {
            this.f68620xdf27f83f = contentValues.getAsString("receiverName");
            if (z17) {
                this.f321932m = true;
            }
        }
        if (contentValues.containsKey("hasClicked")) {
            this.f68614x65958892 = contentValues.getAsInteger("hasClicked").intValue() != 0;
            if (z17) {
                this.f321933n = true;
            }
        }
        if (contentValues.containsKey("receiveTime")) {
            this.f68619xee5f688b = contentValues.getAsLong("receiveTime").longValue();
            if (z17) {
                this.f321934o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
