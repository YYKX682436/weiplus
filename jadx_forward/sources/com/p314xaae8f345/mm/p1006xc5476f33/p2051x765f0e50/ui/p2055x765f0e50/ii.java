package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class ii implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 f242691d;

    public ii(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 activityC17440xc8d425e4) {
        this.f242691d = activityC17440xc8d425e4;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 activityC17440xc8d425e4 = this.f242691d;
        activityC17440xc8d425e4.f242072g = activityC17440xc8d425e4.f242070e.getText().toString().trim();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y0(activityC17440xc8d425e4.f242072g)) {
            db5.e1.i(activityC17440xc8d425e4.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574971k64, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return true;
        }
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf((num == null || (num.intValue() & 2) == 0) ? false : true);
        if (activityC17440xc8d425e4.f242072g.equals(activityC17440xc8d425e4.f242071f) && valueOf.booleanValue()) {
            activityC17440xc8d425e4.finish();
        } else {
            v61.i0 i0Var = new v61.i0(1, activityC17440xc8d425e4.f242072g);
            gm0.j1.d().g(i0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17440xc8d425e4 activityC17440xc8d425e42 = this.f242691d;
            activityC17440xc8d425e42.f242069d = db5.e1.Q(activityC17440xc8d425e42, activityC17440xc8d425e42.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC17440xc8d425e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipz), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hi(this, i0Var));
            activityC17440xc8d425e4.mo48674x36654fab();
        }
        return true;
    }
}
