package w13;

/* loaded from: classes12.dex */
public class i implements o13.u {

    /* renamed from: d, reason: collision with root package name */
    public boolean f523749d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f523750e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523751f;

    /* renamed from: g, reason: collision with root package name */
    public o13.t f523752g;

    public i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create %s", "FTS5SOSHistoryStorage");
    }

    @Override // o13.u
    public void F(int[] iArr, long j17) {
    }

    @Override // o13.u
    public java.lang.String K(java.lang.String str, int i17) {
        return null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return 0;
    }

    @Override // o13.u
    /* renamed from: create */
    public void mo150428xaf65a0fc() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnCreate %s | isCreated =%b", "FTS5SOSHistoryStorage", java.lang.Boolean.valueOf(this.f523749d));
        if (this.f523749d) {
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            this.f523752g = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218914f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Success!");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).n("FTS5MetaSOSHistory") && ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).b(org.p3343x72743996.net.InterfaceC29524x4f65168b.f73887x145b0ccf, 2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Exist, Not Need To Create");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Not Exist, Need To Create");
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).i(java.lang.String.format("DROP TABLE IF EXISTS %s;", "FTS5MetaSOSHistory"));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).i(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (key TEXT PRIMARY KEY, timestamp INTEGER, content TEXT);", "FTS5MetaSOSHistory"));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS SOSHistory_timestamp ON %s(timestamp);", "FTS5MetaSOSHistory"));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).q(-109L, 2L);
            }
            this.f523751f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f523752g).e(java.lang.String.format("INSERT OR REPLACE INTO %s (key, timestamp, content) VALUES (?, ?, ?);", "FTS5MetaSOSHistory"));
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Fail!");
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetCreated");
            this.f523749d = true;
        }
    }

    @Override // o13.u
    /* renamed from: destroy */
    public void mo150429x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", "FTS5SOSHistoryStorage", java.lang.Boolean.valueOf(this.f523750e), java.lang.Boolean.valueOf(this.f523749d));
        if (this.f523750e || !this.f523749d) {
            return;
        }
        this.f523751f.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetDestroyed");
        this.f523750e = true;
    }

    @Override // o13.u
    /* renamed from: getName */
    public java.lang.String mo9549xfb82e301() {
        return "FTS5SOSHistoryStorage";
    }

    @Override // o13.u
    /* renamed from: getPriority */
    public int mo9550x3662b71a() {
        return 1024;
    }

    @Override // o13.u
    /* renamed from: getType */
    public int mo9551xfb85f7b0() {
        return 1024;
    }

    @Override // o13.u
    public void m0(int[] iArr, java.lang.String str) {
    }
}
