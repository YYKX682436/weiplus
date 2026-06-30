package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 f232932d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var) {
        this.f232932d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = this.f232932d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "3s timeout");
        s1Var.A = true;
        if (s1Var.B) {
            if (s1Var.f232964y || (c1163xf1deaba4 = s1Var.f232950h) == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(0);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = s1Var.f232950h;
        if (c1163xf1deaba42 == null) {
            return;
        }
        c1163xf1deaba42.setVisibility(0);
    }
}
