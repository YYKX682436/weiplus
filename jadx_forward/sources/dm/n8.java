package dm;

/* loaded from: classes8.dex */
public class n8 extends l75.f0 {
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
    public static final l75.e0 f320261J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f320262t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f320263u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f320264v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f320265w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f320266x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f320267y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f320268z;

    /* renamed from: field_autoDisappearTime */
    public float f67685xd503b39c;

    /* renamed from: field_bindFeedId */
    public long f67686xd738625b;

    /* renamed from: field_conditions */
    public int f67687x81ab6b1d;

    /* renamed from: field_delayAppearTime */
    public float f67688x515b52a0;

    /* renamed from: field_deliverScenes */
    public int f67689x2556f467;

    /* renamed from: field_excludeDays */
    public int f67690xb36a1d8c;

    /* renamed from: field_expireTime */
    public long f67691x876650f1;

    /* renamed from: field_feedMediaTypes */
    public long f67692xe4519518;

    /* renamed from: field_feedPos */
    public java.lang.String f67693x3a65b591;

    /* renamed from: field_isFromJumper */
    public boolean f67694xfee77594;

    /* renamed from: field_isPreview */
    public boolean f67695x65185639;

    /* renamed from: field_startTime */
    public long f67696x1bb3b54a;

    /* renamed from: field_taskId */
    public long f67697x11522065;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320269d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320270e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320271f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320272g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320273h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320274i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f320275m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f320276n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f320277o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f320278p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f320279q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f320280r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f320281s = true;

