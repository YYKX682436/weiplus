package ot1;

/* loaded from: classes12.dex */
public class j extends l75.n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f430378h = {l75.n0.m145250x3fdc6f77(ot1.h.P, "WxFileIndex3"), "CREATE TABLE IF NOT EXISTS WxFileIndexDirtyWithTalker(msgId INTEGER NOT NULL, username TEXT NOT NULL, PRIMARY KEY (msgId, username))", "CREATE TABLE IF NOT EXISTS WxFileIndexRefresh(indexRowId INTEGER PRIMARY KEY)", "CREATE TABLE IF NOT EXISTS WxFileIndexRegistry(id INTEGER PRIMARY KEY, value BLOB)", "CREATE TABLE IF NOT EXISTS WxFileIndexLinkify(id INTEGER PRIMARY KEY, originalPath TEXT, targetPath TEXT, status INT)", "CREATE TABLE IF NOT EXISTS WxFileIndexDownloadMigration(id INTEGER PRIMARY KEY, originalPath TEXT, targetPath TEXT, indexRowId INT, msgId INT, username TEXT, status INT)"};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f430379i = {"CREATE  INDEX IF NOT EXISTS msgid_username_index ON WxFileIndex3 ( msgId,username,msgSubType ) ", "CREATE  INDEX IF NOT EXISTS username_type_index ON WxFileIndex3 ( username,msgtime,msgSubType ) ", "CREATE INDEX IF NOT EXISTS WxFileIndex_uuid ON WxFileIndex3 (linkUUID)"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f430380m = {"CREATE INDEX IF NOT EXISTS hash_index ON WxFileIndex3 (hash)"};

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f430381n = {"CREATE INDEX IF NOT EXISTS size_index ON WxFileIndex3 (size)"};

    /* renamed from: d, reason: collision with root package name */
    public final d95.b0 f430382d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f430383e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f430384f;

    /* renamed from: g, reason: collision with root package name */
    public final ot1.l f430385g;

    public j(d95.b0 b0Var) {
        super(b0Var, ot1.h.P, "WxFileIndex3", f430379i);
        this.f430383e = -1L;
        this.f430384f = new java.util.HashSet();
        this.f430385g = new ot1.l(this, null);
        this.f430382d = b0Var;
    }

    public static ot1.j W0() {
        java.lang.String str = gm0.j1.u().h() + "WxFileIndex.db";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(-346501660, new ot1.C29939x30bb37());
        return new ot1.j(x51.l0.a(ot1.j.class.hashCode(), str, hashMap, true, false));
    }

    public static java.lang.String y2(int[] iArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append('(');
        for (int i17 : iArr) {
            sb6.append(i17);
            sb6.append(',');
        }
        sb6.setCharAt(sb6.length() - 1, ')');
        return sb6.toString();
    }

    public android.database.Cursor C1() {
        return this.f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT group_concat(path, '|'), group_concat(rowid, '|'), group_concat(msgId, '|'), count(path), size, hash FROM WxFileIndex3 WHERE hash IS NOT NULL GROUP BY size,hash HAVING count(path) > 1 ORDER BY size DESC", null, "WxFileIndex3", null);
    }

