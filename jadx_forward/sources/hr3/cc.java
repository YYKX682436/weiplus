package hr3;

/* loaded from: classes.dex */
public class cc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d f364985d;

    public cc(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d) {
        this.f364985d = activityC16864x5bbaf71d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d = this.f364985d;
        activityC16864x5bbaf71d.mo48674x36654fab();
        activityC16864x5bbaf71d.setResult(-1, new android.content.Intent());
        activityC16864x5bbaf71d.finish();
        return true;
    }
}
