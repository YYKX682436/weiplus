package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class s2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 f219208d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var) {
        this.f219208d = e3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var = this.f219208d;
        if (!e3Var.f219051i) {
            e3Var.f219051i = true;
            o13.y yVar = e3Var.f219047e;
            if (yVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(131112, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.u2(e3Var, null));
            }
        }
        e3Var.f219053n.mo48814x2efc64();
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m63549x9616526c() {
        return super.toString() + "|mBackgroundTimer";
    }
}
