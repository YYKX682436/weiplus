package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class e2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219046q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219046q = l2Var;
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
        java.lang.String format;
        o("start");
        p13.r c17 = p13.r.c(this.f432668n.f432674c, false, this.f219046q.f219151t);
        vVar.f432692d = c17;
        w13.h hVar = this.f219046q.f219142h;
        java.lang.String str = this.f432668n.f432675d;
        hVar.getClass();
        java.lang.String f17 = c17.f();
        java.lang.String q17 = hVar.q();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str)) {
            format = java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, talker, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND talker = ? AND status >= 0" + q17 + " ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17);
        } else {
            format = java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND status >= 0" + q17 + " ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17);
        }
        android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar.f423731f).o(format, new java.lang.String[]{str});
        vVar.f432693e = new java.util.ArrayList();
        while (((android.database.CursorWrapper) o17).moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.d(o17);
            zVar.f432730o = 1;
            zVar.f432723h = "conv_message_content";
            vVar.f432693e.add(zVar);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) o17).close();
        o("findConversationMessage");
        if (vVar.f432692d.f432665d.length <= 1 || this.f432668n.f432681j.contains("create_talker_message\u200b")) {
            return;
        }
        android.database.Cursor Q = ((w13.b) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(p13.r.b(vVar.f432692d.f432665d[0], true), null, o13.d.f423758k, o13.d.f423762o);
        if (Q.moveToNext()) {
            p13.y yVar = new p13.y();
            yVar.f432720e = "create_talker_message\u200b";
            vVar.f432693e.add(0, yVar);
        }
        Q.close();
        o("findTalkerConversation");
    }
}
