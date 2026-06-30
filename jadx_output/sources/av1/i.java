package av1;

/* loaded from: classes3.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14182d;

    public i(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        this.f14182d = screenCastActivity;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            int i18 = com.tencent.mm.plugin.cast.ui.ScreenCastActivity.f95487q;
            com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity = this.f14182d;
            screenCastActivity.W6();
            screenCastActivity.initView();
        }
    }
}
