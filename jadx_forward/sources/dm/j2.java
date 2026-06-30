package dm;

/* loaded from: classes4.dex */
public class j2 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f319276h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f319277i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f319278m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319279n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319280o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319281p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319282q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f319283r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f319284s;

    /* renamed from: field_chat_room_id */
    public java.lang.String f67078x206c903d;

    /* renamed from: field_crop_image_path */
    public java.lang.String f67079x57963853;

    /* renamed from: field_label_id */
    public java.lang.String f67080xa8fb27eb;

    /* renamed from: field_origin_image_path */
    public java.lang.String f67081xeab3e73d;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319285d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319286e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319287f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319288g = true;

    static {
        p75.n0 n0Var = new p75.n0("CropCenterLabelInfo");
        f319276h = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319277i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS CropCenterLabelInfo_Room_Id ON CropCenterLabelInfo(chat_room_id)"};
        f319278m = 339796248;
        f319279n = -1959256506;
        f319280o = 134444440;
        f319281p = 885450562;
        f319282q = 108705909;
        f319283r = m125135x3593deb(dm.j2.class);
        f319284s = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125135x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "chat_room_id";
        e0Var.f398488d.put("chat_room_id", "TEXT");
        e0Var.f398487c[1] = "label_id";
        e0Var.f398488d.put("label_id", "TEXT");
        e0Var.f398487c[2] = "crop_image_path";
        e0Var.f398488d.put("crop_image_path", "TEXT");
        e0Var.f398487c[3] = "origin_image_path";
        e0Var.f398488d.put("origin_image_path", "TEXT");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " chat_room_id TEXT,  label_id TEXT,  crop_image_path TEXT,  origin_image_path TEXT";
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
            if (f319278m == hashCode) {
                try {
                    this.f67078x206c903d = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCropCenterLabelInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319279n == hashCode) {
                try {
                    this.f67080xa8fb27eb = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCropCenterLabelInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319280o == hashCode) {
                try {
                    this.f67079x57963853 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCropCenterLabelInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319281p == hashCode) {
                try {
                    this.f67081xeab3e73d = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseCropCenterLabelInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319282q == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319285d) {
            contentValues.put("chat_room_id", this.f67078x206c903d);
        }
        if (this.f319286e) {
            contentValues.put("label_id", this.f67080xa8fb27eb);
        }
        if (this.f319287f) {
            contentValues.put("crop_image_path", this.f67079x57963853);
        }
        if (this.f319288g) {
            contentValues.put("origin_image_path", this.f67081xeab3e73d);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CropCenterLabelInfo ( ");
        l75.e0 e0Var = f319283r;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319277i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTableSql %s", str2);
            k0Var.A("CropCenterLabelInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "CropCenterLabelInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCropCenterLabelInfo", "updateTableSql %s", str3);
            k0Var.A("CropCenterLabelInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319283r;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319284s;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319276h;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319276h.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chat_room_id")) {
            this.f67078x206c903d = contentValues.getAsString("chat_room_id");
            if (z17) {
                this.f319285d = true;
            }
        }
        if (contentValues.containsKey("label_id")) {
            this.f67080xa8fb27eb = contentValues.getAsString("label_id");
            if (z17) {
                this.f319286e = true;
            }
        }
        if (contentValues.containsKey("crop_image_path")) {
            this.f67079x57963853 = contentValues.getAsString("crop_image_path");
            if (z17) {
                this.f319287f = true;
            }
        }
        if (contentValues.containsKey("origin_image_path")) {
            this.f67081xeab3e73d = contentValues.getAsString("origin_image_path");
            if (z17) {
                this.f319288g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
