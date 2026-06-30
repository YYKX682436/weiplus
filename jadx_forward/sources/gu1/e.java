package gu1;

/* loaded from: classes15.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ViewOnClickListenerC13040xa2425b0d f357419d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ViewOnClickListenerC13040xa2425b0d viewOnClickListenerC13040xa2425b0d) {
        this.f357419d = viewOnClickListenerC13040xa2425b0d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ViewOnClickListenerC13040xa2425b0d viewOnClickListenerC13040xa2425b0d = this.f357419d;
        viewOnClickListenerC13040xa2425b0d.setResult(-1);
        viewOnClickListenerC13040xa2425b0d.finish();
        return true;
    }
}
