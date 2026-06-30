package v92;

/* loaded from: classes15.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f515689d;

    public e(v92.g gVar) {
        this.f515689d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        v92.g gVar = this.f515689d;
        if (itemId == 20005) {
            gVar.h();
        } else {
            if (itemId != 20012) {
                return;
            }
            gVar.i();
        }
    }
}
