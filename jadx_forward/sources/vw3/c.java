package vw3;

/* loaded from: classes.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f522435d;

    public c(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        this.f522435d = baseRepairerPrefUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        hx3.b bVar;
        r45.dp5 dp5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI = this.f522435d;
        j75.f m67437x4bd5310 = baseRepairerPrefUI.m67437x4bd5310();
        if (m67437x4bd5310 == null || (bVar = (hx3.b) m67437x4bd5310.mo140437x75286adb()) == null || (dp5Var = bVar.f367192f) == null) {
            return false;
        }
        baseRepairerPrefUI.startActivityForResult(new android.content.Intent((android.content.Context) baseRepairerPrefUI, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerSearchUI.class).putExtra("key_config_item_list", dp5Var.mo14344x5f01b1f6()), 1);
        return false;
    }
}
