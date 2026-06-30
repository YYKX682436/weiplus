package dm;

/* loaded from: classes10.dex */
public class mb extends l75.f0 {
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
    public static final l75.e0 f320102J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f320103t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f320104u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320105v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320106w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320107x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320108y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320109z;

    /* renamed from: field_actionInfo */
    public r45.et0 f67473x27838069;

    /* renamed from: field_actionTime */
    public long f67474x27886e88;

    /* renamed from: field_actionType */
    public int f67475x2788aaf5;

    /* renamed from: field_canRemove */
    public int f67476x9a04736f;

    /* renamed from: field_failedFlag */
    public int f67477xdad0d5ae;

    /* renamed from: field_feedId */
    public long f67478xf9a02e3e;

    /* renamed from: field_lastTryTime */
    public long f67479x9db99bed;

    /* renamed from: field_localCommentId */
    public long f67480xf609be94;

    /* renamed from: field_objectNonceId */
    public java.lang.String f67481x2812d6a6;

    /* renamed from: field_postTime */
    public long f67482x4ae21932;

    /* renamed from: field_scene */
    public int f67483x29cbf907;

    /* renamed from: field_state */
    public int f67484x29d3a50c;

    /* renamed from: field_tryCount */
    public long f67485x90b085b9;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320110d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320111e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320112f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320113g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320114h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320115i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320116m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320117n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320118o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320119p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320120q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320121r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f320122s = true;

