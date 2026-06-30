package v72;

/* loaded from: classes12.dex */
public class a extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f515176r;

    @Override // o13.a
    public boolean C() {
        return !i(-106, 4);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).q(-106L, 4L);
        }
        this.f515176r = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, fav_type) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", r()));
    }

    public void N(int i17, int i18, long j17, java.lang.String str, long j18, java.lang.String str2, int i19) {
        java.lang.String a17 = o13.n.a(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return;
        }
        boolean m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).m();
        if (!m17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).a();
        }
        try {
            this.f423732g.m107801x35198eae(1, a17);
            this.f423732g.m107867xb158f775();
            this.f515176r.m107799x37fbf859(1, i17);
            this.f515176r.m107799x37fbf859(2, i18);
            this.f515176r.m107799x37fbf859(3, j17);
            this.f515176r.m107801x35198eae(4, str);
            this.f515176r.m107799x37fbf859(5, j18);
            this.f515176r.m107799x37fbf859(6, i19);
            this.f515176r.m107867xb158f775();
            if (m17) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).d();
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTS5FavoriteStorage", java.lang.String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(j18)));
            java.lang.String m107875xeae4a4 = this.f423739q.m107875xeae4a4();
            if (m107875xeae4a4 != null && m107875xeae4a4.length() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTS5FavoriteStorage", ">> ".concat(m107875xeae4a4));
            }
            throw e17;
        }
    }

    @Override // o13.u
    /* renamed from: getName */
    public java.lang.String mo9549xfb82e301() {
        return "FTS5FavoriteStorage";
    }

    @Override // o13.u
    /* renamed from: getPriority */
    public int mo9550x3662b71a() {
        return 256;
    }

    @Override // o13.u
    /* renamed from: getType */
    public int mo9551xfb85f7b0() {
        return 256;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, fav_type INT DEFAULT 0);", r());
    }

    @Override // o13.a
    public java.lang.String t() {
        return "Favorite";
    }
}
