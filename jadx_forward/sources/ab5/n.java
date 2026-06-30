package ab5;

/* loaded from: classes9.dex */
public class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.z f84504d;

    public n(ab5.z zVar) {
        this.f84504d = zVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ab5.y yVar = this.f84504d.f84520c;
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
        } else {
            yVar.mo1049x34063ac(menuItem, i17);
        }
    }
}
