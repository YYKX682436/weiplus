package g72;

/* loaded from: classes14.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350764d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4) {
        this.f350764d = activityC13520x8c9585b4;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "cancel with back button");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.S;
        this.f350764d.V6();
        return false;
    }
}
