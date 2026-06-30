package dm;

/* loaded from: classes4.dex */
public class p3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f320647m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f320648n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f320649o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f320650p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f320651q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f320652r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f320653s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f320654t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f320655u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f320656v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f320657w;

    /* renamed from: field_content */
    public java.lang.String f67887xad49e234;

    /* renamed from: field_localId */
    public long f67888x88be67a1;

    /* renamed from: field_subtype */
    public int f67889x541db35;

    /* renamed from: field_tagContent */
    public java.lang.String f67890xffe55fe4;

    /* renamed from: field_time */
    public long f67891x2261f6f2;

    /* renamed from: field_type */
    public int f67892x2262335f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f320658d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f320659e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f320660f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f320661g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f320662h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f320663i = true;

    static {
        p75.n0 n0Var = new p75.n0("FavSearchInfo");
        f320647m = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f320648n = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavSearchInfo_Content_Index ON FavSearchInfo(content)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_TagContent_Index ON FavSearchInfo(tagContent)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_SubType_Index ON FavSearchInfo(subtype)"};
        f320649o = 338409958;
        f320650p = 951530617;
        f320651q = 1186868095;
        f320652r = 3560141;
        f320653s = 3575610;
        f320654t = -1867567750;
        f320655u = 108705909;
        f320656v = m125388x3593deb(dm.p3.class);
        f320657w = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125388x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66867x2a5c95c7;
        e0Var.f398488d.put(dm.i4.f66867x2a5c95c7, "LONG PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66867x2a5c95c7;
        e0Var.f398487c[1] = "content";
        e0Var.f398488d.put("content", "TEXT");
        e0Var.f398487c[2] = "tagContent";
        e0Var.f398488d.put("tagContent", "TEXT");
        e0Var.f398487c[3] = "time";
        e0Var.f398488d.put("time", "LONG");
        e0Var.f398487c[4] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[5] = "subtype";
        e0Var.f398488d.put("subtype", "INTEGER default '0' ");
        e0Var.f398487c[6] = "rowid";
        e0Var.f398489e = " localId LONG PRIMARY KEY ,  content TEXT,  tagContent TEXT,  time LONG,  type INTEGER,  subtype INTEGER default '0' ";
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
            if (f320649o == hashCode) {
                try {
                    this.f67888x88be67a1 = cursor.getLong(i17);
                    this.f320658d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavSearchInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320650p == hashCode) {
                try {
                    this.f67887xad49e234 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavSearchInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320651q == hashCode) {
                try {
                    this.f67890xffe55fe4 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavSearchInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320652r == hashCode) {
                try {
                    this.f67891x2261f6f2 = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavSearchInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320653s == hashCode) {
                try {
                    this.f67892x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavSearchInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320654t == hashCode) {
                try {
                    this.f67889x541db35 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseFavSearchInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f320655u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f320658d) {
            contentValues.put(dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f67888x88be67a1));
        }
        if (this.f320659e) {
            contentValues.put("content", this.f67887xad49e234);
        }
        if (this.f320660f) {
            contentValues.put("tagContent", this.f67890xffe55fe4);
        }
        if (this.f320661g) {
            contentValues.put("time", java.lang.Long.valueOf(this.f67891x2261f6f2));
        }
        if (this.f320662h) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f67892x2262335f));
        }
        if (this.f320663i) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.f67889x541db35));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseFavSearchInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavSearchInfo ( ");
        l75.e0 e0Var = f320656v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f320648n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavSearchInfo", "createTableSql %s", str2);
            k0Var.A("FavSearchInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "FavSearchInfo", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavSearchInfo", "updateTableSql %s", str3);
            k0Var.A("FavSearchInfo", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseFavSearchInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f320656v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f320657w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return java.lang.Long.valueOf(this.f67888x88be67a1);
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f320647m;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f320647m.f434209a;
    }

    @Override // l75.f0
    /* renamed from: toJSON */
    public java.lang.Object mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.f66867x2a5c95c7, java.lang.Long.valueOf(this.f67888x88be67a1));
            n51.f.b(jSONObject, "content", this.f67887xad49e234);
            n51.f.b(jSONObject, "tagContent", this.f67890xffe55fe4);
            n51.f.b(jSONObject, "time", java.lang.Long.valueOf(this.f67891x2261f6f2));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.f67892x2262335f));
            n51.f.b(jSONObject, "subtype", java.lang.Integer.valueOf(this.f67889x541db35));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66867x2a5c95c7)) {
            this.f67888x88be67a1 = contentValues.getAsLong(dm.i4.f66867x2a5c95c7).longValue();
            if (z17) {
                this.f320658d = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.f67887xad49e234 = contentValues.getAsString("content");
            if (z17) {
                this.f320659e = true;
            }
        }
        if (contentValues.containsKey("tagContent")) {
            this.f67890xffe55fe4 = contentValues.getAsString("tagContent");
            if (z17) {
                this.f320660f = true;
            }
        }
        if (contentValues.containsKey("time")) {
            this.f67891x2261f6f2 = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f320661g = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f67892x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f320662h = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.f67889x541db35 = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f320663i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
