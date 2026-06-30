package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class h1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219089n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219090o;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f219090o = s1Var;
        this.f219089n = userName;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteKefuContactTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219090o;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = s1Var.f219200h;
        java.lang.String str = this.f219089n;
        copyOnWriteArraySet.remove(str);
        w13.g gVar = s1Var.f219198f;
        if (gVar != null) {
            gVar.m0(new int[]{131089, 131090}, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.m3 ij6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).ij();
        ij6.f219167g.m0(o13.d.f423761n, str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "delete kefu contact " + this.f219089n;
    }
}
