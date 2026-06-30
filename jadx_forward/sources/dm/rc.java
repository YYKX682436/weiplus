package dm;

/* loaded from: classes12.dex */
public class rc extends l75.f0 {
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
    public static final int f321261J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f321262t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f321263u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f321264v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f321265w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f321266x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321267y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321268z;

    /* renamed from: field_detail */
    public java.lang.String f68218xf63d4736;

    /* renamed from: field_diskSpace */
    public long f68219x9f7e1864;

    /* renamed from: field_flags */
    public long f68220x2918cf02;

    /* renamed from: field_hash */
    public byte[] f68221x225c6533;

    /* renamed from: field_linkUUID */
    public byte[] f68222x64f1185a;

    /* renamed from: field_msgId */
    public long f68223x297eb4f7;

    /* renamed from: field_msgSubType */
    public int f68224x169c833e;

    /* renamed from: field_msgType */
    public int f68225xc4aab016;

    /* renamed from: field_msgtime */
    public long f68226xc4b8ff89;

    /* renamed from: field_path */
    public java.lang.String f68227x2260084a;

    /* renamed from: field_size */
    public long f68228x22618426;

    /* renamed from: field_subIdx */
    public int f68229x10aee742;

    /* renamed from: field_username */
    public java.lang.String f68230xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321269d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321270e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321271f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321272g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321273h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321274i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321275m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321276n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321277o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321278p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f321279q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f321280r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f321281s = true;

