package dm;

/* loaded from: classes10.dex */
public class w3 extends l75.f0 {
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
    public static final int f322290J;
    public static final int K;
    public static final l75.e0 L;
    public static final o75.e M;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.n0 f322291u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f322292v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322293w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322294x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322295y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322296z;

    /* renamed from: field_actionInfo */
    public r45.et0 f68953x27838069;

    /* renamed from: field_actionTime */
    public long f68954x27886e88;

    /* renamed from: field_actionType */
    public int f68955x2788aaf5;

    /* renamed from: field_canRemove */
    public int f68956x9a04736f;

    /* renamed from: field_dupFlag */
    public java.lang.String f68957xec748fc6;

    /* renamed from: field_failedFlag */
    public int f68958xdad0d5ae;

    /* renamed from: field_feedId */
    public long f68959xf9a02e3e;

    /* renamed from: field_lastTryTime */
    public long f68960x9db99bed;

    /* renamed from: field_localCommentId */
    public long f68961xf609be94;

    /* renamed from: field_objectNonceId */
    public java.lang.String f68962x2812d6a6;

    /* renamed from: field_postTime */
    public long f68963x4ae21932;

    /* renamed from: field_scene */
    public int f68964x29cbf907;

    /* renamed from: field_state */
    public int f68965x29d3a50c;

