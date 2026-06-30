package j82;

/* loaded from: classes8.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j82.g f379688d;

    public f(j82.g gVar) {
        this.f379688d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        j82.g gVar = this.f379688d;
        if (itemId == 0) {
            intent.putExtra("key_fav_scene", 4);
            intent.putExtra("key_fav_item_id", gVar.f379689d.f181790f.f67645x88be67a1);
            o72.x1.L0(gVar.f379689d.mo55332x76847179(), ".ui.FavTagEditUI", intent, null);
        } else {
            if (itemId != 1) {
                return;
            }
            o72.x1.k(gVar.f379689d.f181790f, null, 3);
            gVar.f379689d.finish();
        }
    }
}
