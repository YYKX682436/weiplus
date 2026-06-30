package dm;

/* loaded from: classes8.dex */
public class m3 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f319966i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f319967m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f319968n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f319969o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319970p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319971q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319972r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319973s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f319974t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f319975u;

    /* renamed from: field_localId */
    public long f67419x88be67a1;

    /* renamed from: field_modItem */
    public r45.kp0 f67420xbda7f2f0;

    /* renamed from: field_scene */
    public int f67421x29cbf907;

    /* renamed from: field_time */
    public long f67422x2261f6f2;

    /* renamed from: field_type */
    public int f67423x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319976d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319977e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319978f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319979g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319980h = true;

    static {
        p75.n0 n0Var = new p75.n0("FavEditInfo");
        f319966i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319967m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavModInfo_LocalId_Index ON FavEditInfo(localId)"};
        f319968n = 338409958;
        f319969o = 1226130741;
        f319970p = 3560141;
        f319971q = 3575610;
        f319972r = 109254796;
        f319973s = 108705909;
        f319974t = m125218x3593deb(dm.m3.class);
        f319975u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125218x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "LONG");
        e0Var.f398487c[1] = "modItem";
        e0Var.f398488d.put("modItem", "BLOB");
        e0Var.f398487c[2] = "time";
        e0Var.f398488d.put("time", "LONG");
        e0Var.f398487c[3] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[4] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER default '1' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " localId LONG,  modItem BLOB,  time LONG,  type INTEGER,  scene INTEGER default '1' ";
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
            if (f319968n == hashCode) {
                try {
                    this.f67419x88be67a1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavEditInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319969o == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.f67420xbda7f2f0 = (r45.kp0) new r45.kp0().mo11468x92b714fd(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavEditInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319970p == hashCode) {
                try {
                    this.f67422x2261f6f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavEditInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319971q == hashCode) {
                try {
                    this.f67423x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavEditInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319972r == hashCode) {
                try {
                    this.f67421x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavEditInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319973s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319976d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f67419x88be67a1));
        }
        if (this.f319977e) {
            r45.kp0 kp0Var = this.f67420xbda7f2f0;
            if (kp0Var != null) {
                try {
                    contentValues.put("modItem", kp0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavEditInfo", e17.getMessage());
                }
            } else {
                contentValues.put("modItem", (byte[]) null);
            }
        }
        if (this.f319978f) {
            contentValues.put("time", java.lang.Long.valueOf(this.f67422x2261f6f2));
        }
        if (this.f319979g) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67423x2262335f));
        }
        if (this.f319980h) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f67421x29cbf907));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavEditInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavEditInfo ( ");
        l75.e0 e0Var = f319974t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319967m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavEditInfo", "createTableSql %s", str2);
            k0Var.A("FavEditInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FavEditInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavEditInfo", "updateTableSql %s", str3);
            k0Var.A("FavEditInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavEditInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319974t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319975u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f72763xa3c65b86);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319966i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319966i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f67419x88be67a1));
            n51.f.b(jSONObject, "modItem", this.f67420xbda7f2f0);
            n51.f.b(jSONObject, "time", java.lang.Long.valueOf(this.f67422x2261f6f2));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f67423x2262335f));
            n51.f.b(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f67421x29cbf907));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f67419x88be67a1 = contentValues.getAsLong(dm.i4.f66867x2a5c95c7).longValue();
            if (z17) {
                this.f319976d = true;
            }
        }
        if (contentValues.containsKey("modItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("modItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.f67420xbda7f2f0 = (r45.kp0) new r45.kp0().mo11468x92b714fd(asByteArray);
                    if (z17) {
                        this.f319977e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavEditInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("time")) {
            this.f67422x2261f6f2 = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f319978f = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67423x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f319979g = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f67421x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f319980h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
