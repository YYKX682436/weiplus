package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes8.dex */
public final class me implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne f168422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f168423e;

    public me(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne neVar, android.content.Context context) {
        this.f168422d = neVar;
        this.f168423e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne neVar = this.f168422d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(neVar.f168464a, "onDismiss#reportOnActionSheetHideIfNeed");
        neVar.getClass();
        android.content.Context context = this.f168423e;
        boolean z17 = context instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8;
        java.lang.String str = neVar.f168464a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "getRecentForwardReportInfo, context: " + context);
        }
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
        if (pk5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "tryReport, recentForwardReportInfo is null");
        } else {
            pk5Var.f464670i = 9;
            int i17 = neVar.f168466c;
            if (2 == i17 || 3 == i17) {
                pk5Var.f464671m = java.lang.String.valueOf(49);
                pk5Var.f464672n = "33";
            }
            pk5Var.f464675q = neVar.f168465b;
            pk5Var.f464665d = neVar.f168466c;
            pk5Var.f464673o = (int) (android.os.SystemClock.elapsedRealtime() - pk5Var.f464676r);
            l35.a.f396976a.a(context);
        }
        neVar.f168465b = "";
        neVar.f168466c = 1;
    }
}
