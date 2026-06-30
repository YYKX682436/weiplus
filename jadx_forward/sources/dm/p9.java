package dm;

/* loaded from: classes4.dex */
public class p9 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f320751m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f320752n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320753o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320754p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320755q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320756r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320757s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320758t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320759u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f320760v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f320761w;

    /* renamed from: field_appId */
    public java.lang.String f67930x28d45f97;

    /* renamed from: field_endTime */
    public long f67931x14c61803;

    /* renamed from: field_launchProtoBlob */
    public byte[] f67932x435571ed;

    /* renamed from: field_reportId */
    public long f67933x44eeb14;

    /* renamed from: field_scene */
    public int f67934x29cbf907;

    /* renamed from: field_startTime */
    public long f67935x1bb3b54a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320762d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320763e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320764f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320765g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320766h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320767i = true;

    static {
        p75.n0 n0Var = new p75.n0("PredownloadIssueLaunchWxaAppResponse");
        f320751m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320752n = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableStartTimeIndex ON PredownloadIssueLaunchWxaAppResponse(startTime)", "CREATE INDEX IF NOT EXISTS PushDuplicateLaunchWxaAppRespTableEndTimeIndex ON PredownloadIssueLaunchWxaAppResponse(endTime)"};
        f320753o = 93028124;
        f320754p = 109254796;
        f320755q = -205344974;
        f320756r = -2129294769;
        f320757s = -1607243192;
        f320758t = -427040401;
        f320759u = 108705909;
        f320760v = m125400x3593deb(dm.p9.class);
        f320761w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125400x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[1] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[2] = "launchProtoBlob";
        e0Var.f398488d.put("launchProtoBlob", "BLOB");
        e0Var.f398487c[3] = "startTime";
        e0Var.f398488d.put("startTime", "LONG");
        e0Var.f398487c[4] = "endTime";
        e0Var.f398488d.put("endTime", "LONG");
        e0Var.f398487c[5] = "reportId";
        e0Var.f398488d.put("reportId", "LONG");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " appId TEXT,  scene INTEGER,  launchProtoBlob BLOB,  startTime LONG,  endTime LONG,  reportId LONG";
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
            if (f320753o == hashCode) {
                try {
                    this.f67930x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320754p == hashCode) {
                try {
                    this.f67934x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320755q == hashCode) {
                try {
                    this.f67932x435571ed = cursor.getBlob(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320756r == hashCode) {
                try {
                    this.f67935x1bb3b54a = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320757s == hashCode) {
                try {
                    this.f67931x14c61803 = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320758t == hashCode) {
                try {
                    this.f67933x44eeb14 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320759u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320762d) {
            contentValues.put("appId", this.f67930x28d45f97);
        }
        if (this.f320763e) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f67934x29cbf907));
        }
        if (this.f320764f) {
            contentValues.put("launchProtoBlob", this.f67932x435571ed);
        }
        if (this.f320765g) {
            contentValues.put("startTime", java.lang.Long.valueOf(this.f67935x1bb3b54a));
        }
        if (this.f320766h) {
            contentValues.put("endTime", java.lang.Long.valueOf(this.f67931x14c61803));
        }
        if (this.f320767i) {
            contentValues.put("reportId", java.lang.Long.valueOf(this.f67933x44eeb14));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS PredownloadIssueLaunchWxaAppResponse ( ");
        l75.e0 e0Var = f320760v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320752n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTableSql %s", str2);
            k0Var.A("PredownloadIssueLaunchWxaAppResponse", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "PredownloadIssueLaunchWxaAppResponse", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "updateTableSql %s", str3);
            k0Var.A("PredownloadIssueLaunchWxaAppResponse", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BasePredownloadIssueLaunchWxaAppResponse", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320760v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320761w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320751m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320751m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f67930x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f320762d = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f67934x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f320763e = true;
            }
        }
        if (contentValues.containsKey("launchProtoBlob")) {
            this.f67932x435571ed = contentValues.getAsByteArray("launchProtoBlob");
            if (z17) {
                this.f320764f = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.f67935x1bb3b54a = contentValues.getAsLong("startTime").longValue();
            if (z17) {
                this.f320765g = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.f67931x14c61803 = contentValues.getAsLong("endTime").longValue();
            if (z17) {
                this.f320766h = true;
            }
        }
        if (contentValues.containsKey("reportId")) {
            this.f67933x44eeb14 = contentValues.getAsLong("reportId").longValue();
            if (z17) {
                this.f320767i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
