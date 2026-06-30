package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class k extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219108e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f219109f;

    /* renamed from: g, reason: collision with root package name */
    public w13.a f219110g;

    /* renamed from: h, reason: collision with root package name */
    public final int f219111h = 131093;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f219112i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final l75.q0 f219113m = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.j(this);

    public static final void j(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        long j17;
        o13.v fj6;
        kVar.getClass();
        java.util.List A0 = a3Var.A0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A0, "getMemberList(...)");
        java.lang.String g07 = kz5.n0.g0(A0, "\u200b", null, null, 0, null, null, 62, null);
        o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
        if (zVar == null || (fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) zVar).fj()) == null) {
            j17 = 0;
        } else {
            java.lang.String str = a3Var.f69088x37548063;
            if (str == null) {
                str = "";
            }
            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) fj6).b(str);
        }
        long j18 = j17;
        w13.a aVar = kVar.f219110g;
        if (aVar != null) {
            long size = a3Var.A0().size();
            java.lang.String str2 = a3Var.f69088x37548063;
            aVar.u(2097168, 54, size, str2 == null ? "" : str2, j18, g07);
        }
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        o13.y yVar = this.f219109f;
        if (uVar == null || yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(null, "search(...)");
            throw null;
        }
        int i17 = uVar.f432673b;
        if (i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.g(this, uVar);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(-65536, gVar);
            return gVar;
        }
        if (i17 == 13) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.h(this, uVar);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(-65536, hVar);
            return hVar;
        }
        if (i17 != 15) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i(this, uVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(-65536, iVar);
        return iVar;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchChatroomMemberLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", "Create Success!");
        this.f219108e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f219109f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        o13.u cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(5);
        this.f219110g = cj6 instanceof w13.a ? (w13.a) cj6 : null;
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().add(this.f219113m);
        o13.y yVar = this.f219108e;
        if (yVar == null) {
            return true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(this.f219111h, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e(this));
        return true;
    }

    @Override // o13.b
    public boolean i() {
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo49775xc84af884(this.f219113m);
        this.f219110g = null;
        this.f219108e = null;
        this.f219109f = null;
        return true;
    }

    public final boolean k(com.p314xaae8f345.mm.p2621x8fb0427b.a3 chatroomMember) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomMember, "chatroomMember");
        java.lang.String r17 = c01.z1.r();
        int i17 = chatroomMember.f69084x8729abea;
        l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.a3.f275275e2;
        if ((((long) i17) & 2) == 2) {
            return true;
        }
        java.lang.String str = chatroomMember.f69099x6941929d;
        if (str != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            if (r26.n0.B(str, r17, false)) {
                z17 = true;
                return !z17 || chatroomMember.A0().size() < 3;
            }
        }
        z17 = false;
        if (z17) {
            return true;
        }
    }
}
