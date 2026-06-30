package p61;

/* loaded from: classes5.dex */
public class t2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c f433914d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c) {
        this.f433914d = activityC11367x42f5894c;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c = this.f433914d;
        java.lang.String trim = activityC11367x42f5894c.f154583e.getText().toString().trim();
        if (trim.equals("")) {
            db5.e1.i(activityC11367x42f5894c, com.p314xaae8f345.mm.R.C30867xcad56011.ahp, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return true;
        }
        activityC11367x42f5894c.mo48674x36654fab();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5616x50897eb6 c5616x50897eb6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5616x50897eb6();
        c5616x50897eb6.f135940g.f88484a = activityC11367x42f5894c;
        c5616x50897eb6.e();
        java.lang.String str = c5616x50897eb6.f135941h.f88565a;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5617x25f2ff67 c5617x25f2ff67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5617x25f2ff67();
        c5617x25f2ff67.e();
        r61.e1 e1Var = new r61.e1(activityC11367x42f5894c.f154584f, 2, trim, 0, "", str, c5617x25f2ff67.f135942g.f88681a);
        gm0.j1.d().g(e1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11367x42f5894c activityC11367x42f5894c2 = this.f433914d;
        activityC11367x42f5894c2.f154585g = db5.e1.Q(activityC11367x42f5894c2, activityC11367x42f5894c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11367x42f5894c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahe), true, true, new p61.s2(this, e1Var));
        return true;
    }
}
