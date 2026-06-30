package o13;

/* loaded from: classes12.dex */
public abstract class a implements o13.u {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f423729d;

    /* renamed from: e, reason: collision with root package name */
    public kk.j f423730e;

    /* renamed from: f, reason: collision with root package name */
    public volatile o13.t f423731f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423732g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423733h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423734i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423735m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423736n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423737o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423738p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f423739q;

    public a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "Create %s", mo9549xfb82e301());
    }

    public java.util.List A(int[] iArr, int i17) {
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT docid, type, subtype, aux_index FROM %s WHERE type IN " + o13.n.m(iArr) + ";", r()), null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                y(arrayList2, i17);
                return arrayList;
            }
            p13.d dVar = new p13.d();
            dVar.f432604a = cursorWrapper.getLong(0);
            cursorWrapper.getInt(1);
            cursorWrapper.getInt(2);
            dVar.f432605b = cursorWrapper.getString(3);
            arrayList.add(dVar);
            arrayList2.add(java.lang.Long.valueOf(dVar.f432604a));
        }
    }

    public boolean B() {
        return this instanceof w13.b;
    }

    public abstract boolean C();

    public final boolean D() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "Create Fail!");
            return false;
        }
        this.f423731f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "Create Success!");
        java.lang.String o17 = o();
        java.lang.String r17 = r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "indexTableName=%s | metaTableName=%s | TableName=%s", o17, r17, t());
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).n(o17) && ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).n(r17) && !C()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "Table Exist, Not Need To Create");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "Table Not Exist, Need To Create");
            java.lang.String format = java.lang.String.format("DROP TABLE IF EXISTS %s;", o17);
            java.lang.String format2 = java.lang.String.format("DROP TABLE IF EXISTS %s;", r17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(format);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(format2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE VIRTUAL TABLE %s USING fts5(content, tokenize='mmSimple', prefix='1 2 3 4 5');", o()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(n());
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_typeId ON %s(type, entity_id);", r17, r17));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_entity_id_subtype ON %s(entity_id, subtype);", r17, r17));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_aux_index_subtype ON %s(aux_index, subtype);", r17, r17));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", r17, r17));
        }
        this.f423732g = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT INTO %s (content) VALUES (?);", o17));
        this.f423733h = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT OR REPLACE INTO %s (docid, type, subtype, entity_id, aux_index, timestamp) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?);", r17));
        this.f423734i = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("DELETE FROM %s WHERE rowid=?;", o17));
        this.f423735m = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("DELETE FROM %s WHERE docid=?;", r17));
        this.f423736n = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("UPDATE %s SET status=? WHERE docid=?;", r17));
        this.f423737o = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("UPDATE %s SET status=? WHERE aux_index=? AND status=?", r17));
        this.f423738p = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("UPDATE %s SET timestamp=? WHERE aux_index=?", r17));
        this.f423739q = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e("SELECT mm_last_error();");
        this.f423730e = new kk.l(100);
        E();
        return true;
    }

    public abstract void E();

    @Override // o13.u
    public void F(int[] iArr, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND entity_id=?;", r()), new java.lang.String[]{java.lang.Long.toString(j17)});
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                m(arrayList);
                return;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public boolean G() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f423732g;
        if (c26970x63d6eaa3 != null) {
            c26970x63d6eaa3.close();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa32 = this.f423733h;
        if (c26970x63d6eaa32 != null) {
            c26970x63d6eaa32.close();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa33 = this.f423734i;
        if (c26970x63d6eaa33 != null) {
            c26970x63d6eaa33.close();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa34 = this.f423735m;
        if (c26970x63d6eaa34 != null) {
            c26970x63d6eaa34.close();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa35 = this.f423736n;
        if (c26970x63d6eaa35 != null) {
            c26970x63d6eaa35.close();
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa36 = this.f423739q;
        if (c26970x63d6eaa36 != null) {
            c26970x63d6eaa36.close();
        }
        kk.j jVar = this.f423730e;
        if (jVar != null) {
            ((kk.l) jVar).mo143584x5a5b64d();
        }
        this.f423731f = null;
        return true;
    }

    public android.database.Cursor H(p13.r rVar, int[] iArr, int[] iArr2, java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2;
        java.lang.String str3;
        if (rVar.a()) {
            return new d95.d();
        }
        java.lang.String f17 = rVar.f();
        java.lang.String format = z17 ? java.lang.String.format(", MMHighlight(%s, %d, type, subtype)", o(), java.lang.Integer.valueOf(((java.util.ArrayList) rVar.f432666e).size())) : "";
        java.lang.String str4 = str != null ? " AND aux_index = ?" : "";
        if (iArr2 == null || iArr2.length <= 0) {
            str2 = "";
        } else {
            str2 = " AND subtype IN " + o13.n.m(iArr2);
        }
        if (iArr == null || iArr.length <= 0) {
            str3 = "";
        } else {
            str3 = " AND type IN " + o13.n.m(iArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp");
        sb6.append(z18 ? ", content" : "");
        sb6.append(format);
        sb6.append(" FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s'");
        sb6.append(str3);
        sb6.append(str4);
        sb6.append(" AND status >= 0");
        sb6.append(str2);
        sb6.append(";");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format(sb6.toString(), r(), r(), o(), r(), o(), o(), f17), str != null ? new java.lang.String[]{str} : null);
    }

    public android.database.Cursor I(int[] iArr, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        if (!z17 && !z18 && !z19 && !z27 && !z28) {
            return d95.d.a();
        }
        if (iArr == null || iArr.length == 0) {
            return d95.d.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        if (z17) {
            sb6.append("docid,");
        }
        if (z18) {
            sb6.append("entity_id,");
        }
        if (z19) {
            sb6.append("aux_index,");
        }
        if (z27) {
            sb6.append("timestamp,");
        }
        if (z28) {
            sb6.append("status,");
        }
        sb6.setLength(sb6.length() - 1);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT %s FROM %s WHERE type IN " + o13.n.m(iArr) + ";", sb6.toString(), r()), null);
    }

    public void J(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f423730e).m77802xbc5e1583()) {
            if (str2.startsWith(str)) {
                hashSet.add(str2);
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f423730e).m77803xc84af884((java.lang.String) it.next());
        }
    }

    @Override // o13.u
    public java.lang.String K(java.lang.String str, int i17) {
        if (B()) {
            java.lang.String str2 = str + "\u200b" + i17;
            if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f423730e).k(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "hit lru insert content map");
                return (java.lang.String) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) this.f423730e).get(str2);
            }
        }
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT content FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index=? AND subtype=?", r(), o(), r(), o()), new java.lang.String[]{str, java.lang.String.valueOf(i17)});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        java.lang.String string = cursorWrapper.moveToFirst() ? cursorWrapper.getString(0) : null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        return string;
    }

    public void L(long j17, long j18) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).q(j17, j18);
    }

    public final void M(java.lang.String str, long j17) {
        this.f423738p.m107799x37fbf859(1, j17);
        this.f423738p.m107801x35198eae(2, str);
        this.f423738p.m107867xb158f775();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        o13.u uVar = (o13.u) obj;
        if (mo9550x3662b71a() < uVar.mo9550x3662b71a()) {
            return -1;
        }
        return mo9550x3662b71a() > uVar.mo9550x3662b71a() ? 1 : 0;
    }

    @Override // o13.u
    /* renamed from: create */
    public synchronized void mo150428xaf65a0fc() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "OnCreate %s | isCreated =%b", mo9549xfb82e301(), java.lang.Boolean.valueOf(this.f423729d));
        if (!this.f423729d && D()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "SetCreated");
            this.f423729d = true;
        }
    }

    @Override // o13.u
    /* renamed from: destroy */
    public final void mo150429x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "OnDestroy %s | isCreated %b", mo9549xfb82e301(), java.lang.Boolean.valueOf(this.f423729d));
        if (this.f423729d && G()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "SetDestroyed");
            this.f423729d = false;
        }
    }

    public void h() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).a();
    }

    public boolean i(int i17, int i18) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).b(i17, i18);
    }

    public void j() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).d();
    }

    public void k(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(2048);
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + ";", r()), null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                m(arrayList);
                return;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public final void l(long j17) {
        boolean m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).m();
        if (!m17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).a();
        }
        this.f423734i.m107799x37fbf859(1, j17);
        try {
            this.f423734i.m107867xb158f775();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p(), e17, "deleteIndexByDocId", new java.lang.Object[0]);
        }
        this.f423735m.m107799x37fbf859(1, j17);
        try {
            this.f423735m.m107867xb158f775();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p(), e18, "deleteMetaByDocIdStmt", new java.lang.Object[0]);
        }
        if (m17) {
            return;
        }
        j();
    }

    public final void m(java.util.List list) {
        boolean m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).m();
        if (!m17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).a();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f423734i.m107799x37fbf859(1, ((java.lang.Long) it.next()).longValue());
            try {
                this.f423734i.m107867xb158f775();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p(), e17, "deleteIndexByDocIdStmt", new java.lang.Object[0]);
            }
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            try {
                this.f423735m.m107799x37fbf859(1, ((java.lang.Long) it6.next()).longValue());
                this.f423735m.m107867xb158f775();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(p(), e18, "deleteMetaByDocIdStmt", new java.lang.Object[0]);
            }
        }
        if (m17) {
            return;
        }
        j();
    }

    @Override // o13.u
    public final void m0(int[] iArr, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT docid FROM %s WHERE type IN " + o13.n.m(iArr) + " AND aux_index=?;", r()), new java.lang.String[]{str});
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                m(arrayList);
                return;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", r());
    }

    public final java.lang.String o() {
        return "FTS5Index" + t();
    }

    public java.lang.String p() {
        return "MicroMsg.FTS.BaseFTS5NativeStorage";
    }

    public final java.lang.String r() {
        return "FTS5Meta" + t();
    }

    public long s(int[] iArr) {
        android.database.Cursor cursor = null;
        try {
            cursor = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT count(*) FROM %s WHERE type IN %s", r(), o13.n.m(iArr)), null);
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) cursor;
            long j17 = cursorWrapper.moveToNext() ? cursorWrapper.getLong(0) : 0L;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) cursor).close();
            return j17;
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) cursor).close();
            }
            throw th6;
        }
    }

    public abstract java.lang.String t();

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(int r15, int r16, long r17, java.lang.String r19, long r20, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o13.a.u(int, int, long, java.lang.String, long, java.lang.String):void");
    }

    public java.util.List w(int[] iArr, java.lang.String str, int i17) {
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o(java.lang.String.format("SELECT docid FROM %s WHERE aux_index=? AND type IN " + o13.n.m(iArr) + ";", r()), new java.lang.String[]{str});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                y(arrayList, i17);
                return arrayList;
            }
            arrayList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    public final void y(java.util.List list, int i17) {
        boolean m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).m();
        if (!m17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).a();
        }
        this.f423736n.m107799x37fbf859(1, i17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f423736n.m107799x37fbf859(2, ((java.lang.Long) it.next()).longValue());
            this.f423736n.m107867xb158f775();
        }
        if (m17) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).d();
    }
}
