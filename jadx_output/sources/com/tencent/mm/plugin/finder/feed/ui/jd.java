package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class jd implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110190a;

    public jd(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f110190a = kdVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110190a;
        if (!z17) {
            kdVar.I1 = false;
            int i17 = kdVar.J1;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            int i18 = i17 & (-2);
            kdVar.J1 = i18;
            kdVar.J1 = i18 & (-3);
            return;
        }
        zl2.q4 q4Var = zl2.q4.f473933a;
        zl2.r4 r4Var = zl2.r4.f473950a;
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        if (q4Var.F(r4Var.T1(e1Var != null ? e1Var.f328989s : null))) {
            kdVar.I1 = true;
            int i19 = kdVar.J1;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            kdVar.J1 = 1 | i19;
        }
        if (kdVar.N) {
            int i27 = kdVar.J1;
            java.util.regex.Pattern pattern3 = pm0.v.f356802a;
            kdVar.J1 = i27 | 2;
        }
    }
}
