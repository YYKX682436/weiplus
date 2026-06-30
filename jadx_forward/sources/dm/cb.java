package dm;

/* loaded from: classes4.dex */
public class cb extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f317743m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f317744n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317745o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317746p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f317747q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f317748r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317749s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317750t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317751u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f317752v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f317753w;

    /* renamed from: field_available */
    public int f66173x6edfb5c4;

    /* renamed from: field_baseItemData */
    public byte[] f66174xeed4d673;

    /* renamed from: field_mixFlag */
    public int f66175xb48339a3;

    /* renamed from: field_mixRetryTime */
    public int f66176x2277e5be;

    /* renamed from: field_storyLocalId */
    public int f66177x7bbdfa56;

    /* renamed from: field_timeStamp */
    public long f66178x9c2463f1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317754d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317755e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317756f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317757g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317758h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317759i = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryEditorInfo");
        f317743m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317744n = new java.lang.String[0];
        f317745o = -492230834;
        f317746p = 25573622;
        f317747q = 1871858481;
        f317748r = 1072729064;
        f317749s = 374093465;
        f317750t = -733902135;
        f317751u = 108705909;
        f317752v = m124857x3593deb(dm.cb.class);
        f317753w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124857x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "baseItemData";
        e0Var.f398488d.put("baseItemData", "BLOB");
        e0Var.f398487c[1] = "timeStamp";
        e0Var.f398488d.put("timeStamp", "LONG");
        e0Var.f398487c[2] = "storyLocalId";
        e0Var.f398488d.put("storyLocalId", "INTEGER");
        e0Var.f398487c[3] = "mixFlag";
        e0Var.f398488d.put("mixFlag", "INTEGER");
        e0Var.f398487c[4] = "mixRetryTime";
        e0Var.f398488d.put("mixRetryTime", "INTEGER");
        e0Var.f398487c[5] = "available";
        e0Var.f398488d.put("available", "INTEGER");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " baseItemData BLOB,  timeStamp LONG,  storyLocalId INTEGER,  mixFlag INTEGER,  mixRetryTime INTEGER,  available INTEGER";
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
            if (f317745o == hashCode) {
                try {
                    this.f66174xeed4d673 = cursor.getBlob(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryEditorInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317746p == hashCode) {
                try {
                    this.f66178x9c2463f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryEditorInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317747q == hashCode) {
                try {
                    this.f66177x7bbdfa56 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryEditorInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317748r == hashCode) {
                try {
                    this.f66175xb48339a3 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryEditorInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317749s == hashCode) {
                try {
                    this.f66176x2277e5be = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryEditorInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317750t == hashCode) {
                try {
                    this.f66173x6edfb5c4 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStoryEditorInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317751u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317754d) {
            contentValues.put("baseItemData", this.f66174xeed4d673);
        }
        if (this.f317755e) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.f66178x9c2463f1));
        }
        if (this.f317756f) {
            contentValues.put("storyLocalId", java.lang.Integer.valueOf(this.f66177x7bbdfa56));
        }
        if (this.f317757g) {
            contentValues.put("mixFlag", java.lang.Integer.valueOf(this.f66175xb48339a3));
        }
        if (this.f317758h) {
            contentValues.put("mixRetryTime", java.lang.Integer.valueOf(this.f66176x2277e5be));
        }
        if (this.f317759i) {
            contentValues.put("available", java.lang.Integer.valueOf(this.f66173x6edfb5c4));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseStoryEditorInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryEditorInfo ( ");
        l75.e0 e0Var = f317752v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317744n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryEditorInfo", "createTableSql %s", str2);
            k0Var.A("StoryEditorInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "StoryEditorInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryEditorInfo", "updateTableSql %s", str3);
            k0Var.A("StoryEditorInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStoryEditorInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317752v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317753w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317743m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317743m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("baseItemData")) {
            this.f66174xeed4d673 = contentValues.getAsByteArray("baseItemData");
            if (z17) {
                this.f317754d = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.f66178x9c2463f1 = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f317755e = true;
            }
        }
        if (contentValues.containsKey("storyLocalId")) {
            this.f66177x7bbdfa56 = contentValues.getAsInteger("storyLocalId").intValue();
            if (z17) {
                this.f317756f = true;
            }
        }
        if (contentValues.containsKey("mixFlag")) {
            this.f66175xb48339a3 = contentValues.getAsInteger("mixFlag").intValue();
            if (z17) {
                this.f317757g = true;
            }
        }
        if (contentValues.containsKey("mixRetryTime")) {
            this.f66176x2277e5be = contentValues.getAsInteger("mixRetryTime").intValue();
            if (z17) {
                this.f317758h = true;
            }
        }
        if (contentValues.containsKey("available")) {
            this.f66173x6edfb5c4 = contentValues.getAsInteger("available").intValue();
            if (z17) {
                this.f317759i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
