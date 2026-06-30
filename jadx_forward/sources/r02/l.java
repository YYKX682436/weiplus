package r02;

/* loaded from: classes8.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449844d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5) {
        this.f449844d = activityC13242xdf6880d5;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449844d;
        android.content.Intent intent = new android.content.Intent(this.f449844d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC13242xdf6880d5, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13242xdf6880d5.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC13242xdf6880d5, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        o02.a.b(10, 1001, 1, 2, "", "", "");
        return true;
    }
}
