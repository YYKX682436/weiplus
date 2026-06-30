package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class j3 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f219105n;

    /* renamed from: o, reason: collision with root package name */
    public int f219106o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 f219107p;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 m3Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i3 i3Var) {
        this.f219107p = m3Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildTopHitsIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f219106o = this.f219107p.f219167g.O();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 5184000000L;
        w13.k kVar = this.f219107p.f219167g;
        java.lang.String format = java.lang.String.format("SELECT docid FROM %s WHERE timestamp < ? OR score = 0;", kVar.r());
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) kVar.f423731f).o(format, new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis)});
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                kVar.m(linkedList);
                this.f219105n = linkedList.size();
                return true;
            }
            linkedList.add(java.lang.Long.valueOf(cursorWrapper.getLong(0)));
        }
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{topHitsUpdateCount: %d deleteExpiredCount: %d}", java.lang.Integer.valueOf(this.f219106o), java.lang.Integer.valueOf(this.f219105n));
    }
}
