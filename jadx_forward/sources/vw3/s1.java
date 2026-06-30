package vw3;

/* loaded from: classes.dex */
public final class s1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI f522637d;

    public s1(com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI repairerItemSettingUI) {
        this.f522637d = repairerItemSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f522637d.onBackPressed();
        return true;
    }
}
