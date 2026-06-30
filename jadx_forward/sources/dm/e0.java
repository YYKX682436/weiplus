package dm;

/* loaded from: classes4.dex */
public class e0 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f318040f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f318041g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f318042h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f318043i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f318044m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f318045n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f318046o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318047d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318048e = true;

    /* renamed from: field_appId */
    public java.lang.String f66314x28d45f97;

    /* renamed from: field_recommendCard */
    public r45.tk5 f66315x35317767;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandRecommendCard");
        f318040f = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318041g = new java.lang.String[0];
        f318042h = 93028124;
        f318043i = -1142472212;
        f318044m = 108705909;
        f318045n = m124890x3593deb(dm.e0.class);
        f318046o = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124890x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f398487c = strArr;
        strArr[0] = "appId";
        e0Var.f398488d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "appId";
        e0Var.f398487c[1] = "recommendCard";
        e0Var.f398488d.put("recommendCard", "BLOB");
        e0Var.f398487c[2] = "rowid";
        e0Var.f398489e = " appId TEXT PRIMARY KEY ,  recommendCard BLOB";
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
            if (f318042h == hashCode) {
                try {
                    this.f66314x28d45f97 = cursor.getString(i17);
                    this.f318047d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandRecommendCard", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318043i == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f66315x35317767 = (r45.tk5) new r45.tk5().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAppBrandRecommendCard", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318044m == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318047d) {
            contentValues.put("appId", this.f66314x28d45f97);
        }
        if (this.f318048e) {
            r45.tk5 tk5Var = this.f66315x35317767;
            if (tk5Var != null) {
                try {
                    contentValues.put("recommendCard", tk5Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandRecommendCard", e17.getMessage());
                }
            } else {
                contentValues.put("recommendCard", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandRecommendCard ( ");
        l75.e0 e0Var = f318045n;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318041g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTableSql %s", str2);
            k0Var.A("AppBrandRecommendCard", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AppBrandRecommendCard", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandRecommendCard", "updateTableSql %s", str3);
            k0Var.A("AppBrandRecommendCard", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318045n;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318046o;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66314x28d45f97;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318040f;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318040f.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.f66314x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f318047d = true;
            }
        }
        if (contentValues.containsKey("recommendCard")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("recommendCard");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f66315x35317767 = (r45.tk5) new r45.tk5().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f318048e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAppBrandRecommendCard", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
