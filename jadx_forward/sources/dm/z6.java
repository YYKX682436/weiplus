package dm;

/* loaded from: classes12.dex */
public class z6 extends l75.f0 {

    /* renamed from: COL_EXPIRE_AT */
    public static final java.lang.String f69378x5c44bb34 = "expire_at";

    /* renamed from: COL_KEY */
    public static final java.lang.String f69379x636ba6e0 = "key";

    /* renamed from: COL_VALUE */
    public static final java.lang.String f69380x37b679b2 = "value";

    /* renamed from: DB_INFO */
    public static final l75.e0 f69381x8324abcf;

    /* renamed from: EXPIRE_AT */
    public static final p75.d f69382xb501f353;

    /* renamed from: INDEX_CREATE */
    public static final java.lang.String[] f69383x371a9529;
    public static final p75.d KEY;

    /* renamed from: OBSERVER_OWNER */
    public static final o75.e f69384x7807a7ea;

    /* renamed from: ROWID */
    public static final p75.d f69385x4a8c055;

    /* renamed from: TABLE */
    public static final p75.n0 f69386x4be43ae;

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f69387xc4fe047c = "KindaCacheTable";

    /* renamed from: TAG_ */
    private static final java.lang.String f69388x272c25 = "MicroMsg.SDK.BaseKindaCacheTable";

    /* renamed from: VALUE */
    public static final p75.d f69389x4da9951;

    /* renamed from: expire_at_HASHCODE */
    private static final int f69390xca35fb67;

    /* renamed from: key_HASHCODE */
    private static final int f69391xa91875db;

    /* renamed from: rowid_HASHCODE */
    private static final int f69392x4e8c5485;

    /* renamed from: value_HASHCODE */
    private static final int f69393x6538d709;

    /* renamed from: field_expire_at */
    public long f69397xa987964e;

    /* renamed from: field_key */
    public java.lang.String f69398x4b6e619a;

    /* renamed from: field_value */
    public byte[] f69399x29f571ec;

    /* renamed from: __hadSetkey */
    private boolean f69395xbd956948 = true;

    /* renamed from: __hadSetvalue */
    private boolean f69396xae79461a = true;

    /* renamed from: __hadSetexpire_at */
    private boolean f69394xe289a37c = true;

    static {
        p75.n0 n0Var = new p75.n0("KindaCacheTable");
        f69386x4be43ae = n0Var;
        java.lang.String str = n0Var.f434209a;
        f69385x4a8c055 = new p75.d("rowid", "long", str, "");
        KEY = new p75.d("key", "string", str, "");
        f69389x4da9951 = new p75.d("value", "byte[]", str, "");
        f69382xb501f353 = new p75.d("expire_at", "long", str, "");
        f69383x371a9529 = new java.lang.String[0];
        f69391xa91875db = 106079;
        f69393x6538d709 = 111972721;
        f69390xca35fb67 = 250178387;
        f69392x4e8c5485 = 108705909;
        f69381x8324abcf = m125740x3593deb(dm.z6.class);
        f69384x7807a7ea = new o75.e();
    }

    /* renamed from: batchInsert */
    public static final m75.a m125735xead4b293(java.util.List<dm.z6> list, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (dm.z6 z6Var : list) {
            if (z17) {
                arrayList.add(new m75.c(z6Var, true, z6Var.m125758x258b5cc5(), f69384x7807a7ea, f69388x272c25));
            } else {
                arrayList.add(new m75.c(z6Var, true, null, null, f69388x272c25));
            }
        }
        return new m75.a(arrayList);
    }

