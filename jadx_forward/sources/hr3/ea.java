package hr3;

/* loaded from: classes11.dex */
public class ea implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365052d;

    public ea(hr3.va vaVar) {
        this.f365052d = vaVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.va vaVar = this.f365052d;
        if (itemId == 1) {
            vaVar.f365642e.M();
        } else {
            if (itemId != 2) {
                return;
            }
            vaVar.f365642e.N();
        }
    }
}
