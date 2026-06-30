package dm;

/* loaded from: classes4.dex */
public class ja extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f319409h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f319410i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f319411m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319412n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319413o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319414p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319415q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319416r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f319417s;

    /* renamed from: t, reason: collision with root package name */
    public static final o75.e f319418t;

    /* renamed from: field_id */
    public int f67155xc8a07680;

    /* renamed from: field_key */
    public java.lang.String f67156x4b6e619a;

    /* renamed from: field_selfUsername */
    public java.lang.String f67157x55775f67;

    /* renamed from: field_signedVersion */
    public int f67158x30b88397;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319419d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319420e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319421f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319422g = true;

    static {
        p75.n0 n0Var = new p75.n0("SignedAgreementInfo");
        f319409h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319410i = new p75.d("selfUsername", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319411m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS SignedAgreementInfo_selfUsername ON SignedAgreementInfo(selfUsername)"};
        f319412n = 106079;
        f319413o = 1229697090;
        f319414p = 3355;
        f319415q = -1217507812;
        f319416r = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        ((java.util.HashMap) e0Var.f398488d).put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "selfUsername";
        ((java.util.HashMap) e0Var.f398488d).put("selfUsername", "TEXT");
        e0Var.f398487c[2] = dm.i4.f66865x76d1ec5a;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66865x76d1ec5a, "INTEGER");
        e0Var.f398487c[3] = "signedVersion";
        ((java.util.HashMap) e0Var.f398488d).put("signedVersion", "INTEGER default '0' ");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  selfUsername TEXT,  id INTEGER,  signedVersion INTEGER default '0' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f319417s = e0Var;
        f319418t = new o75.e();
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
            if (f319412n == hashCode) {
                try {
                    this.f67156x4b6e619a = cursor.getString(i17);
                    this.f319419d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSignedAgreementInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319413o == hashCode) {
                try {
                    this.f67157x55775f67 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSignedAgreementInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319414p == hashCode) {
                try {
                    this.f67155xc8a07680 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSignedAgreementInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319415q == hashCode) {
                try {
                    this.f67158x30b88397 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseSignedAgreementInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319416r == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319419d) {
            contentValues.put("key", this.f67156x4b6e619a);
        }
        if (this.f319420e) {
            contentValues.put("selfUsername", this.f67157x55775f67);
        }
        if (this.f319421f) {
            contentValues.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(this.f67155xc8a07680));
        }
        if (this.f319422g) {
            contentValues.put("signedVersion", java.lang.Integer.valueOf(this.f67158x30b88397));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseSignedAgreementInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SignedAgreementInfo ( ");
        l75.e0 e0Var = f319417s;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319411m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSignedAgreementInfo", "createTableSql %s", str2);
            k0Var.A("SignedAgreementInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "SignedAgreementInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSignedAgreementInfo", "updateTableSql %s", str3);
            k0Var.A("SignedAgreementInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseSignedAgreementInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319417s;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319418t;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67156x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319409h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319409h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f67156x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f319419d = true;
            }
        }
        if (contentValues.containsKey("selfUsername")) {
            this.f67157x55775f67 = contentValues.getAsString("selfUsername");
            if (z17) {
                this.f319420e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67155xc8a07680 = contentValues.getAsInteger(dm.i4.f66865x76d1ec5a).intValue();
            if (z17) {
                this.f319421f = true;
            }
        }
        if (contentValues.containsKey("signedVersion")) {
            this.f67158x30b88397 = contentValues.getAsInteger("signedVersion").intValue();
            if (z17) {
                this.f319422g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
