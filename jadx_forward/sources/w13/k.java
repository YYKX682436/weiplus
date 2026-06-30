package w13;

/* loaded from: classes12.dex */
public class k extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523754r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523755s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523756t;

    @Override // o13.a
    public boolean C() {
        return !i(-100, 6);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).q(-100L, 6L);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_query ON %s(query);", r(), r()));
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS %s_score ON %s(score);", r(), r()));
        this.f523754r = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT INTO %s (content) VALUES (?);", o()));
        this.f523755s = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT OR REPLACE INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, query, score, scene, meta_content) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?, ?, ?, ?);", r()));
        this.f523756t = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("UPDATE %s SET status=? WHERE aux_index=?", r()));
    }

    @Override // o13.a
    public boolean G() {
        super.G();
        this.f523754r.close();
        this.f523755s.close();
        this.f523756t.close();
        return true;
    }

    public boolean N(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(str) < java.lang.System.currentTimeMillis() - 5184000000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int O() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w13.k.O():int");
    }

    @Override // o13.u
    /* renamed from: getName */
    public java.lang.String mo9549xfb82e301() {
        return "FTS5TopHitsStorage";
    }

    @Override // o13.u
    /* renamed from: getPriority */
    public int mo9550x3662b71a() {
        return 768;
    }

    @Override // o13.u
    /* renamed from: getType */
    public int mo9551xfb85f7b0() {
        return 1;
    }

    @Override // o13.a
    public java.lang.String n() {
        return java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, query TEXT COLLATE NOCASE, score INT, scene INT, meta_content TEXT);", r());
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5TopHitsStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "TopHits";
    }
}
