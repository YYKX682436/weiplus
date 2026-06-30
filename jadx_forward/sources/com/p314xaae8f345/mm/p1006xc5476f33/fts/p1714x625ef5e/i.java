package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class i extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k f219093q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar, p13.u ftsRequest) {
        super(ftsRequest);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsRequest, "ftsRequest");
        this.f219093q = kVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchRelatedChatroomTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f432668n;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar = this.f219093q;
        if (vVar == null || uVar == null) {
            return;
        }
        p13.r d17 = p13.r.d(uVar.f432688q);
        int size = ((java.util.ArrayList) uVar.f432688q).size() + 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "search SearchCommonChatroomTask <= " + size);
        vVar.f432692d = d17;
        w13.a aVar = kVar.f219110g;
        if (aVar != null) {
            java.lang.String format = java.lang.String.format("SELECT aux_index FROM " + aVar.o() + " NOT INDEXED JOIN " + aVar.r() + " ON (" + aVar.r() + ".docid = " + aVar.o() + ".rowid) WHERE " + aVar.o() + " MATCH '" + d17.f() + "' AND entity_id <= " + size + " ORDER BY timestamp DESC;", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) aVar.f423731f).o(format, null);
            do {
                try {
                    if (!o17.moveToNext()) {
                        break;
                    }
                    p13.z zVar = new p13.z();
                    zVar.f432720e = o17.getString(0);
                    vVar.f432693e.add(zVar);
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(o17, th6);
                        throw th7;
                    }
                }
            } while (vVar.f432693e.size() < uVar.f432680i);
            vz5.b.a(o17, null);
        }
    }
}
