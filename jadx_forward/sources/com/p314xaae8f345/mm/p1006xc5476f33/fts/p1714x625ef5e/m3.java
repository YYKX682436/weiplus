package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class m3 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219165e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f219166f;

    /* renamed from: g, reason: collision with root package name */
    public w13.k f219167g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashSet f219168h;

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k3 k3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k3(this, uVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219166f).b(-65536, k3Var);
        return k3Var;
    }

    @Override // o13.b, o13.w
    public void d(java.lang.String str, p13.y yVar, int i17, java.util.HashMap hashMap) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l3(this, null);
        l3Var.f219152n = str;
        l3Var.f219153o = yVar;
        l3Var.f219154p = i17;
        l3Var.f219155q = hashMap;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219165e).b(65626, l3Var);
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchTopHitsLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Success!");
        this.f219168h = new java.util.HashSet();
        this.f219167g = (w13.k) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1);
        this.f219165e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f219166f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219165e).b(65626, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.j3(this, null));
        return true;
    }

    @Override // o13.b
    public boolean i() {
        java.util.HashSet hashSet = this.f219168h;
        if (hashSet != null) {
            hashSet.clear();
        }
        this.f219167g = null;
        this.f219165e = null;
        this.f219166f = null;
        return true;
    }

    public void j(java.lang.String str) {
        if (this.f219168h.add(str)) {
            w13.k kVar = this.f219167g;
            kVar.f523756t.m107799x37fbf859(1, 1L);
            kVar.f523756t.m107801x35198eae(2, str);
            kVar.f523756t.m107867xb158f775();
        }
    }
}
