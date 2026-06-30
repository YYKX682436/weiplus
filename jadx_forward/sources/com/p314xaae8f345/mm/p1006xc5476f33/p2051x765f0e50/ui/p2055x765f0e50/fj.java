package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes12.dex */
public class fj implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17448xb1d592e2 f242572d;

    public fj(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17448xb1d592e2 activityC17448xb1d592e2) {
        this.f242572d = activityC17448xb1d592e2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        com.p314xaae8f345.mm.p959x883644fd.a0 Ai = com.p314xaae8f345.mm.p959x883644fd.t0.Ai();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int currentTimeMillis = (int) (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) / 86400000);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.p6 p6Var = Ai.f153024f;
        synchronized (p6Var) {
            p6Var.f274455a.d(-1);
            p6Var.f274456b.clear();
            p6Var.f274458d.d();
            p6Var.f274459e.d();
            p6Var.f274464j = true;
        }
        Ai.f153022d.mo70514xb06685ab("netstat", null, null);
        com.p314xaae8f345.mm.p959x883644fd.s sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
        sVar.f153088c = currentTimeMillis;
        sVar.f153087b = -1;
        Ai.u0(sVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17448xb1d592e2 activityC17448xb1d592e2 = this.f242572d;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17448xb1d592e2.f242119f;
        activityC17448xb1d592e2.V6();
    }
}
