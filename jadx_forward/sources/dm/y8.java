package dm;

/* loaded from: classes4.dex */
public class y8 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f322753i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f322754m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f322755n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322756o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322757p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322758q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322759r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322760s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f322761t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f322762u;

    /* renamed from: field_appId */
    public java.lang.String f69197x28d45f97;

    /* renamed from: field_updateTime */
    public long f69198xa783a79b;

    /* renamed from: field_voipExtraData */
    public java.lang.String f69199x19f64795;

    /* renamed from: field_voipRecordPath */
    public java.lang.String f69200x258fd3bb;

    /* renamed from: field_voipRoomId */
    public java.lang.String f69201xef00797b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322763d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322764e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322765f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322766g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322767h = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenVoiceServiceVoipRecord");
        f322753i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322754m = new java.lang.String[0];
        f322755n = 903431446;
        f322756o = 93028124;
        f322757p = 1972591062;
        f322758q = -295931082;
        f322759r = -1599335910;
        f322760s = 108705909;
        f322761t = m125712x3593deb(dm.y8.class);
        f322762u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125712x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "voipRoomId";
        e0Var.f398488d.put("voipRoomId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "voipRoomId";
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[2] = "voipRecordPath";
        e0Var.f398488d.put("voipRecordPath", "TEXT");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG");
        e0Var.f398487c[4] = "voipExtraData";
        e0Var.f398488d.put("voipExtraData", "TEXT");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " voipRoomId TEXT PRIMARY KEY ,  appId TEXT,  voipRecordPath TEXT,  updateTime LONG,  voipExtraData TEXT";
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
            if (f322755n == hashCode) {
                try {
                    this.f69201xef00797b = cursor.getString(i17);
                    this.f322763d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322756o == hashCode) {
                try {
                    this.f69197x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322757p == hashCode) {
                try {
                    this.f69200x258fd3bb = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322758q == hashCode) {
                try {
                    this.f69198xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322759r == hashCode) {
                try {
                    this.f69199x19f64795 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322760s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322763d) {
            contentValues.put("voipRoomId", this.f69201xef00797b);
        }
        if (this.f322764e) {
            contentValues.put("appId", this.f69197x28d45f97);
        }
        if (this.f322765f) {
            contentValues.put("voipRecordPath", this.f69200x258fd3bb);
        }
        if (this.f322766g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f69198xa783a79b));
        }
        if (this.f322767h) {
            contentValues.put("voipExtraData", this.f69199x19f64795);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenVoiceServiceVoipRecord ( ");
        l75.e0 e0Var = f322761t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322754m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "createTableSql %s", str2);
            k0Var.A("OpenVoiceServiceVoipRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "OpenVoiceServiceVoipRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "updateTableSql %s", str3);
            k0Var.A("OpenVoiceServiceVoipRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322761t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322762u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69201xef00797b;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322753i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322753i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("voipRoomId")) {
            this.f69201xef00797b = contentValues.getAsString("voipRoomId");
            if (z17) {
                this.f322763d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f69197x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f322764e = true;
            }
        }
        if (contentValues.containsKey("voipRecordPath")) {
            this.f69200x258fd3bb = contentValues.getAsString("voipRecordPath");
            if (z17) {
                this.f322765f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f69198xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f322766g = true;
            }
        }
        if (contentValues.containsKey("voipExtraData")) {
            this.f69199x19f64795 = contentValues.getAsString("voipExtraData");
            if (z17) {
                this.f322767h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
