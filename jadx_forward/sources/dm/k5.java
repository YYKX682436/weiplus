package dm;

/* loaded from: classes8.dex */
public class k5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final l75.e0 f319537J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f319538t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f319539u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f319540v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f319541w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f319542x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f319543y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f319544z;

    /* renamed from: field_BusinessData */
    public java.lang.String f67204xedd646cf;

    /* renamed from: field_bgMixTaskId */
    public java.lang.String f67205x4998b872;

    /* renamed from: field_compressImg */
    public boolean f67206xc119393c;

    /* renamed from: field_createTime */
    public long f67207xac3be4e;

    /* renamed from: field_localIdList */
    public java.lang.String f67208xae33d3df;

    /* renamed from: field_mediaList */
    public java.lang.String f67209x1a2f2d9d;

    /* renamed from: field_mediaType */
    public int f67210x1a330c39;

    /* renamed from: field_mixState */
    public int f67211xdc9ed13a;

    /* renamed from: field_publishSource */
    public int f67212xf10bdf85;

    /* renamed from: field_publishState */
    public int f67213x9c6db7e7;

    /* renamed from: field_sourceSceneId */
    public int f67214xf10c4fa7;

    /* renamed from: field_taskId */
    public java.lang.String f67215x11522065;

    /* renamed from: field_uploadState */
    public int f67216xaa90b74b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f319545d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319546e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319547f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319548g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319549h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f319550i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f319551m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f319552n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f319553o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f319554p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f319555q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f319556r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f319557s = true;

    static {
        p75.n0 n0Var = new p75.n0("GameHaowanPublishEdition");
        f319538t = n0Var;
        java.lang.String tableName = n0Var.f434209a;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tableName, "tableName");
        f319539u = new java.lang.String[0];
        f319540v = -880873088;
        f319541w = 1369213417;
        f319542x = 2009180682;
        f319543y = 2140463422;
        f319544z = 1114930084;
        A = 2140209826;
        B = -508913750;
        C = 1053908752;
        D = -1874720574;
        E = 1431953665;
        F = -1092892779;
        G = -572956617;
        H = 2009209388;
        I = 108705909;
        f319537J = m125166x3593deb(dm.k5.class);
        K = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125166x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f398487c = strArr;
        strArr[0] = "taskId";
        e0Var.f398488d.put("taskId", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "taskId";
        e0Var.f398487c[1] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[2] = "publishSource";
        e0Var.f398488d.put("publishSource", "INTEGER");
        e0Var.f398487c[3] = "mediaType";
        e0Var.f398488d.put("mediaType", "INTEGER");
        e0Var.f398487c[4] = "localIdList";
        e0Var.f398488d.put("localIdList", "TEXT");
        e0Var.f398487c[5] = "mediaList";
        e0Var.f398488d.put("mediaList", "TEXT");
        e0Var.f398487c[6] = "BusinessData";
        e0Var.f398488d.put("BusinessData", "TEXT");
        e0Var.f398487c[7] = "uploadState";
        e0Var.f398488d.put("uploadState", "INTEGER default '0' ");
        e0Var.f398487c[8] = "publishState";
        e0Var.f398488d.put("publishState", "INTEGER default '0' ");
        e0Var.f398487c[9] = "compressImg";
        e0Var.f398488d.put("compressImg", "INTEGER default 'true' ");
        e0Var.f398487c[10] = "mixState";
        e0Var.f398488d.put("mixState", "INTEGER default '0' ");
        e0Var.f398487c[11] = "bgMixTaskId";
        e0Var.f398488d.put("bgMixTaskId", "TEXT");
        e0Var.f398487c[12] = "sourceSceneId";
        e0Var.f398488d.put("sourceSceneId", "INTEGER default '0' ");
        e0Var.f398487c[13] = "rowid";
        e0Var.f398489e = " taskId TEXT PRIMARY KEY ,  createTime LONG,  publishSource INTEGER,  mediaType INTEGER,  localIdList TEXT,  mediaList TEXT,  BusinessData TEXT,  uploadState INTEGER default '0' ,  publishState INTEGER default '0' ,  compressImg INTEGER default 'true' ,  mixState INTEGER default '0' ,  bgMixTaskId TEXT,  sourceSceneId INTEGER default '0' ";
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
            boolean z17 = true;
            if (f319540v == hashCode) {
                try {
                    this.f67215x11522065 = cursor.getString(i17);
                    this.f319545d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319541w == hashCode) {
                try {
                    this.f67207xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319542x == hashCode) {
                try {
                    this.f67212xf10bdf85 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319543y == hashCode) {
                try {
                    this.f67210x1a330c39 = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f319544z == hashCode) {
                try {
                    this.f67208xae33d3df = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f67209x1a2f2d9d = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f67204xedd646cf = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                try {
                    this.f67216xaa90b74b = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (D == hashCode) {
                try {
                    this.f67213x9c6db7e7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (E == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.f67206xc119393c = z17;
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (F == hashCode) {
                try {
                    this.f67211xdc9ed13a = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (G == hashCode) {
                try {
                    this.f67205x4998b872 = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (H == hashCode) {
                try {
                    this.f67214xf10c4fa7 = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameHaowanPublishEdition", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (I == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f319545d) {
            contentValues.put("taskId", this.f67215x11522065);
        }
        if (this.f319546e) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f67207xac3be4e));
        }
        if (this.f319547f) {
            contentValues.put("publishSource", java.lang.Integer.valueOf(this.f67212xf10bdf85));
        }
        if (this.f319548g) {
            contentValues.put("mediaType", java.lang.Integer.valueOf(this.f67210x1a330c39));
        }
        if (this.f319549h) {
            contentValues.put("localIdList", this.f67208xae33d3df);
        }
        if (this.f319550i) {
            contentValues.put("mediaList", this.f67209x1a2f2d9d);
        }
        if (this.f319551m) {
            contentValues.put("BusinessData", this.f67204xedd646cf);
        }
        if (this.f319552n) {
            contentValues.put("uploadState", java.lang.Integer.valueOf(this.f67216xaa90b74b));
        }
        if (this.f319553o) {
            contentValues.put("publishState", java.lang.Integer.valueOf(this.f67213x9c6db7e7));
        }
        if (this.f319554p) {
            if (this.f67206xc119393c) {
                contentValues.put("compressImg", (java.lang.Integer) 1);
            } else {
                contentValues.put("compressImg", (java.lang.Integer) 0);
            }
        }
        if (this.f319555q) {
            contentValues.put("mixState", java.lang.Integer.valueOf(this.f67211xdc9ed13a));
        }
        if (this.f319556r) {
            contentValues.put("bgMixTaskId", this.f67205x4998b872);
        }
        if (this.f319557s) {
            contentValues.put("sourceSceneId", java.lang.Integer.valueOf(this.f67214xf10c4fa7));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameHaowanPublishEdition ( ");
        l75.e0 e0Var = f319537J;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f319539u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTableSql %s", str2);
            k0Var.A("GameHaowanPublishEdition", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameHaowanPublishEdition", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "updateTableSql %s", str3);
            k0Var.A("GameHaowanPublishEdition", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f319537J;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return K;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f67215x11522065;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f319538t;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f319538t.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("taskId")) {
            this.f67215x11522065 = contentValues.getAsString("taskId");
            if (z17) {
                this.f319545d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f67207xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f319546e = true;
            }
        }
        if (contentValues.containsKey("publishSource")) {
            this.f67212xf10bdf85 = contentValues.getAsInteger("publishSource").intValue();
            if (z17) {
                this.f319547f = true;
            }
        }
        if (contentValues.containsKey("mediaType")) {
            this.f67210x1a330c39 = contentValues.getAsInteger("mediaType").intValue();
            if (z17) {
                this.f319548g = true;
            }
        }
        if (contentValues.containsKey("localIdList")) {
            this.f67208xae33d3df = contentValues.getAsString("localIdList");
            if (z17) {
                this.f319549h = true;
            }
        }
        if (contentValues.containsKey("mediaList")) {
            this.f67209x1a2f2d9d = contentValues.getAsString("mediaList");
            if (z17) {
                this.f319550i = true;
            }
        }
        if (contentValues.containsKey("BusinessData")) {
            this.f67204xedd646cf = contentValues.getAsString("BusinessData");
            if (z17) {
                this.f319551m = true;
            }
        }
        if (contentValues.containsKey("uploadState")) {
            this.f67216xaa90b74b = contentValues.getAsInteger("uploadState").intValue();
            if (z17) {
                this.f319552n = true;
            }
        }
        if (contentValues.containsKey("publishState")) {
            this.f67213x9c6db7e7 = contentValues.getAsInteger("publishState").intValue();
            if (z17) {
                this.f319553o = true;
            }
        }
        if (contentValues.containsKey("compressImg")) {
            this.f67206xc119393c = contentValues.getAsInteger("compressImg").intValue() != 0;
            if (z17) {
                this.f319554p = true;
            }
        }
        if (contentValues.containsKey("mixState")) {
            this.f67211xdc9ed13a = contentValues.getAsInteger("mixState").intValue();
            if (z17) {
                this.f319555q = true;
            }
        }
        if (contentValues.containsKey("bgMixTaskId")) {
            this.f67205x4998b872 = contentValues.getAsString("bgMixTaskId");
            if (z17) {
                this.f319556r = true;
            }
        }
        if (contentValues.containsKey("sourceSceneId")) {
            this.f67214xf10c4fa7 = contentValues.getAsInteger("sourceSceneId").intValue();
            if (z17) {
                this.f319557s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
