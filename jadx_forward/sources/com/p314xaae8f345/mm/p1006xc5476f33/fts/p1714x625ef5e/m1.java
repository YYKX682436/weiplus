package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class m1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f219159n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219160o;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f219160o = s1Var;
        this.f219159n = userName;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SetKefuContactDirtyTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219160o;
        if (!s1Var.f219200h.add(this.f219159n)) {
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = s1Var.f219207r;
        long j17 = s1Var.f219201i;
        b4Var.c(j17, j17);
        return true;
    }
}
