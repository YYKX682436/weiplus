package ay3;

/* loaded from: classes3.dex */
public final class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17234xdac4c81e f96822d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17234xdac4c81e activityC17234xdac4c81e) {
        this.f96822d = activityC17234xdac4c81e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneSearchUI", "backBtn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17234xdac4c81e activityC17234xdac4c81e = this.f96822d;
        activityC17234xdac4c81e.setResult(-2);
        activityC17234xdac4c81e.finish();
        return false;
    }
}