    static {
        p75.n0 n0Var = new p75.n0("WxFileIndex3");
        f321262t = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321263u = new p75.d("msgId", "long", tableName, "");
        f321264v = new p75.d(dm.i4.f66875xa013b0d5, "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321265w = new p75.d("msgSubType", "int", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f321266x = new java.lang.String[0];
        f321267y = 104191100;
        f321268z = -265713450;
        A = 1343750747;
        B = 1567968985;
        C = 3433509;
        D = 3530753;
        E = 1344688590;
        F = 3195150;
        G = 81784169;
        H = 1194200757;
        I = -891570083;
        f321261J = -1335224239;
        K = 97513095;
        L = 108705909;
        M = m125458x3593deb(dm.rc.class);
        N = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125458x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "msgId";
        e0Var.f398488d.put("msgId", "LONG");
        e0Var.f398487c[1] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[2] = "msgType";
        e0Var.f398488d.put("msgType", "INTEGER");
        e0Var.f398487c[3] = "msgSubType";
        e0Var.f398488d.put("msgSubType", "INTEGER");
        e0Var.f398487c[4] = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
        e0Var.f398488d.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "TEXT");
        e0Var.f398487c[5] = "size";
        e0Var.f398488d.put("size", "LONG");
        e0Var.f398487c[6] = "msgtime";
        e0Var.f398488d.put("msgtime", "LONG");
        e0Var.f398487c[7] = "hash";
        e0Var.f398488d.put("hash", "BLOB");
        e0Var.f398487c[8] = "diskSpace";
        e0Var.f398488d.put("diskSpace", "LONG");
        e0Var.f398487c[9] = "linkUUID";
        e0Var.f398488d.put("linkUUID", "BLOB");
        e0Var.f398487c[10] = "subIdx";
        e0Var.f398488d.put("subIdx", "INTEGER");
        e0Var.f398487c[11] = "detail";
        e0Var.f398488d.put("detail", "TEXT");
        e0Var.f398487c[12] = "flags";
        e0Var.f398488d.put("flags", "LONG");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " msgId LONG,  username TEXT,  msgType INTEGER,  msgSubType INTEGER,  path TEXT,  size LONG,  msgtime LONG,  hash BLOB,  diskSpace LONG,  linkUUID BLOB,  subIdx INTEGER,  detail TEXT,  flags LONG";
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
            if (f321267y == hashCode) {
                try {
                    this.f68223x297eb4f7 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321268z == hashCode) {
                try {
                    this.f68230xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f68225xc4aab016 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68224x169c833e = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68227x2260084a = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f68228x22618426 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f68226xc4b8ff89 = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f68221x225c6533 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f68219x9f7e1864 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68222x64f1185a = cursor.getBlob(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68229x10aee742 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321261J == hashCode) {
                try {
                    this.f68218xf63d4736 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                try {
                    this.f68220x2918cf02 = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseWxFileIndex3", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (L == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321269d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.f68223x297eb4f7));
        }
        if (this.f321270e) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f68230xdec927b);
        }
        if (this.f321271f) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.f68225xc4aab016));
        }
        if (this.f321272g) {
            contentValues.put("msgSubType", java.lang.Integer.valueOf(this.f68224x169c833e));
        }
        if (this.f321273h) {
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f68227x2260084a);
        }
        if (this.f321274i) {
            contentValues.put("size", java.lang.Long.valueOf(this.f68228x22618426));
        }
        if (this.f321275m) {
            contentValues.put("msgtime", java.lang.Long.valueOf(this.f68226xc4b8ff89));
        }
        if (this.f321276n) {
            contentValues.put("hash", this.f68221x225c6533);
        }
        if (this.f321277o) {
            contentValues.put("diskSpace", java.lang.Long.valueOf(this.f68219x9f7e1864));
        }
        if (this.f321278p) {
            contentValues.put("linkUUID", this.f68222x64f1185a);
        }
        if (this.f321279q) {
            contentValues.put("subIdx", java.lang.Integer.valueOf(this.f68229x10aee742));
        }
        if (this.f321280r) {
            contentValues.put("detail", this.f68218xf63d4736);
        }
        if (this.f321281s) {
            contentValues.put("flags", java.lang.Long.valueOf(this.f68220x2918cf02));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseWxFileIndex3", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxFileIndex3 ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321266x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxFileIndex3", "createTableSql %s", str2);
            k0Var.A("WxFileIndex3", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "WxFileIndex3", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxFileIndex3", "updateTableSql %s", str3);
            k0Var.A("WxFileIndex3", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseWxFileIndex3", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return M;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return N;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321262t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321262t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.f68223x297eb4f7 = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f321269d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f68230xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f321270e = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.f68225xc4aab016 = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f321271f = true;
            }
        }
        if (contentValues.containsKey("msgSubType")) {
            this.f68224x169c833e = contentValues.getAsInteger("msgSubType").intValue();
            if (z17) {
                this.f321272g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            this.f68227x2260084a = contentValues.getAsString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (z17) {
                this.f321273h = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.f68228x22618426 = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f321274i = true;
            }
        }
        if (contentValues.containsKey("msgtime")) {
            this.f68226xc4b8ff89 = contentValues.getAsLong("msgtime").longValue();
            if (z17) {
                this.f321275m = true;
            }
        }
        if (contentValues.containsKey("hash")) {
            this.f68221x225c6533 = contentValues.getAsByteArray("hash");
            if (z17) {
                this.f321276n = true;
            }
        }
        if (contentValues.containsKey("diskSpace")) {
            this.f68219x9f7e1864 = contentValues.getAsLong("diskSpace").longValue();
            if (z17) {
                this.f321277o = true;
            }
        }
        if (contentValues.containsKey("linkUUID")) {
            this.f68222x64f1185a = contentValues.getAsByteArray("linkUUID");
            if (z17) {
                this.f321278p = true;
            }
        }
        if (contentValues.containsKey("subIdx")) {
            this.f68229x10aee742 = contentValues.getAsInteger("subIdx").intValue();
            if (z17) {
                this.f321279q = true;
            }
        }
        if (contentValues.containsKey("detail")) {
            this.f68218xf63d4736 = contentValues.getAsString("detail");
            if (z17) {
                this.f321280r = true;
            }
        }
        if (contentValues.containsKey("flags")) {
            this.f68220x2918cf02 = contentValues.getAsLong("flags").longValue();
            if (z17) {
                this.f321281s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
