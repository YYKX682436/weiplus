package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class j0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219100q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219100q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "QueryRecommendLabelByCommonChatroomTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        w13.b bVar = this.f219100q.f219121g;
        java.lang.String str = this.f432668n.f432674c;
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o("SELECT\n    l.label_id,\n    COUNT(DISTINCT m.member) AS user_count,\n    (SELECT COUNT(DISTINCT chatroom) FROM FTS5ChatRoomMembers) AS total_chatrooms,\n    (SELECT COUNT(DISTINCT member) FROM FTS5ChatRoomMembers) AS total_members,\n    (SELECT COUNT(DISTINCT chatroom) FROM FTS5ChatRoomMembers WHERE member = ?) AS member_chatroom_count,\n    (SELECT COUNT(DISTINCT m.member) FROM FTS5ChatRoomMembers m\n     INNER JOIN (\n         SELECT chatroom\n         FROM FTS5ChatRoomMembers\n         WHERE member = ?\n         GROUP BY chatroom\n     ) g ON m.chatroom = g.chatroom\n     INNER JOIN FTS5ContactLabels l ON m.member = l.user\n     WHERE m.member != ?) AS labeled_member_count\nFROM FTS5ChatRoomMembers m\nINNER JOIN (\n    SELECT chatroom\n    FROM FTS5ChatRoomMembers\n    WHERE member = ?\n    GROUP BY chatroom\n) g ON m.chatroom = g.chatroom\nINNER JOIN FTS5ContactLabels l ON m.member = l.user\nWHERE m.member != ?\nGROUP BY l.label_id\nORDER BY user_count DESC;", new java.lang.String[]{str, str, str, str, str});
        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "cursor getColumnNames: %s", java.util.Arrays.toString(cursorWrapper.getColumnNames()));
        vVar.f432693e = new java.util.ArrayList();
        while (cursorWrapper.moveToNext()) {
            if (cursorWrapper.getColumnCount() >= 6) {
                p13.y yVar = new p13.y();
                yVar.f432727l = new java.lang.String[]{cursorWrapper.getString(0), cursorWrapper.getString(1), cursorWrapper.getString(2), cursorWrapper.getString(3), cursorWrapper.getString(4), cursorWrapper.getString(5)};
                vVar.f432693e.add(yVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "cursor find: label_id=%s, user_count=%s", cursorWrapper.getString(0), cursorWrapper.getString(1));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        vVar.f432691c = 0;
    }
}
