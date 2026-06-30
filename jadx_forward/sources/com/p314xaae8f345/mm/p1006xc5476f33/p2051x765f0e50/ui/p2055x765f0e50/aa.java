package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class aa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17418xdb0644c5 f242341d;

    public aa(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17418xdb0644c5 activityC17418xdb0644c5) {
        this.f242341d = activityC17418xdb0644c5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17418xdb0644c5 activityC17418xdb0644c5 = this.f242341d;
        activityC17418xdb0644c5.f241907g = activityC17418xdb0644c5.f241904d.getText().toString().trim();
        if (!c01.z1.r().equalsIgnoreCase(activityC17418xdb0644c5.f241907g)) {
            db5.e1.u(activityC17418xdb0644c5.mo55332x76847179(), activityC17418xdb0644c5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyc, activityC17418xdb0644c5.f241907g), activityC17418xdb0644c5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bb8), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z9(this), null);
            return true;
        }
        activityC17418xdb0644c5.mo48674x36654fab();
        activityC17418xdb0644c5.finish();
        return true;
    }
}