    public void D0(java.util.List list) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        d95.b0 b0Var = this.f430382d;
        b0Var.b();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                objArr[0] = java.lang.Long.valueOf(((java.lang.Long) it.next()).longValue());
                b0Var.H("WxFileIndexRefresh", "INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE rowId = ?", objArr);
            }
        } finally {
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    public android.database.Cursor D2(java.lang.String[] strArr, int[] iArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        d95.b0 b0Var = this.f430382d;
        java.lang.String join = android.text.TextUtils.join(",", strArr);
        return b0Var.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT " + join + " FROM WxFileIndex3 WHERE msgSubType IN " + y2(iArr), null, "WxFileIndex3", c26987xeef691ab);
    }

    public void G2(int[] iArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f430382d.j("WxFileIndexDirtyWithTalker", "INSERT OR REPLACE INTO WxFileIndexDirtyWithTalker SELECT DISTINCT msgId, username FROM WxFileIndex3 WHERE msgSubType IN " + y2(iArr) + " AND username IS NOT NULL AND username != ''", null, c26987xeef691ab);
        java.util.Arrays.toString(iArr);
    }

    public void J0(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        d95.b0 b0Var = this.f430382d;
        b0Var.b();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ot1.h hVar = (ot1.h) it.next();
                b0Var.H("WxFileIndex3", "UPDATE WxFileIndex3 SET diskSpace = ?, linkUUID = ? WHERE rowId = ?", new java.lang.Object[]{java.lang.Long.valueOf(hVar.f68219x9f7e1864), hVar.f68222x64f1185a, java.lang.Long.valueOf(hVar.f72763xa3c65b86)});
                arrayList.add(java.lang.Long.valueOf(hVar.f72763xa3c65b86));
            }
            b0Var.A("WxFileIndexRefresh", "DELETE FROM WxFileIndexRefresh WHERE indexRowId IN " + ("(" + android.text.TextUtils.join(",", arrayList) + ")"));
        } finally {
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    public long K1() {
        long j17 = this.f430383e;
        if (j17 >= 0) {
            return j17;
        }
        try {
            android.database.Cursor o17 = this.f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT value FROM WxFileIndexRegistry WHERE id = ?", new java.lang.String[]{"1"}, "WxFileIndexRegistry", null);
            if (o17 != null) {
                try {
                    if (o17.moveToFirst()) {
                        long j18 = o17.getLong(0);
                        this.f430383e = j18;
                        o17.close();
                        return j18;
                    }
                } finally {
                }
            }
            if (o17 != null) {
                o17.close();
            }
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e17, "Cannot read LinearScanCursor", new java.lang.Object[0]);
        }
        return this.f430383e;
    }

    public void L0(java.util.HashSet hashSet, java.util.List list, long j17, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.lang.String str;
        java.lang.String str2;
        java.util.Iterator it;
        if (z17) {
            synchronized (this.f430384f) {
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    this.f430384f.remove((m3.d) it6.next());
                }
            }
        }
        d95.b0 b0Var = this.f430382d;
        b0Var.b();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                java.util.Iterator it7 = ((java.util.ArrayList) d75.b.c(list, 100)).iterator();
                while (it7.hasNext()) {
                    java.util.List list2 = (java.util.List) it7.next();
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    java.util.Iterator it8 = list2.iterator();
                    p75.y yVar = null;
                    while (it8.hasNext()) {
                        ot1.h hVar = (ot1.h) it8.next();
                        java.util.Iterator it9 = it8;
                        p75.y yVar2 = (p75.y) dm.rc.f321263u.i(java.lang.Long.valueOf(hVar.f68223x297eb4f7)).c(dm.rc.f321264v.j(hVar.f68230xdec927b));
                        yVar2.f(dm.rc.f321265w.i(java.lang.Integer.valueOf(hVar.f68224x169c833e)));
                        yVar = yVar == null ? yVar2 : yVar.d(yVar2);
                        it8 = it9;
                    }
                    if (yVar != null) {
                        p75.i0 g17 = dm.rc.f321262t.g(linkedList);
                        g17.f434190d = yVar;
                        g17.d(linkedList2);
                        g17.b(linkedList3);
                        arrayList.addAll(g17.a().k(this.f430382d, ot1.h.class));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileIndexStorage", "Find existing rows failed: " + e17.getMessage());
            }
            if (!hashSet.isEmpty()) {
                java.util.Iterator it10 = ((java.util.ArrayList) d75.b.c(new java.util.ArrayList(hashSet), 100)).iterator();
                while (it10.hasNext()) {
                    java.util.List<m3.d> list3 = (java.util.List) it10.next();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE ");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("DELETE FROM WxFileIndexRefresh WHERE indexRowId IN (SELECT rowId FROM WxFileIndex3 WHERE ");
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("DELETE FROM WxFileIndex3 WHERE ");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    boolean z18 = true;
                    for (m3.d dVar : list3) {
                        if (z18) {
                            it = it10;
                        } else {
                            it = it10;
                            sb6.append(" OR ");
                            sb7.append(" OR ");
                            sb8.append(" OR ");
                        }
                        sb6.append("(msgId = ? AND username = ?)");
                        sb7.append("(msgId = ? AND username = ?)");
                        sb8.append("(msgId = ? AND username = ?)");
                        arrayList2.add(dVar.f404626b);
                        arrayList2.add(dVar.f404625a);
                        arrayList3.add(dVar.f404626b);
                        arrayList3.add(dVar.f404625a);
                        arrayList4.add(dVar.f404626b);
                        arrayList4.add(dVar.f404625a);
                        it10 = it;
                        z18 = false;
                    }
                    sb6.append(" AND linkUUID IS NOT NULL)");
                    sb7.append(")");
                    b0Var.j("WxFileIndexRefresh", sb6.toString(), arrayList2.toArray(), c26987xeef691ab);
                    b0Var.j("WxFileIndexRefresh", sb7.toString(), arrayList3.toArray(), c26987xeef691ab);
                    b0Var.j("WxFileIndex3", sb8.toString(), arrayList4.toArray(), c26987xeef691ab);
                    it10 = it10;
                }
            }
            java.util.Iterator it11 = list.iterator();
            while (true) {
                long j18 = 0;
                if (!it11.hasNext()) {
                    break;
                }
                ot1.h hVar2 = (ot1.h) it11.next();
                if (c26987xeef691ab != null) {
                    c26987xeef691ab.m108011xf4ed245c();
                }
                java.util.Iterator it12 = arrayList.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        break;
                    }
                    ot1.h hVar3 = (ot1.h) it12.next();
                    if (hVar3.f72763xa3c65b86 >= j18 && hVar3.f68223x297eb4f7 == hVar2.f68223x297eb4f7 && (str = hVar3.f68230xdec927b) != null && str.equals(hVar2.f68230xdec927b) && hVar3.f68224x169c833e == hVar2.f68224x169c833e && (str2 = hVar3.f68227x2260084a) != null && str2.equals(hVar2.f68227x2260084a)) {
                        byte[] bArr = hVar3.f68221x225c6533;
                        if (bArr != null && hVar2.f68221x225c6533 == null) {
                            hVar2.f68221x225c6533 = bArr;
                        }
                    } else {
                        j18 = 0;
                    }
                }
                long T = b0Var.T("WxFileIndex3", "msgId", hVar2.mo9763xeb27878e(), false);
                byte[] bArr2 = hVar2.f68222x64f1185a;
                if (bArr2 != null) {
                    b0Var.H("WxFileIndexRefresh", "INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID = ? AND rowId != ?", new java.lang.Object[]{bArr2, java.lang.Long.valueOf(T)});
                }
            }
            if (!hashSet.isEmpty()) {
                java.util.Iterator it13 = ((java.util.ArrayList) d75.b.c(new java.util.ArrayList(hashSet), 100)).iterator();
                while (it13.hasNext()) {
                    java.util.List<m3.d> list4 = (java.util.List) it13.next();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("DELETE FROM WxFileIndexDirtyWithTalker WHERE ");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    boolean z19 = true;
                    for (m3.d dVar2 : list4) {
                        if (!z19) {
                            sb9.append(" OR ");
                        }
                        sb9.append("(msgId = ? AND username = ?)");
                        arrayList5.add(dVar2.f404626b);
                        arrayList5.add(dVar2.f404625a);
                        z19 = false;
                    }
                    b0Var.j("WxFileIndexDirtyWithTalker", sb9.toString(), arrayList5.toArray(), c26987xeef691ab);
                }
            }
            if (o2()) {
                java.util.Iterator it14 = ((java.util.ArrayList) d75.b.c((java.util.List) hashSet.stream().map(new ot1.C29942x30bb3a()).distinct().collect(java.util.stream.Collectors.toList()), 100)).iterator();
                while (it14.hasNext()) {
                    b0Var.j("WxFileIndexDirty", "DELETE FROM WxFileIndexDirty WHERE msgId IN " + ("(" + android.text.TextUtils.join(",", (java.util.List) it14.next()) + ")"), null, c26987xeef691ab);
                }
            }
            if (j17 >= 0) {
                b3(j17);
            }
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e18, "Cannot end transaction", new java.lang.Object[0]);
            }
        } finally {
        }
    }

    public void O2(java.lang.String str, long j17, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (str == null || str.isEmpty()) {
            return;
        }
        final m3.d dVar = new m3.d(str, java.lang.Long.valueOf(j17));
        if (z17) {
            synchronized (this.f430384f) {
                if (this.f430384f.stream().anyMatch(new java.util.function.Predicate() { // from class: ot1.j$$c
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return ((m3.d) obj).m146704xb2c87fbf(m3.d.this);
                    }
                })) {
                    return;
                }
            }
        }
        d95.b0 b0Var = this.f430382d;
        if (z17) {
            b0Var.j("WxFileIndexDirtyWithTalker", "INSERT OR REPLACE INTO WxFileIndexDirtyWithTalker VALUES (?, ?)", new java.lang.Object[]{java.lang.Long.valueOf(j17), str}, c26987xeef691ab);
        } else {
            b0Var.j("WxFileIndexDirtyWithTalker", "DELETE FROM WxFileIndexDirtyWithTalker WHERE msgId = ? AND username = ?", new java.lang.Object[]{java.lang.Long.valueOf(j17), str}, c26987xeef691ab);
            if (o2()) {
                b0Var.j("WxFileIndexDirty", "DELETE FROM WxFileIndexDirty WHERE msgId = ?", new java.lang.Object[]{java.lang.Long.valueOf(j17)}, c26987xeef691ab);
            }
        }
        synchronized (this.f430384f) {
            if (z17) {
                this.f430384f.add(dVar);
            } else {
                this.f430384f.remove(dVar);
            }
        }
    }

    public void P0(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f430382d.j("WxFileIndexRefresh", "DELETE FROM WxFileIndexRefresh WHERE indexRowId NOT IN (SELECT rowId FROM WxFileIndex3)", null, c26987xeef691ab);
    }

    public long P1() {
        try {
            android.database.Cursor f17 = this.f430382d.f("SELECT sum(diskSpace) FROM (SELECT DISTINCT diskSpace, path FROM WxFileIndex3)", null, 0);
            long j17 = (f17 == null || !f17.moveToFirst()) ? 0L : f17.getLong(0);
            if (f17 != null) {
                f17.close();
            }
            return j17;
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e17, "Cannot get media summery.", new java.lang.Object[0]);
            return 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [ot1.j] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public java.util.List S1(java.lang.String str, long j17, long j18, int[] iArr, boolean z17, boolean z18, boolean z19) {
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = str;
        try {
            android.database.Cursor T1 = T1(i17, j17, j18, iArr, z17, z18, z19 ? new java.lang.String[]{"msgId, path, diskSpace, linkUUID"} : null, null);
            while (T1.moveToNext()) {
                try {
                    try {
                        ot1.h hVar = new ot1.h();
                        if (z19) {
                            i17 = 0;
                            i17 = 0;
                            try {
                                hVar.f68223x297eb4f7 = T1.getLong(0);
                                hVar.f68227x2260084a = T1.getString(1);
                                hVar.f68219x9f7e1864 = T1.getLong(2);
                                hVar.f68222x64f1185a = T1.getBlob(3);
                                hVar.f72763xa3c65b86 = T1.getLong(4);
                                hVar.f68230xdec927b = str;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                java.lang.Throwable th7 = th;
                                if (T1 == null) {
                                    throw th7;
                                }
                                try {
                                    T1.close();
                                    throw th7;
                                } catch (java.lang.Throwable th8) {
                                    th7.addSuppressed(th8);
                                    throw th7;
                                }
                            }
                        } else {
                            i17 = 0;
                            hVar.mo9015xbf5d97fd(T1);
                        }
                        arrayList.add(hVar);
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        i17 = 0;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e, "getMediaWxFileIndex failed", new java.lang.Object[i17]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileIndexStorage", "getMediaWxFileIndex [%s] size[%d] cost[%d] ", str, java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    return arrayList;
                }
            }
            T1.close();
        } catch (java.lang.Exception e18) {
            e = e18;
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileIndexStorage", "getMediaWxFileIndex [%s] size[%d] cost[%d] ", str, java.lang.Integer.valueOf(arrayList.size()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return arrayList;
    }

    public android.database.Cursor T1(java.lang.String str, long j17, long j18, int[] iArr, boolean z17, boolean z18, java.lang.String[] strArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        int[] copyOf;
        java.lang.String str2 = iArr != null ? " AND msgSubType IN " + y2(iArr) : "";
        if (z17) {
            if (iArr == null) {
                copyOf = ot1.h.Q;
            } else {
                int[] iArr2 = new int[iArr.length];
                int i17 = 0;
                for (int i18 : iArr) {
                    if (java.util.Arrays.binarySearch(ot1.h.Q, i18) >= 0) {
                        iArr2[i17] = i18;
                        i17++;
                    }
                }
                copyOf = java.util.Arrays.copyOf(iArr2, i17);
            }
            str2 = str2 + " AND msgId IN (SELECT msgId FROM WxFileIndex3 AS st WHERE msgSubType IN " + y2(copyOf) + " AND st.username = WxFileIndex3.username)";
        }
        return this.f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT " + (strArr == null ? "*" : android.text.TextUtils.join(",", strArr)) + ", rowid FROM WxFileIndex3" + (str == null ? " WHERE" : " WHERE username = ?3 AND") + " msgtime > ?1 AND msgtime <= ?2" + str2 + (z18 ? " ORDER BY msgtime DESC, msgSubType ASC" : ""), str == null ? new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17)} : new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), str}, "WxFileIndex3", c26987xeef691ab);
    }

    public final java.util.List V2(java.lang.String str, java.lang.Object[] objArr, java.util.Comparator comparator) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980 = this.f430382d.P().m107710x1d3f4980(str, objArr);
            while (m107710x1d3f4980.moveToNext()) {
                try {
                    ot1.h hVar = new ot1.h();
                    hVar.mo9015xbf5d97fd(m107710x1d3f4980);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(hVar.f68230xdec927b, hVar.f68223x297eb4f7);
                    if (f27 != null) {
                        arrayList.add(f27);
                        hashMap.put(f27, hVar);
                    }
                } finally {
                }
            }
            m107710x1d3f4980.close();
        } catch (java.lang.Exception unused) {
        }
        if (comparator == null) {
            comparator = new ot1.C29940x30bb38();
        }
        arrayList.sort(comparator);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ot1.h hVar2 = (ot1.h) hashMap.get((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next());
            if (hVar2 == null) {
                throw new java.lang.IllegalStateException("Sorting mechanism error");
            }
            arrayList2.add(hVar2);
        }
        return arrayList2;
    }

    public java.util.List X1() {
        android.database.Cursor f17 = this.f430382d.f("SELECT indexRowId, path FROM WxFileIndexRefresh JOIN WxFileIndex3 ON WxFileIndexRefresh.indexRowId = WxFileIndex3.rowId", null, 0);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (f17.moveToNext()) {
                arrayList.add(new m3.d(java.lang.Long.valueOf(f17.getLong(0)), f17.getString(1)));
            }
            f17.close();
            return arrayList;
        } catch (java.lang.Throwable th6) {
            if (f17 != null) {
                try {
                    f17.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public void Y2(boolean z17, long j17, int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        boolean z18;
        boolean z19;
        d95.b0 b0Var = this.f430382d;
        b0Var.b();
        try {
            try {
                int b27 = (int) b2(2, 0L);
                long b28 = b2(3, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileIndexStorage", "Check DB version: %d, code version: %d, rescan old: %d, rescan new: %d", java.lang.Integer.valueOf(b27), 2, java.lang.Long.valueOf(b28), java.lang.Long.valueOf(j17));
                z19 = b28 < j17;
                z18 = b27 != 2 || z19 || z17;
            } catch (java.lang.RuntimeException e17) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e17, "Cannot get DB VERSION, force update", new java.lang.Object[0]);
                    z18 = true;
                    z19 = true;
                } catch (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileIndexStorage", "Check for update cancelled.");
                } catch (java.lang.RuntimeException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e18, "Check for update failed.", new java.lang.Object[0]);
                }
            }
            if (z18) {
                this.f430383e = -1L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileIndexStorage", "Flush DB and update");
                b0Var.j("WxFileIndex3", "DELETE FROM WxFileIndex3", null, c26987xeef691ab);
                b0Var.j("WxFileIndexDirtyWithTalker", "DELETE FROM WxFileIndexDirtyWithTalker", null, c26987xeef691ab);
                if (o2()) {
                    b0Var.j("WxFileIndexDirty", "DELETE FROM WxFileIndexDirty", null, c26987xeef691ab);
                }
                b0Var.j("WxFileIndexRefresh", "DELETE FROM WxFileIndexRefresh", null, c26987xeef691ab);
                b0Var.H("WxFileIndexRegistry", "DELETE FROM WxFileIndexRegistry WHERE id = ?", new java.lang.Object[]{1});
                f3(2, 2);
                f3(5, java.lang.Integer.valueOf(i17));
                if (z19) {
                    b0Var.H("WxFileIndexRegistry", "REPLACE INTO WxFileIndexRegistry VALUES (?, ?)", new java.lang.Object[]{3, java.lang.Long.valueOf(j17)});
                }
                synchronized (this.f430384f) {
                    this.f430384f.clear();
                }
            }
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused2) {
            }
        } catch (java.lang.Throwable th6) {
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused3) {
            }
            throw th6;
        }
    }

    public void b1(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        d95.b0 b0Var = this.f430382d;
        b0Var.j("WxFileIndex", "DROP TABLE IF EXISTS WxFileIndex", null, c26987xeef691ab);
        b0Var.j("WxFileIndex2", "DROP TABLE IF EXISTS WxFileIndex2", null, c26987xeef691ab);
    }

    public long b2(int i17, long j17) {
        try {
            p75.k z17 = this.f430382d.z("SELECT value FROM WxFileIndexRegistry WHERE id = ?");
            long j18 = i17;
            try {
                p75.e0 e0Var = (p75.e0) z17;
                e0Var.m157940x37fbf859(1, j18);
                long c17 = e0Var.c();
                e0Var.close();
                return c17;
            } catch (java.lang.Throwable th6) {
                if (z17 != null) {
                    try {
                        ((p75.e0) z17).close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621 | java.io.IOException unused) {
            return j17;
        }
    }

    public void b3(long j17) {
        try {
            this.f430382d.H("WxFileIndexRegistry", "REPLACE INTO WxFileIndexRegistry VALUES(?, ?)", new java.lang.Object[]{1, java.lang.Long.valueOf(j17)});
            this.f430383e = j17;
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxFileIndexStorage", e17, "Cannot write LinearScanCursor", new java.lang.Object[0]);
            this.f430383e = -1L;
        }
    }

    public android.database.Cursor d1(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        return this.f430382d.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT sum(size), sum(diskSpace) FROM WxFileIndex3", null, "WxFileIndex3", c26987xeef691ab);
    }

    public java.util.List f1(byte[] bArr, int i17, int i18, java.util.Comparator comparator) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from WxFileIndex3  where linkUUID=?");
        java.lang.String str2 = "";
        if (i17 > 0) {
            str = " AND msgType=" + i17;
        } else {
            str = "";
        }
        sb6.append(str);
        if (i18 > 0) {
            str2 = " AND msgSubType=" + i18;
        }
        sb6.append(str2);
        return V2(sb6.toString(), new java.lang.Object[]{bArr}, comparator);
    }

    public void f3(int i17, java.lang.Object obj) {
        try {
            p75.k z17 = this.f430382d.z("REPLACE INTO WxFileIndexRegistry VALUES (?, ?)");
            try {
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), obj};
                p75.e0 e0Var = (p75.e0) z17;
                e0Var.a(objArr);
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = e0Var.f434167d;
                if (c26970x63d6eaa3 != null) {
                    c26970x63d6eaa3.m107867xb158f775();
                } else {
                    com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = e0Var.f434168e;
                    if (c26915x63d6eaa3 != null) {
                        c26915x63d6eaa3.m106530xb158f775();
                    }
                }
                e0Var.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public java.lang.String h2(long j17) {
        try {
            android.database.Cursor f17 = this.f430382d.f("SELECT username FROM WxFileIndex3 WHERE msgId = ? LIMIT 1", new java.lang.String[]{java.lang.String.valueOf(j17)}, 0);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        java.lang.String string = f17.getString(0);
                        f17.close();
                        return string;
                    }
                } finally {
                }
            }
            if (f17 == null) {
                return null;
            }
            f17.close();
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxFileIndexStorage", "Failed to get username by msgId: " + j17, e17);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r5 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List i1(long r3, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select *, rowid from WxFileIndex3  where msgId="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " AND username='"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "' order by msgSubType ASC "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            d95.b0 r0 = r2.f430382d     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            r1 = 0
            android.database.Cursor r5 = r0.f(r3, r5, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
        L29:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            if (r3 == 0) goto L44
            ot1.h r3 = new ot1.h     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            r3.<init>()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            r3.mo9015xbf5d97fd(r5)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            r4.add(r3)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L42
            goto L29
        L3b:
            r3 = move-exception
            if (r5 == 0) goto L41
            r5.close()
        L41:
            throw r3
        L42:
            if (r5 == 0) goto L47
        L44:
            r5.close()
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.j.i1(long, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r5 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ot1.h k1(java.lang.String r3, long r4, int r6) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " AND username='"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L1e
        L1c:
            java.lang.String r3 = ""
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select *, rowid from WxFileIndex3  where msgId="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " AND msgSubType="
            r0.append(r4)
            r0.append(r6)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            ot1.h r4 = new ot1.h
            r4.<init>()
            r5 = 0
            d95.b0 r6 = r2.f430382d     // Catch: java.lang.Throwable -> L5b
            r0 = 0
            android.database.Cursor r5 = r6.f(r3, r5, r0)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L55
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L4e
            goto L55
        L4e:
            r5.moveToNext()     // Catch: java.lang.Throwable -> L5b
            r4.mo9015xbf5d97fd(r5)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L55:
            if (r5 == 0) goto L5a
            r5.close()
        L5a:
            return r4
        L5b:
            if (r5 == 0) goto L60
        L5d:
            r5.close()
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ot1.j.k1(java.lang.String, long, int):ot1.h");
    }

    public long k2(java.lang.String str, java.lang.String str2, int i17) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("originalPath", str);
        contentValues.put("targetPath", str2);
        contentValues.put("status", java.lang.Integer.valueOf(i17));
        return this.f430382d.T("WxFileIndexLinkify", dm.i4.f66865x76d1ec5a, contentValues, false);
    }

    public android.database.Cursor n1(java.lang.String str, long j17, java.lang.String[] strArr) {
        android.database.Cursor E;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    E = this.f430382d.E("WxFileIndex3", strArr, "msgId=? AND username=?", new java.lang.String[]{"" + j17, str}, null, null, null);
                    return E;
                }
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        E = this.f430382d.E("WxFileIndex3", strArr, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null);
        return E;
    }

    public java.util.List o1(byte[] bArr, int i17, int i18, java.util.Comparator comparator) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from WxFileIndex3  where hash=?");
        java.lang.String str2 = "";
        if (i17 > 0) {
            str = " AND msgType=" + i17;
        } else {
            str = "";
        }
        sb6.append(str);
        if (i18 > 0) {
            str2 = " AND msgSubType=" + i18;
        }
        sb6.append(str2);
        return V2(sb6.toString(), new java.lang.Object[]{bArr}, comparator);
    }

    public final boolean o2() {
        try {
            android.database.Cursor f17 = this.f430382d.f("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new java.lang.String[]{"WxFileIndexDirty"}, 0);
            boolean z17 = f17 != null && f17.getCount() > 0;
            if (f17 != null) {
                f17.close();
            }
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxFileIndexStorage", "Failed to check table existence: WxFileIndexDirty", e17);
            return false;
        }
    }

    public android.database.Cursor p1(long j17, long j18, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT username, sum(diskSpace) AS allSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr = ot1.h.Q;
        sb6.append(y2(iArr));
        sb6.append(" THEN diskSpace ELSE 0 END) AS mediaSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr2 = ot1.h.T;
        sb6.append(y2(iArr2));
        sb6.append(" THEN diskSpace ELSE 0 END) AS imageSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr3 = ot1.h.Z;
        sb6.append(y2(iArr3));
        sb6.append(" THEN diskSpace ELSE 0 END) AS videoSize, sum(CASE WHEN msgSubType IN ");
        int[] iArr4 = ot1.h.f430374x1;
        sb6.append(y2(iArr4));
        sb6.append(" THEN diskSpace ELSE 0 END) AS fileSize, max(msgtime) AS allTime, max(CASE WHEN msgSubType IN ");
        sb6.append(y2(iArr));
        sb6.append(" THEN msgtime ELSE NULL END) AS mediaTime, max(CASE WHEN msgSubType IN ");
        sb6.append(y2(iArr2));
        sb6.append(" THEN msgtime ELSE NULL END) AS imageTime, max(CASE WHEN msgSubType IN ");
        sb6.append(y2(iArr3));
        sb6.append(" THEN msgtime ELSE NULL END) AS videoTime, max(CASE WHEN msgSubType IN ");
        sb6.append(y2(iArr4));
        sb6.append(" THEN msgtime ELSE NULL END) AS fileTime FROM WxFileIndex3 WHERE size > 0 AND msgtime >= ? AND msgtime <= ?  GROUP BY username");
        return this.f430382d.U(sb6.toString(), new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18)}, 2, c26987xeef691ab);
    }

    public boolean t3(long j17, int i17) {
        try {
            this.f430382d.H("WxFileIndexDownloadMigration", "UPDATE WxFileIndexDownloadMigration SET status = ? WHERE id = ?", new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17)});
            return true;
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("updateLinkify failed : " + th6.getMessage());
        }
    }

    public android.database.Cursor u1(int[][] iArr, boolean z17, boolean z18, boolean z19, long j17, long j18, java.lang.Boolean bool, boolean z27, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        sb6.append("SELECT username");
        for (int[] iArr2 : iArr) {
            if (iArr2 == null || iArr2.length == 0) {
                sb6.append(", sum(diskSpace)");
            } else {
                sb6.append(", sum(CASE WHEN msgSubType IN ");
                sb6.append(y2(iArr2));
                sb6.append(" THEN diskSpace ELSE 0 END)");
            }
        }
        if (z17) {
            for (int[] iArr3 : iArr) {
                if (iArr3 == null || iArr3.length == 0) {
                    sb6.append(", max(msgtime)");
                } else {
                    sb6.append(", max(CASE WHEN msgSubType IN ");
                    sb6.append(y2(iArr3));
                    sb6.append(" THEN msgtime ELSE NULL END)");
                }
            }
        }
        if (z18) {
            for (int[] iArr4 : iArr) {
                if (iArr4 == null || iArr4.length == 0) {
                    sb6.append(", count(DISTINCT msgId)");
                } else {
                    sb6.append(", count(DISTINCT CASE WHEN msgSubType IN ");
                    sb6.append(y2(iArr4));
                    sb6.append(" THEN msgId ELSE NULL END)");
                }
            }
        }
        if (z19) {
            for (int[] iArr5 : iArr) {
                if (iArr5 == null || iArr5.length == 0) {
                    sb6.append(", group_concat(DISTINCT msgId)");
                } else {
                    sb6.append(", group_concat(DISTINCT CASE WHEN msgSubType IN ");
                    sb6.append(y2(iArr5));
                    sb6.append(" THEN msgId ELSE NULL END)");
                }
            }
        }
        sb6.append(" FROM WxFileIndex3 WHERE size > 0 AND msgtime >= ? AND msgtime <= ?");
        if (bool != null) {
            sb6.append(" AND flags & 1");
            sb6.append(bool.booleanValue() ? " != 0" : " = 0");
        }
        if (z27) {
            sb6.append(" AND flags & 2 = 0");
        }
        sb6.append(" GROUP BY username");
        return this.f430382d.U(sb6.toString(), new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18)}, 2, c26987xeef691ab);
    }

    public boolean v3(long j17, java.lang.String str) {
        try {
            this.f430382d.H("WxFileIndex3", "UPDATE WxFileIndex3 SET path=? WHERE rowid = ?", new java.lang.Object[]{str, java.lang.Long.valueOf(j17)});
            return true;
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("updateFileFullPath failed : " + th6.getMessage());
        }
    }

    public boolean w3(long j17, int i17) {
        try {
            this.f430382d.H("WxFileIndexLinkify", "UPDATE WxFileIndexLinkify SET status = ? WHERE id = ?", new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17)});
            return true;
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("updateLinkify failed : " + th6.getMessage());
        }
    }

    public void y0(java.util.List list, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        d95.b0 b0Var = this.f430382d;
        b0Var.b();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ot1.h hVar = (ot1.h) it.next();
                objArr[0] = java.lang.Long.valueOf(hVar.f72763xa3c65b86);
                if (hVar.f68222x64f1185a != null) {
                    b0Var.j("WxFileIndexRefresh", "INSERT OR IGNORE INTO WxFileIndexRefresh SELECT rowId FROM WxFileIndex3 WHERE linkUUID IN (SELECT linkUUID FROM WxFileIndex3 WHERE rowId = ? AND linkUUID IS NOT NULL)", objArr, c26987xeef691ab);
                    b0Var.H("WxFileIndexRefresh", "DELETE FROM WxFileIndexRefresh WHERE indexRowId = ?", objArr);
                }
                b0Var.H("WxFileIndex3", "DELETE FROM WxFileIndex3 WHERE rowId = ?", objArr);
            }
        } finally {
            try {
                b0Var.t();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    public void z0(java.util.HashSet hashSet, boolean z17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (hashSet.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        if (z17) {
            synchronized (this.f430384f) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m3.d dVar = (m3.d) it.next();
                    if (this.f430384f.add(dVar)) {
                        hashSet2.add(dVar);
                    }
                }
            }
        } else {
            synchronized (this.f430384f) {
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    this.f430384f.remove((m3.d) it6.next());
                }
            }
            hashSet2 = hashSet;
        }
        if (hashSet2.isEmpty()) {
            return;
        }
        d95.b0 b0Var = this.f430382d;
        try {
            if (z17) {
                b0Var.b();
                try {
                    java.util.Iterator it7 = hashSet2.iterator();
                    while (it7.hasNext()) {
                        m3.d dVar2 = (m3.d) it7.next();
                        java.lang.String str = (java.lang.String) dVar2.f404625a;
                        java.lang.Long l17 = (java.lang.Long) dVar2.f404626b;
                        if (str == null || str.isEmpty()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileIndexStorage", "Skip marking dirty for msgId %d due to empty username", l17);
                        } else {
                            b0Var.j("WxFileIndexDirtyWithTalker", "INSERT OR REPLACE INTO WxFileIndexDirtyWithTalker VALUES (?, ?)", new java.lang.Object[]{l17, str}, c26987xeef691ab);
                        }
                    }
                    hashSet2.size();
                    hashSet.size();
                } finally {
                    try {
                        b0Var.t();
                    } catch (java.lang.RuntimeException unused) {
                    }
                }
            } else {
                b0Var.b();
                try {
                    java.util.Iterator it8 = hashSet2.iterator();
                    while (it8.hasNext()) {
                        m3.d dVar3 = (m3.d) it8.next();
                        java.lang.String str2 = (java.lang.String) dVar3.f404625a;
                        java.lang.Long l18 = (java.lang.Long) dVar3.f404626b;
                        b0Var.j("WxFileIndexDirtyWithTalker", "DELETE FROM WxFileIndexDirtyWithTalker WHERE msgId = ? AND username = ?", new java.lang.Object[]{l18, str2}, c26987xeef691ab);
                        if (o2()) {
                            b0Var.j("WxFileIndexDirty", "DELETE FROM WxFileIndexDirty WHERE msgId = ?", new java.lang.Object[]{l18}, c26987xeef691ab);
                        }
                    }
                    b0Var.t();
                } finally {
                }
            }
        } catch (java.lang.RuntimeException unused2) {
        }
    }

    public java.util.List z1() {
        d95.b0 b0Var = this.f430382d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.Cursor f17 = b0Var.f("SELECT msgId, username FROM WxFileIndexDirtyWithTalker", null, 0);
            while (f17.moveToNext()) {
                try {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f17.getLong(0), f17.getString(1)));
                } finally {
                }
            }
            f17.close();
            if (o2()) {
                f17 = b0Var.f("SELECT msgId FROM WxFileIndexDirty", null, 0);
                while (f17.moveToNext()) {
                    try {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f17.getLong(0), "talker-ignore"));
                    } finally {
                    }
                }
                f17.close();
            }
            arrayList.size();
            try {
                com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106266x8bcd201b(b0Var.P(), "SELECT COUNT(*) FROM WxFileIndexDirtyWithTalker", null);
            } catch (java.lang.Exception unused) {
            }
            if (o2()) {
                try {
                    com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106266x8bcd201b(b0Var.P(), "SELECT COUNT(*) FROM WxFileIndexDirty", null);
                } catch (java.lang.Exception unused2) {
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxFileIndexStorage", "Failed to get dirty msg list", e17);
        }
        return arrayList;
    }
}
