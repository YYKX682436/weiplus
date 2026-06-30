package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class c2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219014q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219014q = l2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchAppBrandKefuConversationMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 14;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        o("start");
        p13.r c17 = p13.r.c(this.f432668n.f432674c, false, this.f219014q.f219151t);
        vVar.f432692d = c17;
        w13.h hVar = this.f219014q.f219142h;
        hVar.getClass();
        if (c17.a()) {
            o17 = new d95.d();
        } else {
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar.f423731f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, talker, MAX(timestamp) as maxTime, count(talker) as msgCount FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE aux_index = '%s' AND %s MATCH '%s' AND status >= 0 GROUP BY talker ORDER BY timestamp desc;", hVar.r(), hVar.r(), hVar.o(), hVar.r(), hVar.o(), "appbrandcustomerservicemsg", hVar.o(), c17.f()), null);
        }
        vVar.f432693e = new java.util.ArrayList();
        while (o17.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.f432716a = o17.getLong(0);
            zVar.f432717b = o17.getInt(1);
            zVar.f432718c = o17.getInt(2);
            zVar.f432719d = o17.getLong(3);
            zVar.f432720e = o17.getString(4);
            zVar.f432721f = o17.getLong(5);
            zVar.f432730o = java.lang.Integer.valueOf(o17.getInt(6));
            zVar.f432722g = o17.getString(4);
            vVar.f432693e.add(zVar);
        }
        o17.close();
        o("findkefuConversationMessage");
    }
}
