package ay3;

/* loaded from: classes.dex */
public final class k implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17235xecd31272 f96824d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17235xecd31272 activityC17235xecd31272) {
        this.f96824d = activityC17235xecd31272;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneSelectUI", "backBtn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17235xecd31272 activityC17235xecd31272 = this.f96824d;
        activityC17235xecd31272.setResult(-2);
        activityC17235xecd31272.finish();
        return false;
    }
}
