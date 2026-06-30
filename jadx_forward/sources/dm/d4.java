package dm;

/* loaded from: classes10.dex */
public class d4 extends l75.f0 {
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
    public static final l75.e0 f317871J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f317872t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f317873u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317874v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317875w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317876x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317877y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317878z;

    /* renamed from: field_createTime */
    public int f66231xac3be4e;

    /* renamed from: field_dbversion */
    public int f66232x5e81d195;

    /* renamed from: field_extraInfoFlag */
    public long f66233xaaf3eee5;

    /* renamed from: field_finderItem */
    public r45.ec1 f66234xddef18be;

    /* renamed from: field_localFlag */
    public int f66235x52c1d072;

    /* renamed from: field_localId */
    public long f66236x88be67a1;

    /* renamed from: field_markDeleted */
    public int f66237x922d48c7;

    /* renamed from: field_objectId */
    public long f66238x2327e25f;

    /* renamed from: field_objectType */
    public int f66239xf8be237e;

    /* renamed from: field_originMvInfo */
    public r45.ef2 f66240x6a01bfe2;

    /* renamed from: field_postIntent */
    public java.lang.String f66241x844f7c1;

    /* renamed from: field_version */
    public int f66242x8987ca93;

    /* renamed from: field_watermarkFlag */
    public int f66243x30403f6b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317879d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317880e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317881f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317882g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317883h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317884i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317885m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317886n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317887o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f317888p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f317889q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f317890r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f317891s = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderDraftItem");
        f317872t = n0Var;
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
        f317873u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderDraftItem_local_index ON FinderDraftItem(localId)", "CREATE INDEX IF NOT EXISTS FinderDraftItem_create_time ON FinderDraftItem(createTime)", "CREATE INDEX IF NOT EXISTS FinderDraftItem__Local_Flag ON FinderDraftItem(localFlag)", "CREATE INDEX IF NOT EXISTS FinderDraftItem__Object_Type ON FinderDraftItem(objectType)", "CREATE INDEX IF NOT EXISTS FinderDraftItem_svr_index ON FinderDraftItem(objectId)"};
        f317874v = 338409958;
        f317875w = 1369213417;
        f317876x = -1205623433;
        f317877y = 617079897;
        f317878z = 1066856217;
        A = 1327350620;
        B = 1574310077;
        C = 90495162;
        D = 644739212;
        E = 833206634;
        F = 351608024;
        G = -1008490854;
        H = -1225389584;
        I = 108705909;
        f317871J = m124873x3593deb(dm.d4.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124873x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "LONG PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66867x2a5c95c7;
        e0Var.f398487c[1] = "createTime";
        e0Var.f398488d.put("createTime", "INTEGER");
        e0Var.f398487c[2] = "localFlag";
        e0Var.f398488d.put("localFlag", "INTEGER");
        e0Var.f398487c[3] = "finderItem";
        e0Var.f398488d.put("finderItem", "BLOB");
        e0Var.f398487c[4] = "objectType";
        e0Var.f398488d.put("objectType", "INTEGER");
        e0Var.f398487c[5] = "postIntent";
        e0Var.f398488d.put("postIntent", "TEXT");
        e0Var.f398487c[6] = "originMvInfo";
        e0Var.f398488d.put("originMvInfo", "BLOB");
        e0Var.f398487c[7] = "objectId";
        e0Var.f398488d.put("objectId", "LONG default '0' ");
        e0Var.f398487c[8] = "markDeleted";
        e0Var.f398488d.put("markDeleted", "INTEGER default '0' ");
        e0Var.f398487c[9] = "extraInfoFlag";
        e0Var.f398488d.put("extraInfoFlag", "LONG default '0' ");
        e0Var.f398487c[10] = "version";
        e0Var.f398488d.put("version", "INTEGER default '0' ");
        e0Var.f398487c[11] = "dbversion";
        e0Var.f398488d.put("dbversion", "INTEGER default '0' ");
        e0Var.f398487c[12] = dm.i4.f66876xa7ac9d11;
        e0Var.f398488d.put(dm.i4.f66876xa7ac9d11, "INTEGER");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " localId LONG PRIMARY KEY ,  createTime INTEGER,  localFlag INTEGER,  finderItem BLOB,  objectType INTEGER,  postIntent TEXT,  originMvInfo BLOB,  objectId LONG default '0' ,  markDeleted INTEGER default '0' ,  extraInfoFlag LONG default '0' ,  version INTEGER default '0' ,  dbversion INTEGER default '0' ,  watermarkFlag INTEGER";
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
            if (f317874v == hashCode) {
                try {
                    this.f66236x88be67a1 = cursor.getLong(i17);
                    this.f317879d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317875w == hashCode) {
                try {
                    this.f66231xac3be4e = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317876x == hashCode) {
                try {
                    this.f66235x52c1d072 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317877y == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f66234xddef18be = (r45.ec1) new r45.ec1().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317878z == hashCode) {
                try {
                    this.f66239xf8be237e = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66241x844f7c1 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.f66240x6a01bfe2 = (r45.ef2) new r45.ef2().mo11468x92b714fd(blob2);
                    }
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f66238x2327e25f = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f66237x922d48c7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f66233xaaf3eee5 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f66242x8987ca93 = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f66232x5e81d195 = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f66243x30403f6b = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderDraftItem", th18, "convertFrom %s", columnNames[i17]);
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
        if (this.f317879d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f66236x88be67a1));
        }
        if (this.f317880e) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.f66231xac3be4e));
        }
        if (this.f317881f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.f66235x52c1d072));
        }
        if (this.f317882g) {
            r45.ec1 ec1Var = this.f66234xddef18be;
            if (ec1Var != null) {
                try {
                    contentValues.put("finderItem", ec1Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e17.getMessage());
                }
            } else {
                contentValues.put("finderItem", (byte[]) null);
            }
        }
        if (this.f317883h) {
            contentValues.put("objectType", java.lang.Integer.valueOf(this.f66239xf8be237e));
        }
        if (this.f317884i) {
            contentValues.put("postIntent", this.f66241x844f7c1);
        }
        if (this.f317885m) {
            r45.ef2 ef2Var = this.f66240x6a01bfe2;
            if (ef2Var != null) {
                try {
                    contentValues.put("originMvInfo", ef2Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e18.getMessage());
                }
            } else {
                contentValues.put("originMvInfo", (byte[]) null);
            }
        }
        if (this.f317886n) {
            contentValues.put("objectId", java.lang.Long.valueOf(this.f66238x2327e25f));
        }
        if (this.f317887o) {
            contentValues.put("markDeleted", java.lang.Integer.valueOf(this.f66237x922d48c7));
        }
        if (this.f317888p) {
            contentValues.put("extraInfoFlag", java.lang.Long.valueOf(this.f66233xaaf3eee5));
        }
        if (this.f317889q) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f66242x8987ca93));
        }
        if (this.f317890r) {
            contentValues.put("dbversion", java.lang.Integer.valueOf(this.f66232x5e81d195));
        }
        if (this.f317891s) {
            contentValues.put(dm.i4.f66876xa7ac9d11, java.lang.Integer.valueOf(this.f66243x30403f6b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderDraftItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderDraftItem ( ");
        l75.e0 e0Var = f317871J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317873u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderDraftItem", "createTableSql %s", str2);
            k0Var.A("FinderDraftItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderDraftItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderDraftItem", "updateTableSql %s", str3);
            k0Var.A("FinderDraftItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderDraftItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317871J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f66236x88be67a1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317872t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317872t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f66236x88be67a1 = contentValues.getAsLong(dm.i4.f66867x2a5c95c7).longValue();
            if (z17) {
                this.f317879d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66231xac3be4e = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f317880e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.f66235x52c1d072 = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f317881f = true;
            }
        }
        if (contentValues.containsKey("finderItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("finderItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f66234xddef18be = (r45.ec1) new r45.ec1().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f317882g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e17.getMessage());
            }
        }
        if (contentValues.containsKey("objectType")) {
            this.f66239xf8be237e = contentValues.getAsInteger("objectType").intValue();
            if (z17) {
                this.f317883h = true;
            }
        }
        if (contentValues.containsKey("postIntent")) {
            this.f66241x844f7c1 = contentValues.getAsString("postIntent");
            if (z17) {
                this.f317884i = true;
            }
        }
        if (contentValues.containsKey("originMvInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("originMvInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.f66240x6a01bfe2 = (r45.ef2) new r45.ef2().mo11468x92b714fd(asByteArray2);
                    if (z17) {
                        this.f317885m = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e18.getMessage());
            }
        }
        if (contentValues.containsKey("objectId")) {
            this.f66238x2327e25f = contentValues.getAsLong("objectId").longValue();
            if (z17) {
                this.f317886n = true;
            }
        }
        if (contentValues.containsKey("markDeleted")) {
            this.f66237x922d48c7 = contentValues.getAsInteger("markDeleted").intValue();
            if (z17) {
                this.f317887o = true;
            }
        }
        if (contentValues.containsKey("extraInfoFlag")) {
            this.f66233xaaf3eee5 = contentValues.getAsLong("extraInfoFlag").longValue();
            if (z17) {
                this.f317888p = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.f66242x8987ca93 = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f317889q = true;
            }
        }
        if (contentValues.containsKey("dbversion")) {
            this.f66232x5e81d195 = contentValues.getAsInteger("dbversion").intValue();
            if (z17) {
                this.f317890r = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66876xa7ac9d11)) {
            this.f66243x30403f6b = contentValues.getAsInteger(dm.i4.f66876xa7ac9d11).intValue();
            if (z17) {
                this.f317891s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
