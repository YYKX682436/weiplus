package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class f extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f219056n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k f219057o;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar, com.p314xaae8f345.mm.p2621x8fb0427b.a3 chatroomMember) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomMember, "chatroomMember");
        this.f219057o = kVar;
        this.f219056n = chatroomMember;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildSingleChatroomMemberTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildChatroomMember ");
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f219056n;
        sb6.append(a3Var.f69088x37548063);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchChatroomMemberLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar = this.f219057o;
        w13.a aVar = kVar.f219110g;
        if (aVar != null) {
            aVar.m0(new int[]{2097168}, a3Var.f69088x37548063);
        }
        if (kVar.k(a3Var)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k.j(kVar, a3Var);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "username: " + this.f219056n.f69088x37548063;
    }
}
