package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class c0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f219009n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f219010o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219011p;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m mVar) {
        this.f219011p = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "LoadLabelCacheTask";
    }

    @Override // p13.c
    public boolean i() {
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f219011p.f219121g.f423731f).o("SELECT user, label_id FROM FTS5ContactLabels;", null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                return true;
            }
            java.lang.String string = cursorWrapper.getString(0);
            long j17 = cursorWrapper.getLong(1);
            java.util.List list = (java.util.List) this.f219011p.f219126o.get(string);
            if (list == null) {
                list = new java.util.ArrayList(16);
                this.f219011p.f219126o.put(string, list);
                this.f219009n++;
            }
            list.add(java.lang.Long.valueOf(j17));
            this.f219010o++;
        }
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{users: %d labels: %d}", java.lang.Integer.valueOf(this.f219009n), java.lang.Integer.valueOf(this.f219010o));
    }
}
