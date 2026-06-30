package ay3;

/* loaded from: classes10.dex */
public final class o implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17236x66d07b59 f96828d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17236x66d07b59 activityC17236x66d07b59) {
        this.f96828d = activityC17236x66d07b59;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNewRingtoneUI", "backBtn");
        this.f96828d.U6();
        return false;
    }
}
