package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class j2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public int f219102q;

    /* renamed from: r, reason: collision with root package name */
    public int f219103r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219104s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219104s = l2Var;
        this.f219102q = 0;
        this.f219103r = 0;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchTopGroupMessageTask";
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{totalMsgCount: %d conversationCount: %d}", java.lang.Integer.valueOf(this.f219102q), java.lang.Integer.valueOf(this.f219103r));
    }

    @Override // p13.c
    public int k() {
        return 15;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        java.lang.String str;
        android.database.Cursor o17;
        o("start");
        vVar.f432692d = p13.r.c(this.f432668n.f432674c, false, this.f219104s.f219151t);
        vVar.f432693e = new java.util.LinkedList();
        w13.h hVar = this.f219104s.f219142h;
        p13.r rVar = vVar.f432692d;
        int i17 = this.f432668n.f432680i;
        hVar.getClass();
        if (rVar.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = rVar.f();
            if (i17 != Integer.MAX_VALUE) {
                str = " LIMIT " + (i17 + 1);
            } else {
                str = "";
            }
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar.f423731f).o(java.lang.String.format("SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount, talker FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0" + hVar.q() + " GROUP BY aux_index ORDER BY timestamp desc" + str + ";", hVar.r(), hVar.o(), hVar.r(), hVar.o(), hVar.o(), f17), null);
        }
        while (o17.moveToNext()) {
            p13.y yVar = new p13.y();
            yVar.f432717b = o17.getInt(0);
            yVar.f432718c = o17.getInt(1);
            yVar.f432719d = o17.getLong(2);
            yVar.f432720e = o17.getString(3);
            yVar.f432721f = o17.getLong(4);
            int i18 = o17.getInt(5);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(yVar.f432720e) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.C3(yVar.f432720e)) {
                yVar.f432722g = o17.getString(6);
            }
            yVar.f432730o = java.lang.Integer.valueOf(i18);
            vVar.f432693e.add(yVar);
            this.f219102q += ((java.lang.Integer) yVar.f432730o).intValue();
            this.f219103r++;
        }
        o17.close();
        o("groupMessage");
        java.lang.String[] strArr = vVar.f432692d.f432665d;
        if (strArr.length > 1) {
            android.database.Cursor Q = ((w13.b) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(p13.r.b(strArr[0], true), null, o13.d.f423758k, o13.d.f423762o);
            if (Q.moveToNext()) {
                p13.y yVar2 = new p13.y();
                yVar2.f432720e = "create_talker_message\u200b";
                vVar.f432693e.add(0, yVar2);
            }
            Q.close();
            o("findTalkerConversation");
        }
    }
}
