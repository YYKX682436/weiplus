package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class h0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f219087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219088o;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, long j17) {
        this.f219088o = lVar;
        this.f219087n = j17;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "MarkLabelDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        if (!this.f219088o.f219127p.containsKey(java.lang.Long.valueOf(this.f219087n))) {
            this.f219088o.f219127p.put(java.lang.Long.valueOf(this.f219087n), this.f219088o.f219121g.w(o13.d.f423759l, java.lang.String.valueOf(this.f219087n), 1));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(32);
        w13.b bVar = this.f219088o.f219121g;
        long j17 = this.f219087n;
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o("SELECT user FROM FTS5ContactLabels WHERE label_id=?;", new java.lang.String[]{java.lang.Long.toString(j17)});
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                break;
            }
            arrayList.add(cursorWrapper.getString(0));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f219088o.f219124m.containsKey(str)) {
                this.f219088o.f219124m.put(str, this.f219088o.f219121g.w(o13.d.f423758k, str, 1));
            }
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{mLabelId: %d mContactCount: %d}", java.lang.Long.valueOf(this.f219087n), 0);
    }
}
