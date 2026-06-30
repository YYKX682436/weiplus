package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class a0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f218979n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f218980o = false;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f218981p;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, java.lang.String str) {
        this.f218981p = lVar;
        this.f218979n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertContactTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f218979n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Insert Contact %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f218981p;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p) lVar.f219122h).a(str);
        if (a17.d1().length() <= 0 || !lVar.p(a17)) {
            this.f218980o = true;
        } else {
            lVar.k(a17);
        }
        lVar.f219124m.remove(str);
        lVar.f219123i.remove(str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s isSkipped: %b}", this.f218979n, java.lang.Boolean.valueOf(this.f218980o));
    }
}
