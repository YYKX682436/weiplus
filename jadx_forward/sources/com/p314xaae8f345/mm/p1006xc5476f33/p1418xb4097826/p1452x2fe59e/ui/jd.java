package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class jd implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f191723a;

    public jd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f191723a = kdVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f191723a;
        if (!z17) {
            kdVar.I1 = false;
            int i17 = kdVar.J1;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            int i18 = i17 & (-2);
            kdVar.J1 = i18;
            kdVar.J1 = i18 & (-3);
            return;
        }
        zl2.q4 q4Var = zl2.q4.f555466a;
        zl2.r4 r4Var = zl2.r4.f555483a;
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
        if (q4Var.F(r4Var.T1(e1Var != null ? e1Var.f410522s : null))) {
            kdVar.I1 = true;
            int i19 = kdVar.J1;
            java.util.regex.Pattern pattern2 = pm0.v.f438335a;
            kdVar.J1 = 1 | i19;
        }
        if (kdVar.N) {
            int i27 = kdVar.J1;
            java.util.regex.Pattern pattern3 = pm0.v.f438335a;
            kdVar.J1 = i27 | 2;
        }
    }
}
