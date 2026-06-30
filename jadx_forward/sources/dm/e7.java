package dm;

/* loaded from: classes12.dex */
public class e7 extends l75.f0 {

    /* renamed from: COL_EXPIRE_AT */
    public static final java.lang.String f66389x5c44bb34 = "expire_at";

    /* renamed from: COL_KEY */
    public static final java.lang.String f66390x636ba6e0 = "key";

    /* renamed from: COL_TYPE */
    public static final java.lang.String f66391xa0d96b9 = "type";

    /* renamed from: COL_VALUE */
    public static final java.lang.String f66392x37b679b2 = "value";

    /* renamed from: DB_INFO */
    public static final l75.e0 f66393x8324abcf;

    /* renamed from: EXPIRE_AT */
    public static final p75.d f66394xb501f353;

    /* renamed from: INDEX_CREATE */
    public static final java.lang.String[] f66395x371a9529;
    public static final p75.d KEY;

    /* renamed from: OBSERVER_OWNER */
    public static final o75.e f66396x7807a7ea;

    /* renamed from: ROWID */
    public static final p75.d f66397x4a8c055;

    /* renamed from: TABLE */
    public static final p75.n0 f66398x4be43ae;

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f66399xc4fe047c = "KindaConfigCache";

    /* renamed from: TAG_ */
    private static final java.lang.String f66400x272c25 = "MicroMsg.SDK.BaseKindaConfigCache";

    /* renamed from: TYPE */
    public static final p75.d f66401x27873a;

    /* renamed from: VALUE */
    public static final p75.d f66402x4da9951;

    /* renamed from: expire_at_HASHCODE */
    private static final int f66403xca35fb67;

    /* renamed from: key_HASHCODE */
    private static final int f66404xa91875db;

    /* renamed from: rowid_HASHCODE */
    private static final int f66405x4e8c5485;

    /* renamed from: type_HASHCODE */
    private static final int f66406x78454b60;

    /* renamed from: value_HASHCODE */
    private static final int f66407x6538d709;

    /* renamed from: field_expire_at */
    public long f66412xa987964e;

    /* renamed from: field_key */
    public java.lang.String f66413x4b6e619a;

    /* renamed from: field_type */
    public int f66414x2262335f;

    /* renamed from: field_value */
    public java.lang.String f66415x29f571ec;

    /* renamed from: __hadSetkey */
    private boolean f66409xbd956948 = true;

    /* renamed from: __hadSetvalue */
    private boolean f66411xae79461a = true;

    /* renamed from: __hadSettype */
    private boolean f66410xf51c2171 = true;

    /* renamed from: __hadSetexpire_at */
    private boolean f66408xe289a37c = true;

    static {
        p75.n0 n0Var = new p75.n0("KindaConfigCache");
        f66398x4be43ae = n0Var;
        java.lang.String str = n0Var.f434209a;
        f66397x4a8c055 = new p75.d("rowid", "long", str, "");
        KEY = new p75.d("key", "string", str, "");
        f66402x4da9951 = new p75.d("value", "string", str, "");
        f66401x27873a = new p75.d("type", "int", str, "");
        f66394xb501f353 = new p75.d("expire_at", "long", str, "");
        f66395x371a9529 = new java.lang.String[0];
        f66404xa91875db = 106079;
        f66407x6538d709 = 111972721;
        f66406x78454b60 = 3575610;
        f66403xca35fb67 = 250178387;
        f66405x4e8c5485 = 108705909;
        f66393x8324abcf = m124910x3593deb(dm.e7.class);
        f66396x7807a7ea = new o75.e();
    }

    /* renamed from: batchInsert */
    public static final m75.a m124905xead4b293(java.util.List<dm.e7> list, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (dm.e7 e7Var : list) {
            if (z17) {
                arrayList.add(new m75.c(e7Var, true, e7Var.m124934x258b5cc5(), f66396x7807a7ea, f66400x272c25));
            } else {
                arrayList.add(new m75.c(e7Var, true, null, null, f66400x272c25));
            }
        }
        return new m75.a(arrayList);
    }

