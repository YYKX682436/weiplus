package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class e2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f242506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f242507e;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f242507e = activityC17388xa7b1222e;
        this.f242506d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f242506d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f242507e;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC17388xa7b1222e.f241713i)) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str = activityC17388xa7b1222e.f241713i;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str)) {
                return;
            }
        }
        activityC17388xa7b1222e.finish();
    }
}
