package dm;

/* loaded from: classes4.dex */
public class d2 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f317842p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f317843q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f317844r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f317845s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f317846t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f317847u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f317848v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f317849w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f317850x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f317851y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f317852z;

    /* renamed from: field_chat_room_id */
    public java.lang.String f66220x206c903d;

    /* renamed from: field_crop_label_id */
    public java.lang.String f66221x22f9ac90;

    /* renamed from: field_hd_image_path */
    public java.lang.String f66222x4ac6dd27;

    /* renamed from: field_is_recognize */
    public java.lang.String f66223xf8a7d2de;

    /* renamed from: field_label_id */
    public java.lang.String f66224xa8fb27eb;

    /* renamed from: field_msg_id */
    public long f66225x6583d7e;

    /* renamed from: field_ocr_result */
    public java.lang.String f66226xa779eec3;

    /* renamed from: field_origin_image_path */
    public java.lang.String f66227xeab3e73d;

    /* renamed from: field_timestamp */
    public long f66228x9de75411;

    /* renamed from: d, reason: collision with root package name */
    public boolean f317853d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317854e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f317855f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317856g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f317857h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317858i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f317859m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f317860n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317861o = true;

    static {
        p75.n0 n0Var = new p75.n0("ClsLabelInfo");
        f317842p = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317843q = new p75.d(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f317844r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS ClsLabelInfo_Room_Id ON ClsLabelInfo(chat_room_id)", "CREATE INDEX IF NOT EXISTS ClsLabelInfo_Is_Rec ON ClsLabelInfo(is_recognize)"};
        f317845s = 339796248;
        f317846t = -1065021799;
        f317847u = -1959256506;
        f317848v = -1448118507;
        f317849w = -296568226;
        f317850x = 55126294;
        f317851y = -780359764;
        f317852z = 885450562;
        A = -327408711;
        B = 108705909;
        C = m124869x3593deb(dm.d2.class);
        D = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124869x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f398487c = strArr;
        strArr[0] = "chat_room_id";
        e0Var.f398488d.put("chat_room_id", "TEXT");
        e0Var.f398487c[1] = "msg_id";
        e0Var.f398488d.put("msg_id", "LONG");
        e0Var.f398487c[2] = "label_id";
        e0Var.f398488d.put("label_id", "TEXT default '' ");
        e0Var.f398487c[3] = "crop_label_id";
        e0Var.f398488d.put("crop_label_id", "TEXT default '' ");
        e0Var.f398487c[4] = "ocr_result";
        e0Var.f398488d.put("ocr_result", "TEXT default '' ");
        e0Var.f398487c[5] = com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6;
        e0Var.f398488d.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "LONG");
        e0Var.f398487c[6] = "hd_image_path";
        e0Var.f398488d.put("hd_image_path", "TEXT");
        e0Var.f398487c[7] = "origin_image_path";
        e0Var.f398488d.put("origin_image_path", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "origin_image_path";
        e0Var.f398487c[8] = "is_recognize";
        e0Var.f398488d.put("is_recognize", "TEXT");
        e0Var.f398487c[9] = "rowid";
        e0Var.f398489e = " chat_room_id TEXT,  msg_id LONG,  label_id TEXT default '' ,  crop_label_id TEXT default '' ,  ocr_result TEXT default '' ,  timestamp LONG,  hd_image_path TEXT,  origin_image_path TEXT default ''  PRIMARY KEY ,  is_recognize TEXT";
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
            if (f317845s == hashCode) {
                try {
                    this.f66220x206c903d = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317846t == hashCode) {
                try {
                    this.f66225x6583d7e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317847u == hashCode) {
                try {
                    this.f66224xa8fb27eb = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317848v == hashCode) {
                try {
                    this.f66221x22f9ac90 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317849w == hashCode) {
                try {
                    this.f66226xa779eec3 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317850x == hashCode) {
                try {
                    this.f66228x9de75411 = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317851y == hashCode) {
                try {
                    this.f66222x4ac6dd27 = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f317852z == hashCode) {
                try {
                    this.f66227xeab3e73d = cursor.getString(i17);
                    this.f317860n = true;
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f66223xf8a7d2de = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseClsLabelInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f317853d) {
            contentValues.put("chat_room_id", this.f66220x206c903d);
        }
        if (this.f317854e) {
            contentValues.put("msg_id", java.lang.Long.valueOf(this.f66225x6583d7e));
        }
        if (this.f66224xa8fb27eb == null) {
            this.f66224xa8fb27eb = "";
        }
        if (this.f317855f) {
            contentValues.put("label_id", this.f66224xa8fb27eb);
        }
        if (this.f66221x22f9ac90 == null) {
            this.f66221x22f9ac90 = "";
        }
        if (this.f317856g) {
            contentValues.put("crop_label_id", this.f66221x22f9ac90);
        }
        if (this.f66226xa779eec3 == null) {
            this.f66226xa779eec3 = "";
        }
        if (this.f317857h) {
            contentValues.put("ocr_result", this.f66226xa779eec3);
        }
        if (this.f317858i) {
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f66228x9de75411));
        }
        if (this.f317859m) {
            contentValues.put("hd_image_path", this.f66222x4ac6dd27);
        }
        if (this.f66227xeab3e73d == null) {
            this.f66227xeab3e73d = "";
        }
        if (this.f317860n) {
            contentValues.put("origin_image_path", this.f66227xeab3e73d);
        }
        if (this.f317861o) {
            contentValues.put("is_recognize", this.f66223xf8a7d2de);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseClsLabelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ClsLabelInfo ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f317844r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseClsLabelInfo", "createTableSql %s", str2);
            k0Var.A("ClsLabelInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "ClsLabelInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseClsLabelInfo", "updateTableSql %s", str3);
            k0Var.A("ClsLabelInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseClsLabelInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return C;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66227xeab3e73d;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f317842p;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f317842p.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chat_room_id")) {
            this.f66220x206c903d = contentValues.getAsString("chat_room_id");
            if (z17) {
                this.f317853d = true;
            }
        }
        if (contentValues.containsKey("msg_id")) {
            this.f66225x6583d7e = contentValues.getAsLong("msg_id").longValue();
            if (z17) {
                this.f317854e = true;
            }
        }
        if (contentValues.containsKey("label_id")) {
            this.f66224xa8fb27eb = contentValues.getAsString("label_id");
            if (z17) {
                this.f317855f = true;
            }
        }
        if (contentValues.containsKey("crop_label_id")) {
            this.f66221x22f9ac90 = contentValues.getAsString("crop_label_id");
            if (z17) {
                this.f317856g = true;
            }
        }
        if (contentValues.containsKey("ocr_result")) {
            this.f66226xa779eec3 = contentValues.getAsString("ocr_result");
            if (z17) {
                this.f317857h = true;
            }
        }
        if (contentValues.containsKey(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6)) {
            this.f66228x9de75411 = contentValues.getAsLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6).longValue();
            if (z17) {
                this.f317858i = true;
            }
        }
        if (contentValues.containsKey("hd_image_path")) {
            this.f66222x4ac6dd27 = contentValues.getAsString("hd_image_path");
            if (z17) {
                this.f317859m = true;
            }
        }
        if (contentValues.containsKey("origin_image_path")) {
            this.f66227xeab3e73d = contentValues.getAsString("origin_image_path");
            if (z17) {
                this.f317860n = true;
            }
        }
        if (contentValues.containsKey("is_recognize")) {
            this.f66223xf8a7d2de = contentValues.getAsString("is_recognize");
            if (z17) {
                this.f317861o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
