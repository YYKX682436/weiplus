package dm;

/* loaded from: classes8.dex */
public class v4 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final l75.e0 G;
    public static final o75.e H;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f322080r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f322081s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f322082t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322083u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322084v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322085w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f322086x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f322087y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f322088z;

    /* renamed from: field_address */
    public java.lang.String f68725x302a49af;

    /* renamed from: field_basicInfoResponse */
    public r45.qo2 f68726x7daa258;

    /* renamed from: field_businessHour */
    public java.lang.String f68727xe40cf8e9;

    /* renamed from: field_categoryTips */
    public java.lang.String f68728x2593847b;

    /* renamed from: field_fromType */
    public java.lang.String f68729xd3933fa9;

    /* renamed from: field_latitude */
    public float f68730xc7eeb611;

    /* renamed from: field_longitude */
    public float f68731xa2ce34aa;

    /* renamed from: field_noticeWording */
    public java.lang.String f68732x5c9501b;

    /* renamed from: field_phoneNumber */
    public java.lang.String f68733x24a41292;

    /* renamed from: field_poiId */
    public java.lang.String f68734x29a73180;

    /* renamed from: field_priceTips */
    public java.lang.String f68735x1be9d71c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322089d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322090e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322091f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322092g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322093h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322094i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322095m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f322096n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f322097o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f322098p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f322099q = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderMapPoiInfo");
        f322080r = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322081s = new p75.d("poiId", "string", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322082t = new java.lang.String[0];
        f322083u = 106844421;
        f322084v = 426235222;
        f322085w = -673101372;
        f322086x = -1192969641;
        f322087y = -2125747167;
        f322088z = -1937827168;
        A = -1439978388;
        B = 137365935;
        C = -1244645884;
        D = -1147692044;
        E = 1374528093;
        F = 108705909;
        G = m125559x3593deb(dm.v4.class);
        H = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125559x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f398487c = strArr;
        strArr[0] = "poiId";
        e0Var.f398488d.put("poiId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "poiId";
        e0Var.f398487c[1] = "categoryTips";
        e0Var.f398488d.put("categoryTips", "TEXT");
        e0Var.f398487c[2] = "businessHour";
        e0Var.f398488d.put("businessHour", "TEXT");
        e0Var.f398487c[3] = "phoneNumber";
        e0Var.f398488d.put("phoneNumber", "TEXT");
        e0Var.f398487c[4] = "priceTips";
        e0Var.f398488d.put("priceTips", "TEXT");
        e0Var.f398487c[5] = "noticeWording";
        e0Var.f398488d.put("noticeWording", "TEXT");
        e0Var.f398487c[6] = "latitude";
        e0Var.f398488d.put("latitude", "FLOAT");
        e0Var.f398487c[7] = "longitude";
        e0Var.f398488d.put("longitude", "FLOAT");
        e0Var.f398487c[8] = "fromType";
        e0Var.f398488d.put("fromType", "TEXT");
        e0Var.f398487c[9] = "address";
        e0Var.f398488d.put("address", "TEXT default '' ");
        e0Var.f398487c[10] = "basicInfoResponse";
        e0Var.f398488d.put("basicInfoResponse", "BLOB");
        e0Var.f398487c[11] = "rowid";
        e0Var.f398489e = " poiId TEXT PRIMARY KEY ,  categoryTips TEXT,  businessHour TEXT,  phoneNumber TEXT,  priceTips TEXT,  noticeWording TEXT,  latitude FLOAT,  longitude FLOAT,  fromType TEXT,  address TEXT default '' ,  basicInfoResponse BLOB";
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
            if (f322083u == hashCode) {
                try {
                    this.f68734x29a73180 = cursor.getString(i17);
                    this.f322089d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322084v == hashCode) {
                try {
                    this.f68728x2593847b = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322085w == hashCode) {
                try {
                    this.f68727xe40cf8e9 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322086x == hashCode) {
                try {
                    this.f68733x24a41292 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322087y == hashCode) {
                try {
                    this.f68735x1be9d71c = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322088z == hashCode) {
                try {
                    this.f68732x5c9501b = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f68730xc7eeb611 = cursor.getFloat(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68731xa2ce34aa = cursor.getFloat(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f68729xd3933fa9 = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f68725x302a49af = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f68726x7daa258 = (r45.qo2) new r45.qo2().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFinderMapPoiInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322089d) {
            contentValues.put("poiId", this.f68734x29a73180);
        }
        if (this.f322090e) {
            contentValues.put("categoryTips", this.f68728x2593847b);
        }
        if (this.f322091f) {
            contentValues.put("businessHour", this.f68727xe40cf8e9);
        }
        if (this.f322092g) {
            contentValues.put("phoneNumber", this.f68733x24a41292);
        }
        if (this.f322093h) {
            contentValues.put("priceTips", this.f68735x1be9d71c);
        }
        if (this.f322094i) {
            contentValues.put("noticeWording", this.f68732x5c9501b);
        }
        if (this.f322095m) {
            contentValues.put("latitude", java.lang.Float.valueOf(this.f68730xc7eeb611));
        }
        if (this.f322096n) {
            contentValues.put("longitude", java.lang.Float.valueOf(this.f68731xa2ce34aa));
        }
        if (this.f322097o) {
            contentValues.put("fromType", this.f68729xd3933fa9);
        }
        if (this.f68725x302a49af == null) {
            this.f68725x302a49af = "";
        }
        if (this.f322098p) {
            contentValues.put("address", this.f68725x302a49af);
        }
        if (this.f322099q) {
            r45.qo2 qo2Var = this.f68726x7daa258;
            if (qo2Var != null) {
                try {
                    contentValues.put("basicInfoResponse", qo2Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderMapPoiInfo", e17.getMessage());
                }
            } else {
                contentValues.put("basicInfoResponse", (byte[]) null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderMapPoiInfo ( ");
        l75.e0 e0Var = G;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322082t) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTableSql %s", str2);
            k0Var.A("FinderMapPoiInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FinderMapPoiInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderMapPoiInfo", "updateTableSql %s", str3);
            k0Var.A("FinderMapPoiInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFinderMapPoiInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return G;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return H;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68734x29a73180;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322080r;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322080r.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("poiId")) {
            this.f68734x29a73180 = contentValues.getAsString("poiId");
            if (z17) {
                this.f322089d = true;
            }
        }
        if (contentValues.containsKey("categoryTips")) {
            this.f68728x2593847b = contentValues.getAsString("categoryTips");
            if (z17) {
                this.f322090e = true;
            }
        }
        if (contentValues.containsKey("businessHour")) {
            this.f68727xe40cf8e9 = contentValues.getAsString("businessHour");
            if (z17) {
                this.f322091f = true;
            }
        }
        if (contentValues.containsKey("phoneNumber")) {
            this.f68733x24a41292 = contentValues.getAsString("phoneNumber");
            if (z17) {
                this.f322092g = true;
            }
        }
        if (contentValues.containsKey("priceTips")) {
            this.f68735x1be9d71c = contentValues.getAsString("priceTips");
            if (z17) {
                this.f322093h = true;
            }
        }
        if (contentValues.containsKey("noticeWording")) {
            this.f68732x5c9501b = contentValues.getAsString("noticeWording");
            if (z17) {
                this.f322094i = true;
            }
        }
        if (contentValues.containsKey("latitude")) {
            this.f68730xc7eeb611 = contentValues.getAsFloat("latitude").floatValue();
            if (z17) {
                this.f322095m = true;
            }
        }
        if (contentValues.containsKey("longitude")) {
            this.f68731xa2ce34aa = contentValues.getAsFloat("longitude").floatValue();
            if (z17) {
                this.f322096n = true;
            }
        }
        if (contentValues.containsKey("fromType")) {
            this.f68729xd3933fa9 = contentValues.getAsString("fromType");
            if (z17) {
                this.f322097o = true;
            }
        }
        if (contentValues.containsKey("address")) {
            this.f68725x302a49af = contentValues.getAsString("address");
            if (z17) {
                this.f322098p = true;
            }
        }
        if (contentValues.containsKey("basicInfoResponse")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("basicInfoResponse");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f68726x7daa258 = (r45.qo2) new r45.qo2().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f322099q = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFinderMapPoiInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
