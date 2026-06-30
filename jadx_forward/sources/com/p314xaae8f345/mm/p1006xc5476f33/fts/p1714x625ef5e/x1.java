package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class x1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219265n;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.C15577xe6a675dc c15577xe6a675dc) {
        this.f219265n = l2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteKefuMessage";
    }

    @Override // p13.c
    public boolean i() {
        w13.h hVar = this.f219265n.f219142h;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) hVar.f423731f).j(java.lang.String.format("UPDATE %s SET status = ? WHERE aux_index LIKE '%%%s';", hVar.r(), "@kefu.openim"), new java.lang.Integer[]{-1});
        return false;
    }
}
