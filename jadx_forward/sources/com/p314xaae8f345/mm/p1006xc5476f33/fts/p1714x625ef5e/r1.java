package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class r1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219194d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var) {
        this.f219194d = s1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219194d;
        o13.y yVar = s1Var.f219197e;
        if (yVar == null) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(s1Var.f219199g + 1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.n1(s1Var));
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m63547x9616526c() {
        return super.toString() + "|updateKefuContactTimer";
    }
}
