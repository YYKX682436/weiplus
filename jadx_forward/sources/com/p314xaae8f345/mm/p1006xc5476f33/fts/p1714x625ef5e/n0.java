package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class n0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219170q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219170q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchChatroomInMemberTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        super.p(vVar);
        w13.b bVar = this.f219170q.f219121g;
        java.lang.String str = this.f432668n.f432675d;
        p13.r rVar = vVar.f432692d;
        bVar.getClass();
        if (rVar.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = rVar.f();
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o(java.lang.String.format("SELECT aux_index FROM %s NOT INDEXED JOIN (SELECT docid, aux_index, timestamp FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=?) as temp ON (%s.rowid = temp.docid) WHERE %s MATCH '%s' ORDER BY -timestamp;", bVar.o(), bVar.r(), bVar.o(), bVar.o(), f17), new java.lang.String[]{str});
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        vVar.f432693e = new java.util.ArrayList();
        while (o17.moveToNext()) {
            p13.y yVar = new p13.y();
            java.lang.String string = o17.getString(0);
            yVar.f432720e = string;
            if (hashSet.add(string)) {
                vVar.f432693e.add(yVar);
            }
        }
        o17.close();
        vVar.f432691c = 0;
    }
}
