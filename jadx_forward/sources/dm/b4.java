package dm;

/* loaded from: classes8.dex */
public class b4 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f317371g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f317372h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f317373i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f317374m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f317375n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f317376o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f317377p;

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f317378q;

    /* renamed from: r, reason: collision with root package name */
    public static final o75.e f317379r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317380d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317381e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317382f = true;

    /* renamed from: field_courseInfo */
    public r45.uz0 f65973x4d9967ce;

    /* renamed from: field_dramaInfo */
    public r45.n11 f65974x9255f2b0;

    /* renamed from: field_topic_id */
    public long f65975xe4b3ebd0;

    static {
        p75.n0 n0Var = new p75.n0("FinderCourseInfo");
        f317371g = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317372h = new p75.d("topic_id", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317373i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderCourseInfo_index ON FinderCourseInfo(topic_id)"};
        f317374m = -957291989;
        f317375n = -1804455063;
        f317376o = -138950731;
        f317377p = 108705909;
        f317378q = m124811x3593deb(dm.b4.class);
        f317379r = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124811x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "topic_id";
        e0Var.f398488d.put("topic_id", "LONG PRIMARY KEY ");
        e0Var.f398486b = "topic_id";
        e0Var.f398487c[1] = "courseInfo";
        e0Var.f398488d.put("courseInfo", "BLOB");
        e0Var.f398487c[2] = "dramaInfo";
        e0Var.f398488d.put("dramaInfo", "BLOB");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " topic_id LONG PRIMARY KEY ,  courseInfo BLOB,  dramaInfo BLOB";
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
            if (f317374m == hashCode) {
                try {
                    this.f65975xe4b3ebd0 = cursor.getLong(i17);
                    this.f317380d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCourseInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317375n == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f65973x4d9967ce = (r45.uz0) new r45.uz0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCourseInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317376o == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.f65974x9255f2b0 = (r45.n11) new r45.n11().mo11468x92b714fd(blob2);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCourseInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317377p == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317380d) {
            contentValues.put("topic_id", java.lang.Long.valueOf(this.f65975xe4b3ebd0));
        }
        if (this.f317381e) {
            r45.uz0 uz0Var = this.f65973x4d9967ce;
            if (uz0Var != null) {
                try {
                    contentValues.put("courseInfo", uz0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e17.getMessage());
                }
            } else {
                contentValues.put("courseInfo", (byte[]) null);
            }
        }
        if (this.f317382f) {
            r45.n11 n11Var = this.f65974x9255f2b0;
            if (n11Var != null) {
                try {
                    contentValues.put("dramaInfo", n11Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e18.getMessage());
                }
            } else {
                contentValues.put("dramaInfo", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderCourseInfo ( ");
        l75.e0 e0Var = f317378q;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317373i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderCourseInfo", "createTableSql %s", str2);
            k0Var.A("FinderCourseInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderCourseInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderCourseInfo", "updateTableSql %s", str3);
            k0Var.A("FinderCourseInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderCourseInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f317378q;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f317379r;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f65975xe4b3ebd0);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317371g;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317371g.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("topic_id")) {
            this.f65975xe4b3ebd0 = contentValues.getAsLong("topic_id").longValue();
            if (z17) {
                this.f317380d = true;
            }
        }
        if (contentValues.containsKey("courseInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("courseInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f65973x4d9967ce = (r45.uz0) new r45.uz0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f317381e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("dramaInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("dramaInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.f65974x9255f2b0 = (r45.n11) new r45.n11().mo11468x92b714fd(asByteArray2);
                    if (z17) {
                        this.f317382f = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e18.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
