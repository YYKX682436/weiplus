package dm;

/* loaded from: classes4.dex */
public class o2 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f320407h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f320408i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320409m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f320410n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320411o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320412p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320413q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f320414r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f320415s;

    /* renamed from: field_ecsGiftRedLabelType */
    public int f67775xc4d9c6fd;

    /* renamed from: field_ecsUnhandledGiftCount */
    public int f67776xbdb2116c;

    /* renamed from: field_lastHandleEcsGiftTimeStampMs */
    public long f67777x6d297bba;

    /* renamed from: field_talker */
    public java.lang.String f67778x114ef53e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320416d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320417e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320418f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320419g = true;

    static {
        p75.n0 n0Var = new p75.n0("EcsConversationRecord");
        f320407h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320408i = new java.lang.String[0];
        f320409m = -881080743;
        f320410n = -963934479;
        f320411o = -701703742;
        f320412p = 1336850069;
        f320413q = 108705909;
        f320414r = m125357x3593deb(dm.o2.class);
        f320415s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125357x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "talker";
        e0Var.f398488d.put("talker", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "talker";
        e0Var.f398487c[1] = "ecsUnhandledGiftCount";
        e0Var.f398488d.put("ecsUnhandledGiftCount", "INTEGER");
        e0Var.f398487c[2] = "ecsGiftRedLabelType";
        e0Var.f398488d.put("ecsGiftRedLabelType", "INTEGER");
        e0Var.f398487c[3] = "lastHandleEcsGiftTimeStampMs";
        e0Var.f398488d.put("lastHandleEcsGiftTimeStampMs", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " talker TEXT PRIMARY KEY ,  ecsUnhandledGiftCount INTEGER,  ecsGiftRedLabelType INTEGER,  lastHandleEcsGiftTimeStampMs LONG";
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
            if (f320409m == hashCode) {
                try {
                    this.f67778x114ef53e = cursor.getString(i17);
                    this.f320416d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsConversationRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320410n == hashCode) {
                try {
                    this.f67776xbdb2116c = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsConversationRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320411o == hashCode) {
                try {
                    this.f67775xc4d9c6fd = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsConversationRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320412p == hashCode) {
                try {
                    this.f67777x6d297bba = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEcsConversationRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320413q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320416d) {
            contentValues.put("talker", this.f67778x114ef53e);
        }
        if (this.f320417e) {
            contentValues.put("ecsUnhandledGiftCount", java.lang.Integer.valueOf(this.f67776xbdb2116c));
        }
        if (this.f320418f) {
            contentValues.put("ecsGiftRedLabelType", java.lang.Integer.valueOf(this.f67775xc4d9c6fd));
        }
        if (this.f320419g) {
            contentValues.put("lastHandleEcsGiftTimeStampMs", java.lang.Long.valueOf(this.f67777x6d297bba));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEcsConversationRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EcsConversationRecord ( ");
        l75.e0 e0Var = f320414r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320408i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsConversationRecord", "createTableSql %s", str2);
            k0Var.A("EcsConversationRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EcsConversationRecord", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsConversationRecord", "updateTableSql %s", str3);
            k0Var.A("EcsConversationRecord", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEcsConversationRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320414r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320415s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67778x114ef53e;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320407h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320407h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("talker")) {
            this.f67778x114ef53e = contentValues.getAsString("talker");
            if (z17) {
                this.f320416d = true;
            }
        }
        if (contentValues.containsKey("ecsUnhandledGiftCount")) {
            this.f67776xbdb2116c = contentValues.getAsInteger("ecsUnhandledGiftCount").intValue();
            if (z17) {
                this.f320417e = true;
            }
        }
        if (contentValues.containsKey("ecsGiftRedLabelType")) {
            this.f67775xc4d9c6fd = contentValues.getAsInteger("ecsGiftRedLabelType").intValue();
            if (z17) {
                this.f320418f = true;
            }
        }
        if (contentValues.containsKey("lastHandleEcsGiftTimeStampMs")) {
            this.f67777x6d297bba = contentValues.getAsLong("lastHandleEcsGiftTimeStampMs").longValue();
            if (z17) {
                this.f320419g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
