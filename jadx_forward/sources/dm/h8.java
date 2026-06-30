package dm;

/* loaded from: classes8.dex */
public class h8 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f318938m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f318939n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f318940o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f318941p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f318942q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318943r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318944s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318945t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318946u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318947v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318948w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f318949x;

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f318950y;

    /* renamed from: z, reason: collision with root package name */
    public static final o75.e f318951z;

    /* renamed from: field_createTime */
    public long f66789xac3be4e;

    /* renamed from: field_data */
    public byte[] f66790x225a93cf;

    /* renamed from: field_id */
    public java.lang.String f66791xc8a07680;

    /* renamed from: field_showData */
    public r45.lr4 f66792x98981ec;

    /* renamed from: field_type */
    public int f66793x2262335f;

    /* renamed from: field_updateTime */
    public long f66794xa783a79b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318952d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318953e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318954f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318955g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318956h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318957i = true;

    static {
        p75.n0 n0Var = new p75.n0("MultiTaskInfo");
        f318938m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318939n = new p75.d(dm.i4.f66865x76d1ec5a, "string", tableName, "");
        f318940o = new p75.d("type", "int", tableName, "");
        f318941p = new p75.d("createTime", "long", tableName, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318942q = new java.lang.String[0];
        f318943r = 3355;
        f318944s = 3575610;
        f318945t = 1369213417;
        f318946u = -295931082;
        f318947v = -339314617;
        f318948w = 3076010;
        f318949x = 108705909;
        f318950y = m125034x3593deb(dm.h8.class);
        f318951z = new o75.e();
    }

    /* renamed from: createTable */
    public static void m125033xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMultiTaskInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MultiTaskInfo ( ");
        l75.e0 e0Var = f318950y;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318942q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTaskInfo", "createTableSql %s", str2);
            k0Var.A("MultiTaskInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "MultiTaskInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTaskInfo", "updateTableSql %s", str3);
            k0Var.A("MultiTaskInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseMultiTaskInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125034x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        e0Var.f398488d.put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = "type";
        e0Var.f398488d.put("type", "INTEGER default '0' ");
        e0Var.f398487c[2] = "createTime";
        e0Var.f398488d.put("createTime", "LONG default '0' ");
        e0Var.f398487c[3] = dm.i4.f66874x4c6b1f55;
        e0Var.f398488d.put(dm.i4.f66874x4c6b1f55, "LONG default '0' ");
        e0Var.f398487c[4] = "showData";
        e0Var.f398488d.put("showData", "BLOB");
        e0Var.f398487c[5] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "BLOB default '' ");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  type INTEGER default '0' ,  createTime LONG default '0' ,  updateTime LONG default '0' ,  showData BLOB,  data BLOB default '' ";
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
            if (f318943r == hashCode) {
                try {
                    this.f66791xc8a07680 = cursor.getString(i17);
                    this.f318952d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTaskInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318944s == hashCode) {
                try {
                    this.f66793x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTaskInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318945t == hashCode) {
                try {
                    this.f66789xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTaskInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318946u == hashCode) {
                try {
                    this.f66794xa783a79b = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTaskInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318947v == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f66792x98981ec = (r45.lr4) new r45.lr4().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTaskInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318948w == hashCode) {
                try {
                    this.f66790x225a93cf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseMultiTaskInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318949x == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f318952d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f66791xc8a07680);
        }
        if (this.f318953e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66793x2262335f));
        }
        if (this.f318954f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f66789xac3be4e));
        }
        if (this.f318955g) {
            contentValues.put(dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66794xa783a79b));
        }
        if (this.f318956h) {
            r45.lr4 lr4Var = this.f66792x98981ec;
            if (lr4Var != null) {
                try {
                    contentValues.put("showData", lr4Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMultiTaskInfo", e17.getMessage());
                }
            } else {
                contentValues.put("showData", (byte[]) null);
            }
        }
        if (this.f318957i) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f66790x225a93cf);
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
        m125033xe1f0e832(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318950y;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318951z;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66791xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318938m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318938m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.f66865x76d1ec5a, this.f66791xc8a07680);
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f66793x2262335f));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.f66789xac3be4e));
            n51.f.b(jSONObject, dm.i4.f66874x4c6b1f55, java.lang.Long.valueOf(this.f66794xa783a79b));
            n51.f.b(jSONObject, "showData", this.f66792x98981ec);
            n51.f.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f66790x225a93cf);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f66791xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f318952d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66793x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f318953e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f66789xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f318954f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.f66874x4c6b1f55)) {
            this.f66794xa783a79b = contentValues.getAsLong(dm.i4.f66874x4c6b1f55).longValue();
            if (z17) {
                this.f318955g = true;
            }
        }
        if (contentValues.containsKey("showData")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("showData");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f66792x98981ec = (r45.lr4) new r45.lr4().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f318956h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseMultiTaskInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            this.f66790x225a93cf = contentValues.getAsByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            if (z17) {
                this.f318957i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
