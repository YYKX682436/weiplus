package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class cq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dq f242458d;

    public cq(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dq dqVar) {
        this.f242458d = dqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dq dqVar = this.f242458d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gq gqVar = dqVar.f242491e;
        if (gqVar != null) {
            int size = dqVar.f242498o.f242313u.size();
            int i17 = dqVar.f242494h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mp mpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mp) gqVar;
            mpVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fq.f242579a += size;
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = mpVar.f242872a;
            activityC17486x3b418ac7.V6(false);
            activityC17486x3b418ac7.f242303h.setText(activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2o) + "(" + activityC17486x3b418ac7.f242312t.size() + ")");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = activityC17486x3b418ac7.f242309q;
            if (xpVar != null) {
                xpVar.m8146xced61ae5();
            }
            if (i17 < size) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UnfamiliarContactUI", "[onDelSuccess] realDeleteCount:%s count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
                db5.e1.s(activityC17486x3b418ac7.mo55332x76847179(), activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2l, java.lang.Integer.valueOf(size - i17)), "");
            }
            dqVar.f242498o.f242313u.clear();
        }
    }
}
