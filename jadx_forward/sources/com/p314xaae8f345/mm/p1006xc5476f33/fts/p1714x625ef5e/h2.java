package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class h2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219091q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219091q = l2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchConversationMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 14;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        p13.r c17 = p13.r.c(this.f432668n.f432674c, false, this.f219091q.f219151t);
        vVar.f432692d = c17;
        w13.h hVar = this.f219091q.f219142h;
        hVar.getClass();
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar.f423731f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, talker, MAX(timestamp) as maxTime, count(talker) as msgCount FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index = '%s' AND %s MATCH '%s' AND status >= 0 GROUP BY talker ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), "opencustomerservicemsg", hVar.o(), c17.f()), null);
        vVar.f432693e = new java.util.ArrayList();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                o("findkefuConversationMessage");
                return;
            }
            p13.z zVar = new p13.z();
            zVar.f432716a = cursorWrapper.getLong(0);
            zVar.f432717b = cursorWrapper.getInt(1);
            zVar.f432718c = cursorWrapper.getInt(2);
            zVar.f432719d = cursorWrapper.getLong(3);
            zVar.f432720e = cursorWrapper.getString(4);
            zVar.f432721f = cursorWrapper.getLong(5);
            zVar.f432730o = java.lang.Integer.valueOf(cursorWrapper.getInt(6));
            zVar.f432722g = cursorWrapper.getString(4);
            vVar.f432693e.add(zVar);
        }
    }
}
