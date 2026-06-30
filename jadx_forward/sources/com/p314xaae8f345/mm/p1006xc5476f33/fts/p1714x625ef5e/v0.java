package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class v0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219242q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219242q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchContactSmallerTimestampTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        long longValue = java.lang.Long.valueOf(this.f432668n.f432674c).longValue();
        w13.b bVar = this.f219242q.f219121g;
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o(java.lang.String.format("SELECT distinct(aux_index) FROM %s WHERE timestamp < %d AND type = %d", bVar.r(), java.lang.Long.valueOf(longValue), 131072), null);
        vVar.f432693e = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                return;
            } else {
                p13.y yVar = new p13.y();
                yVar.f432720e = cursorWrapper.getString(0);
                vVar.f432693e.add(yVar);
            }
        }
    }
}
