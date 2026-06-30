package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class yb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 f243315d;

    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46) {
        this.f243315d = activityC17420x3d09cd46;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46 = this.f243315d;
        float f17 = activityC17420x3d09cd46.f241921g;
        if (activityC17420x3d09cd46.f241922h != f17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC17420x3d09cd46.mo55332x76847179());
            u1Var.g(activityC17420x3d09cd46.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ini));
            u1Var.a(true);
            u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zb(activityC17420x3d09cd46, f17));
            u1Var.q(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(activityC17420x3d09cd46.f241918d), java.lang.Integer.valueOf(activityC17420x3d09cd46.f241919e), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(activityC17420x3d09cd46.f241918d), java.lang.Integer.valueOf(activityC17420x3d09cd46.f241919e));
            activityC17420x3d09cd46.finish();
        }
        return true;
    }
}
