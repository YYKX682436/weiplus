package dm;

/* loaded from: classes7.dex */
public class c6 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f317663p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f317664q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f317665r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f317666s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f317667t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f317668u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317669v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317670w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317671x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317672y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317673z;

    /* renamed from: field_active */
    public int f66134xf102adeb;

    /* renamed from: field_content */
    public java.lang.String f66135xad49e234;

    /* renamed from: field_creator */
    public java.lang.String f66136xb1e12de7;

    /* renamed from: field_firstMsgId */
    public long f66137xae937411;

    /* renamed from: field_key */
    public java.lang.String f66138x4b6e619a;

    /* renamed from: field_lastActiveTime */
    public long f66139x3647780e;

    /* renamed from: field_msgSvrId */
    public long f66140xd09be28e;

    /* renamed from: field_num */
    public int f66141x4b6e6ec1;

    /* renamed from: field_username */
    public java.lang.String f66142xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317674d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317675e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317676f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317677g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317678h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317679i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317680m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317681n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317682o = true;

    static {
        p75.n0 n0Var = new p75.n0("GroupSolitatire");
        f317663p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317664q = new p75.d(dm.i4.f66875xa013b0d5, "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317665r = new p75.d("creator", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317666s = new p75.d("active", "int", tableName, "");
        f317667t = new p75.d("lastActiveTime", "long", tableName, "");
        f317668u = new java.lang.String[0];
        f317669v = -265713450;
        f317670w = 106079;
        f317671x = 951530617;
        f317672y = 1028554796;
        f317673z = 109446;
        A = -177455188;
        B = -1294411543;
        C = -1422950650;
        D = -2041905623;
        E = 108705909;
        F = m124843x3593deb(dm.c6.class);
        G = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124843x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[1] = "key";
        e0Var.f398488d.put("key", "TEXT");
        e0Var.f398487c[2] = "content";
        e0Var.f398488d.put("content", "TEXT");
        e0Var.f398487c[3] = "creator";
        e0Var.f398488d.put("creator", "TEXT");
        e0Var.f398487c[4] = "num";
        e0Var.f398488d.put("num", "INTEGER");
        e0Var.f398487c[5] = "firstMsgId";
        e0Var.f398488d.put("firstMsgId", "LONG");
        e0Var.f398487c[6] = "msgSvrId";
        e0Var.f398488d.put("msgSvrId", "LONG");
        e0Var.f398487c[7] = "active";
        e0Var.f398488d.put("active", "INTEGER default '-1' ");
        e0Var.f398487c[8] = "lastActiveTime";
        e0Var.f398488d.put("lastActiveTime", "LONG");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " username TEXT,  key TEXT,  content TEXT,  creator TEXT,  num INTEGER,  firstMsgId LONG,  msgSvrId LONG,  active INTEGER default '-1' ,  lastActiveTime LONG";
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
            if (f317669v == hashCode) {
                try {
                    this.f66142xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317670w == hashCode) {
                try {
                    this.f66138x4b6e619a = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317671x == hashCode) {
                try {
                    this.f66135xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317672y == hashCode) {
                try {
                    this.f66136xb1e12de7 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317673z == hashCode) {
                try {
                    this.f66141x4b6e6ec1 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66137xae937411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66140xd09be28e = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66134xf102adeb = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66139x3647780e = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGroupSolitatire", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317674d) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66142xdec927b);
        }
        if (this.f317675e) {
            contentValues.put("key", this.f66138x4b6e619a);
        }
        if (this.f317676f) {
            contentValues.put("content", this.f66135xad49e234);
        }
        if (this.f317677g) {
            contentValues.put("creator", this.f66136xb1e12de7);
        }
        if (this.f317678h) {
            contentValues.put("num", java.lang.Integer.valueOf(this.f66141x4b6e6ec1));
        }
        if (this.f317679i) {
            contentValues.put("firstMsgId", java.lang.Long.valueOf(this.f66137xae937411));
        }
        if (this.f317680m) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f66140xd09be28e));
        }
        if (this.f317681n) {
            contentValues.put("active", java.lang.Integer.valueOf(this.f66134xf102adeb));
        }
        if (this.f317682o) {
            contentValues.put("lastActiveTime", java.lang.Long.valueOf(this.f66139x3647780e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGroupSolitatire", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GroupSolitatire ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317668u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGroupSolitatire", "createTableSql %s", str2);
            k0Var.A("GroupSolitatire", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GroupSolitatire", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGroupSolitatire", "updateTableSql %s", str3);
            k0Var.A("GroupSolitatire", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGroupSolitatire", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return F;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return G;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317663p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317663p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f66142xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f317674d = true;
            }
        }
        if (contentValues.containsKey("key")) {
            this.f66138x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f317675e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f66135xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f317676f = true;
            }
        }
        if (contentValues.containsKey("creator")) {
            this.f66136xb1e12de7 = contentValues.getAsString("creator");
            if (z17) {
                this.f317677g = true;
            }
        }
        if (contentValues.containsKey("num")) {
            this.f66141x4b6e6ec1 = contentValues.getAsInteger("num").intValue();
            if (z17) {
                this.f317678h = true;
            }
        }
        if (contentValues.containsKey("firstMsgId")) {
            this.f66137xae937411 = contentValues.getAsLong("firstMsgId").longValue();
            if (z17) {
                this.f317679i = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.f66140xd09be28e = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f317680m = true;
            }
        }
        if (contentValues.containsKey("active")) {
            this.f66134xf102adeb = contentValues.getAsInteger("active").intValue();
            if (z17) {
                this.f317681n = true;
            }
        }
        if (contentValues.containsKey("lastActiveTime")) {
            this.f66139x3647780e = contentValues.getAsLong("lastActiveTime").longValue();
            if (z17) {
                this.f317682o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
