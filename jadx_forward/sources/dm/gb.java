package dm;

/* loaded from: classes8.dex */
public class gb extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f318741i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f318742m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f318743n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f318744o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f318745p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f318746q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f318747r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f318748s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f318749t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f318750u;

    /* renamed from: field_conDescription */
    public java.lang.String f66690xbe857eff;

    /* renamed from: field_conPhone */
    public java.lang.String f66691xf9f876b1;

    /* renamed from: field_conRemark */
    public java.lang.String f66692x4854b29d;

    /* renamed from: field_contactLabels */
    public java.lang.String f66693x91130dba;

    /* renamed from: field_encryptUsername */
    public java.lang.String f66694xdd77ad16;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318751d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f318752e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318753f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f318754g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318755h = true;

    static {
        p75.n0 n0Var = new p75.n0("Stranger");
        f318741i = n0Var;
        java.lang.String tableName = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f318742m = new java.lang.String[0];
        f318743n = -1914377637;
        f318744o = -1380546654;
        f318745p = 399038527;
        f318746q = 243860762;
        f318747r = -600478452;
        f318748s = 108705909;
        f318749t = m125012x3593deb(dm.gb.class);
        f318750u = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125012x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f398487c = strArr;
        strArr[0] = "encryptUsername";
        e0Var.f398488d.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
        e0Var.f398486b = "encryptUsername";
        e0Var.f398487c[1] = "conRemark";
        e0Var.f398488d.put("conRemark", "TEXT default '' ");
        e0Var.f398487c[2] = "contactLabels";
        e0Var.f398488d.put("contactLabels", "TEXT default '' ");
        e0Var.f398487c[3] = "conDescription";
        e0Var.f398488d.put("conDescription", "TEXT default '' ");
        e0Var.f398487c[4] = "conPhone";
        e0Var.f398488d.put("conPhone", "TEXT default '' ");
        e0Var.f398487c[5] = "rowid";
        e0Var.f398489e = " encryptUsername TEXT default ''  PRIMARY KEY ,  conRemark TEXT default '' ,  contactLabels TEXT default '' ,  conDescription TEXT default '' ,  conPhone TEXT default '' ";
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
            if (f318743n == hashCode) {
                try {
                    this.f66694xdd77ad16 = cursor.getString(i17);
                    this.f318751d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStranger", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318744o == hashCode) {
                try {
                    this.f66692x4854b29d = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStranger", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318745p == hashCode) {
                try {
                    this.f66693x91130dba = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStranger", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318746q == hashCode) {
                try {
                    this.f66690xbe857eff = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStranger", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318747r == hashCode) {
                try {
                    this.f66691xf9f876b1 = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseStranger", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f318748s == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66694xdd77ad16 == null) {
            this.f66694xdd77ad16 = "";
        }
        if (this.f318751d) {
            contentValues.put("encryptUsername", this.f66694xdd77ad16);
        }
        if (this.f66692x4854b29d == null) {
            this.f66692x4854b29d = "";
        }
        if (this.f318752e) {
            contentValues.put("conRemark", this.f66692x4854b29d);
        }
        if (this.f66693x91130dba == null) {
            this.f66693x91130dba = "";
        }
        if (this.f318753f) {
            contentValues.put("contactLabels", this.f66693x91130dba);
        }
        if (this.f66690xbe857eff == null) {
            this.f66690xbe857eff = "";
        }
        if (this.f318754g) {
            contentValues.put("conDescription", this.f66690xbe857eff);
        }
        if (this.f66691xf9f876b1 == null) {
            this.f66691xf9f876b1 = "";
        }
        if (this.f318755h) {
            contentValues.put("conPhone", this.f66691xf9f876b1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseStranger", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS Stranger ( ");
        l75.e0 e0Var = f318749t;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f318742m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStranger", "createTableSql %s", str2);
            k0Var.A("Stranger", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "Stranger", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStranger", "updateTableSql %s", str3);
            k0Var.A("Stranger", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseStranger", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f318749t;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f318750u;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66694xdd77ad16;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f318741i;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f318741i.f434209a;
    }

    @Override // l75.f0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject mo124851xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "encryptUsername", this.f66694xdd77ad16);
            n51.f.b(jSONObject, "conRemark", this.f66692x4854b29d);
            n51.f.b(jSONObject, "contactLabels", this.f66693x91130dba);
            n51.f.b(jSONObject, "conDescription", this.f66690xbe857eff);
            n51.f.b(jSONObject, "conPhone", this.f66691xf9f876b1);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("encryptUsername")) {
            this.f66694xdd77ad16 = contentValues.getAsString("encryptUsername");
            if (z17) {
                this.f318751d = true;
            }
        }
        if (contentValues.containsKey("conRemark")) {
            this.f66692x4854b29d = contentValues.getAsString("conRemark");
            if (z17) {
                this.f318752e = true;
            }
        }
        if (contentValues.containsKey("contactLabels")) {
            this.f66693x91130dba = contentValues.getAsString("contactLabels");
            if (z17) {
                this.f318753f = true;
            }
        }
        if (contentValues.containsKey("conDescription")) {
            this.f66690xbe857eff = contentValues.getAsString("conDescription");
            if (z17) {
                this.f318754g = true;
            }
        }
        if (contentValues.containsKey("conPhone")) {
            this.f66691xf9f876b1 = contentValues.getAsString("conPhone");
            if (z17) {
                this.f318755h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
