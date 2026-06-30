package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class q2 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public w13.i f219187e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f219188f;

    /* renamed from: g, reason: collision with root package name */
    public o13.y f219189g;

    @Override // o13.b, o13.w
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.n2(this);
        o13.y yVar = this.f219188f;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(132072, n2Var);
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.p2(this, uVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219189g).b(-65536, p2Var);
        return p2Var;
    }

    @Override // o13.b, o13.w
    public void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m2 m2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m2(this);
        m2Var.f219161n = str;
        m2Var.f219163p = str2;
        m2Var.f219162o = java.lang.System.currentTimeMillis();
        o13.y yVar = this.f219188f;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(132072, m2Var);
        }
    }

    @Override // o13.b, o13.w
    public void e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.o2(this);
        o2Var.f219177n = str;
        o13.y yVar = this.f219188f;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(132072, o2Var);
        }
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchSOSHistoryLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Success!");
        this.f219187e = (w13.i) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1024);
        this.f219188f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f219189g = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f219187e = null;
        this.f219188f = null;
        this.f219189g = null;
        return true;
    }
}
