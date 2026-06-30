package vw3;

/* loaded from: classes.dex */
public final class i0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI f522517d;

    public i0(com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI repairerFavDebugUI) {
        this.f522517d = repairerFavDebugUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f522517d.finish();
        return true;
    }
}
