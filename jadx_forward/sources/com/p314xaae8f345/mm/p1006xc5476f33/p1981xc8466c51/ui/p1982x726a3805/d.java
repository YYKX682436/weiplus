package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes12.dex */
public class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i f237040d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i iVar) {
        this.f237040d = iVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7;
        g4Var.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.i iVar = this.f237040d;
        iVar.f237051i.f237072c.o(null);
        if (iVar.f237049g.X1 == 0) {
            if (iVar.f237048f.t0()) {
                g4Var.f(2, iVar.f237046d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
            if (iVar.f237048f.u0()) {
                g4Var.f(1, iVar.f237046d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbx));
            }
            g4Var.f(3, iVar.f237046d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccr));
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.l) ((java.util.HashMap) iVar.f237051i.f237074e).get(iVar.f237050h);
            if (lVar == null || (c5886xd11a0be7 = lVar.f237068a) == null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = c5884x4c2d9184.f136192g;
                aqVar.f87707a = currentTimeMillis;
                aqVar.f87708b = iVar.f237050h;
                c5884x4c2d9184.e();
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
            s6Var.e(c5886xd11a0be7);
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar = iVar.f237051i;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mVar.f237072c;
            android.content.Context context = iVar.f237046d;
            mVar.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = lVar.f237068a;
            java.lang.String e17 = s6Var.e(c5886xd11a0be72);
            int c17 = s6Var.c(c5886xd11a0be72);
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.j(mVar, c5886xd11a0be72, context, e17, c17, s6Var.d(c5886xd11a0be72));
            boolean z17 = lVar.f237069b;
            kd0.p2 p2Var = mVar.f237075f;
            if (!z17) {
                lVar.f237069b = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).h(c17, e17);
            }
            k0Var.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).b(jVar, c17, e17, 5));
        }
    }
}
