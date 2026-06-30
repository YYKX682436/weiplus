package w13;

/* loaded from: classes12.dex */
public class f extends o13.a {

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f523746r;

    @Override // o13.a
    public boolean B() {
        return true;
    }

    @Override // o13.a
    public boolean C() {
        return !i(-101, 3);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i(java.lang.String.format("DROP TABLE IF EXISTS %s", "Feature"));
            L(-101L, 3L);
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).n("Feature")) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).i("CREATE TABLE IF NOT EXISTS Feature ( " + p13.f.f432618J.f398489e + ");");
        }
        this.f523746r = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).e(java.lang.String.format("INSERT INTO %s (featureId, title, titlePY, titleShortPY, tag, actionType, url, helpUrl, updateUrl, androidUrl, iconPath, timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", "Feature"));
    }

    @Override // o13.a
    public boolean G() {
        super.G();
        this.f523746r.close();
        return true;
    }

    public p13.f N(int i17) {
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).o("Select * from Feature where featureId = " + i17, null);
        try {
            if (!((android.database.CursorWrapper) o17).moveToFirst()) {
                return null;
            }
            p13.f fVar = new p13.f();
            fVar.mo9015xbf5d97fd(o17);
            return fVar;
        } finally {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        }
    }

    public boolean O(java.util.List list) {
        boolean m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).m();
        if (!m17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).a();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p13.f fVar = (p13.f) it.next();
            try {
                this.f523746r.m107799x37fbf859(1, fVar.f68145x818dc9ac);
                this.f523746r.m107801x35198eae(2, fVar.f68150x29dd02d3);
                this.f523746r.m107801x35198eae(3, fVar.f68151x26a7a41c);
                this.f523746r.m107801x35198eae(4, fVar.f68152xb2e3b132);
                this.f523746r.m107801x35198eae(5, fVar.f68148x4b6e82d5);
                this.f523746r.m107799x37fbf859(6, fVar.f68143x2788aaf5);
                this.f523746r.m107801x35198eae(7, fVar.f68154x4b6e88aa);
                this.f523746r.m107801x35198eae(8, fVar.f68146xa49a5829);
                this.f523746r.m107801x35198eae(9, fVar.f68153x266f9ee1);
                this.f523746r.m107801x35198eae(10, fVar.f68144xe43f00e5);
                this.f523746r.m107801x35198eae(11, fVar.f68147xf1c539e3);
                this.f523746r.m107799x37fbf859(12, fVar.f68149x9de75411);
                this.f523746r.m107869x22927a8e();
            } catch (java.lang.Exception unused) {
            }
        }
        if (!m17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).d();
        }
        return true;
    }

    @Override // o13.u
    /* renamed from: getName */
    public java.lang.String mo9549xfb82e301() {
        return "FTS5FeatureStorage";
    }

    @Override // o13.u
    /* renamed from: getPriority */
    public int mo9550x3662b71a() {
        return 17;
    }

    @Override // o13.u
    /* renamed from: getType */
    public int mo9551xfb85f7b0() {
        return 17;
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5FeatureStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "Feature";
    }
}
