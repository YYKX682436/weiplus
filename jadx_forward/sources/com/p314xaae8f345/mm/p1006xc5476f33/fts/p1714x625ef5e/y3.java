package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class y3 extends p13.c {
    public y3(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var, com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.u3 u3Var) {
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "FTSClearUnReadCountTask";
    }

    @Override // p13.c
    public boolean i() {
        gm0.j1.u().f354686f.A(null, "UPDATE rconversation SET unReadCount = 0;");
        return true;
    }
}
