package dm;

/* loaded from: classes4.dex */
public class e extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f318021n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f318022o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318023p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318024q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318025r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318026s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f318027t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f318028u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f318029v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f318030w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f318031x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f318032y;

    /* renamed from: field_boxFTS */
    public java.lang.String f66307xf361ea7f;

    /* renamed from: field_boxJSON */
    public java.lang.String f66308x78dd32ee;

    /* renamed from: field_chatId */
    public java.lang.String f66309xf4aa5578;

    /* renamed from: field_extInfo */
    public java.lang.String f66310x26b3182a;

    /* renamed from: field_query */
    public java.lang.String f66311x29b7f943;

    /* renamed from: field_searchId */
    public java.lang.String f66312x52baae88;

    /* renamed from: field_timeStamp */
    public long f66313x9c2463f1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318033d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318034e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318035f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318036g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318037h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318038i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f318039m = true;

    static {
        p75.n0 n0Var = new p75.n0("AIHistoryMessage");
        f318021n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318022o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AIHistoryMessage_chatId_index ON AIHistoryMessage(chatId)", "CREATE INDEX IF NOT EXISTS AIHistoryMessage_timeStamp_index ON AIHistoryMessage(timeStamp)"};
        f318023p = 888644835;
        f318024q = -1361631597;
        f318025r = 25573622;
        f318026s = 107944136;
        f318027t = 71992627;
        f318028u = -1383154790;
        f318029v = -1306498449;
        f318030w = 108705909;
        f318031x = m124888x3593deb(dm.e.class);
        f318032y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124888x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "searchId";
        e0Var.f398488d.put("searchId", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "searchId";
        e0Var.f398487c[1] = "chatId";
        e0Var.f398488d.put("chatId", "TEXT default '' ");
        e0Var.f398487c[2] = "timeStamp";
        e0Var.f398488d.put("timeStamp", "LONG default '0' ");
        e0Var.f398487c[3] = "query";
        e0Var.f398488d.put("query", "TEXT default '' ");
        e0Var.f398487c[4] = "boxJSON";
        e0Var.f398488d.put("boxJSON", "TEXT default '' ");
        e0Var.f398487c[5] = "boxFTS";
        e0Var.f398488d.put("boxFTS", "TEXT default '' ");
        e0Var.f398487c[6] = "extInfo";
        e0Var.f398488d.put("extInfo", "TEXT default '' ");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " searchId TEXT default ''  PRIMARY KEY ,  chatId TEXT default '' ,  timeStamp LONG default '0' ,  query TEXT default '' ,  boxJSON TEXT default '' ,  boxFTS TEXT default '' ,  extInfo TEXT default '' ";
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
            if (f318023p == hashCode) {
                try {
                    this.f66312x52baae88 = cursor.getString(i17);
                    this.f318033d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318024q == hashCode) {
                try {
                    this.f66309xf4aa5578 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318025r == hashCode) {
                try {
                    this.f66313x9c2463f1 = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318026s == hashCode) {
                try {
                    this.f66311x29b7f943 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318027t == hashCode) {
                try {
                    this.f66308x78dd32ee = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318028u == hashCode) {
                try {
                    this.f66307xf361ea7f = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318029v == hashCode) {
                try {
                    this.f66310x26b3182a = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseAIHistoryMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318030w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66312x52baae88 == null) {
            this.f66312x52baae88 = "";
        }
        if (this.f318033d) {
            contentValues.put("searchId", this.f66312x52baae88);
        }
        if (this.f66309xf4aa5578 == null) {
            this.f66309xf4aa5578 = "";
        }
        if (this.f318034e) {
            contentValues.put("chatId", this.f66309xf4aa5578);
        }
        if (this.f318035f) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.f66313x9c2463f1));
        }
        if (this.f66311x29b7f943 == null) {
            this.f66311x29b7f943 = "";
        }
        if (this.f318036g) {
            contentValues.put("query", this.f66311x29b7f943);
        }
        if (this.f66308x78dd32ee == null) {
            this.f66308x78dd32ee = "";
        }
        if (this.f318037h) {
            contentValues.put("boxJSON", this.f66308x78dd32ee);
        }
        if (this.f66307xf361ea7f == null) {
            this.f66307xf361ea7f = "";
        }
        if (this.f318038i) {
            contentValues.put("boxFTS", this.f66307xf361ea7f);
        }
        if (this.f66310x26b3182a == null) {
            this.f66310x26b3182a = "";
        }
        if (this.f318039m) {
            contentValues.put("extInfo", this.f66310x26b3182a);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseAIHistoryMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AIHistoryMessage ( ");
        l75.e0 e0Var = f318031x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318022o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAIHistoryMessage", "createTableSql %s", str2);
            k0Var.A("AIHistoryMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "AIHistoryMessage", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAIHistoryMessage", "updateTableSql %s", str3);
            k0Var.A("AIHistoryMessage", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseAIHistoryMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318031x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318032y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66312x52baae88;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318021n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318021n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("searchId")) {
            this.f66312x52baae88 = contentValues.getAsString("searchId");
            if (z17) {
                this.f318033d = true;
            }
        }
        if (contentValues.containsKey("chatId")) {
            this.f66309xf4aa5578 = contentValues.getAsString("chatId");
            if (z17) {
                this.f318034e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.f66313x9c2463f1 = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f318035f = true;
            }
        }
        if (contentValues.containsKey("query")) {
            this.f66311x29b7f943 = contentValues.getAsString("query");
            if (z17) {
                this.f318036g = true;
            }
        }
        if (contentValues.containsKey("boxJSON")) {
            this.f66308x78dd32ee = contentValues.getAsString("boxJSON");
            if (z17) {
                this.f318037h = true;
            }
        }
        if (contentValues.containsKey("boxFTS")) {
            this.f66307xf361ea7f = contentValues.getAsString("boxFTS");
            if (z17) {
                this.f318038i = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.f66310x26b3182a = contentValues.getAsString("extInfo");
            if (z17) {
                this.f318039m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