    static {
        p75.n0 n0Var = new p75.n0("UniAction");
        f320103t = n0Var;
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
        f320104u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_Local_Comment_Id ON UniAction(localCommentId)", "CREATE INDEX IF NOT EXISTS FinderAction_Feed_Id ON UniAction(feedId)", "CREATE INDEX IF NOT EXISTS Finder_Feed_CreateTime ON UniAction(actionTime)", "CREATE INDEX IF NOT EXISTS Finder_Feed_ActionType ON UniAction(actionType)", "CREATE INDEX IF NOT EXISTS Finder_Reply_state ON UniAction(state)"};
        f320105v = 1175274671;
        f320106w = -1278410919;
        f320107x = 1851865635;
        f320108y = 1851881104;
        f320109z = -1362583253;
        A = 109254796;
        B = 109757585;
        C = 1851542532;
        D = 757010317;
        E = 1928166420;
        F = -10073996;
        G = 838484914;
        H = 564765001;
        I = 108705909;
        f320102J = m125233x3593deb(dm.mb.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125233x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
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
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " localCommentId LONG PRIMARY KEY ,  feedId LONG,  actionTime LONG,  actionType INTEGER,  objectNonceId TEXT,  scene INTEGER,  state INTEGER,  actionInfo BLOB,  postTime LONG,  tryCount LONG,  canRemove INTEGER,  lastTryTime LONG,  failedFlag INTEGER";
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
            if (f320105v == hashCode) {
                try {
                    this.f67480xf609be94 = cursor.getLong(i17);
                    this.f320110d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320106w == hashCode) {
                try {
                    this.f67478xf9a02e3e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320107x == hashCode) {
                try {
                    this.f67474x27886e88 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320108y == hashCode) {
                try {
                    this.f67475x2788aaf5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320109z == hashCode) {
                try {
                    this.f67481x2812d6a6 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67483x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67484x29d3a50c = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67473x27838069 = (r45.et0) new r45.et0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67482x4ae21932 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67485x90b085b9 = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67476x9a04736f = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67479x9db99bed = cursor.getLong(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67477xdad0d5ae = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseUniAction", th18, "convertFrom %s", columnNames[i17]);
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
        if (this.f320110d) {
            contentValues.put("localCommentId", java.lang.Long.valueOf(this.f67480xf609be94));
        }
        if (this.f320111e) {
            contentValues.put("feedId", java.lang.Long.valueOf(this.f67478xf9a02e3e));
        }
        if (this.f320112f) {
            contentValues.put("actionTime", java.lang.Long.valueOf(this.f67474x27886e88));
        }
        if (this.f320113g) {
            contentValues.put("actionType", java.lang.Integer.valueOf(this.f67475x2788aaf5));
        }
        if (this.f320114h) {
            contentValues.put("objectNonceId", this.f67481x2812d6a6);
        }
        if (this.f320115i) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f67483x29cbf907));
        }
        if (this.f320116m) {
            contentValues.put("state", java.lang.Integer.valueOf(this.f67484x29d3a50c));
        }
        if (this.f320117n) {
            r45.et0 et0Var = this.f67473x27838069;
            if (et0Var != null) {
                try {
                    contentValues.put("actionInfo", et0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseUniAction", e17.getMessage());
                }
            } else {
                contentValues.put("actionInfo", (byte[]) null);
            }
        }
        if (this.f320118o) {
            contentValues.put("postTime", java.lang.Long.valueOf(this.f67482x4ae21932));
        }
        if (this.f320119p) {
            contentValues.put("tryCount", java.lang.Long.valueOf(this.f67485x90b085b9));
        }
        if (this.f320120q) {
            contentValues.put("canRemove", java.lang.Integer.valueOf(this.f67476x9a04736f));
        }
        if (this.f320121r) {
            contentValues.put("lastTryTime", java.lang.Long.valueOf(this.f67479x9db99bed));
        }
        if (this.f320122s) {
            contentValues.put("failedFlag", java.lang.Integer.valueOf(this.f67477xdad0d5ae));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseUniAction", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS UniAction ( ");
        l75.e0 e0Var = f320102J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320104u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseUniAction", "createTableSql %s", str2);
            k0Var.A("UniAction", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "UniAction", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseUniAction", "updateTableSql %s", str3);
            k0Var.A("UniAction", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseUniAction", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320102J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67480xf609be94);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320103t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320103t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("localCommentId")) {
            this.f67480xf609be94 = contentValues.getAsLong("localCommentId").longValue();
            if (z17) {
                this.f320110d = true;
            }
        }
        if (contentValues.containsKey("feedId")) {
            this.f67478xf9a02e3e = contentValues.getAsLong("feedId").longValue();
            if (z17) {
                this.f320111e = true;
            }
        }
        if (contentValues.containsKey("actionTime")) {
            this.f67474x27886e88 = contentValues.getAsLong("actionTime").longValue();
            if (z17) {
                this.f320112f = true;
            }
        }
        if (contentValues.containsKey("actionType")) {
            this.f67475x2788aaf5 = contentValues.getAsInteger("actionType").intValue();
            if (z17) {
                this.f320113g = true;
            }
        }
        if (contentValues.containsKey("objectNonceId")) {
            this.f67481x2812d6a6 = contentValues.getAsString("objectNonceId");
            if (z17) {
                this.f320114h = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f67483x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f320115i = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.f67484x29d3a50c = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f320116m = true;
            }
        }
        if (contentValues.containsKey("actionInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("actionInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67473x27838069 = (r45.et0) new r45.et0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f320117n = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseUniAction", e17.getMessage());
            }
        }
        if (contentValues.containsKey("postTime")) {
            this.f67482x4ae21932 = contentValues.getAsLong("postTime").longValue();
            if (z17) {
                this.f320118o = true;
            }
        }
        if (contentValues.containsKey("tryCount")) {
            this.f67485x90b085b9 = contentValues.getAsLong("tryCount").longValue();
            if (z17) {
                this.f320119p = true;
            }
        }
        if (contentValues.containsKey("canRemove")) {
            this.f67476x9a04736f = contentValues.getAsInteger("canRemove").intValue();
            if (z17) {
                this.f320120q = true;
            }
        }
        if (contentValues.containsKey("lastTryTime")) {
            this.f67479x9db99bed = contentValues.getAsLong("lastTryTime").longValue();
            if (z17) {
                this.f320121r = true;
            }
        }
        if (contentValues.containsKey("failedFlag")) {
            this.f67477xdad0d5ae = contentValues.getAsInteger("failedFlag").intValue();
            if (z17) {
                this.f320122s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
