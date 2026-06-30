package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class s0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219196q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219196q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchCommonChatroomTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(this.f432668n.f432674c.split(","));
        w13.b bVar = this.f219196q.f219121g;
        bVar.getClass();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("member IN (");
        for (int i17 = 0; i17 < P1.size(); i17++) {
            stringBuffer.append("'");
            stringBuffer.append((java.lang.String) P1.get(i17));
            stringBuffer.append("'");
            if (i17 != P1.size() - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(")");
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o(java.lang.String.format("SELECT member, chatroom, entity_id FROM FTS5ChatRoomMembers, %s WHERE %s AND chatroom = aux_index", bVar.r(), stringBuffer.toString()), null);
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
            if (!cursorWrapper.moveToNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                vVar.f432693e = arrayList;
                p13.y yVar = new p13.y();
                yVar.f432730o = hashMap;
                arrayList.add(yVar);
                return;
            }
            java.lang.String string = cursorWrapper.getString(0);
            java.util.List arrayList2 = hashMap.containsKey(string) ? (java.util.List) hashMap.get(string) : new java.util.ArrayList();
            p13.y yVar2 = new p13.y();
            yVar2.f432720e = cursorWrapper.getString(1);
            yVar2.f432719d = cursorWrapper.getLong(2);
            arrayList2.add(yVar2);
            hashMap.put(string, arrayList2);
        }
    }
}
