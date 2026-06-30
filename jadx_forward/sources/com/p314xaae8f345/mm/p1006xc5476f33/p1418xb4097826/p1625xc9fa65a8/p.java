package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class p implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f207339a;

    public p(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f207339a = h0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        jz5.l lVar = new jz5.l("behaviour_session_id", Ri);
        boolean z17 = false;
        lVarArr[0] = lVar;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[1] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.mu2) this.f207339a.f391656d).m75936x14adae67(0);
        if (c19782x23db1cfa != null && c19782x23db1cfa.m76177x2220c3f4() == 1) {
            z17 = true;
        }
        if (z17) {
            ml2.v1 v1Var = ml2.v1.f409673e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f409673e;
            j17 = 2;
        }
        lVarArr[3] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
