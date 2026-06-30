package dk5;

/* loaded from: classes9.dex */
public class e4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316139d;

    public e4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316139d = activityC22571x51759e93;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316139d;
        if (activityC22571x51759e93.f292534r2 && activityC22571x51759e93.E1) {
            return true;
        }
        activityC22571x51759e93.E1 = !activityC22571x51759e93.E1;
        activityC22571x51759e93.b7().q(activityC22571x51759e93.E1);
        activityC22571x51759e93.f287982g.q(activityC22571x51759e93.E1);
        activityC22571x51759e93.e8();
        if (activityC22571x51759e93.E1) {
            activityC22571x51759e93.mo54450xbf7c1df6(activityC22571x51759e93.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig6));
        } else {
            activityC22571x51759e93.mo54450xbf7c1df6(activityC22571x51759e93.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ig9));
        }
        activityC22571x51759e93.d8();
        activityC22571x51759e93.getClass();
        if (activityC22571x51759e93.E1 && activityC22571x51759e93.H1) {
            com.p314xaae8f345.mm.p959x883644fd.b.b(activityC22571x51759e93.S1, 7);
        }
        return true;
    }
}
