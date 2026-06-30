package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class l0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219137q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219137q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchTopChatroomInnerRankTask";
    }

    @Override // p13.c
    public int k() {
        return 25;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        o("start");
        p13.r b17 = p13.r.b(this.f432668n.f432674c, true);
        vVar.f432692d = b17;
        w13.b bVar = this.f219137q.f219121g;
        bVar.getClass();
        if (b17.a()) {
            o17 = new d95.d();
        } else {
            java.lang.String f17 = b17.f();
            long currentTimeMillis = java.lang.System.currentTimeMillis() - 1209600000;
            long size = ((java.util.ArrayList) b17.f432666e).size();
            o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) bVar.f423731f).o(java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %d, type, subtype) AS Offsets, MMChatroomRank(%s, timestamp / 1000 - %d / 1000, subtype, ?, entity_id, %d) AS Rank FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = 131075 ORDER BY entity_id ;", bVar.r(), bVar.o(), java.lang.Long.valueOf(size), bVar.o(), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(size), bVar.r(), bVar.o(), bVar.r(), bVar.o(), bVar.o(), f17), new java.lang.String[]{b17.f432663b});
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f432668n.f432681j);
        while (o17.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.e(o17);
            if (hashSet.add(zVar.f432720e)) {
                if (arrayList.size() > this.f432668n.f432680i) {
                    break;
                }
                arrayList.add(zVar);
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    o17.close();
                    throw new java.lang.InterruptedException("Task is Cancel: " + this.f432668n.f432674c);
                }
            }
        }
        o17.close();
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        o("orm");
        vVar.f432693e = new java.util.ArrayList(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.z zVar2 = (p13.z) it.next();
            zVar2.a();
            zVar2.b(vVar.f432692d);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l.n(zVar2);
            vVar.f432693e.add(zVar2);
        }
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        java.util.Comparator comparator = this.f432668n.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
        o("calOffsets");
        o("checkChatroom");
    }
}
