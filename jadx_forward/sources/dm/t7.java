package dm;

/* loaded from: classes8.dex */
public class t7 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f321662o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f321663p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f321664q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f321665r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321666s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321667t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321668u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321669v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321670w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321671x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321672y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f321673z;

    /* renamed from: field_height */
    public int f68484xfd0bc00c;

    /* renamed from: field_media_fuzzy_thumbnail_md5 */
    public java.lang.String f68485x9bdca656;

    /* renamed from: field_media_fuzzy_thumbnail_url */
    public java.lang.String f68486x9bdcc647;

    /* renamed from: field_media_md5 */
    public java.lang.String f68487x1a37dd9e;

    /* renamed from: field_media_type */
    public int f68488x2cc75b1a;

    /* renamed from: field_media_url */
    public java.lang.String f68489x1a37fd8f;

    /* renamed from: field_packet_id */
    public java.lang.String f68490x645a32d;

    /* renamed from: field_width */
    public int f68491x2a070e41;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321674d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321675e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321676f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321677g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321678h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321679i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321680m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321681n = true;

    static {
        p75.n0 n0Var = new p75.n0("LocalStoryDetail");
        f321662o = n0Var;
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
        f321663p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS LocalStoryDetailPacketIdIndex ON LocalStoryDetail(packet_id)"};
        f321664q = 1939875509;
        f321665r = 2140787348;
        f321666s = 2140779171;
        f321667t = -1221029593;
        f321668u = 113126854;
        f321669v = 1806137394;
        f321670w = 138801484;
        f321671x = 138793307;
        f321672y = 108705909;
        f321673z = m125514x3593deb(dm.t7.class);
        A = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125514x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f398487c = strArr;
        strArr[0] = "media_type";
        e0Var.f398488d.put("media_type", "INTEGER");
        e0Var.f398487c[1] = "media_url";
        e0Var.f398488d.put("media_url", "TEXT");
        e0Var.f398487c[2] = "media_md5";
        e0Var.f398488d.put("media_md5", "TEXT");
        e0Var.f398487c[3] = "height";
        e0Var.f398488d.put("height", "INTEGER");
        e0Var.f398487c[4] = "width";
        e0Var.f398488d.put("width", "INTEGER");
        e0Var.f398487c[5] = "packet_id";
        e0Var.f398488d.put("packet_id", "TEXT");
        e0Var.f398487c[6] = "media_fuzzy_thumbnail_url";
        e0Var.f398488d.put("media_fuzzy_thumbnail_url", "TEXT");
        e0Var.f398487c[7] = "media_fuzzy_thumbnail_md5";
        e0Var.f398488d.put("media_fuzzy_thumbnail_md5", "TEXT");
        e0Var.f398487c[8] = "rowid";
        e0Var.f398489e = " media_type INTEGER,  media_url TEXT,  media_md5 TEXT,  height INTEGER,  width INTEGER,  packet_id TEXT,  media_fuzzy_thumbnail_url TEXT,  media_fuzzy_thumbnail_md5 TEXT";
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
            if (f321664q == hashCode) {
                try {
                    this.f68488x2cc75b1a = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321665r == hashCode) {
                try {
                    this.f68489x1a37fd8f = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321666s == hashCode) {
                try {
                    this.f68487x1a37dd9e = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321667t == hashCode) {
                try {
                    this.f68484xfd0bc00c = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321668u == hashCode) {
                try {
                    this.f68491x2a070e41 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321669v == hashCode) {
                try {
                    this.f68490x645a32d = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321670w == hashCode) {
                try {
                    this.f68486x9bdcc647 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321671x == hashCode) {
                try {
                    this.f68485x9bdca656 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseLocalStoryDetail", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321672y == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321674d) {
            contentValues.put("media_type", java.lang.Integer.valueOf(this.f68488x2cc75b1a));
        }
        if (this.f321675e) {
            contentValues.put("media_url", this.f68489x1a37fd8f);
        }
        if (this.f321676f) {
            contentValues.put("media_md5", this.f68487x1a37dd9e);
        }
        if (this.f321677g) {
            contentValues.put("height", java.lang.Integer.valueOf(this.f68484xfd0bc00c));
        }
        if (this.f321678h) {
            contentValues.put("width", java.lang.Integer.valueOf(this.f68491x2a070e41));
        }
        if (this.f321679i) {
            contentValues.put("packet_id", this.f68490x645a32d);
        }
        if (this.f321680m) {
            contentValues.put("media_fuzzy_thumbnail_url", this.f68486x9bdcc647);
        }
        if (this.f321681n) {
            contentValues.put("media_fuzzy_thumbnail_md5", this.f68485x9bdca656);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseLocalStoryDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LocalStoryDetail ( ");
        l75.e0 e0Var = f321673z;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321663p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLocalStoryDetail", "createTableSql %s", str2);
            k0Var.A("LocalStoryDetail", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "LocalStoryDetail", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLocalStoryDetail", "updateTableSql %s", str3);
            k0Var.A("LocalStoryDetail", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseLocalStoryDetail", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f321673z;
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
        return f321662o;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321662o.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("media_type")) {
            this.f68488x2cc75b1a = contentValues.getAsInteger("media_type").intValue();
            if (z17) {
                this.f321674d = true;
            }
        }
        if (contentValues.containsKey("media_url")) {
            this.f68489x1a37fd8f = contentValues.getAsString("media_url");
            if (z17) {
                this.f321675e = true;
            }
        }
        if (contentValues.containsKey("media_md5")) {
            this.f68487x1a37dd9e = contentValues.getAsString("media_md5");
            if (z17) {
                this.f321676f = true;
            }
        }
        if (contentValues.containsKey("height")) {
            this.f68484xfd0bc00c = contentValues.getAsInteger("height").intValue();
            if (z17) {
                this.f321677g = true;
            }
        }
        if (contentValues.containsKey("width")) {
            this.f68491x2a070e41 = contentValues.getAsInteger("width").intValue();
            if (z17) {
                this.f321678h = true;
            }
        }
        if (contentValues.containsKey("packet_id")) {
            this.f68490x645a32d = contentValues.getAsString("packet_id");
            if (z17) {
                this.f321679i = true;
            }
        }
        if (contentValues.containsKey("media_fuzzy_thumbnail_url")) {
            this.f68486x9bdcc647 = contentValues.getAsString("media_fuzzy_thumbnail_url");
            if (z17) {
                this.f321680m = true;
            }
        }
        if (contentValues.containsKey("media_fuzzy_thumbnail_md5")) {
            this.f68485x9bdca656 = contentValues.getAsString("media_fuzzy_thumbnail_md5");
            if (z17) {
                this.f321681n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