    static {
        p75.n0 n0Var = new p75.n0("NpsSurveyTaskConfig");
        f320262t = n0Var;
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
        f320263u = new java.lang.String[0];
        f320264v = -880873088;
        f320265w = -930859336;
        f320266x = -976025642;
        f320267y = -1408450836;
        f320268z = -2129294769;
        A = -834724724;
        B = 1202373969;
        C = -897963202;
        D = 29921253;
        E = 521581473;
        F = 877992755;
        G = -222574993;
        H = 504442358;
        I = 108705909;
        f320261J = m125342x3593deb(dm.n8.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125342x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "taskId";
        e0Var.f398488d.put("taskId", "LONG PRIMARY KEY ");
        e0Var.f398486b = "taskId";
        e0Var.f398487c[1] = "conditions";
        e0Var.f398488d.put("conditions", "INTEGER");
        e0Var.f398487c[2] = "feedPos";
        e0Var.f398488d.put("feedPos", "TEXT default '' ");
        e0Var.f398487c[3] = "deliverScenes";
        e0Var.f398488d.put("deliverScenes", "INTEGER");
        e0Var.f398487c[4] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[5] = "expireTime";
        e0Var.f398488d.put("expireTime", "LONG");
        e0Var.f398487c[6] = "excludeDays";
        e0Var.f398488d.put("excludeDays", "INTEGER");
        e0Var.f398487c[7] = "isPreview";
        e0Var.f398488d.put("isPreview", "INTEGER default 'false' ");
        e0Var.f398487c[8] = "delayAppearTime";
        e0Var.f398488d.put("delayAppearTime", "FLOAT");
        e0Var.f398487c[9] = "autoDisappearTime";
        e0Var.f398488d.put("autoDisappearTime", "FLOAT");
        e0Var.f398487c[10] = "feedMediaTypes";
        e0Var.f398488d.put("feedMediaTypes", "LONG");
        e0Var.f398487c[11] = "isFromJumper";
        e0Var.f398488d.put("isFromJumper", "INTEGER default 'false' ");
        e0Var.f398487c[12] = "bindFeedId";
        e0Var.f398488d.put("bindFeedId", "LONG");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " taskId LONG PRIMARY KEY ,  conditions INTEGER,  feedPos TEXT default '' ,  deliverScenes INTEGER,  startTime LONG,  expireTime LONG,  excludeDays INTEGER,  isPreview INTEGER default 'false' ,  delayAppearTime FLOAT,  autoDisappearTime FLOAT,  feedMediaTypes LONG,  isFromJumper INTEGER default 'false' ,  bindFeedId LONG";
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
            if (f320264v == hashCode) {
                try {
                    this.f67697x11522065 = cursor.getLong(i17);
                    this.f320269d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320265w == hashCode) {
                try {
                    this.f67687x81ab6b1d = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320266x == hashCode) {
                try {
                    this.f67693x3a65b591 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320267y == hashCode) {
                try {
                    this.f67689x2556f467 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320268z == hashCode) {
                try {
                    this.f67696x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67691x876650f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67690xb36a1d8c = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67695x65185639 = z17;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67688x515b52a0 = cursor.getFloat(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    this.f67685xd503b39c = cursor.getFloat(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67692xe4519518 = cursor.getLong(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67694xfee77594 = z17;
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67686xd738625b = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseNpsSurveyTaskConfig", th18, "convertFrom %s", columnNames[i17]);
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
        if (this.f320269d) {
            contentValues.put("taskId", java.lang.Long.valueOf(this.f67697x11522065));
        }
        if (this.f320270e) {
            contentValues.put("conditions", java.lang.Integer.valueOf(this.f67687x81ab6b1d));
        }
        if (this.f67693x3a65b591 == null) {
            this.f67693x3a65b591 = "";
        }
        if (this.f320271f) {
            contentValues.put("feedPos", this.f67693x3a65b591);
        }
        if (this.f320272g) {
            contentValues.put("deliverScenes", java.lang.Integer.valueOf(this.f67689x2556f467));
        }
        if (this.f320273h) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f67696x1bb3b54a));
        }
        if (this.f320274i) {
            contentValues.put("expireTime", java.lang.Long.valueOf(this.f67691x876650f1));
        }
        if (this.f320275m) {
            contentValues.put("excludeDays", java.lang.Integer.valueOf(this.f67690xb36a1d8c));
        }
        if (this.f320276n) {
            if (this.f67695x65185639) {
                contentValues.put("isPreview", (java.lang.Integer) 1);
            } else {
                contentValues.put("isPreview", (java.lang.Integer) 0);
            }
        }
        if (this.f320277o) {
            contentValues.put("delayAppearTime", java.lang.Float.valueOf(this.f67688x515b52a0));
        }
        if (this.f320278p) {
            contentValues.put("autoDisappearTime", java.lang.Float.valueOf(this.f67685xd503b39c));
        }
        if (this.f320279q) {
            contentValues.put("feedMediaTypes", java.lang.Long.valueOf(this.f67692xe4519518));
        }
        if (this.f320280r) {
            if (this.f67694xfee77594) {
                contentValues.put("isFromJumper", (java.lang.Integer) 1);
            } else {
                contentValues.put("isFromJumper", (java.lang.Integer) 0);
            }
        }
        if (this.f320281s) {
            contentValues.put("bindFeedId", java.lang.Long.valueOf(this.f67686xd738625b));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NpsSurveyTaskConfig ( ");
        l75.e0 e0Var = f320261J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320263u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTableSql %s", str2);
            k0Var.A("NpsSurveyTaskConfig", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "NpsSurveyTaskConfig", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "updateTableSql %s", str3);
            k0Var.A("NpsSurveyTaskConfig", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseNpsSurveyTaskConfig", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320261J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67697x11522065);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320262t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320262t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("taskId")) {
            this.f67697x11522065 = contentValues.getAsLong("taskId").longValue();
            if (z17) {
                this.f320269d = true;
            }
        }
        if (contentValues.containsKey("conditions")) {
            this.f67687x81ab6b1d = contentValues.getAsInteger("conditions").intValue();
            if (z17) {
                this.f320270e = true;
            }
        }
        if (contentValues.containsKey("feedPos")) {
            this.f67693x3a65b591 = contentValues.getAsString("feedPos");
            if (z17) {
                this.f320271f = true;
            }
        }
        if (contentValues.containsKey("deliverScenes")) {
            this.f67689x2556f467 = contentValues.getAsInteger("deliverScenes").intValue();
            if (z17) {
                this.f320272g = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f67696x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f320273h = true;
            }
        }
        if (contentValues.containsKey("expireTime")) {
            this.f67691x876650f1 = contentValues.getAsLong("expireTime").longValue();
            if (z17) {
                this.f320274i = true;
            }
        }
        if (contentValues.containsKey("excludeDays")) {
            this.f67690xb36a1d8c = contentValues.getAsInteger("excludeDays").intValue();
            if (z17) {
                this.f320275m = true;
            }
        }
        if (contentValues.containsKey("isPreview")) {
            this.f67695x65185639 = contentValues.getAsInteger("isPreview").intValue() != 0;
            if (z17) {
                this.f320276n = true;
            }
        }
        if (contentValues.containsKey("delayAppearTime")) {
            this.f67688x515b52a0 = contentValues.getAsFloat("delayAppearTime").floatValue();
            if (z17) {
                this.f320277o = true;
            }
        }
        if (contentValues.containsKey("autoDisappearTime")) {
            this.f67685xd503b39c = contentValues.getAsFloat("autoDisappearTime").floatValue();
            if (z17) {
                this.f320278p = true;
            }
        }
        if (contentValues.containsKey("feedMediaTypes")) {
            this.f67692xe4519518 = contentValues.getAsLong("feedMediaTypes").longValue();
            if (z17) {
                this.f320279q = true;
            }
        }
        if (contentValues.containsKey("isFromJumper")) {
            this.f67694xfee77594 = contentValues.getAsInteger("isFromJumper").intValue() != 0;
            if (z17) {
                this.f320280r = true;
            }
        }
        if (contentValues.containsKey("bindFeedId")) {
            this.f67686xd738625b = contentValues.getAsLong("bindFeedId").longValue();
            if (z17) {
                this.f320281s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
