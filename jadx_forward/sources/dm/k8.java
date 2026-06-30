package dm;

/* loaded from: classes13.dex */
public class k8 extends l75.f0 {
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
    public static final l75.e0 f319598J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f319599t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f319600u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319601v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319602w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319603x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319604y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319605z;

    /* renamed from: field_beginShowTime */
    public long f67234x8fbc34ae;

    /* renamed from: field_disappearTime */
    public long f67235x1a23a28b;

    /* renamed from: field_extInfo */
    public java.lang.String f67236x26b3182a;

    /* renamed from: field_hadRead */
    public boolean f67237x9d48d07c;

    /* renamed from: field_isExit */
    public boolean f67238xff75c44d;

    /* renamed from: field_isReject */
    public boolean f67239xe396f0e;

    /* renamed from: field_overdueTime */
    public long f67240xcd55f7c8;

    /* renamed from: field_pagestaytime */
    public long f67241xebf7975a;

    /* renamed from: field_tipId */
    public int f67242x29dcef91;

    /* renamed from: field_tipType */
    public int f67243x2664ac30;

    /* renamed from: field_tipVersion */
    public int f67244x25315422;

    /* renamed from: field_tipkey */
    public java.lang.String f67245x11c182c9;

    /* renamed from: field_tipsShowInfo */
    public r45.rm6 f67246x4fa9bc8;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319606d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319607e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319608f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319609g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319610h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319611i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319612m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319613n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319614o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f319615p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f319616q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f319617r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f319618s = true;

