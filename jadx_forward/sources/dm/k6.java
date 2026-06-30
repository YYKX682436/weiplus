package dm;

/* loaded from: classes12.dex */
public class k6 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f319558o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f319559p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319560q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319561r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319562s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319563t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319564u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319565v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319566w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319567x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319568y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f319569z;

    /* renamed from: field_appusername */
    public java.lang.String f67217x84a2aa32;

    /* renamed from: field_likecount */
    public int f67218x9113f2d3;

    /* renamed from: field_rankID */
    public java.lang.String f67219xde6292c;

    /* renamed from: field_ranknum */
    public int f67220xaedf8d95;

    /* renamed from: field_score */
    public int f67221x29cc1f0d;

    /* renamed from: field_selfLikeState */
    public int f67222x3a0346c9;

    /* renamed from: field_sportRecord */
    public r45.ed6 f67223x448d7120;

    /* renamed from: field_username */
    public java.lang.String f67224xdec927b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319570d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319571e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319572f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319573g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319574h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319575i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319576m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319577n = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceRankInfo");
        f319558o = n0Var;
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
        f319559p = new java.lang.String[0];
        f319560q = -938280377;
        f319561r = 417550839;
        f319562s = -265713450;
        f319563t = 978116570;
        f319564u = 109264530;
        f319565v = -160053288;
        f319566w = -1061613234;
        f319567x = -657581851;
        f319568y = 108705909;
        f319569z = m125168x3593deb(dm.k6.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125168x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "rankID";
        e0Var.f398488d.put("rankID", "TEXT");
        e0Var.f398487c[1] = "appusername";
        e0Var.f398488d.put("appusername", "TEXT");
        e0Var.f398487c[2] = dm.i4.f66875xa013b0d5;
        e0Var.f398488d.put(dm.i4.f66875xa013b0d5, "TEXT");
        e0Var.f398487c[3] = "ranknum";
        e0Var.f398488d.put("ranknum", "INTEGER");
        e0Var.f398487c[4] = ya.b.f77498x4b14672;
        e0Var.f398488d.put(ya.b.f77498x4b14672, "INTEGER");
        e0Var.f398487c[5] = "likecount";
        e0Var.f398488d.put("likecount", "INTEGER default '0' ");
        e0Var.f398487c[6] = "selfLikeState";
        e0Var.f398488d.put("selfLikeState", "INTEGER default '3' ");
        e0Var.f398487c[7] = "sportRecord";
        e0Var.f398488d.put("sportRecord", "BLOB");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " rankID TEXT,  appusername TEXT,  username TEXT,  ranknum INTEGER,  score INTEGER,  likecount INTEGER default '0' ,  selfLikeState INTEGER default '3' ,  sportRecord BLOB";
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
            if (f319560q == hashCode) {
                try {
                    this.f67219xde6292c = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319561r == hashCode) {
                try {
                    this.f67217x84a2aa32 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319562s == hashCode) {
                try {
                    this.f67224xdec927b = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319563t == hashCode) {
                try {
                    this.f67220xaedf8d95 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319564u == hashCode) {
                try {
                    this.f67221x29cc1f0d = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319565v == hashCode) {
                try {
                    this.f67218x9113f2d3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319566w == hashCode) {
                try {
                    this.f67222x3a0346c9 = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319567x == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67223x448d7120 = (r45.ed6) new r45.ed6().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseHardDeviceRankInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319568y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319570d) {
            contentValues.put("rankID", this.f67219xde6292c);
        }
        if (this.f319571e) {
            contentValues.put("appusername", this.f67217x84a2aa32);
        }
        if (this.f319572f) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f67224xdec927b);
        }
        if (this.f319573g) {
            contentValues.put("ranknum", java.lang.Integer.valueOf(this.f67220xaedf8d95));
        }
        if (this.f319574h) {
            contentValues.put(ya.b.f77498x4b14672, java.lang.Integer.valueOf(this.f67221x29cc1f0d));
        }
        if (this.f319575i) {
            contentValues.put("likecount", java.lang.Integer.valueOf(this.f67218x9113f2d3));
        }
        if (this.f319576m) {
            contentValues.put("selfLikeState", java.lang.Integer.valueOf(this.f67222x3a0346c9));
        }
        if (this.f319577n) {
            r45.ed6 ed6Var = this.f67223x448d7120;
            if (ed6Var != null) {
                try {
                    contentValues.put("sportRecord", ed6Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceRankInfo", e17.getMessage());
                }
            } else {
                contentValues.put("sportRecord", (byte[]) null);
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceRankInfo ( ");
        l75.e0 e0Var = f319569z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319559p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceRankInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "HardDeviceRankInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceRankInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceRankInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319569z;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return A;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319558o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319558o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("rankID")) {
            this.f67219xde6292c = contentValues.getAsString("rankID");
            if (z17) {
                this.f319570d = true;
            }
        }
        if (contentValues.containsKey("appusername")) {
            this.f67217x84a2aa32 = contentValues.getAsString("appusername");
            if (z17) {
                this.f319571e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66875xa013b0d5)) {
            this.f67224xdec927b = contentValues.getAsString(dm.i4.f66875xa013b0d5);
            if (z17) {
                this.f319572f = true;
            }
        }
        if (contentValues.containsKey("ranknum")) {
            this.f67220xaedf8d95 = contentValues.getAsInteger("ranknum").intValue();
            if (z17) {
                this.f319573g = true;
            }
        }
        if (contentValues.containsKey(ya.b.f77498x4b14672)) {
            this.f67221x29cc1f0d = contentValues.getAsInteger(ya.b.f77498x4b14672).intValue();
            if (z17) {
                this.f319574h = true;
            }
        }
        if (contentValues.containsKey("likecount")) {
            this.f67218x9113f2d3 = contentValues.getAsInteger("likecount").intValue();
            if (z17) {
                this.f319575i = true;
            }
        }
        if (contentValues.containsKey("selfLikeState")) {
            this.f67222x3a0346c9 = contentValues.getAsInteger("selfLikeState").intValue();
            if (z17) {
                this.f319576m = true;
            }
        }
        if (contentValues.containsKey("sportRecord")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("sportRecord");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67223x448d7120 = (r45.ed6) new r45.ed6().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f319577n = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseHardDeviceRankInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
