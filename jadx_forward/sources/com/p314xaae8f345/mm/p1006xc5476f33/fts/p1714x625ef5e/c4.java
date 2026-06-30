package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class c4 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f219017f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f219018g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f219019h = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.u3(this);

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c a4Var;
        switch (uVar.f432673b) {
            case com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55825xa5f977ac /* 65521 */:
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.a4(this, uVar.f432680i, uVar.f432677f);
                break;
            case com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26633x8dbd5dfc.SectionHeader.f55826xa5ecac51 /* 65522 */:
            default:
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.v3(this, null);
                break;
            case 65523:
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.z3(this, uVar);
                break;
            case 65524:
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y3(this, null);
                break;
            case 65525:
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b4(this, null);
                break;
            case 65526:
                a4Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.x3(this, uVar);
                break;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219016e).b(Integer.MAX_VALUE, a4Var);
        return a4Var;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "SearchTestLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Success!");
        this.f219016e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        gm0.j1.d().q(30, this.f219019h);
        return false;
    }
}
