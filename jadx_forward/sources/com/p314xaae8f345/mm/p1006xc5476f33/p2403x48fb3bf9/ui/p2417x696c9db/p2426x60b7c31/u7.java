package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class u7 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266975e;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266975e = c1Var;
        this.f266974d = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.kb3 kb3Var;
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        gm0.j1.n().f354821b.q(cc1.w.f4294x366c91de, this);
        int i19 = -1;
        java.lang.String str2 = "getEnterpriseChat:fail";
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((r01.j3) m1Var).f449659e;
            kb3Var = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.kb3) fVar;
            if (kb3Var != null && (gi5Var = kb3Var.f460106d) != null) {
                i19 = gi5Var.f456821d;
                java.lang.String str3 = gi5Var.f456822e;
                if (str3 != null && str3.length() > 0) {
                    str2 = "getEnterpriseChat:fail_" + kb3Var.f460106d.f456822e;
                }
            }
        } else {
            kb3Var = null;
        }
        nw4.y2 y2Var = this.f266974d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266975e;
        if (i19 != 0) {
            c1Var.i5(y2Var, str2, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", kb3Var.f460107e);
        c1Var.i5(y2Var, "getEnterpriseChat:ok", hashMap);
    }
}
