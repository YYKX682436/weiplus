package ab5;

/* loaded from: classes9.dex */
public class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.z f2971d;

    public n(ab5.z zVar) {
        this.f2971d = zVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ab5.y yVar = this.f2971d.f2987c;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
        } else {
            yVar.onMMMenuItemSelected(menuItem, i17);
        }
    }
}
