package kp3;

/* loaded from: classes14.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 f392503d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 activityC16781xd3c41868) {
        this.f392503d = activityC16781xd3c41868;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.palmPrintMainUI", "click BackBtn");
        this.f392503d.onBackPressed();
        return true;
    }
}
