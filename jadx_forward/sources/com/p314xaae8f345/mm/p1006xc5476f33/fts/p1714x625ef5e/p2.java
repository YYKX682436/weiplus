package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class p2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2 f219181q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2 q2Var, p13.u uVar) {
        super(uVar);
        this.f219181q = q2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchSOSHistoryTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        vVar.f432693e = new java.util.ArrayList();
        w13.i iVar = this.f219181q.f219187e;
        int i17 = this.f432668n.f432680i;
        iVar.getClass();
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) iVar.f523752g).o(java.lang.String.format("SELECT content, timestamp FROM %s ORDER BY timestamp desc LIMIT " + i17, "FTS5MetaSOSHistory"), null);
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                vVar.f432691c = 0;
                return;
            } else {
                java.lang.String string = cursorWrapper.getString(0);
                p13.z zVar = new p13.z();
                zVar.f432723h = string;
                vVar.f432693e.add(zVar);
            }
        }
    }
}
