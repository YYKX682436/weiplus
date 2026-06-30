package p32;

/* loaded from: classes.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f432998d;

    public f(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f432998d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("query_source_type", 9);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("max_select_count", 1);
            j45.l.n(this.f432998d, "gallery", ".ui.AlbumPreviewUI", intent, 1001);
        }
    }
}
