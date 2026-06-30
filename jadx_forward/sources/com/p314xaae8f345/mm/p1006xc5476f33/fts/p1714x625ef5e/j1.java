package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class j1 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219101q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var, p13.u ftsRequest) {
        super(ftsRequest);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsRequest, "ftsRequest");
        this.f219101q = s1Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchAppBrandKefuContactTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        android.database.Cursor o17;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f432668n.f432681j);
        p75.i0 i17 = dm.i2.K.i();
        i17.f434190d = dm.i2.L.p("'%@app'");
        java.util.List k17 = i17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.l4.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) it.next()).h1());
        }
        p13.u uVar = this.f432668n;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219101q;
        if (vVar == null || uVar == null) {
            return;
        }
        p13.r b17 = p13.r.b(uVar.f432674c, true);
        vVar.f432692d = b17;
        w13.g gVar = s1Var.f219198f;
        if (gVar != null) {
            if (b17.a()) {
                o17 = new d95.d();
            } else {
                java.lang.String format = java.lang.String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, %s, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type = '%s' AND status >= 0 ORDER BY subtype;", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.r(), gVar.o(), java.lang.Long.valueOf(((java.util.ArrayList) b17.f432666e).size()), gVar.r(), gVar.o(), gVar.r(), gVar.o(), gVar.o(), b17.f(), 131090}, 10));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) gVar.f423731f).o(format, null);
            }
            while (o17.moveToNext()) {
                try {
                    p13.z zVar = new p13.z();
                    zVar.c(o17);
                    if (hashSet.add(zVar.f432720e)) {
                        if (arrayList.contains(zVar.f432720e)) {
                            vVar.f432693e.add(zVar);
                            if (vVar.f432693e.size() > uVar.f432680i) {
                                break;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", zVar.f432720e + " already delete");
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(o17, th6);
                        throw th7;
                    }
                }
            }
            vz5.b.a(o17, null);
        }
    }
}
