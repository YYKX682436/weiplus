package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class m0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219158q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219158q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchChatroomCountTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        w13.b bVar = this.f219158q.f219121g;
        java.lang.String str = this.f432668n.f432674c;
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o(java.lang.String.format("SELECT count(aux_index) FROM %s NOT INDEXED JOIN FTS5ChatRoomMembers ON (aux_index = chatroom) WHERE member=? AND subtype=38 AND type=131075", bVar.r()), new java.lang.String[]{str});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        int i17 = cursorWrapper.moveToNext() ? cursorWrapper.getInt(0) : 0;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        p13.y yVar = new p13.y();
        yVar.f432730o = java.lang.Integer.valueOf(i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        vVar.f432693e = arrayList;
        arrayList.add(yVar);
    }
}