    static {
        p75.n0 n0Var = new p75.n0("NewTipsInfo");
        f319599t = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319600u = new java.lang.String[0];
        f319601v = 110366486;
        f319602w = 1812602813;
        f319603x = -873573404;
        f319604y = -1311637899;
        f319605z = -1180527256;
        A = 683025089;
        B = -260676247;
        C = 376569651;
        D = -1596363504;
        E = 1637261197;
        F = -120656733;
        G = -1306498449;
        H = -540284875;
        I = 108705909;
        f319598J = m125173x3593deb(dm.k8.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125173x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "tipId";
        e0Var.f398488d.put("tipId", "INTEGER default '0'  PRIMARY KEY ");
        e0Var.f398486b = "tipId";
        e0Var.f398487c[1] = "tipVersion";
        e0Var.f398488d.put("tipVersion", "INTEGER");
        e0Var.f398487c[2] = "tipkey";
        e0Var.f398488d.put("tipkey", "TEXT");
        e0Var.f398487c[3] = "tipType";
        e0Var.f398488d.put("tipType", "INTEGER");
        e0Var.f398487c[4] = "isExit";
        e0Var.f398488d.put("isExit", "INTEGER");
        e0Var.f398487c[5] = "hadRead";
        e0Var.f398488d.put("hadRead", "INTEGER");
        e0Var.f398487c[6] = "isReject";
        e0Var.f398488d.put("isReject", "INTEGER");
        e0Var.f398487c[7] = "beginShowTime";
        e0Var.f398488d.put("beginShowTime", "LONG");
        e0Var.f398487c[8] = "disappearTime";
        e0Var.f398488d.put("disappearTime", "LONG");
        e0Var.f398487c[9] = "overdueTime";
        e0Var.f398488d.put("overdueTime", "LONG");
        e0Var.f398487c[10] = "tipsShowInfo";
        e0Var.f398488d.put("tipsShowInfo", "BLOB");
        e0Var.f398487c[11] = "extInfo";
        e0Var.f398488d.put("extInfo", "TEXT");
        e0Var.f398487c[12] = "pagestaytime";
        e0Var.f398488d.put("pagestaytime", "LONG");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " tipId INTEGER default '0'  PRIMARY KEY ,  tipVersion INTEGER,  tipkey TEXT,  tipType INTEGER,  isExit INTEGER,  hadRead INTEGER,  isReject INTEGER,  beginShowTime LONG,  disappearTime LONG,  overdueTime LONG,  tipsShowInfo BLOB,  extInfo TEXT,  pagestaytime LONG";
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
            if (f319601v == hashCode) {
                try {
                    this.f67242x29dcef91 = cursor.getInt(i17);
                    this.f319606d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319602w == hashCode) {
                try {
                    this.f67244x25315422 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319603x == hashCode) {
                try {
                    this.f67245x11c182c9 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319604y == hashCode) {
                try {
                    this.f67243x2664ac30 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319605z == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67238xff75c44d = z17;
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67237x9d48d07c = z17;
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67239xe396f0e = z17;
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67234x8fbc34ae = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67235x1a23a28b = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67240xcd55f7c8 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67246x4fa9bc8 = (r45.rm6) new r45.rm6().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67236x26b3182a = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67241xebf7975a = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNewTipsInfo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319606d) {
            contentValues.put("tipId", java.lang.Integer.valueOf(this.f67242x29dcef91));
        }
        if (this.f319607e) {
            contentValues.put("tipVersion", java.lang.Integer.valueOf(this.f67244x25315422));
        }
        if (this.f319608f) {
            contentValues.put("tipkey", this.f67245x11c182c9);
        }
        if (this.f319609g) {
            contentValues.put("tipType", java.lang.Integer.valueOf(this.f67243x2664ac30));
        }
        if (this.f319610h) {
            if (this.f67238xff75c44d) {
                contentValues.put("isExit", (java.lang.Integer) 1);
            } else {
                contentValues.put("isExit", (java.lang.Integer) 0);
            }
        }
        if (this.f319611i) {
            if (this.f67237x9d48d07c) {
                contentValues.put("hadRead", (java.lang.Integer) 1);
            } else {
                contentValues.put("hadRead", (java.lang.Integer) 0);
            }
        }
        if (this.f319612m) {
            if (this.f67239xe396f0e) {
                contentValues.put("isReject", (java.lang.Integer) 1);
            } else {
                contentValues.put("isReject", (java.lang.Integer) 0);
            }
        }
        if (this.f319613n) {
            contentValues.put("beginShowTime", java.lang.Long.valueOf(this.f67234x8fbc34ae));
        }
        if (this.f319614o) {
            contentValues.put("disappearTime", java.lang.Long.valueOf(this.f67235x1a23a28b));
        }
        if (this.f319615p) {
            contentValues.put("overdueTime", java.lang.Long.valueOf(this.f67240xcd55f7c8));
        }
        if (this.f319616q) {
            r45.rm6 rm6Var = this.f67246x4fa9bc8;
            if (rm6Var != null) {
                try {
                    contentValues.put("tipsShowInfo", rm6Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseNewTipsInfo", e17.getMessage());
                }
            } else {
                contentValues.put("tipsShowInfo", (byte[]) null);
            }
        }
        if (this.f319617r) {
            contentValues.put("extInfo", this.f67236x26b3182a);
        }
        if (this.f319618s) {
            contentValues.put("pagestaytime", java.lang.Long.valueOf(this.f67241xebf7975a));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseNewTipsInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NewTipsInfo ( ");
        l75.e0 e0Var = f319598J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319600u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNewTipsInfo", "createTableSql %s", str2);
            k0Var.A("NewTipsInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "NewTipsInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNewTipsInfo", "updateTableSql %s", str3);
            k0Var.A("NewTipsInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNewTipsInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319598J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f67242x29dcef91);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319599t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319599t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tipId")) {
            this.f67242x29dcef91 = contentValues.getAsInteger("tipId").intValue();
            if (z17) {
                this.f319606d = true;
            }
        }
        if (contentValues.containsKey("tipVersion")) {
            this.f67244x25315422 = contentValues.getAsInteger("tipVersion").intValue();
            if (z17) {
                this.f319607e = true;
            }
        }
        if (contentValues.containsKey("tipkey")) {
            this.f67245x11c182c9 = contentValues.getAsString("tipkey");
            if (z17) {
                this.f319608f = true;
            }
        }
        if (contentValues.containsKey("tipType")) {
            this.f67243x2664ac30 = contentValues.getAsInteger("tipType").intValue();
            if (z17) {
                this.f319609g = true;
            }
        }
        if (contentValues.containsKey("isExit")) {
            this.f67238xff75c44d = contentValues.getAsInteger("isExit").intValue() != 0;
            if (z17) {
                this.f319610h = true;
            }
        }
        if (contentValues.containsKey("hadRead")) {
            this.f67237x9d48d07c = contentValues.getAsInteger("hadRead").intValue() != 0;
            if (z17) {
                this.f319611i = true;
            }
        }
        if (contentValues.containsKey("isReject")) {
            this.f67239xe396f0e = contentValues.getAsInteger("isReject").intValue() != 0;
            if (z17) {
                this.f319612m = true;
            }
        }
        if (contentValues.containsKey("beginShowTime")) {
            this.f67234x8fbc34ae = contentValues.getAsLong("beginShowTime").longValue();
            if (z17) {
                this.f319613n = true;
            }
        }
        if (contentValues.containsKey("disappearTime")) {
            this.f67235x1a23a28b = contentValues.getAsLong("disappearTime").longValue();
            if (z17) {
                this.f319614o = true;
            }
        }
        if (contentValues.containsKey("overdueTime")) {
            this.f67240xcd55f7c8 = contentValues.getAsLong("overdueTime").longValue();
            if (z17) {
                this.f319615p = true;
            }
        }
        if (contentValues.containsKey("tipsShowInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("tipsShowInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67246x4fa9bc8 = (r45.rm6) new r45.rm6().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f319616q = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseNewTipsInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.f67236x26b3182a = contentValues.getAsString("extInfo");
            if (z17) {
                this.f319617r = true;
            }
        }
        if (contentValues.containsKey("pagestaytime")) {
            this.f67241xebf7975a = contentValues.getAsLong("pagestaytime").longValue();
            if (z17) {
                this.f319618s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
