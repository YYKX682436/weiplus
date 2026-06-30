package vw3;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f522406d;

    public a(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        this.f522406d = baseRepairerPrefUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f522406d.onBackPressed();
        return true;
    }
}
