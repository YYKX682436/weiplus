package dm;

/* loaded from: classes8.dex */
public class u5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final l75.e0 D;
    public static final o75.e E;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.n0 f321834q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f321835r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f321836s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f321837t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f321838u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f321839v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f321840w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f321841x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f321842y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f321843z;

    /* renamed from: field_appId */
    public java.lang.String f68557x28d45f97;

    /* renamed from: field_checkCgiTime */
    public long f68558x3349a5ef;

    /* renamed from: field_createTime */
    public long f68559xac3be4e;

    /* renamed from: field_downloadItemList */
    public byte[] f68560xc2f9979e;

    /* renamed from: field_expiredSeconds */
    public int f68561xbdbd517f;

    /* renamed from: field_finishDownloadTime */
    public long f68562xdeeda70d;

    /* renamed from: field_intervalSeconds */
    public int f68563x1597c8b5;

    /* renamed from: field_packageName */
    public java.lang.String f68564xa1e9e82c;

    /* renamed from: field_scene */
    public int f68565x29cbf907;

    /* renamed from: field_taskExpiredSeconds */
    public long f68566x5f6e4be4;

    /* renamed from: d, reason: collision with root package name */
    public boolean f321844d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f321845e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321846f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f321847g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f321848h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f321849i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f321850m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f321851n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f321852o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f321853p = true;

    static {
        p75.n0 n0Var = new p75.n0("GameResourceDownload");
        f321834q = n0Var;
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
        f321835r = new java.lang.String[0];
        f321836s = 908759025;
        f321837t = 93028124;
        f321838u = -972749318;
        f321839v = 230741914;
        f321840w = 1369213417;
        f321841x = 656275146;
        f321842y = -684021848;
        f321843z = 540279545;
        A = 1471892607;
        B = 109254796;
        C = 108705909;
        D = m125536x3593deb(dm.u5.class);
        E = new o75.e();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125536x3593deb(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[10];
        java.lang.String[] strArr = new java.lang.String[11];
        e0Var.f398487c = strArr;
        strArr[0] = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1;
        e0Var.f398488d.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, "TEXT PRIMARY KEY ");
        e0Var.f398486b = com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1;
        e0Var.f398487c[1] = "appId";
        e0Var.f398488d.put("appId", "TEXT");
        e0Var.f398487c[2] = "intervalSeconds";
        e0Var.f398488d.put("intervalSeconds", "INTEGER");
        e0Var.f398487c[3] = "expiredSeconds";
        e0Var.f398488d.put("expiredSeconds", "INTEGER");
        e0Var.f398487c[4] = "createTime";
        e0Var.f398488d.put("createTime", "LONG");
        e0Var.f398487c[5] = "checkCgiTime";
        e0Var.f398488d.put("checkCgiTime", "LONG");
        e0Var.f398487c[6] = "finishDownloadTime";
        e0Var.f398488d.put("finishDownloadTime", "LONG");
        e0Var.f398487c[7] = "downloadItemList";
        e0Var.f398488d.put("downloadItemList", "BLOB");
        e0Var.f398487c[8] = "taskExpiredSeconds";
        e0Var.f398488d.put("taskExpiredSeconds", "LONG");
        e0Var.f398487c[9] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
        e0Var.f398488d.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "INTEGER");
        e0Var.f398487c[10] = "rowid";
        e0Var.f398489e = " packageName TEXT PRIMARY KEY ,  appId TEXT,  intervalSeconds INTEGER,  expiredSeconds INTEGER,  createTime LONG,  checkCgiTime LONG,  finishDownloadTime LONG,  downloadItemList BLOB,  taskExpiredSeconds LONG,  scene INTEGER";
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
            if (f321836s == hashCode) {
                try {
                    this.f68564xa1e9e82c = cursor.getString(i17);
                    this.f321844d = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321837t == hashCode) {
                try {
                    this.f68557x28d45f97 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321838u == hashCode) {
                try {
                    this.f68563x1597c8b5 = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321839v == hashCode) {
                try {
                    this.f68561xbdbd517f = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321840w == hashCode) {
                try {
                    this.f68559xac3be4e = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321841x == hashCode) {
                try {
                    this.f68558x3349a5ef = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321842y == hashCode) {
                try {
                    this.f68562xdeeda70d = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f321843z == hashCode) {
                try {
                    this.f68560xc2f9979e = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (A == hashCode) {
                try {
                    this.f68566x5f6e4be4 = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (B == hashCode) {
                try {
                    this.f68565x29cbf907 = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SDK.BaseGameResourceDownload", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (C == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f321844d) {
            contentValues.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, this.f68564xa1e9e82c);
        }
        if (this.f321845e) {
            contentValues.put("appId", this.f68557x28d45f97);
        }
        if (this.f321846f) {
            contentValues.put("intervalSeconds", java.lang.Integer.valueOf(this.f68563x1597c8b5));
        }
        if (this.f321847g) {
            contentValues.put("expiredSeconds", java.lang.Integer.valueOf(this.f68561xbdbd517f));
        }
        if (this.f321848h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.f68559xac3be4e));
        }
        if (this.f321849i) {
            contentValues.put("checkCgiTime", java.lang.Long.valueOf(this.f68558x3349a5ef));
        }
        if (this.f321850m) {
            contentValues.put("finishDownloadTime", java.lang.Long.valueOf(this.f68562xdeeda70d));
        }
        if (this.f321851n) {
            contentValues.put("downloadItemList", this.f68560xc2f9979e);
        }
        if (this.f321852o) {
            contentValues.put("taskExpiredSeconds", java.lang.Long.valueOf(this.f68566x5f6e4be4));
        }
        if (this.f321853p) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f68565x29cbf907));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BaseGameResourceDownload", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameResourceDownload ( ");
        l75.e0 e0Var = D;
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f321835r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameResourceDownload", "createTableSql %s", str2);
            k0Var.A("GameResourceDownload", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(e0Var, "GameResourceDownload", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameResourceDownload", "updateTableSql %s", str3);
            k0Var.A("GameResourceDownload", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BaseGameResourceDownload", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return D;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return E;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f68564xa1e9e82c;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f321834q;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f321834q.f434209a;
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1)) {
            this.f68564xa1e9e82c = contentValues.getAsString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
            if (z17) {
                this.f321844d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.f68557x28d45f97 = contentValues.getAsString("appId");
            if (z17) {
                this.f321845e = true;
            }
        }
        if (contentValues.containsKey("intervalSeconds")) {
            this.f68563x1597c8b5 = contentValues.getAsInteger("intervalSeconds").intValue();
            if (z17) {
                this.f321846f = true;
            }
        }
        if (contentValues.containsKey("expiredSeconds")) {
            this.f68561xbdbd517f = contentValues.getAsInteger("expiredSeconds").intValue();
            if (z17) {
                this.f321847g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.f68559xac3be4e = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f321848h = true;
            }
        }
        if (contentValues.containsKey("checkCgiTime")) {
            this.f68558x3349a5ef = contentValues.getAsLong("checkCgiTime").longValue();
            if (z17) {
                this.f321849i = true;
            }
        }
        if (contentValues.containsKey("finishDownloadTime")) {
            this.f68562xdeeda70d = contentValues.getAsLong("finishDownloadTime").longValue();
            if (z17) {
                this.f321850m = true;
            }
        }
        if (contentValues.containsKey("downloadItemList")) {
            this.f68560xc2f9979e = contentValues.getAsByteArray("downloadItemList");
            if (z17) {
                this.f321851n = true;
            }
        }
        if (contentValues.containsKey("taskExpiredSeconds")) {
            this.f68566x5f6e4be4 = contentValues.getAsLong("taskExpiredSeconds").longValue();
            if (z17) {
                this.f321852o = true;
            }
        }
        if (contentValues.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
            this.f68565x29cbf907 = contentValues.getAsInteger(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811).intValue();
            if (z17) {
                this.f321853p = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
