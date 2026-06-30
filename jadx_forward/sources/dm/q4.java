package dm;

/* loaded from: classes4.dex */
public class q4 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f320928f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f320929g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f320930h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f320931i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f320932m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f320933n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f320934o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320935d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320936e = true;

    /* renamed from: field_liveId */
    public java.lang.String f68045x41d5e0c;

    /* renamed from: field_luckyMoneyData */
    public byte[] f68046xb8b7e867;

    static {
        p75.n0 n0Var = new p75.n0("FinderLiveLuckyMoneyInfo");
        f320928f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320929g = new java.lang.String[0];
        f320930h = -1102434521;
        f320931i = 146501250;
        f320932m = 108705909;
        f320933n = m125418x3593deb(dm.q4.class);
        f320934o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125418x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "liveId";
        e0Var.f398488d.put("liveId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "liveId";
        e0Var.f398487c[1] = "luckyMoneyData";
        e0Var.f398488d.put("luckyMoneyData", "BLOB");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " liveId TEXT PRIMARY KEY ,  luckyMoneyData BLOB";
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
            if (f320930h == hashCode) {
                try {
                    this.f68045x41d5e0c = cursor.getString(i17);
                    this.f320935d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320931i == hashCode) {
                try {
                    this.f68046xb8b7e867 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320932m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320935d) {
            contentValues.put("liveId", this.f68045x41d5e0c);
        }
        if (this.f320936e) {
            contentValues.put("luckyMoneyData", this.f68046xb8b7e867);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderLiveLuckyMoneyInfo ( ");
        l75.e0 e0Var = f320933n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320929g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTableSql %s", str2);
            k0Var.A("FinderLiveLuckyMoneyInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderLiveLuckyMoneyInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "updateTableSql %s", str3);
            k0Var.A("FinderLiveLuckyMoneyInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderLiveLuckyMoneyInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320933n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320934o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68045x41d5e0c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320928f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320928f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("liveId")) {
            this.f68045x41d5e0c = contentValues.getAsString("liveId");
            if (z17) {
                this.f320935d = true;
            }
        }
        if (contentValues.containsKey("luckyMoneyData")) {
            this.f68046xb8b7e867 = contentValues.getAsByteArray("luckyMoneyData");
            if (z17) {
                this.f320936e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