    /* renamed from: createTable */
    public static void m124906xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f66400x272c25, "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        linkedList.add("CREATE TABLE IF NOT EXISTS KindaConfigCache ( " + f66393x8324abcf.f398489e + ");");
        for (java.lang.String str : f66395x371a9529) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f66400x272c25, "createTableSql %s", str2);
            k0Var.A("KindaConfigCache", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(f66393x8324abcf, "KindaConfigCache", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f66400x272c25, "updateTableSql %s", str3);
            k0Var.A("KindaConfigCache", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f66400x272c25, "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: cvBuilder */
    public static final dm.a7 m124907xa93e23a8() {
        return new dm.a7();
    }

    /* renamed from: delete */
    public static final dm.b7 m124908xb06685ab() {
        return new dm.b7();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m124910x3593deb(java.lang.Class<?> cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "value";
        e0Var.f398488d.put("value", "TEXT");
        e0Var.f398487c[2] = "type";
        e0Var.f398488d.put("type", "INTEGER");
        e0Var.f398487c[3] = "expire_at";
        e0Var.f398488d.put("expire_at", "LONG");
        e0Var.f398487c[4] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  value TEXT,  type INTEGER,  expire_at LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    /* renamed from: insert */
    public static final m75.c m124911xb970c2b9(dm.e7 e7Var, boolean z17) {
        return z17 ? new m75.c(e7Var, true, e7Var.m124934x258b5cc5(), f66396x7807a7ea, f66400x272c25) : new m75.c(e7Var, true, null, null, f66400x272c25);
    }

    /* renamed from: insertOrThrow */
    public static final m75.c m124912x98afe1ca(dm.e7 e7Var, boolean z17) {
        return z17 ? new m75.c(e7Var, false, e7Var.m124934x258b5cc5(), f66396x7807a7ea, f66400x272c25) : new m75.c(e7Var, false, null, null, f66400x272c25);
    }

    /* renamed from: isExistByKey */
    public static final p75.l0 m124913x8b0d0a9b(java.lang.String str) {
        p75.n0 n0Var = f66398x4be43ae;
        p75.d dVar = KEY;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f434190d = dVar.j(str);
        h17.f434189c = f66400x272c25;
        h17.c(1, 0);
        return h17.a();
    }

    /* renamed from: observe */
    public static final void m124914x9d92d11c(p012xc85e97e9.p093xedfae76a.y yVar, o75.a aVar) {
        f66396x7807a7ea.m127126x9d92d11c(yVar, aVar);
    }

    /* renamed from: removeObserve */
    public static final void m124915xe4d493f8(o75.a aVar) {
        f66396x7807a7ea.mo127128xb5bdeb7a(aVar);
    }

    /* renamed from: replace */
    public static final m75.d m124916x413cb2b4(dm.e7 e7Var, boolean z17) {
        return z17 ? new m75.d(e7Var, e7Var.m124935x90c9bb62(), f66396x7807a7ea, f66400x272c25) : new m75.d(e7Var, null, null, f66400x272c25);
    }

    /* renamed from: select */
    public static final dm.c7 m124917xc9ff34fc() {
        return new dm.c7();
    }

    /* renamed from: selectByExpire_at */
    public static final p75.l0 m124918x591f2e20(long j17) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = f66394xb501f353.i(java.lang.Long.valueOf(j17));
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectByExpire_atList */
    public static final p75.l0 m124919x3bbf42de(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = f66394xb501f353.k(list);
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectByKey */
    public static final p75.l0 m124920xb40beec(java.lang.String str) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = KEY.j(str);
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectByKeyList */
    public static final p75.l0 m124921xedd38daa(java.util.List<java.lang.String> list) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = KEY.l(list);
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectByType */
    public static final p75.l0 m124922x5cdb804d(int i17) {
        p75.i0 i18 = f66398x4be43ae.i();
        i18.f434190d = f66401x27873a.i(java.lang.Integer.valueOf(i17));
        i18.f434189c = f66400x272c25;
        return i18.a();
    }

    /* renamed from: selectByTypeList */
    public static final p75.l0 m124923x877cb68b(java.util.List<java.lang.Integer> list) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = f66401x27873a.k(list);
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectByValue */
    public static final p75.l0 m124924x3ea5c2be(java.lang.String str) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = f66402x4da9951.j(str);
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectByValueList */
    public static final p75.l0 m124925x1c8e587c(java.util.List<java.lang.String> list) {
        p75.i0 i17 = f66398x4be43ae.i();
        i17.f434190d = f66402x4da9951.l(list);
        i17.f434189c = f66400x272c25;
        return i17.a();
    }

    /* renamed from: selectExistListByKey */
    public static final p75.l0 m124926x7c48eb6f(java.util.List<java.lang.String> list) {
        p75.n0 n0Var = f66398x4be43ae;
        p75.d dVar = KEY;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f434190d = dVar.l(list);
        h17.f434189c = f66400x272c25;
        return h17.a();
    }

    /* renamed from: selectExpire_atByKey */
    public static final long m124927xac557f11(l75.k0 k0Var, java.lang.String str) {
        dm.c7 m124917xc9ff34fc = m124917xc9ff34fc();
        ((java.util.LinkedList) m124917xc9ff34fc.f317683a).add(f66394xb501f353);
        m124917xc9ff34fc.f317684b = KEY.j(str);
        dm.e7 e7Var = (dm.e7) m124917xc9ff34fc.a().o(k0Var, dm.e7.class);
        if (e7Var != null) {
            return e7Var.f66412xa987964e;
        }
        return 0L;
    }

    /* renamed from: selectTypeByKey */
    public static final int m124928xfcf6e1d2(l75.k0 k0Var, java.lang.String str) {
        dm.c7 m124917xc9ff34fc = m124917xc9ff34fc();
        ((java.util.LinkedList) m124917xc9ff34fc.f317683a).add(f66401x27873a);
        m124917xc9ff34fc.f317684b = KEY.j(str);
        dm.e7 e7Var = (dm.e7) m124917xc9ff34fc.a().o(k0Var, dm.e7.class);
        if (e7Var != null) {
            return e7Var.f66414x2262335f;
        }
        return 0;
    }

    /* renamed from: selectValueByKey */
    public static final java.lang.String m124929x8bb3e9b3(l75.k0 k0Var, java.lang.String str) {
        dm.c7 m124917xc9ff34fc = m124917xc9ff34fc();
        ((java.util.LinkedList) m124917xc9ff34fc.f317683a).add(f66402x4da9951);
        m124917xc9ff34fc.f317684b = KEY.j(str);
        dm.e7 e7Var = (dm.e7) m124917xc9ff34fc.a().o(k0Var, dm.e7.class);
        if (e7Var != null) {
            return e7Var.f66415x29f571ec;
        }
        return null;
    }

    /* renamed from: update */
    public static final dm.d7 m124930xce0038c9() {
        return new dm.d7();
    }

    /* renamed from: compareContent */
    public boolean m124932x5c5a33d4(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.e7)) {
            return false;
        }
        dm.e7 e7Var = (dm.e7) f0Var;
        return n51.f.a(this.f66413x4b6e619a, e7Var.f66413x4b6e619a) && n51.f.a(this.f66415x29f571ec, e7Var.f66415x29f571ec) && n51.f.a(java.lang.Integer.valueOf(this.f66414x2262335f), java.lang.Integer.valueOf(e7Var.f66414x2262335f)) && n51.f.a(java.lang.Long.valueOf(this.f66412xa987964e), java.lang.Long.valueOf(e7Var.f66412xa987964e));
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
            if (f66404xa91875db == hashCode) {
                try {
                    this.f66413x4b6e619a = cursor.getString(i17);
                    this.f66409xbd956948 = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f66400x272c25, th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f66407x6538d709 == hashCode) {
                try {
                    this.f66415x29f571ec = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f66400x272c25, th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f66406x78454b60 == hashCode) {
                try {
                    this.f66414x2262335f = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f66400x272c25, th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f66403xca35fb67 == hashCode) {
                try {
                    this.f66412xa987964e = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f66400x272c25, th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f66405x4e8c5485 == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f66409xbd956948) {
            contentValues.put("key", this.f66413x4b6e619a);
        }
        if (this.f66411xae79461a) {
            contentValues.put("value", this.f66415x29f571ec);
        }
        if (this.f66410xf51c2171) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66414x2262335f));
        }
        if (this.f66408xe289a37c) {
            contentValues.put("expire_at", java.lang.Long.valueOf(this.f66412xa987964e));
        }
        long j17 = this.f72763xa3c65b86;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    /* renamed from: createDeleteEvent */
    public o75.c m124933xe8d3a113() {
        o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(mo9766x4c6b483e()), f66400x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    /* renamed from: createInsertEvent */
    public o75.c m124934x258b5cc5() {
        o75.c cVar = new o75.c(o75.b.f425115c, java.lang.String.valueOf(mo9766x4c6b483e()), f66400x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    @Override // l75.f0
    /* renamed from: createMyTable */
    public void mo9764xdf360ce6(l75.k0 k0Var) {
        m124906xe1f0e832(k0Var);
    }

    /* renamed from: createReplaceEvent */
    public o75.c m124935x90c9bb62() {
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(mo9766x4c6b483e()), f66400x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    /* renamed from: createUpdateEvent */
    public o75.c m124936x98330b5() {
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(mo9766x4c6b483e()), f66400x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    /* renamed from: deleteFromDB */
    public int m124937xbc662333(l75.k0 k0Var, boolean z17) {
        return m124909xb06685ab(this, z17).a(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f66393x8324abcf;
    }

    /* renamed from: getIndexCreateSQL */
    public java.lang.String[] m124938xec04bf76() {
        return f66395x371a9529;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f66396x7807a7ea;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f66413x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f66398x4be43ae;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f66398x4be43ae.f434209a;
    }

    /* renamed from: insertOrThrowToDB */
    public long m124939x171dc523(l75.k0 k0Var, boolean z17) {
        return m124912x98afe1ca(this, z17).a(k0Var);
    }

    /* renamed from: insertToDB */
    public long m124940x39969692(l75.k0 k0Var, boolean z17) {
        return m124911xb970c2b9(this, z17).a(k0Var);
    }

    /* renamed from: isExistByKeyInDB */
    public boolean m124941xd223199e(l75.k0 k0Var) {
        return m124913x8b0d0a9b(this.f66413x4b6e619a).h(k0Var);
    }

    /* renamed from: parseBuff */
    public final void m124942x92b54da6() {
    }

    /* renamed from: replaceToDB */
    public long m124943x19a4110d(l75.k0 k0Var, boolean z17) {
        return m124916x413cb2b4(this, z17).a(k0Var);
    }

    /* renamed from: reset */
    public void m124944x6761d4f() {
    }

    /* renamed from: updateToDB */
    public int m124949xee5c84a2(l75.k0 k0Var, boolean z17) {
        return m124931xce0038c9(this, z17).a(k0Var);
    }

    /* renamed from: delete */
    public static final m75.b m124909xb06685ab(dm.e7 e7Var, boolean z17) {
        if (z17) {
            return new m75.b(e7Var, e7Var.m124933xe8d3a113(), f66396x7807a7ea, f66400x272c25);
        }
        return new m75.b(e7Var, null, null, f66400x272c25);
    }

    /* renamed from: update */
    public static final m75.e m124931xce0038c9(dm.e7 e7Var, boolean z17) {
        if (z17) {
            return new m75.e(e7Var, e7Var.m124936x98330b5(), f66396x7807a7ea, f66400x272c25);
        }
        return new m75.e(e7Var, null, null, f66400x272c25);
    }

    /* renamed from: selectByExpire_at */
    public p75.l0 m124945x591f2e20() {
        return m124918x591f2e20(this.f66412xa987964e);
    }

    /* renamed from: selectByKey */
    public p75.l0 m124946xb40beec() {
        return m124920xb40beec(this.f66413x4b6e619a);
    }

    /* renamed from: selectByType */
    public p75.l0 m124947x5cdb804d() {
        return m124922x5cdb804d(this.f66414x2262335f);
    }

    /* renamed from: selectByValue */
    public p75.l0 m124948x3ea5c2be() {
        return m124924x3ea5c2be(this.f66415x29f571ec);
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f66413x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f66409xbd956948 = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f66415x29f571ec = contentValues.getAsString("value");
            if (z17) {
                this.f66411xae79461a = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.f66414x2262335f = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f66410xf51c2171 = true;
            }
        }
        if (contentValues.containsKey("expire_at")) {
            this.f66412xa987964e = contentValues.getAsLong("expire_at").longValue();
            if (z17) {
                this.f66408xe289a37c = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
