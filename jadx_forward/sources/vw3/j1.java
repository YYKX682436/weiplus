package vw3;

/* loaded from: classes.dex */
public final class j1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFolderUI f522530d;

    public j1(com.tencent.mm.plugin.repairer.ui.RepairerFolderUI repairerFolderUI) {
        this.f522530d = repairerFolderUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f522530d.finish();
        return false;
    }
}
