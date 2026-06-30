package dm;

/* loaded from: classes8.dex */
public class w2 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f322271n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f322272o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f322273p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f322274q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f322275r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f322276s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f322277t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f322278u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f322279v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f322280w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f322281x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f322282y;

    /* renamed from: field_click_flag */
    public int f68946x8ad25c28;

    /* renamed from: field_desc */
    public java.lang.String f68947x225aa2b6;

    /* renamed from: field_download_flag */
    public int f68948x7b2a3a3e;

    /* renamed from: field_groupId */
    public java.lang.String f68949x861009b5;

    /* renamed from: field_lang */
    public java.lang.String f68950x225e3613;

    /* renamed from: field_md5 */
    public java.lang.String f68951x4b6e68b9;

    /* renamed from: field_md5_lang */
    public java.lang.String f68952x62706db4;

    /* renamed from: d, reason: collision with root package name */
    public boolean f322283d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f322284e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322285f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f322286g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f322287h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f322288i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f322289m = true;

    static {
        p75.n0 n0Var = new p75.n0("EmojiInfoDesc");
        f322271n = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f322272o = new java.lang.String[0];
        f322273p = 1152214031;
        f322274q = 107902;
        f322275r = 3314158;
        f322276s = 3079825;
        f322277t = 293428218;
        f322278u = -777312317;
        f322279v = 31458499;
        f322280w = 108705909;
        f322281x = m125651x3593deb(dm.w2.class);
        f322282y = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125651x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f398487c = strArr;
        strArr[0] = "md5_lang";
        e0Var.f398488d.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
        e0Var.f398486b = "md5_lang";
        e0Var.f398487c[1] = "md5";
        e0Var.f398488d.put("md5", "TEXT COLLATE NOCASE ");
        e0Var.f398487c[2] = "lang";
        e0Var.f398488d.put("lang", "TEXT COLLATE NOCASE ");
        e0Var.f398487c[3] = "desc";
        e0Var.f398488d.put("desc", "TEXT");
        e0Var.f398487c[4] = "groupId";
        e0Var.f398488d.put("groupId", "TEXT default '' ");
        e0Var.f398487c[5] = "click_flag";
        e0Var.f398488d.put("click_flag", "INTEGER");
        e0Var.f398487c[6] = "download_flag";
        e0Var.f398488d.put("download_flag", "INTEGER");
        e0Var.f398487c[7] = "rowid";
        e0Var.f398489e = " md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ,  md5 TEXT COLLATE NOCASE ,  lang TEXT COLLATE NOCASE ,  desc TEXT,  groupId TEXT default '' ,  click_flag INTEGER,  download_flag INTEGER";
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
            if (f322273p == hashCode) {
                try {
                    this.f68952x62706db4 = cursor.getString(i17);
                    this.f322283d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322274q == hashCode) {
                try {
                    this.f68951x4b6e68b9 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322275r == hashCode) {
                try {
                    this.f68950x225e3613 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322276s == hashCode) {
                try {
                    this.f68947x225aa2b6 = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322277t == hashCode) {
                try {
                    this.f68949x861009b5 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322278u == hashCode) {
                try {
                    this.f68946x8ad25c28 = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322279v == hashCode) {
                try {
                    this.f68948x7b2a3a3e = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseEmojiInfoDesc", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f322280w == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322283d) {
            contentValues.put("md5_lang", this.f68952x62706db4);
        }
        if (this.f322284e) {
            contentValues.put("md5", this.f68951x4b6e68b9);
        }
        if (this.f322285f) {
            contentValues.put("lang", this.f68950x225e3613);
        }
        if (this.f322286g) {
            contentValues.put("desc", this.f68947x225aa2b6);
        }
        if (this.f68949x861009b5 == null) {
            this.f68949x861009b5 = "";
        }
        if (this.f322287h) {
            contentValues.put("groupId", this.f68949x861009b5);
        }
        if (this.f322288i) {
            contentValues.put("click_flag", java.lang.Integer.valueOf(this.f68946x8ad25c28));
        }
        if (this.f322289m) {
            contentValues.put("download_flag", java.lang.Integer.valueOf(this.f68948x7b2a3a3e));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseEmojiInfoDesc", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiInfoDesc ( ");
        l75.e0 e0Var = f322281x;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f322272o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiInfoDesc", "createTableSql %s", str2);
            k0Var.A("EmojiInfoDesc", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "EmojiInfoDesc", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiInfoDesc", "updateTableSql %s", str3);
            k0Var.A("EmojiInfoDesc", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseEmojiInfoDesc", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f322281x;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f322282y;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68952x62706db4;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f322271n;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f322271n.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("md5_lang")) {
            this.f68952x62706db4 = contentValues.getAsString("md5_lang");
            if (z17) {
                this.f322283d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.f68951x4b6e68b9 = contentValues.getAsString("md5");
            if (z17) {
                this.f322284e = true;
            }
        }
        if (contentValues.containsKey("lang")) {
            this.f68950x225e3613 = contentValues.getAsString("lang");
            if (z17) {
                this.f322285f = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.f68947x225aa2b6 = contentValues.getAsString("desc");
            if (z17) {
                this.f322286g = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.f68949x861009b5 = contentValues.getAsString("groupId");
            if (z17) {
                this.f322287h = true;
            }
        }
        if (contentValues.containsKey("click_flag")) {
            this.f68946x8ad25c28 = contentValues.getAsInteger("click_flag").intValue();
            if (z17) {
                this.f322288i = true;
            }
        }
        if (contentValues.containsKey("download_flag")) {
            this.f68948x7b2a3a3e = contentValues.getAsInteger("download_flag").intValue();
            if (z17) {
                this.f322289m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
