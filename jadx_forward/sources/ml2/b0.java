package ml2;

/* loaded from: classes10.dex */
public final class b0 implements e62.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml2.c0 f408743a;

    public b0(ml2.c0 c0Var) {
        this.f408743a = c0Var;
    }

    @Override // e62.e
    public void a(java.lang.Object obj, l52.g gVar, android.view.View view) {
    }

    @Override // e62.e
    public void b(java.lang.Object obj, l52.g gVar, android.view.View view) {
        if (gVar == null || view == null || !(view.getTag() instanceof ed4.p)) {
            return;
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(gVar.f398147h);
        ml2.c0 c0Var = this.f408743a;
        if (!isEmpty) {
            c0Var.getClass();
            java.lang.String str = gVar.f398146g;
            int i17 = gVar.f398141b;
            java.lang.String str2 = android.text.TextUtils.isEmpty(gVar.f398148i) ? gVar.f398140a.f464371d : gVar.f398148i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.f398140a.f464371d);
            long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.f398142c);
            ml2.x1 x1Var = ml2.x1.f409735f;
            java.lang.String userName = gVar.f398140a.f464389y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
            ml2.e0 e0Var = ml2.e0.f408903e;
            ml2.v3[] v3VarArr = ml2.v3.f409681d;
            ml2.f0 f0Var = new ml2.f0(null, str, i17, str2, E1, E12, x1Var, "37", -1, userName, e0Var, true, true, 3, null, null, null, gVar.f398149j, 0L, null, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.f398140a.f464371d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(c0Var.f408850k, 0), null, null, null, 60669952, null);
            ml2.x0 x0Var = c0Var.f408840a;
            if (x0Var != null) {
                ((ml2.b) x0Var).a(f0Var, false);
                return;
            }
            return;
        }
        c0Var.getClass();
        fe0.l4 l4Var = (fe0.l4) i95.n0.c(fe0.l4.class);
        java.lang.Object tag = view.getTag();
        ((ee0.p4) l4Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n) tag : null;
        if (nVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = nVar.f38402x94f64b00;
            if (c19807x593d1720 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
            } else {
                r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
                r8 = a90Var != null ? a90Var.f451381s : null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromTagToFinderLiveShareObject", "com.tencent.mm.feature.sns.SnsFinderService");
            }
        }
        if (r8 == null) {
            return;
        }
        java.lang.String m75945x2fec8307 = r8.m75945x2fec8307(1);
        java.lang.String str3 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        int i18 = gVar.f398141b;
        java.lang.String m75945x2fec83072 = r8.m75945x2fec8307(2);
        java.lang.String str4 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
        long E13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(r8.m75945x2fec8307(2));
        long E14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(r8.m75945x2fec8307(0));
        ml2.x1 x1Var2 = ml2.x1.f409735f;
        java.lang.String str5 = c0Var.f408850k;
        java.lang.String m75945x2fec83073 = r8.m75945x2fec8307(3);
        java.lang.String str6 = m75945x2fec83073 == null ? "" : m75945x2fec83073;
        ml2.e0 e0Var2 = r8.m75939xb282bd08(13) == 1 ? ml2.e0.f408903e : ml2.e0.f408904f;
        ml2.v3[] v3VarArr2 = ml2.v3.f409681d;
        ml2.f0 f0Var2 = new ml2.f0(null, str3, i18, str4, E13, E14, x1Var2, str5, -1, str6, e0Var2, true, true, 3, null, null, null, gVar.f398149j, 0L, null, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(r8.m75945x2fec8307(2)), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(c0Var.f408850k, 0), null, null, null, 60669952, null);
        ml2.x0 x0Var2 = c0Var.f408840a;
        if (x0Var2 != null) {
            ((ml2.b) x0Var2).a(f0Var2, false);
        }
    }
}
