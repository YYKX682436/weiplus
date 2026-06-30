package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class g1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f219080n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219081o;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var) {
        this.f219081o = s1Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildKefuContactIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.g gVar;
        w13.g gVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "BuildKefuContactIndexTask execute");
        w13.g gVar3 = this.f219081o.f219198f;
        android.database.Cursor cursor = null;
        if (gVar3 != null) {
            java.lang.String format = java.lang.String.format("SELECT DISTINCT aux_index FROM %s;", java.util.Arrays.copyOf(new java.lang.Object[]{gVar3.r()}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            cursor = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) gVar3.f423731f).o(format, null);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        boolean z17 = false;
        if (cursor != null) {
            while (true) {
                android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) cursor;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                hashSet.add(cursorWrapper.getString(0));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) cursor).close();
        }
        java.util.List k17 = dm.u8.C.i().a().k(gm0.j1.u().f354686f, dm.u8.class);
        p75.i0 i17 = dm.e2.N1.i();
        i17.f434190d = dm.e2.P1.p("'%@app'");
        java.util.List k18 = i17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class);
        w13.g gVar4 = this.f219081o.f219198f;
        if (!(gVar4 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) gVar4.f423731f).m()) && (gVar2 = this.f219081o.f219198f) != null) {
            gVar2.h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219081o;
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            dm.u8 u8Var = (dm.u8) it.next();
            if (hashSet.add(u8Var.f68613xdec927b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1.k(s1Var, u8Var, 0);
                this.f219080n++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var2 = this.f219081o;
        java.util.Iterator it6 = ((java.util.ArrayList) k18).iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it6.next();
            if (hashSet.add(z3Var.d1())) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1.j(s1Var2, z3Var);
                this.f219080n++;
            }
        }
        w13.g gVar5 = this.f219081o.f219198f;
        if (gVar5 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) gVar5.f423731f).m()) {
            z17 = true;
        }
        if (z17 && (gVar = this.f219081o.f219198f) != null) {
            gVar.j();
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "add kefu contact index count: " + this.f219080n;
    }
}
