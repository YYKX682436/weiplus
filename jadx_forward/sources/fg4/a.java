package fg4;

/* loaded from: classes8.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18528xb888b874 f343999d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18528xb888b874 activityC18528xb888b874) {
        this.f343999d = activityC18528xb888b874;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f343999d.finish();
        return true;
    }
}
