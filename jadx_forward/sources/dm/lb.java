package dm;

/* loaded from: classes4.dex */
public class lb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f319861i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f319862m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f319863n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f319864o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f319865p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f319866q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f319867r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f319868s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f319869t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f319870u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f319871v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f319872w;

    /* renamed from: field_contentId */
    private java.lang.String f67355x825a2e6f;

    /* renamed from: field_id */
    private java.lang.String f67356xc8a07680;

    /* renamed from: field_receiverId */
    private java.lang.String f67357xc5a067cf;

    /* renamed from: field_senderId */
    private java.lang.String f67358x682573d5;

    /* renamed from: field_targetLangCode */
    private java.lang.String f67359xf0d33b91;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319873d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319874e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319875f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319876g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319877h = false;

    static {
        p75.n0 n0Var = new p75.n0("TranslateContext");
        f319861i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p75.d dVar = new p75.d("contentId", "string", tableName, "");
        f319862m = dVar;
        p75.d dVar2 = new p75.d("senderId", "string", tableName, "");
        f319863n = dVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p75.v f17 = n0Var.f("contentIdAndSenderIdIndex");
        f17.b(dVar, dVar2);
        f319864o = new java.lang.String[]{f17.a().f434169a};
        f319865p = 3355;
        f319866q = -407108748;
        f319867r = 1247963696;
        f319868s = 209269610;
        f319869t = 1087816108;
        f319870u = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = dm.i4.f66865x76d1ec5a;
        ((java.util.HashMap) e0Var.f398488d).put(dm.i4.f66865x76d1ec5a, "TEXT PRIMARY KEY ");
        e0Var.f398486b = dm.i4.f66865x76d1ec5a;
        e0Var.f398487c[1] = "contentId";
        ((java.util.HashMap) e0Var.f398488d).put("contentId", "TEXT");
        e0Var.f398487c[2] = "senderId";
        ((java.util.HashMap) e0Var.f398488d).put("senderId", "TEXT default '' ");
        e0Var.f398487c[3] = "receiverId";
        ((java.util.HashMap) e0Var.f398488d).put("receiverId", "TEXT default '' ");
        e0Var.f398487c[4] = "targetLangCode";
        ((java.util.HashMap) e0Var.f398488d).put("targetLangCode", "TEXT default '' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " id TEXT PRIMARY KEY ,  contentId TEXT,  senderId TEXT default '' ,  receiverId TEXT default '' ,  targetLangCode TEXT default '' ";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        f319871v = e0Var;
        f319872w = new o75.e();
    }

    public void A0(java.lang.String str) {
        this.f67358x682573d5 = str;
        this.f319875f = true;
    }

    public void D0(java.lang.String str) {
        this.f67359xf0d33b91 = str;
        this.f319877h = true;
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
            if (f319865p == hashCode) {
                try {
                    this.f67356xc8a07680 = cursor.getString(i17);
                    this.f319873d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTranslateContext", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319866q == hashCode) {
                try {
                    this.f67355x825a2e6f = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTranslateContext", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319867r == hashCode) {
                try {
                    this.f67358x682573d5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTranslateContext", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319868s == hashCode) {
                try {
                    this.f67357xc5a067cf = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTranslateContext", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319869t == hashCode) {
                try {
                    this.f67359xf0d33b91 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseTranslateContext", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319870u == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319873d) {
            contentValues.put(dm.i4.f66865x76d1ec5a, this.f67356xc8a07680);
        }
        if (this.f319874e) {
            contentValues.put("contentId", this.f67355x825a2e6f);
        }
        if (this.f67358x682573d5 == null) {
            this.f67358x682573d5 = "";
        }
        if (this.f319875f) {
            contentValues.put("senderId", this.f67358x682573d5);
        }
        if (this.f67357xc5a067cf == null) {
            this.f67357xc5a067cf = "";
        }
        if (this.f319876g) {
            contentValues.put("receiverId", this.f67357xc5a067cf);
        }
        if (this.f67359xf0d33b91 == null) {
            this.f67359xf0d33b91 = "";
        }
        if (this.f319877h) {
            contentValues.put("targetLangCode", this.f67359xf0d33b91);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseTranslateContext", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TranslateContext ( ");
        l75.e0 e0Var = f319871v;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319864o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTranslateContext", "createTableSql %s", str2);
            k0Var.A("TranslateContext", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "TranslateContext", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTranslateContext", "updateTableSql %s", str3);
            k0Var.A("TranslateContext", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseTranslateContext", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319871v;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f319872w;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67356xc8a07680;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319861i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319861i.f434209a;
    }

    /* renamed from: insertToDB */
    public long m125208x39969692(l75.k0 k0Var, boolean z17) {
        m75.c cVar;
        if (z17) {
            o75.c cVar2 = new o75.c(o75.b.f425115c, java.lang.String.valueOf(this.f67356xc8a07680), "MicroMsg.SDK.BaseTranslateContext");
            cVar2.f425123d = this;
            cVar = new m75.c(this, true, cVar2, f319872w, "MicroMsg.SDK.BaseTranslateContext");
        } else {
            cVar = new m75.c(this, true, null, null, "MicroMsg.SDK.BaseTranslateContext");
        }
        return cVar.a(k0Var);
    }

    public java.lang.String t0() {
        return this.f67355x825a2e6f;
    }

    public java.lang.String u0() {
        return this.f67357xc5a067cf;
    }

    public java.lang.String v0() {
        return this.f67358x682573d5;
    }

    public java.lang.String w0() {
        return this.f67359xf0d33b91;
    }

    public void y0(java.lang.String str) {
        this.f67355x825a2e6f = str;
        this.f319874e = true;
    }

    public void z0(java.lang.String str) {
        this.f67357xc5a067cf = str;
        this.f319876g = true;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.f66865x76d1ec5a)) {
            this.f67356xc8a07680 = contentValues.getAsString(dm.i4.f66865x76d1ec5a);
            if (z17) {
                this.f319873d = true;
            }
        }
        if (contentValues.containsKey("contentId")) {
            this.f67355x825a2e6f = contentValues.getAsString("contentId");
            if (z17) {
                this.f319874e = true;
            }
        }
        if (contentValues.containsKey("senderId")) {
            this.f67358x682573d5 = contentValues.getAsString("senderId");
            if (z17) {
                this.f319875f = true;
            }
        }
        if (contentValues.containsKey("receiverId")) {
            this.f67357xc5a067cf = contentValues.getAsString("receiverId");
            if (z17) {
                this.f319876g = true;
            }
        }
        if (contentValues.containsKey("targetLangCode")) {
            this.f67359xf0d33b91 = contentValues.getAsString("targetLangCode");
            if (z17) {
                this.f319877h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
