package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class af implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155259e;

    public af(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174, java.lang.String str) {
        this.f155259e = activityC11461x47892174;
        this.f155258d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.String str2 = this.f155258d;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = this.f155259e;
        activityC11461x47892174.getClass();
        h11.e eVar = new h11.e(str2, 12, "", 0, "");
        eVar.f359606f = activityC11461x47892174.f155096d;
        activityC11461x47892174.f155107r = db5.e1.Q(activityC11461x47892174, activityC11461x47892174.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11461x47892174.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bf(activityC11461x47892174, eVar));
        java.lang.String h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(activityC11461x47892174.X6().trim());
        java.lang.String str3 = activityC11461x47892174.f155108s;
        if (str3 == null || activityC11461x47892174.f155109t == null || h17.equals(str3) || !h17.equals(activityC11461x47892174.f155109t)) {
            java.lang.String str4 = activityC11461x47892174.f155108s;
            i17 = (str4 == null || (str = activityC11461x47892174.f155109t) == null || str.equals(str4) || h17.equals(activityC11461x47892174.f155109t)) ? 0 : 2;
        } else {
            i17 = 1;
        }
        activityC11461x47892174.f155108s = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(activityC11461x47892174.X6().trim());
        int i19 = activityC11461x47892174.D;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
        ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454027s = i19;
        ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454028t = i17;
        activityC11461x47892174.D++;
        s75.d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.cf(activityC11461x47892174, eVar, activityC11461x47892174.C.m78931xfb85ada3().toString(), str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(activityC11461x47892174.f155114y.m78931xfb85ada3().toString())), "reg_permchk", 7);
    }
}