    /* renamed from: createTable */
    public static void m125736xe1f0e832(l75.k0 k0Var) {
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f69388x272c25, "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        linkedList.add("CREATE TABLE IF NOT EXISTS KindaCacheTable ( " + f69381x8324abcf.f398489e + ");");
        for (java.lang.String str : f69383x371a9529) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f69388x272c25, "createTableSql %s", str2);
            k0Var.A("KindaCacheTable", str2);
        }
        for (java.lang.String str3 : l75.n0.m145251xdc9c58c4(f69381x8324abcf, "KindaCacheTable", k0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f69388x272c25, "updateTableSql %s", str3);
            k0Var.A("KindaCacheTable", str3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f69388x272c25, "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: cvBuilder */
    public static final dm.v6 m125737xa93e23a8() {
        return new dm.v6();
    }

    /* renamed from: delete */
    public static final dm.w6 m125738xb06685ab() {
        return new dm.w6();
    }

    /* renamed from: initAutoDBInfo */
    public static l75.e0 m125740x3593deb(java.lang.Class<?> cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f398485a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f398487c = strArr;
        strArr[0] = "key";
        e0Var.f398488d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f398486b = "key";
        e0Var.f398487c[1] = "value";
        e0Var.f398488d.put("value", "BLOB");
        e0Var.f398487c[2] = "expire_at";
        e0Var.f398488d.put("expire_at", "LONG");
        e0Var.f398487c[3] = "rowid";
        e0Var.f398489e = " key TEXT PRIMARY KEY ,  value BLOB,  expire_at LONG";
        if (e0Var.f398486b == null) {
            e0Var.f398486b = "rowid";
        }
        return e0Var;
    }

    /* renamed from: insert */
    public static final m75.c m125741xb970c2b9(dm.z6 z6Var, boolean z17) {
        return z17 ? new m75.c(z6Var, true, z6Var.m125758x258b5cc5(), f69384x7807a7ea, f69388x272c25) : new m75.c(z6Var, true, null, null, f69388x272c25);
    }

    /* renamed from: insertOrThrow */
    public static final m75.c m125742x98afe1ca(dm.z6 z6Var, boolean z17) {
        return z17 ? new m75.c(z6Var, false, z6Var.m125758x258b5cc5(), f69384x7807a7ea, f69388x272c25) : new m75.c(z6Var, false, null, null, f69388x272c25);
    }

    /* renamed from: isExistByKey */
    public static final p75.l0 m125743x8b0d0a9b(java.lang.String str) {
        p75.n0 n0Var = f69386x4be43ae;
        p75.d dVar = KEY;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f434190d = dVar.j(str);
        h17.f434189c = f69388x272c25;
        h17.c(1, 0);
        return h17.a();
    }

    /* renamed from: observe */
    public static final void m125744x9d92d11c(p012xc85e97e9.p093xedfae76a.y yVar, o75.a aVar) {
        f69384x7807a7ea.m127126x9d92d11c(yVar, aVar);
    }

    /* renamed from: removeObserve */
    public static final void m125745xe4d493f8(o75.a aVar) {
        f69384x7807a7ea.mo127128xb5bdeb7a(aVar);
    }

    /* renamed from: replace */
    public static final m75.d m125746x413cb2b4(dm.z6 z6Var, boolean z17) {
        return z17 ? new m75.d(z6Var, z6Var.m125759x90c9bb62(), f69384x7807a7ea, f69388x272c25) : new m75.d(z6Var, null, null, f69388x272c25);
    }

    /* renamed from: select */
    public static final dm.x6 m125747xc9ff34fc() {
        return new dm.x6();
    }

    /* renamed from: selectByExpire_at */
    public static final p75.l0 m125748x591f2e20(long j17) {
        p75.i0 i17 = f69386x4be43ae.i();
        i17.f434190d = f69382xb501f353.i(java.lang.Long.valueOf(j17));
        i17.f434189c = f69388x272c25;
        return i17.a();
    }

    /* renamed from: selectByExpire_atList */
    public static final p75.l0 m125749x3bbf42de(java.util.List<java.lang.Long> list) {
        p75.i0 i17 = f69386x4be43ae.i();
        i17.f434190d = f69382xb501f353.k(list);
        i17.f434189c = f69388x272c25;
        return i17.a();
    }

    /* renamed from: selectByKey */
    public static final p75.l0 m125750xb40beec(java.lang.String str) {
        p75.i0 i17 = f69386x4be43ae.i();
        i17.f434190d = KEY.j(str);
        i17.f434189c = f69388x272c25;
        return i17.a();
    }

    /* renamed from: selectByKeyList */
    public static final p75.l0 m125751xedd38daa(java.util.List<java.lang.String> list) {
        p75.i0 i17 = f69386x4be43ae.i();
        i17.f434190d = KEY.l(list);
        i17.f434189c = f69388x272c25;
        return i17.a();
    }

    /* renamed from: selectExistListByKey */
    public static final p75.l0 m125752x7c48eb6f(java.util.List<java.lang.String> list) {
        p75.n0 n0Var = f69386x4be43ae;
        p75.d dVar = KEY;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f434190d = dVar.l(list);
        h17.f434189c = f69388x272c25;
        return h17.a();
    }

    /* renamed from: selectExpire_atByKey */
    public static final long m125753xac557f11(l75.k0 k0Var, java.lang.String str) {
        dm.x6 m125747xc9ff34fc = m125747xc9ff34fc();
        ((java.util.LinkedList) m125747xc9ff34fc.f322569a).add(f69382xb501f353);
        m125747xc9ff34fc.f322570b = KEY.j(str);
        p75.i0 g17 = f69386x4be43ae.g(m125747xc9ff34fc.f322569a);
        g17.f434190d = m125747xc9ff34fc.f322570b;
        g17.d(m125747xc9ff34fc.f322571c);
        g17.b(m125747xc9ff34fc.f322572d);
        dm.z6 z6Var = (dm.z6) g17.a().o(k0Var, dm.z6.class);
        if (z6Var != null) {
            return z6Var.f69397xa987964e;
        }
        return 0L;
    }

    /* renamed from: update */
    public static final dm.y6 m125754xce0038c9() {
        return new dm.y6();
    }

    /* renamed from: compareContent */
    public boolean m125756x5c5a33d4(l75.f0 f0Var) {
        if (f0Var == null || !(f0Var instanceof dm.z6)) {
            return false;
        }
        dm.z6 z6Var = (dm.z6) f0Var;
        return n51.f.a(this.f69398x4b6e619a, z6Var.f69398x4b6e619a) && n51.f.a(this.f69399x29f571ec, z6Var.f69399x29f571ec) && n51.f.a(java.lang.Long.valueOf(this.f69397xa987964e), java.lang.Long.valueOf(z6Var.f69397xa987964e));
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
            if (f69391xa91875db == hashCode) {
                try {
                    this.f69398x4b6e619a = cursor.getString(i17);
                    this.f69395xbd956948 = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f69388x272c25, th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f69393x6538d709 == hashCode) {
                try {
                    this.f69399x29f571ec = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f69388x272c25, th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f69390xca35fb67 == hashCode) {
                try {
                    this.f69397xa987964e = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(f69388x272c25, th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                }
            } else if (f69392x4e8c5485 == hashCode) {
                this.f72763xa3c65b86 = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f69395xbd956948) {
            contentValues.put("key", this.f69398x4b6e619a);
        }
        if (this.f69396xae79461a) {
            contentValues.put("value", this.f69399x29f571ec);
        }
        if (this.f69394xe289a37c) {
            contentValues.put("expire_at", java.lang.Long.valueOf(this.f69397xa987964e));
        }
        long j17 = this.f72763xa3c65b86;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    /* renamed from: createDeleteEvent */
    public o75.c m125757xe8d3a113() {
        o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(mo9766x4c6b483e()), f69388x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    /* renamed from: createInsertEvent */
    public o75.c m125758x258b5cc5() {
        o75.c cVar = new o75.c(o75.b.f425115c, java.lang.String.valueOf(mo9766x4c6b483e()), f69388x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    @Override // l75.f0
    /* renamed from: createMyTable */
    public void mo9764xdf360ce6(l75.k0 k0Var) {
        m125736xe1f0e832(k0Var);
    }

    /* renamed from: createReplaceEvent */
    public o75.c m125759x90c9bb62() {
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(mo9766x4c6b483e()), f69388x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    /* renamed from: createUpdateEvent */
    public o75.c m125760x98330b5() {
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(mo9766x4c6b483e()), f69388x272c25);
        cVar.f425123d = this;
        return cVar;
    }

    /* renamed from: deleteFromDB */
    public int m125761xbc662333(l75.k0 k0Var, boolean z17) {
        return m125739xb06685ab(this, z17).a(k0Var);
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f69381x8324abcf;
    }

    /* renamed from: getIndexCreateSQL */
    public java.lang.String[] m125762xec04bf76() {
        return f69383x371a9529;
    }

    @Override // l75.f0
    /* renamed from: getObserverOwner */
    public o75.e mo9765xec19c1c7() {
        return f69384x7807a7ea;
    }

    @Override // l75.f0
    /* renamed from: getPrimaryKeyValue */
    public java.lang.Object mo9766x4c6b483e() {
        return this.f69398x4b6e619a;
    }

    @Override // l75.f0
    /* renamed from: getTable */
    public p75.n0 mo9767x752de218() {
        return f69386x4be43ae;
    }

    @Override // l75.f0
    /* renamed from: getTableName */
    public java.lang.String mo9768x88e404c3() {
        return f69386x4be43ae.f434209a;
    }

    /* renamed from: insertOrThrowToDB */
    public long m125763x171dc523(l75.k0 k0Var, boolean z17) {
        return m125742x98afe1ca(this, z17).a(k0Var);
    }

    /* renamed from: insertToDB */
    public long m125764x39969692(l75.k0 k0Var, boolean z17) {
        return m125741xb970c2b9(this, z17).a(k0Var);
    }

    /* renamed from: isExistByKeyInDB */
    public boolean m125765xd223199e(l75.k0 k0Var) {
        return m125743x8b0d0a9b(this.f69398x4b6e619a).h(k0Var);
    }

    /* renamed from: parseBuff */
    public final void m125766x92b54da6() {
    }

    /* renamed from: replaceToDB */
    public long m125767x19a4110d(l75.k0 k0Var, boolean z17) {
        return m125746x413cb2b4(this, z17).a(k0Var);
    }

    /* renamed from: reset */
    public void m125768x6761d4f() {
    }

    /* renamed from: updateToDB */
    public int m125771xee5c84a2(l75.k0 k0Var, boolean z17) {
        return m125755xce0038c9(this, z17).a(k0Var);
    }

    /* renamed from: delete */
    public static final m75.b m125739xb06685ab(dm.z6 z6Var, boolean z17) {
        if (z17) {
            return new m75.b(z6Var, z6Var.m125757xe8d3a113(), f69384x7807a7ea, f69388x272c25);
        }
        return new m75.b(z6Var, null, null, f69388x272c25);
    }

    /* renamed from: update */
    public static final m75.e m125755xce0038c9(dm.z6 z6Var, boolean z17) {
        if (z17) {
            return new m75.e(z6Var, z6Var.m125760x98330b5(), f69384x7807a7ea, f69388x272c25);
        }
        return new m75.e(z6Var, null, null, f69388x272c25);
    }

    /* renamed from: selectByExpire_at */
    public p75.l0 m125769x591f2e20() {
        return m125748x591f2e20(this.f69397xa987964e);
    }

    /* renamed from: selectByKey */
    public p75.l0 m125770xb40beec() {
        return m125750xb40beec(this.f69398x4b6e619a);
    }

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9762xbf5d97fd(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.f69398x4b6e619a = contentValues.getAsString("key");
            if (z17) {
                this.f69395xbd956948 = true;
            }
        }
        if (contentValues.containsKey("value")) {
            this.f69399x29f571ec = contentValues.getAsByteArray("value");
            if (z17) {
                this.f69396xae79461a = true;
            }
        }
        if (contentValues.containsKey("expire_at")) {
            this.f69397xa987964e = contentValues.getAsLong("expire_at").longValue();
            if (z17) {
                this.f69394xe289a37c = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.f72763xa3c65b86 = contentValues.getAsLong("rowid").longValue();
        }
    }
}
