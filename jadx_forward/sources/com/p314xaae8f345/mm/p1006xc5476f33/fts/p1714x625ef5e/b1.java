package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class b1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f218992n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f218993o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f218994p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f218995q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f218996r;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m mVar) {
        this.f218996r = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "UpdateDirtyAndTimestampContactTask";
    }

    @Override // p13.c
    public boolean i() {
        o("start");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f218996r;
        java.util.Iterator it = lVar.f219124m.entrySet().iterator();
        int i17 = 50;
        while (it.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                lVar.f219121g.j();
                throw new java.lang.InterruptedException();
            }
            if (i17 >= 50) {
                lVar.f219121g.j();
                lVar.f219121g.h();
                i17 = 0;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.Iterator it6 = ((java.util.List) entry.getValue()).iterator();
            while (it6.hasNext()) {
                lVar.f219121g.l(((java.lang.Long) it6.next()).longValue());
                i17++;
            }
            java.lang.String str = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).a(str);
            if (a17.d1().length() > 0 && lVar.p(a17)) {
                i17 += lVar.k(a17);
            }
            it.remove();
            lVar.f219123i.remove(str);
            this.f218992n++;
        }
        o("dirtyContact");
        java.util.Iterator it7 = lVar.f219123i.iterator();
        while (it7.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                lVar.f219121g.j();
                throw new java.lang.InterruptedException();
            }
            if (i17 >= 50) {
                lVar.f219121g.j();
                lVar.f219121g.h();
                i17 = 0;
            }
            java.lang.String str2 = (java.lang.String) it7.next();
            long b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).b(str2);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 a18 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).a(str2);
            if (a18.d1().length() > 0 && lVar.p(a18)) {
                lVar.f219121g.M(str2, b17);
                i17++;
            }
            it7.remove();
            this.f218994p++;
        }
        lVar.f219121g.j();
        o("timestampContact");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 ij6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).ij();
        ij6.f219168h.clear();
        this.f218995q = ij6.f219167g.O();
        o("topHits");
        java.util.Map a19 = w13.d.f523743a.a(lVar.f219126o);
        java.util.Iterator it8 = lVar.f219127p.entrySet().iterator();
        while (it8.hasNext()) {
            if (java.lang.Thread.interrupted() || this.f432599f) {
                lVar.f219121g.j();
                throw new java.lang.InterruptedException();
            }
            if (i17 >= 50) {
                lVar.f219121g.j();
                lVar.f219121g.h();
                i17 = 0;
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it8.next();
            java.util.Iterator it9 = ((java.util.List) entry2.getValue()).iterator();
            while (it9.hasNext()) {
                lVar.f219121g.l(((java.lang.Long) it9.next()).longValue());
                i17++;
            }
            long longValue = ((java.lang.Long) entry2.getKey()).longValue();
            try {
                p13.k c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).c(longValue);
                if (c17 != null) {
                    java.util.List list = (java.util.List) ((java.util.LinkedHashMap) a19).get(java.lang.Long.valueOf(longValue));
                    if (list == null) {
                        list = new java.util.ArrayList();
                    }
                    i17 += this.f218996r.l(longValue, c17.f432641b, list, c17.f432642c);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchContactLogic", e17, "update label index failed with exception.\n", new java.lang.Object[0]);
            }
            it8.remove();
            this.f218993o++;
        }
        lVar.f219121g.j();
        o("dirtyLabel");
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{DirtyContact: %d Timestamp: %d tophitsCount: %d DirtyLabel: %d}", java.lang.Integer.valueOf(this.f218992n), java.lang.Integer.valueOf(this.f218994p), java.lang.Integer.valueOf(this.f218995q), java.lang.Integer.valueOf(this.f218993o));
    }

    @Override // p13.c
    public int k() {
        return 16;
    }
}
