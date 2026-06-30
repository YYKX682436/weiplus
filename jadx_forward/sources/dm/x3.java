package dm;

/* loaded from: classes7.dex */
public class x3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f322542m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f322543n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f322544o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322545p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322546q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322547r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322548s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322549t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322550u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f322551v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f322552w;

    /* renamed from: field_biz_type */
    public int f69116x6a05088b;

    /* renamed from: field_bypass_buffer */
    public java.lang.String f69117xb27c84f2;

    /* renamed from: field_display_info */
    public r45.bf0 f69118x6c6ddd30;

    /* renamed from: field_end_ts */
    public long f69119xf869a748;

    /* renamed from: field_report_only */
    public boolean f69120x5d0afc12;

    /* renamed from: field_start_ts */
    public long f69121x6c3fc521;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322553d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322554e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322555f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322556g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322557h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322558i = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderCommEducationInfoItem");
        f322542m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322543n = new java.lang.String[0];
        f322544o = 1279393510;
        f322545p = 1316797308;
        f322546q = -1298761629;
        f322547r = -246701097;
        f322548s = 1614949899;
        f322549t = 959598455;
        f322550u = 108705909;
        f322551v = m125681x3593deb(dm.x3.class);
        f322552w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125681x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = "biz_type";
        e0Var.f398488d.put("biz_type", "INTEGER PRIMARY KEY ");
        e0Var.f398486b = "biz_type";
        e0Var.f398487c[1] = "start_ts";
        e0Var.f398488d.put("start_ts", "LONG");
        e0Var.f398487c[2] = "end_ts";
        e0Var.f398488d.put("end_ts", "LONG");
        e0Var.f398487c[3] = "report_only";
        e0Var.f398488d.put("report_only", "INTEGER");
        e0Var.f398487c[4] = "display_info";
        e0Var.f398488d.put("display_info", "BLOB");
        e0Var.f398487c[5] = "bypass_buffer";
        e0Var.f398488d.put("bypass_buffer", "TEXT");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " biz_type INTEGER PRIMARY KEY ,  start_ts LONG,  end_ts LONG,  report_only INTEGER,  display_info BLOB,  bypass_buffer TEXT";
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
            if (f322544o == hashCode) {
                try {
                    this.f69116x6a05088b = cursor.getInt(i17);
                    this.f322553d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322545p == hashCode) {
                try {
                    this.f69121x6c3fc521 = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322546q == hashCode) {
                try {
                    this.f69119xf869a748 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322547r == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f69120x5d0afc12 = z17;
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322548s == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f69118x6c6ddd30 = (r45.bf0) new r45.bf0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322549t == hashCode) {
                try {
                    this.f69117xb27c84f2 = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322550u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322553d) {
            contentValues.put("biz_type", java.lang.Integer.valueOf(this.f69116x6a05088b));
        }
        if (this.f322554e) {
            contentValues.put("start_ts", java.lang.Long.valueOf(this.f69121x6c3fc521));
        }
        if (this.f322555f) {
            contentValues.put("end_ts", java.lang.Long.valueOf(this.f69119xf869a748));
        }
        if (this.f322556g) {
            if (this.f69120x5d0afc12) {
                contentValues.put("report_only", (java.lang.Integer) 1);
            } else {
                contentValues.put("report_only", (java.lang.Integer) 0);
            }
        }
        if (this.f322557h) {
            r45.bf0 bf0Var = this.f69118x6c6ddd30;
            if (bf0Var != null) {
                try {
                    contentValues.put("display_info", bf0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCommEducationInfoItem", e17.getMessage());
                }
            } else {
                contentValues.put("display_info", (byte[]) null);
            }
        }
        if (this.f322558i) {
            contentValues.put("bypass_buffer", this.f69117xb27c84f2);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderCommEducationInfoItem ( ");
        l75.e0 e0Var = f322551v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322543n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "createTableSql %s", str2);
            k0Var.A("FinderCommEducationInfoItem", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderCommEducationInfoItem", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "updateTableSql %s", str3);
            k0Var.A("FinderCommEducationInfoItem", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322551v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322552w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Integer.valueOf(this.f69116x6a05088b);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322542m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322542m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("biz_type")) {
            this.f69116x6a05088b = contentValues.getAsInteger("biz_type").intValue();
            if (z17) {
                this.f322553d = true;
            }
        }
        if (contentValues.containsKey("start_ts")) {
            this.f69121x6c3fc521 = contentValues.getAsLong("start_ts").longValue();
            if (z17) {
                this.f322554e = true;
            }
        }
        if (contentValues.containsKey("end_ts")) {
            this.f69119xf869a748 = contentValues.getAsLong("end_ts").longValue();
            if (z17) {
                this.f322555f = true;
            }
        }
        if (contentValues.containsKey("report_only")) {
            this.f69120x5d0afc12 = contentValues.getAsInteger("report_only").intValue() != 0;
            if (z17) {
                this.f322556g = true;
            }
        }
        if (contentValues.containsKey("display_info")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("display_info");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f69118x6c6ddd30 = (r45.bf0) new r45.bf0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f322557h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderCommEducationInfoItem", e17.getMessage());
            }
        }
        if (contentValues.containsKey("bypass_buffer")) {
            this.f69117xb27c84f2 = contentValues.getAsString("bypass_buffer");
            if (z17) {
                this.f322558i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
