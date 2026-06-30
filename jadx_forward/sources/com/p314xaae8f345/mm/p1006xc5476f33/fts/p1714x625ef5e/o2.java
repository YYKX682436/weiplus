package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class o2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2 f219178o;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.q2 q2Var) {
        this.f219178o = q2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteSOSHistoryTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.i iVar = this.f219178o.f219187e;
        java.lang.String str = this.f219177n;
        iVar.getClass();
        java.lang.String format = java.lang.String.format("DELETE FROM %s WHERE key = ?", "FTS5MetaSOSHistory");
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) iVar.f523752g).j(format, new java.lang.String[]{str});
        return true;
    }
}
