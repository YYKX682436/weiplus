package dm;

/* loaded from: classes8.dex */
public class c3 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f317579r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f317580s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317581t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317582u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317583v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317584w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317585x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317586y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317587z;

    /* renamed from: field_bucketSrc */
    public long f66058x81ee695;

    /* renamed from: field_endTime */
    public long f66059x14c61803;

    /* renamed from: field_exptCheckSum */
    public java.lang.String f66060x4f0eca5f;

    /* renamed from: field_exptContent */
    public java.lang.String f66061x384f96bd;

    /* renamed from: field_exptId */
    public int f66062xf8fc5057;

    /* renamed from: field_exptSeq */
    public int f66063x268de0a3;

    /* renamed from: field_exptType */
    public int f66064xab2ef376;

    /* renamed from: field_groupId */
    public int f66065x861009b5;

    /* renamed from: field_paramHashVal */
    public java.lang.String f66066x92da310b;

    /* renamed from: field_startTime */
    public long f66067x1bb3b54a;

    /* renamed from: field_subType */
    public int f66068x5334f55;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317588d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317589e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317590f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317591g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317592h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317593i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317594m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317595n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317596o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f317597p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f317598q = true;

    static {
        p75.n0 n0Var = new p75.n0("ExptItem");
        f317579r = n0Var;
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
        f317580s = new java.lang.String[0];
        f317581t = -1289150094;
        f317582u = 293428218;
        f317583v = -1308937496;
        f317584w = -862962046;
        f317585x = -2129294769;
        f317586y = -1607243192;
        f317587z = -1922307631;
        A = -1868521062;
        B = 1122179898;
        C = 1837153178;
        D = -2035383834;
        E = 108705909;
        F = m124837x3593deb(dm.c3.class);
        G = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124837x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f398487c = strArr;
        strArr[0] = "exptId";
        e0Var.f398488d.put("exptId", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "exptId";
        e0Var.f398487c[1] = "groupId";
        e0Var.f398488d.put("groupId", "INTEGER");
        e0Var.f398487c[2] = "exptSeq";
        e0Var.f398488d.put("exptSeq", "INTEGER");
        e0Var.f398487c[3] = "exptContent";
        e0Var.f398488d.put("exptContent", "TEXT");
        e0Var.f398487c[4] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[5] = "endTime";
        e0Var.f398488d.put("endTime", "LONG");
        e0Var.f398487c[6] = "exptType";
        e0Var.f398488d.put("exptType", "INTEGER");
        e0Var.f398487c[7] = "subType";
        e0Var.f398488d.put("subType", "INTEGER");
        e0Var.f398487c[8] = "exptCheckSum";
        e0Var.f398488d.put("exptCheckSum", "TEXT");
        e0Var.f398487c[9] = "bucketSrc";
        e0Var.f398488d.put("bucketSrc", "LONG");
        e0Var.f398487c[10] = "paramHashVal";
        e0Var.f398488d.put("paramHashVal", "TEXT");
        e0Var.f398487c[11] = "rowid";
        e0Var.f398489e = " exptId INTEGER PRIMARY KEY ,  groupId INTEGER,  exptSeq INTEGER,  exptContent TEXT,  startTime LONG,  endTime LONG,  exptType INTEGER,  subType INTEGER,  exptCheckSum TEXT,  bucketSrc LONG,  paramHashVal TEXT";
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
            if (f317581t == hashCode) {
                try {
                    this.f66062xf8fc5057 = cursor.getInt(i17);
                    this.f317588d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317582u == hashCode) {
                try {
                    this.f66065x861009b5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317583v == hashCode) {
                try {
                    this.f66063x268de0a3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317584w == hashCode) {
                try {
                    this.f66061x384f96bd = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317585x == hashCode) {
                try {
                    this.f66067x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317586y == hashCode) {
                try {
                    this.f66059x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317587z == hashCode) {
                try {
                    this.f66064xab2ef376 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66068x5334f55 = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f66060x4f0eca5f = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66058x81ee695 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66066x92da310b = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseExptItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
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
        if (this.f317588d) {
            contentValues.put("exptId", java.lang.Integer.valueOf(this.f66062xf8fc5057));
        }
        if (this.f317589e) {
            contentValues.put("groupId", java.lang.Integer.valueOf(this.f66065x861009b5));
        }
        if (this.f317590f) {
            contentValues.put("exptSeq", java.lang.Integer.valueOf(this.f66063x268de0a3));
        }
        if (this.f317591g) {
            contentValues.put("exptContent", this.f66061x384f96bd);
        }
        if (this.f317592h) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f66067x1bb3b54a));
        }
        if (this.f317593i) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f66059x14c61803));
        }
        if (this.f317594m) {
            contentValues.put("exptType", java.lang.Integer.valueOf(this.f66064xab2ef376));
        }
        if (this.f317595n) {
            contentValues.put("subType", java.lang.Integer.valueOf(this.f66068x5334f55));
        }
        if (this.f317596o) {
            contentValues.put("exptCheckSum", this.f66060x4f0eca5f);
        }
        if (this.f317597p) {
            contentValues.put("bucketSrc", java.lang.Long.valueOf(this.f66058x81ee695));
        }
        if (this.f317598q) {
            contentValues.put("paramHashVal", this.f66066x92da310b);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseExptItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ExptItem ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317580s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseExptItem", "createTableSql %s", str2);
            k0Var.A("ExptItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ExptItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseExptItem", "updateTableSql %s", str3);
            k0Var.A("ExptItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseExptItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Integer.valueOf(this.f66062xf8fc5057);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317579r;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317579r.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("exptId")) {
            this.f66062xf8fc5057 = contentValues.getAsInteger("exptId").intValue();
            if (z17) {
                this.f317588d = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.f66065x861009b5 = contentValues.getAsInteger("groupId").intValue();
            if (z17) {
                this.f317589e = true;
            }
        }
        if (contentValues.containsKey("exptSeq")) {
            this.f66063x268de0a3 = contentValues.getAsInteger("exptSeq").intValue();
            if (z17) {
                this.f317590f = true;
            }
        }
        if (contentValues.containsKey("exptContent")) {
            this.f66061x384f96bd = contentValues.getAsString("exptContent");
            if (z17) {
                this.f317591g = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f66067x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f317592h = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f66059x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f317593i = true;
            }
        }
        if (contentValues.containsKey("exptType")) {
            this.f66064xab2ef376 = contentValues.getAsInteger("exptType").intValue();
            if (z17) {
                this.f317594m = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.f66068x5334f55 = contentValues.getAsInteger("subType").intValue();
            if (z17) {
                this.f317595n = true;
            }
        }
        if (contentValues.containsKey("exptCheckSum")) {
            this.f66060x4f0eca5f = contentValues.getAsString("exptCheckSum");
            if (z17) {
                this.f317596o = true;
            }
        }
        if (contentValues.containsKey("bucketSrc")) {
            this.f66058x81ee695 = contentValues.getAsLong("bucketSrc").longValue();
            if (z17) {
                this.f317597p = true;
            }
        }
        if (contentValues.containsKey("paramHashVal")) {
            this.f66066x92da310b = contentValues.getAsString("paramHashVal");
            if (z17) {
                this.f317598q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
