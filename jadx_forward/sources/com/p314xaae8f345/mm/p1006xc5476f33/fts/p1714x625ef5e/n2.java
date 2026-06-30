package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class n2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2 f219173n;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2 q2Var) {
        this.f219173n = q2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteSOSHistoryTask";
    }

    @Override // p13.c
    public boolean i() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f219173n.f219187e.f523752g).i(java.lang.String.format("DELETE FROM %s ;", "FTS5MetaSOSHistory"));
        return true;
    }
}
