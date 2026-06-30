package e33;

/* loaded from: classes10.dex */
public class f1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328751d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328751d = activityC15653x403456cd;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328751d;
        if (1 != itemId) {
            return activityC15653x403456cd.N7();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "go smart gallery.");
        o23.m.f423959a.f423962c = 1;
        android.net.Uri uri = t23.o2.f496749e;
        t23.o2 o2Var = t23.n2.f496742a;
        java.util.ArrayList arrayList = activityC15653x403456cd.f220061m.f328664g;
        o2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
        java.util.ArrayList arrayList2 = (java.util.ArrayList) o2Var.f496753d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        android.content.Intent intent = new android.content.Intent(activityC15653x403456cd, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd.class);
        intent.putExtra("select_type_tag", 2);
        intent.putExtras(activityC15653x403456cd.getIntent());
        intent.removeExtra("album_query_session_id");
        intent.putExtra("send_raw_img", activityC15653x403456cd.D);
        activityC15653x403456cd.startActivityForResult(intent, 4382);
        return true;
    }
}
