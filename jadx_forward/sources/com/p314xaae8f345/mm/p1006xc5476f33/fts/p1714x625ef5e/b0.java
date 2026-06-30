package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class b0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f218990n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f218991o;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, long j17) {
        this.f218991o = lVar;
        this.f218990n = j17;
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f218991o;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h;
        long j17 = this.f218990n;
        p13.k c17 = pVar.c(j17);
        if (c17 != null) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) w13.d.f523743a.a(lVar.f219126o)).get(java.lang.Long.valueOf(j17));
            if (list == null) {
                list = new java.util.ArrayList();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar2 = this.f218991o;
            long j18 = c17.f432640a;
            lVar2.l(j18, c17.f432641b, list, j18);
        }
        lVar.f219127p.remove(java.lang.Long.valueOf(j17));
        return true;
    }
}
