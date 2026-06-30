package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class kp implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 f242781d;

    public kp(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7) {
        this.f242781d = activityC17486x3b418ac7;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7 activityC17486x3b418ac7 = this.f242781d;
        activityC17486x3b418ac7.f242318z = !activityC17486x3b418ac7.f242318z;
        activityC17486x3b418ac7.f242313u.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17486x3b418ac7.T6(activityC17486x3b418ac7, activityC17486x3b418ac7.f242318z);
        if (activityC17486x3b418ac7.f242318z) {
            activityC17486x3b418ac7.f242305m.setEnabled(false);
            activityC17486x3b418ac7.f242306n.setEnabled(false);
            activityC17486x3b418ac7.mo60878xf6b21fea(1, activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2k));
        } else {
            activityC17486x3b418ac7.mo60878xf6b21fea(1, activityC17486x3b418ac7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2q));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xp xpVar = activityC17486x3b418ac7.f242309q;
        if (xpVar != null) {
            xpVar.m8146xced61ae5();
        }
        return true;
    }
}