    /* renamed from: field_tryCount */
    public long f68966x90b085b9;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322297d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322298e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322299f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322300g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322301h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322302i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322303m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322304n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322305o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f322306p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f322307q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f322308r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f322309s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f322310t = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderAction");
        f322291u = n0Var;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322292v = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_Local_Comment_Id ON FinderAction(localCommentId)", "CREATE INDEX IF NOT EXISTS FinderAction_Feed_Id ON FinderAction(feedId)", "CREATE INDEX IF NOT EXISTS Finder_Feed_CreateTime ON FinderAction(actionTime)", "CREATE INDEX IF NOT EXISTS Finder_Feed_ActionType ON FinderAction(actionType)", "CREATE INDEX IF NOT EXISTS Finder_Reply_state ON FinderAction(state)"};
        f322293w = 1175274671;
        f322294x = -1278410919;
        f322295y = 1851865635;
        f322296z = 1851881104;
        A = -1362583253;
        B = 109254796;
        C = 109757585;
        D = 1851542532;
        E = 757010317;
        F = 1928166420;
        G = -10073996;
        H = 838484914;
        I = 564765001;
        f322290J = 2011292171;
        K = 108705909;
        L = m125653x3593deb(dm.w3.class);
        M = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125653x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[14];
        java.lang.String[] strArr = new java.lang.String[15];
        e0Var.f398487c = strArr;
        strArr[0] = "localCommentId";
        e0Var.f398488d.put("localCommentId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "localCommentId";
        e0Var.f398487c[1] = "feedId";
        e0Var.f398488d.put("feedId", "LONG");
        e0Var.f398487c[2] = "actionTime";
        e0Var.f398488d.put("actionTime", "LONG");
        e0Var.f398487c[3] = "actionType";
        e0Var.f398488d.put("actionType", "INTEGER");
        e0Var.f398487c[4] = "objectNonceId";
        e0Var.f398488d.put("objectNonceId", "TEXT");
        e0Var.f398487c[5] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[6] = "state";
        e0Var.f398488d.put("state", "INTEGER");
        e0Var.f398487c[7] = "actionInfo";
        e0Var.f398488d.put("actionInfo", "BLOB");
        e0Var.f398487c[8] = "postTime";
        e0Var.f398488d.put("postTime", "LONG");
        e0Var.f398487c[9] = "tryCount";
        e0Var.f398488d.put("tryCount", "LONG");
        e0Var.f398487c[10] = "canRemove";
        e0Var.f398488d.put("canRemove", "INTEGER");
        e0Var.f398487c[11] = "lastTryTime";
        e0Var.f398488d.put("lastTryTime", "LONG");
        e0Var.f398487c[12] = "failedFlag";
        e0Var.f398488d.put("failedFlag", "INTEGER");
        e0Var.f398487c[13] = "dupFlag";
        e0Var.f398488d.put("dupFlag", "TEXT");
        e0Var.f398487c[14] = "rowid";
        e0Var.f398489e = " localCommentId LONG PRIMARY KEY ,  feedId LONG,  actionTime LONG,  actionType INTEGER,  objectNonceId TEXT,  scene INTEGER,  state INTEGER,  actionInfo BLOB,  postTime LONG,  tryCount LONG,  canRemove INTEGER,  lastTryTime LONG,  failedFlag INTEGER,  dupFlag TEXT";
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
            if (f322293w == hashCode) {
                try {
                    this.f68961xf609be94 = cursor.getLong(i17);
                    this.f322297d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322294x == hashCode) {
                try {
                    this.f68959xf9a02e3e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322295y == hashCode) {
                try {
                    this.f68954x27886e88 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322296z == hashCode) {
                try {
                    this.f68955x2788aaf5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f68962x2812d6a6 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68964x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68965x29d3a50c = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68953x27838069 = (r45.et0) new r45.et0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f68963x4ae21932 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f68966x90b085b9 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f68956x9a04736f = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f68960x9db99bed = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                try {
                    this.f68958xdad0d5ae = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322290J == hashCode) {
                try {
                    this.f68957xec748fc6 = cursor.getString(i17);
                } catch (java.lang.Throwable th19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderAction", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (K == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322297d) {
            contentValues.put("localCommentId", java.lang.Long.valueOf(this.f68961xf609be94));
        }
        if (this.f322298e) {
            contentValues.put("feedId", java.lang.Long.valueOf(this.f68959xf9a02e3e));
        }
        if (this.f322299f) {
            contentValues.put("actionTime", java.lang.Long.valueOf(this.f68954x27886e88));
        }
        if (this.f322300g) {
            contentValues.put("actionType", java.lang.Integer.valueOf(this.f68955x2788aaf5));
        }
        if (this.f322301h) {
            contentValues.put("objectNonceId", this.f68962x2812d6a6);
        }
        if (this.f322302i) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f68964x29cbf907));
        }
        if (this.f322303m) {
            contentValues.put("state", java.lang.Integer.valueOf(this.f68965x29d3a50c));
        }
        if (this.f322304n) {
            r45.et0 et0Var = this.f68953x27838069;
            if (et0Var != null) {
                try {
                    contentValues.put("actionInfo", et0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderAction", e17.getMessage());
                }
            } else {
                contentValues.put("actionInfo", (byte[]) null);
            }
        }
        if (this.f322305o) {
            contentValues.put("postTime", java.lang.Long.valueOf(this.f68963x4ae21932));
        }
        if (this.f322306p) {
            contentValues.put("tryCount", java.lang.Long.valueOf(this.f68966x90b085b9));
        }
        if (this.f322307q) {
            contentValues.put("canRemove", java.lang.Integer.valueOf(this.f68956x9a04736f));
        }
        if (this.f322308r) {
            contentValues.put("lastTryTime", java.lang.Long.valueOf(this.f68960x9db99bed));
        }
        if (this.f322309s) {
            contentValues.put("failedFlag", java.lang.Integer.valueOf(this.f68958xdad0d5ae));
        }
        if (this.f322310t) {
            contentValues.put("dupFlag", this.f68957xec748fc6);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderAction", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderAction ( ");
        l75.e0 e0Var = L;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322292v) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderAction", "createTableSql %s", str2);
            k0Var.A("FinderAction", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderAction", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderAction", "updateTableSql %s", str3);
            k0Var.A("FinderAction", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderAction", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return L;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return M;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f68961xf609be94);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322291u;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322291u.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("localCommentId")) {
            this.f68961xf609be94 = contentValues.getAsLong("localCommentId").longValue();
            if (z17) {
                this.f322297d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.f68959xf9a02e3e = contentValues.getAsLong("feedId").longValue();
            if (z17) {
                this.f322298e = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.f68954x27886e88 = contentValues.getAsLong("actionTime").longValue();
            if (z17) {
                this.f322299f = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.f68955x2788aaf5 = contentValues.getAsInteger("actionType").intValue();
            if (z17) {
                this.f322300g = true;
            }
        }
        if (contentValues.containsKey("objectNonceId")) {
            this.f68962x2812d6a6 = contentValues.getAsString("objectNonceId");
            if (z17) {
                this.f322301h = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f68964x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f322302i = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.f68965x29d3a50c = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f322303m = true;
            }
        }
        if (contentValues.containsKey("actionInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("actionInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68953x27838069 = (r45.et0) new r45.et0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f322304n = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderAction", e17.getMessage());
            }
        }
        if (contentValues.containsKey("postTime")) {
            this.f68963x4ae21932 = contentValues.getAsLong("postTime").longValue();
            if (z17) {
                this.f322305o = true;
            }
        }
        if (contentValues.containsKey("tryCount")) {
            this.f68966x90b085b9 = contentValues.getAsLong("tryCount").longValue();
            if (z17) {
                this.f322306p = true;
            }
        }
        if (contentValues.containsKey("canRemove")) {
            this.f68956x9a04736f = contentValues.getAsInteger("canRemove").intValue();
            if (z17) {
                this.f322307q = true;
            }
        }
        if (contentValues.containsKey("lastTryTime")) {
            this.f68960x9db99bed = contentValues.getAsLong("lastTryTime").longValue();
            if (z17) {
                this.f322308r = true;
            }
        }
        if (contentValues.containsKey("failedFlag")) {
            this.f68958xdad0d5ae = contentValues.getAsInteger("failedFlag").intValue();
            if (z17) {
                this.f322309s = true;
            }
        }
        if (contentValues.containsKey("dupFlag")) {
            this.f68957xec748fc6 = contentValues.getAsString("dupFlag");
            if (z17) {
                this.f322310t = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
