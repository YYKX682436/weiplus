package dm;

/* loaded from: classes8.dex */
public class o5 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320469h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320470i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320471m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320472n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320473o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320474p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320475q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f320476r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f320477s;

    /* renamed from: field_extInfo */
    public v53.c f67823x26b3182a;

    /* renamed from: field_selfUserName */
    public java.lang.String f67824x5568d387;

    /* renamed from: field_sessionId */
    public java.lang.String f67825xbed8694c;

    /* renamed from: field_talker */
    public java.lang.String f67826x114ef53e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320478d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320479e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320480f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320481g = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeSessionInfo");
        f320469h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320470i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_sessionId_index ON GameLifeSessionInfo(sessionId)", "CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_talker_index ON GameLifeSessionInfo(talker)", "CREATE INDEX IF NOT EXISTS GameLifeSessionInfo_selfUsername_index ON GameLifeSessionInfo(selfUserName)"};
        f320471m = 607796817;
        f320472n = -881080743;
        f320473o = 1228743778;
        f320474p = -1306498449;
        f320475q = 108705909;
        f320476r = m125363x3593deb(dm.o5.class);
        f320477s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125363x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398488d.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984;
        e0Var.f398487c[1] = "talker";
        e0Var.f398488d.put("talker", "TEXT default '' ");
        e0Var.f398487c[2] = "selfUserName";
        e0Var.f398488d.put("selfUserName", "TEXT default '' ");
        e0Var.f398487c[3] = "extInfo";
        e0Var.f398488d.put("extInfo", "BLOB");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " sessionId TEXT default ''  PRIMARY KEY ,  talker TEXT default '' ,  selfUserName TEXT default '' ,  extInfo BLOB";
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
            if (f320471m == hashCode) {
                try {
                    this.f67825xbed8694c = cursor.getString(i17);
                    this.f320478d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeSessionInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320472n == hashCode) {
                try {
                    this.f67826x114ef53e = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeSessionInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320473o == hashCode) {
                try {
                    this.f67824x5568d387 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeSessionInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320474p == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67823x26b3182a = (v53.c) new v53.c().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameLifeSessionInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320475q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f67825xbed8694c == null) {
            this.f67825xbed8694c = "";
        }
        if (this.f320478d) {
            contentValues.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f67825xbed8694c);
        }
        if (this.f67826x114ef53e == null) {
            this.f67826x114ef53e = "";
        }
        if (this.f320479e) {
            contentValues.put("talker", this.f67826x114ef53e);
        }
        if (this.f67824x5568d387 == null) {
            this.f67824x5568d387 = "";
        }
        if (this.f320480f) {
            contentValues.put("selfUserName", this.f67824x5568d387);
        }
        if (this.f320481g) {
            v53.c cVar = this.f67823x26b3182a;
            if (cVar != null) {
                try {
                    contentValues.put("extInfo", cVar.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeSessionInfo", e17.getMessage());
                }
            } else {
                contentValues.put("extInfo", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeSessionInfo ( ");
        l75.e0 e0Var = f320476r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320470i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTableSql %s", str2);
            k0Var.A("GameLifeSessionInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameLifeSessionInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeSessionInfo", "updateTableSql %s", str3);
            k0Var.A("GameLifeSessionInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameLifeSessionInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320476r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320477s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67825xbed8694c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320469h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320469h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f67825xbed8694c = contentValues.getAsString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            if (z17) {
                this.f320478d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.f67826x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f320479e = true;
            }
        }
        if (contentValues.containsKey("selfUserName")) {
            this.f67824x5568d387 = contentValues.getAsString("selfUserName");
            if (z17) {
                this.f320480f = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("extInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67823x26b3182a = (v53.c) new v53.c().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f320481g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameLifeSessionInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
