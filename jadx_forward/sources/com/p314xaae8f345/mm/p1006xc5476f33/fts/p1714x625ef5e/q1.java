package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class q1 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 f219186d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var) {
        this.f219186d = s1Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.s1 s1Var = this.f219186d;
        if (s1Var.f423740d && w0Var != null && (w0Var.f398509d instanceof java.lang.String)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchKefuContactLogic", "onKefuContactChangeListener, " + w0Var.f398509d + ", " + w0Var.f398507b);
            int i17 = w0Var.f398507b;
            if (i17 == 3 || i17 == 4) {
                java.lang.Object obj = w0Var.f398509d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) obj;
                o13.y yVar = s1Var.f219197e;
                if (yVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(s1Var.f219199g + 1, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.i1(s1Var, str2, s1Var.f219202m));
                }
            }
        }
    }
}
